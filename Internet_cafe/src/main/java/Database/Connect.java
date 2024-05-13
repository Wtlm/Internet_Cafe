/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
            String connectionUrl = "jdbc:sqlserver://ZANG\\SQLEXPRESS:1433;databaseName=InternetCafe;user=sa;password=123456;"
            + "encrypt=true;trustServerCertificate=true;";
           
            connect = DriverManager.getConnection(connectionUrl);
            s = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    
    public void displayData(String cmd, JTable Table){
        if(checkCmd(cmd)){
            status = false;
        }else{
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
                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.setDataVector(rowData, columnName);
                status = true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public boolean checkCmd(String cmd){
        String[] word = {"INSERT", "UPDATE", "DELETE", "DROP", "CREATE", "ALTER"};
        for(String i: word){
            if(cmd.toUpperCase().contains(i)){
                return true;
            }
        }
        return false;
    }

    public String createAddCmd(String TableName){
        String cmd = "INSERT INTO ";
        StringBuilder cmdBuild = new StringBuilder(cmd);
        cmdBuild.append(TableName);
        cmdBuild.append("(");
        int count = 0;
        while(count < 2){
            for(int i = 1; i <= columnName.length; i++){
                if(count < 1)
                    cmdBuild.append(columnName[i-1]);
                else
                    cmdBuild.append("?");
                if(i != columnName.length)
                    cmdBuild.append(", ");
                else
                    cmdBuild.append(") ");
            }
            if(count < 1)
                cmdBuild.append("VALUES(");
            count++;
        }
        return cmdBuild.toString();
    }
    
    public void showAddData(String TableName, String[] getData){
        try {
            String query = createAddCmd(TableName);
            PreparedStatement pst = connect.prepareStatement(query);
//            pst.setString(1,TableName);
            for(int i = 1; i <= columnName.length; i++ ){
               pst.setString(i,getData[i-1]);                
            }
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void selectData(String TableName, JTable Table){
        String id = Table.getModel().getValueAt(Table.getSelectedRow(), 0).toString();
        try {
            String query = "SELECT * FROM ";
            StringBuilder cmdBuild = new StringBuilder(query);
            cmdBuild.append(TableName);
            cmdBuild.append(" WHERE ");
            cmdBuild.append( columnName[0]);
            cmdBuild.append(" = ?");

            PreparedStatement pst = connect.prepareStatement(cmdBuild.toString());
            pst.setString(1, id);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String createUpdateCmd(String TableName){
        String cmd = "UPDATE ";
        StringBuilder cmdBuild = new StringBuilder(cmd);
        cmdBuild.append(TableName);
        cmdBuild.append(" SET ");
        for(int i = 1; i <= columnName.length*2 +1; i++){
            if(i > columnName.length*2){
                cmdBuild.append("WHERE ") ;
                cmdBuild.append(columnName[0]);
                cmdBuild.append(" = ") ;
                cmdBuild.append(" ? ") ;
            }
            else{
                if(i % 2 != 0){
                    cmdBuild.append(columnName[(i-1)/2]);
                    cmdBuild.append(" = ");
                }
                else{
                    cmdBuild.append("?");
                    if(i != columnName.length*2)
                        cmdBuild.append(", ");
                }
            }
        }
        return cmdBuild.toString();
    }
    
    public void showUpdateData(String TableName, String[] getData, JTable Table){
        String id = Table.getModel().getValueAt(Table.getSelectedRow(), 0).toString();  
        try {
            String query = createUpdateCmd(TableName);
            PreparedStatement pst = connect.prepareStatement(query);
            for(int i = 1; i <= columnName.length+1; i++){
                if(i == (columnName.length+1))
                    pst.setString(i, id);
                else
                    pst.setString(i,getData[i-1]);   
            }
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void showDeleteData(String TableName, String data){
        try {
            String query = "DELETE FROM ";
            StringBuilder cmdBuild = new StringBuilder(query);
            cmdBuild.append(TableName);
            cmdBuild.append(" WHERE ");
            cmdBuild.append( columnName[0]);
            cmdBuild.append(" = ?");
            
            PreparedStatement pst = connect.prepareStatement(cmdBuild.toString());
            pst.setString(1, data);
            pst.executeUpdate();
        } catch (SQLException e) {
             e.printStackTrace();
        }  
    }   
}

