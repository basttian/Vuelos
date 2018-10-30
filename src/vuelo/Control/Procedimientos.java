/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Control;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;

/**
 *
 * @author Sebastian
 */
public class Procedimientos {
    
    //JdateChooser Cargar Fechas String
    SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
     public String getFecha(JDateChooser jdc){
        if (jdc.getDate()!=null){
            return Formato.format(jdc.getDate());
        }else{
	    return null;
            }
	}
    //De Cadena de texto a Date
     public java.util.Date StringADate(String fecha) {
        SimpleDateFormat formtx = new SimpleDateFormat("yyyy-MM-dd"); 
        Date fech = null;
        try {
            fech = formtx.parse(fecha);
            return fech;
        } catch (ParseException ex) {
            Logger.getLogger(Procedimientos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public String getFechaActual(String n) {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
     
     
    public static java.util.Date sumarFechasDias(java.sql.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.sql.Date(cal.getTimeInMillis());
    } 
 
    public int SpiN(JSpinner spinner) {
        int num = (Integer) spinner.getModel().getValue();
        return num ;
    } 
    
    public Date StringATime(String time) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
            Date dt = df.parse(time);
            return dt;
        } catch (ParseException ex) {
            Logger.getLogger(Procedimientos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
 
    
    
}