/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jkevi
 */
public class Database {
     public Connection getConnection( ){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@grad.icmc.usp.br:15215:orcl","j221290","j221290"); 
            
            return con;
            
        }catch(ClassNotFoundException | SQLException e){ System.out.println(e); return null;}  
    }
}
