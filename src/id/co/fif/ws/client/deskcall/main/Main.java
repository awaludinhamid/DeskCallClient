/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.main;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstCitiesExtV;
import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import id.co.fif.ws.client.deskcall.run.ArMstCollZipExtVRun;
import id.co.fif.ws.client.deskcall.run.BaseRun;
import id.co.fif.ws.client.deskcall.run.CmMstActionPlanExtVRun;
import id.co.fif.ws.client.deskcall.run.CmMstDelqReasonsExtVRun;
import id.co.fif.ws.client.deskcall.run.CmMstLkpClassificationsExtVRun;
import id.co.fif.ws.client.deskcall.run.CmMstLkpParametersExtVRun;
//import id.co.fif.ws.client.deskcall.run.CmMstTeamHierarchiesExtVRun;
import id.co.fif.ws.client.deskcall.run.CmMstPotMatrixEntryExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstCitiesExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstKecamatanExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstKelurahanExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstOccupationsExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstOfficesExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstProvinsiExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstSubOccupationExtVRun;
import id.co.fif.ws.client.deskcall.run.FsMstZipcodesExtVRun;
import id.co.fif.ws.client.deskcall.run.StgCollectionResultRun;
import id.co.fif.ws.client.deskcall.run.StgCollectionTaskRun;
import id.co.fif.ws.client.deskcall.security.ClientAuthentication;
import id.co.fif.ws.client.deskcall.service.FsMstCitiesExtVService;
import id.co.fif.ws.client.deskcall.service.FsMstOfficesExtVService;
import id.co.fif.ws.client.deskcall.util.SessionUtil;
import id.co.fif.ws.client.deskcall.util.TableType;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author awal
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        if(args.length != 5)
            throw new Exception(
                    "Usage: [serverUrl] [deskcallId] [userName] [userPassword] " +
                    "[processFlow(1=master|2=task|3=result|4=big table)]");
        String serverUrl = args[0] + "/rest";
        Client c = Client.create();
        ClientAuthentication clientAuth =
                new ClientAuthentication(c, serverUrl, args[1], args[2], args[3]);
        OAuthClientFilter clientFilter = clientAuth.getClientFilter();
        String mitraId = args[1];
        Integer tableType = Integer.parseInt(args[4]);
        //batch preparation
        Properties prop = new Properties();
        prop.load(Main.class.getClassLoader().getResourceAsStream("jdbc.properties"));
        Integer numOfThreadActive = Integer.parseInt(prop.getProperty("pool.numOfThreadActive"));
        Integer numOfRecord = Integer.parseInt(prop.getProperty("pool.numOfRecord"));
        List<BaseRun> baseRuns = new ArrayList<BaseRun>();
        Main main = new Main();
        Object[] objArgs = {c, clientFilter, serverUrl};
        //master setup
        if(tableType == TableType.MASTER.getType()) {
            baseRuns.add(new CmMstActionPlanExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new CmMstDelqReasonsExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new CmMstLkpClassificationsExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new CmMstLkpParametersExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new CmMstPotMatrixEntryExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new FsMstCitiesExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new FsMstOccupationsExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new FsMstOfficesExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new FsMstProvinsiExtVRun(c, clientFilter, serverUrl));
            baseRuns.add(new FsMstSubOccupationExtVRun(c, clientFilter, serverUrl));
            
        //task LKD
        } else if(tableType == TableType.TASK.getType()) {
            main.setThread(baseRuns, new StgCollectionTaskRun(c, clientFilter, serverUrl),
                    objArgs, numOfRecord, mitraId, tableType);

        // result LKD
        } else if(tableType == TableType.RESULT.getType()) {
            main.setThread(baseRuns, new StgCollectionResultRun(c, clientFilter, serverUrl),
                    objArgs, numOfRecord, mitraId, tableType);
            
        // big table
        } else if(tableType == TableType.BIG_TABLE.getType()) {
            // collection zip
            main.setThread(baseRuns, new ArMstCollZipExtVRun(c, clientFilter, serverUrl),
                    objArgs, numOfRecord, mitraId, tableType);
            // zip code
            main.setThread(baseRuns, new FsMstZipcodesExtVRun(c, clientFilter, serverUrl),
                    objArgs, numOfRecord, mitraId, tableType);
            // kecamatan
            main.setThread(baseRuns, new FsMstKecamatanExtVRun(c, clientFilter, serverUrl),
                    objArgs, numOfRecord, mitraId, tableType);
            // kelurahan
            main.setThread(baseRuns, new FsMstKelurahanExtVRun(c, clientFilter, serverUrl),
                    objArgs, numOfRecord, mitraId, tableType);
        }
        // submit thread
        if(baseRuns.size() > 0)
            main.processThread(baseRuns, numOfThreadActive);
    }

    private void processThread(List<BaseRun> baseRuns, Integer numOfThreadActive) {
        ExecutorService executor = Executors.newFixedThreadPool(numOfThreadActive);
        for (BaseRun baseRun : baseRuns) {  
          executor.submit((Runnable) baseRun); //must be implement runnable
        }
        executor.shutdown();
    }

    private void setThread(List<BaseRun> baseRuns, BaseRun baseRun, Object[] objArgs,
            Integer numOfRecord, String mitraId, Integer tableType) {
        if(tableType == TableType.TASK.getType()) {
          List<FsMstOfficesExtV> fmoevList = new SessionUtil<FsMstOfficesExtVService>().getAppContext("fsMstOfficesExtVService").getFsMstOfficesExtVs();
          for(FsMstOfficesExtV fmoev : fmoevList) {
            BaseRun baseRunTmp = getBaseRunTmp(baseRun,objArgs);
            baseRunTmp.setMitraId(mitraId);
            baseRunTmp.setOfficeCode(fmoev.getOfficeCode());
            baseRuns.add(baseRunTmp);
          }
        } else if(tableType == TableType.RESULT.getType()) {
          List<FsMstCitiesExtV> fmcevList = new SessionUtil<FsMstCitiesExtVService>().getAppContext("fsMstCitiesExtVService").getFsMstCitiesExtVs();
          for(FsMstCitiesExtV fmcev : fmcevList) {
            BaseRun baseRunTmp = getBaseRunTmp(baseRun,objArgs);
            baseRunTmp.setCityCode(fmcev.getCityCode());
            baseRuns.add(baseRunTmp);            
          }
        } else {
          Integer count = baseRun.getCount();
          Integer batchOrRecord = getBatchOrRecord(numOfRecord, count);
          for(Integer idxThread = 0; idxThread < batchOrRecord; idxThread++) {
            BaseRun baseRunTmp = getBaseRunTmp(baseRun,objArgs);
            baseRunTmp.setFirstResult(idxThread*numOfRecord);
            baseRunTmp.setMaxResults(numOfRecord);
            baseRuns.add(baseRunTmp);
          }       
        }
    }
    
    private Integer getBatchOrRecord(Integer numOfBatchOrRecord, Integer count) {
      Integer batchOrRecord = 0;
      if(count > 0) {
        batchOrRecord = count/numOfBatchOrRecord;
        if(batchOrRecord == 0)
          batchOrRecord = 1;
        else if((count % numOfBatchOrRecord) > 0)
          batchOrRecord += 1;
      }
      return batchOrRecord;
    }
    
    @SuppressWarnings("UseSpecificCatch")
    private BaseRun getBaseRunTmp(BaseRun baseRun, Object[] objArgs) {
      try {
          return baseRun.getClass()
                          .getConstructor(Client.class,OAuthClientFilter.class,String.class)
                          .newInstance(objArgs);           
      } catch (Exception ex) {
          System.out.println(ex);
      }
      return null;
    }
}
