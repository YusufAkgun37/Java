
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    
    private String user_name = "root";
    private String password = "";
    private String db_name = "demo";
    private String host = "localhost";
    private int port = 3306;
    
    private Connection c = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    public void preparedGetEmployees(int id){
        
        String query = "Select * From calisanlar where id > ? and ad like ?";
        
        try {
            preparedStatement = c.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "B%");
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad:" + ad + " Soyad:" + soyad + " Email:" + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void addEmployee(){
        
        try {
            statement = c.createStatement();
            String ad = "Semih";
            String soyad = "Aktaş";
            String email = "Semihaktas@gmail.com";
            String query = "INSERT INTO calisanlar (ad,soyad,email) VALUES(" + "'" + ad + "'," + "'" + soyad + "'," + "'" + email + "')"; 
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void deleteEmployee(){
        
        try {
            statement = c.createStatement();
            
            String query = "Delete from calisanlar Where id > 4";
            
            int value = statement.executeUpdate(query);
            System.out.println(value + "rows affected...");
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    public void updateEemployee(){
        
        try {
            statement = c.createStatement();
            
            String query = "Update calisanlar Set email = 'example@gmail.com' where id > 3";
            
            statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    public void getEmployees() {
        
        String query = "Select * From calisanlar";
        
        try {
            statement = c.createStatement();
            
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()){
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Id: " + id + " Ad: " + ad + " Soyad: " + soyad + " Email: " + email);
                
            }
                       
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Connect() {
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver is not found...");
        }
        
        try {
            c = DriverManager.getConnection(url, user_name, password);
            System.out.println("Connection succesfull...");
        } catch (SQLException ex) {
            System.out.println("Connection failed...");
        }
           
    }
    public static void main(String[] args) {
        Connect connect = new Connect();
       /* System.out.println("Before Delete.............");
        connect.getEmployees();
        System.out.println("**************************");
        System.out.println("After Delete..............");
        connect.deleteEmployee();
        connect.getEmployees();*/
       connect.preparedGetEmployees(1);

    }
    
}
