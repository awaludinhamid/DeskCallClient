/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.util;

/**
 * @created Aug 24, 2014
 * @author awal
 */
public enum TableType {
    // konstanta penanda jenis table yg akan diseksekusi
    MASTER(1),      //tabel master
    TASK(2),        //table task LKD
    RESULT(3),      //table result LKD
    BIG_TABLE(4);   //table master dengan jumlah data besar
    private int type;
    private TableType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }
}
