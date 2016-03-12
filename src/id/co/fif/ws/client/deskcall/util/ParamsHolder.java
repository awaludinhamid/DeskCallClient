/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.util;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @created May 17, 2014
 * @author awal
 */
public class ParamsHolder {

    private static Map<String,String> paramsMap =
            Collections.synchronizedMap(new LinkedHashMap<String,String>());

    /**
     * @return the paramsMap
     */
    public static Map<String, String> getParamsMap() {
        return paramsMap;
    }

    /**
     * Disable, must set params through its keyset
     * @param aParamsMap the paramsMap to set
     */
    //public static void setParamsMap(Map<String, String> aParamsMap) {
      //  paramsMap = aParamsMap;
    //}

    // singleton
    private ParamsHolder() {}
}
