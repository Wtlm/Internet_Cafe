/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public boolean modify;
    
    public Connect(){
       try{
            String connectionUrl = "jdbc:sqlserver://LAPTOP-DCGSC18J\\SQLEXPRESS:1433;databaseName=Attendance;user=sa;password=123456;"
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
            for(int i = 1; i < columnName.length; i++){
                if(count < 1)
                    cmdBuild.append(columnName[i]);
                else
                    cmdBuild.append("?");
                if(i != columnName.length -1)
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
            for(int i = 1; i < columnName.length; i++ ){
               pst.setString(i,getData[i-1]);                
            }
            pst.executeUpdate();
            modify = true;
        } catch (SQLException e) {
            e.printStackTrace();
            modify = false;

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
        for(int i = 1; i < columnName.length*2 +1; i++){
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
            for(int i = 1; i < columnName.length+1; i++){
                if(i == (columnName.length+1))
                    pst.setString(i, id);
                else
                    pst.setString(i,getData[i-1]);   
            }
            pst.executeUpdate();
            modify = true;          
        } catch (SQLException e) {
            e.printStackTrace();
            modify = false;

        }
    }

    public void showDeleteData(String TableName, String data){
        try {
            String query = "DELETE FROM Attendance WHERE StuID IN (SELECT StudentID FROM Student";
            StringBuilder cmdBuild = new StringBuilder(query);   
            cmdBuild.append(" WHERE Student.StudentName = '");
            cmdBuild.append(data);
            cmdBuild.append("')");
            
            PreparedStatement pst = connect.prepareStatement(cmdBuild.toString());
            pst.executeUpdate();
            modify = true;
        } catch (SQLException e) {
             e.printStackTrace();
            modify = false;
        }  
    }  
    
    public void insertSubject(String[] getData){
        PreparedStatement pst;

        String cmd = "INSERT INTO Subject(SubjectName) VALUES('";
        StringBuilder cmdBuild = new StringBuilder(cmd);
        cmdBuild.append(getData[0]);
        cmdBuild.append("')");
        
        cmd = "INSERT INTO TeacherSubject (SubID, TeaID) "
            + "VALUES ((SELECT SubjectID FROM Subject WHERE SubjectName = '";
        StringBuilder cmdBuild2 = new StringBuilder(cmd);
        cmdBuild2.append(getData[0]);
        cmdBuild2.append("'),(SELECT TeacherID FROM Teacher WHERE TeacherName = '");
        cmdBuild2.append(getData[1]);
        cmdBuild2.append("'))");       
        
        try {
            pst = connect.prepareStatement(cmdBuild.toString());
            pst.executeUpdate();
            pst = connect.prepareStatement(cmdBuild2.toString());
            pst.executeUpdate();
            modify = true;
        } catch (SQLException e) {
            e.printStackTrace();
            modify = false;
        }
    }
    public String cmdRelationship(){
        String cmd =  "SELECT S.SubjectID, T.TeacherID, S.SubjectName, T.TeacherName "
                    + "FROM Subject as S "
                    + "JOIN TeacherSubject as TS ON S.SubjectID = TS.SubID "
                    + "JOIN Teacher as T ON T.TeacherID = TS.TeaID";
        return cmd;
    }
        
    public void insertLesson(String[] getData){
        PreparedStatement pst;

        String cmd = "INSERT INTO Lesson (DateOfLesson, SubID, TeaID) VALUES ('";
        StringBuilder cmdBuild = new StringBuilder(cmd);
        cmdBuild.append(getData[0]);
        cmdBuild.append("',(SELECT SubjectID FROM Subject WHERE SubjectName = '");
        cmdBuild.append(getData[1]);
        cmdBuild.append("'),(SELECT TeacherID FROM Teacher WHERE TeacherName = '");
        cmdBuild.append(getData[2]);
        cmdBuild.append("'))");       
        
        try {
            pst = connect.prepareStatement(cmdBuild.toString());
            pst.executeUpdate();
            modify = true;
        } catch (SQLException e) {
            e.printStackTrace();
            modify = false;
        }
    }
    
    public String cmdLesson(){
        String cmd =  "SELECT L.LessonID, L.DateOfLesson,S.SubjectID, T.TeacherID, S.SubjectName, T.TeacherName "
                    + "FROM Lesson as L "
                    + "JOIN Subject as S ON S.SubjectID = L.SubID "
                    + "JOIN Teacher as T ON T.TeacherID = L.TeaID";
        return cmd;
    }
}

