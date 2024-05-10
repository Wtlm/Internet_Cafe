/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Chung Anh
 */
public class Connect {
    public Connection connect;
    public Statement s;
    public ResultSet rs;
    public String rowData[][];
    public String columnName[];
    public boolean status;
    
    public Connect(){
       try{
            String connectionUrl = "jdbc:sqlserver://LAPTOPCUATUI\\SQLEXPRESS:1433;databaseName=InternetCafe;user=sa;password=123456;"
            + "encrypt=true;trustServerCertificate=true;";
           
            connect = DriverManager.getConnection(connectionUrl);
            s = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    
    public void displayData(String cmd){
        try {
            rs = s.executeQuery(cmd);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            columnName = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                columnName[i] = metaData.getColumnName(i+1);
            }
            rs.last();
            int row = rs.getRow();
            int col = rs.getMetaData().getColumnCount();
            rs.beforeFirst();
            rowData = new String[row][col];
            int r = 0;
            while(rs.next()){
                for(int i = 0; i < col; i++){
                    rowData[r][i] = rs.getString(i+1);
                }
                r++;
            }
            status = true;
        } catch (SQLException e) {
            status = false;
        }
    }
}
