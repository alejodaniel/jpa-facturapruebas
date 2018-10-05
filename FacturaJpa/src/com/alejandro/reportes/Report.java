package com.alejandro.reportes;

import com.alejandro.dominio.Persona;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
//import org.apache.commons.logging.Log;

public class Report {

    private Connection conn;

    public Report() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturajpadb","root","alejodaniel12345");
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void imprimir(Persona persona) {
        //Crear el objeto reporte
        JasperReport reporte;
        //Aqui ponemos la ubicacion del reporte

        String path = "C:\\Users\\Alejandro\\Desktop\\jpa-facturapruebas\\FacturaJpa\\build\\classes\\com\\alejandro\\reportes\\VehiculosReport.jasper";
////        String path = System.getProperty("user.dir") + "/src/com/alejandro/reportes/VehiculosReport.jasper";
        try {
            Map parametros = new HashMap();
            parametros.put("idPersona", persona.getIdPersona());
            parametros.put("nombrePersona", persona.getNombre());
            //Cargo el reporte al objeto
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Se llena el reporte con tres parametros path , null , y la variable de la conexion
            JasperPrint imprime = JasperFillManager.fillReport(reporte, parametros, conn);
            //se crea la vista del reporte 
            JasperViewer vista = new JasperViewer(imprime, false);
            // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vista.setVisible(true);
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
