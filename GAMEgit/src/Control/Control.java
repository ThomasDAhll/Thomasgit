/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author tadah
 */
public class Control {
private static String out;
private boolean update;
private static String rActiveImg; 

    public static String getOut(){
        return out;
    }

    public static void setOut(String a){
        out = "\n" +a;
    }

    /**
     * @return the update
     */
    public boolean getUpdate() {
        return update;
    }

    /**
     * @param update the update to set
     */
    public void setUpdate(boolean update) {
        this.update = update;
    }

    /**
     * @return the activeImg
     */
    public String getRActiveImg() {
        return rActiveImg;
    }

    /**
     * @param activeImg the activeImg to set
     */
    public void setRActiveImg(String activeImg) {
        this.rActiveImg = activeImg;
    }
}
