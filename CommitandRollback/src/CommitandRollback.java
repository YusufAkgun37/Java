import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CommitandRollback {
    private String kullanici_adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host =  "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public CommitandRollback() {
        
        // "jbdc:mysql://localhost:3306/demo" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver is not found....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Connection successfull...");
            
            
        } catch (SQLException ex) {
            System.out.println("Conenction Failed...");
            //ex.printStackTrace();
        }
        
    }
    public void commitverollback() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            con.setAutoCommit(false);
            
            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'yusufakgun1050@gmail.com' where id = 1";
            
            System.out.println("Before the Update");
            calisanlariGetir();
            
            Statement statement = con.createStatement();
            
            statement.executeUpdate(sorgu1);
            
            statement.executeUpdate(sorgu2);
            
            System.out.println("Do you want your transactions to be saved?? (yes/no)");
            String cevap = scanner.nextLine();
            
            if (cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Database is Updated...");
                
            }
            else {
                con.rollback();
                System.out.println("Database Update is cancelled...");
                calisanlariGetir();
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitandRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public void calisanlariGetir() {
        
        String sorgu = "Select * From calisanlar";
      
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Id : " + id + "Ad: " + ad + "Soyad : " + soyad + " Email : " + email);
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitandRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static void main(String[] args) {
        CommitandRollback comroll = new CommitandRollback();
        //baglanti.calisanlariGetir();
        
        comroll.commitverollback();
        
        
        
    }
}

