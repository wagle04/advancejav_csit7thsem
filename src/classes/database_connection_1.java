
package classes;

import java.sql.*;


public class database_connection_1 {
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/javalabworks";
    
    public static void main(String args[]){
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = DriverManager.getConnection(
            DATABASE_URL, "abc", "pqr");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(
            "select * from person");
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("All table of person database:\n");
            
            for (int i=1;i<=numberOfColumns;i++)
                System.out.printf("%-8s\t",metaData.getColumnName(i));
                System.out.println();
                
                
            while(resultSet.next()){
                for (int i=1;i<=numberOfColumns;i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                    System.out.println();
            }
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        finally{
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch(Exception exception){
                exception.printStackTrace();
            }
        }
    }
}
