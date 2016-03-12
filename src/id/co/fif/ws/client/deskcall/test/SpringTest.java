/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.test;

import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import id.co.fif.ws.client.deskcall.service.FsMstOfficesExtVService;
import id.co.fif.ws.client.deskcall.util.SessionUtil;
import java.util.List;

/**
 * @created Mar 25, 2013
 * @author awal
 */
public class SpringTest {

    public static void main(String[] args) {
        FsMstOfficesExtVService tblBranchService =
                new SessionUtil<FsMstOfficesExtVService>().getAppContext("fsMstOfficesExtVService");

        FsMstOfficesExtV tb = new FsMstOfficesExtV();
        tb.setOfficeCode("10100");
        tb.setNameShort("Jakarta - 1");
        tblBranchService.save(tb);

        List<FsMstOfficesExtV> tblBranches = tblBranchService.getFsMstOfficesExtVs();
        for(FsMstOfficesExtV tblBranche : tblBranches) {
            System.out.println(tblBranche.getOfficeCode());
            System.out.println(tblBranche.getNameShort());
        }
    }
}
