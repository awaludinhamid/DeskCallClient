/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.security;

/**
 * @created May 9, 2013
 * @author awal
 */
public class ResponseStatus {

    private enum SuccessStatus {
        OK(200),        // request success
        CREATE(201),    // request success and create new resource
        ACCEPT(202),    // request accepted but has not completed
        NONAUTHOR(203), // request success but response from another source
        NOCONTENT(204); // request success but without content
        private final int status;
        SuccessStatus(int status){
            this.status = status;
        }
        private static Boolean isExists(int status) {
            for(SuccessStatus ss : SuccessStatus.values()) {
                if(ss.status == status)
                    return true;
            }
            return false;
        }
    }

    public static Boolean isSuccess(int status) {
        return SuccessStatus.isExists(status);
    }
}
