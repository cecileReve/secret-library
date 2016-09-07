
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdDConnexion {
    
    public Connection connectDataBase(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch(ClassNotFoundException ex){
            System.err.println("Oops : ClassNotFound : "+ex.getMessage());
        }
        Connection connexion = null;
        
        try{
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=librairie;user=sa;password=sa";
            connexion = DriverManager.getConnection(url);
        }catch(SQLException ex){
            System.err.println("Oops : SQLConnexion : "+ex.getMessage());
        }
        return connexion;
    }
    
    public void closeConnectionDataBase(Connection connexion){
        try{
            connexion.close();
        } catch(SQLException ex){
            System.err.println("Oops : SQLClose : "+ex.getMessage());
        }
        System.out.println("DONE !!!");
    }
    
}
