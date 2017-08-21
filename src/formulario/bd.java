/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Tocuhier
 */
public class bd {
    Connection cont;
    Statement stat;
    String classname, url, usuario, contra;
    
    public bd(){
            cont= null;
            stat= null;
        classname= "com.mysql.jdbc.Driver";
        url= "jdbc:mysql://localhost/escuela";
        usuario= "root";
        contra= "n0m3l0";
    }
    public void state() throws Exception{
        Class.forName(classname).newInstance();
        cont= DriverManager.getConnection(url, usuario, contra);
        stat= cont.createStatement();
    }
    public void agregar(String nombre, String app, String apm, String escuela) throws SQLException{
        stat.executeUpdate("Insert into escuela VALUES(null,'"+ nombre +"','"+ app +"','"+ apm +"','"+ escuela +"');");
        cont.close();
    }
}
