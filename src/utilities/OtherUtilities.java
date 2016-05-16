/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Himasha
 */
public class OtherUtilities {

    public static String getCurrentDate() {
        
        Calendar jc = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = format1.format(jc.getTime());

        return currentDate;
    }
    
    public static void displayInternalFrame(JInternalFrame jif,JDesktopPane jdp){
            
        jdp.add(jif);
        Dimension desktopSize = jdp.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        jif.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
        jif.show();   
    }

    public static void clearJTable(JTable jt){
        DefaultTableModel dtm = (DefaultTableModel)jt.getModel();
        dtm.setRowCount(0);
        jt.setModel(dtm);
    }
    
    public static String getDateFromDateChooser(JDateChooser jdc){
    
        String date = "";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        date = sdf.format(jdc.getDate());
        
        return date;
    }
    
}
