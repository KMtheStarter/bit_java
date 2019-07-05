/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package use;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author bit
 */
public class ConnDemo {
 
    public static void main(String[] args) {
        try(Connection con = conn.ConnDriver.getMyConnection();){
            System.out.println(con);
            
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
