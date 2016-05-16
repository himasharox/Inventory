/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package othermethods;

/**
 *
 * @author hrox
 */
public class StringManipulator {
    
    public static String[] getIdNameSeperatelyFromItem(String item){
        
        //data -> 0 = id, 1 = name
        String []data = new String[2];
        
        data[0] = item.substring(0, item.indexOf("-"));
        data[1] = item.substring(item.indexOf("-"));
        
        return data;
    }
}
