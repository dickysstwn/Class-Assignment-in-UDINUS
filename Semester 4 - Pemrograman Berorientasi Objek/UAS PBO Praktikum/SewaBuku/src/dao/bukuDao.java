

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.buku;


public class bukuDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertBuku(buku b){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO buku(judul_buku, pengarang, penerbit, tahun_terbit, status) VALUES ('"
                + b.getJudulBuku() + "','" + b.getPengarang() + "','" + b.getPenerbit() +  "'," + b.getTahun_terbit()+ "," +b.getStatus() + ")";
        
        System.out.println("Adding Buku...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Buku");
            statement.close();
        } catch (Exception e){
            System.out.println("Error adding Buku...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateBuku(buku b) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE buku SET judul_buku = '" + b.getJudulBuku() + "',"
                + "pengarang = '" + b.getPengarang() + "', " +  "penerbit = '" +b.getPenerbit() + "', " + " tahun_terbit = "+b.getTahun_terbit() + " , " + "status = " +b.getStatus() + " WHERE buku_id = '"+b.getIdBuku()+"'";
        System.out.println("Editing Buku...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Buku "+b.getIdBuku());
            statement.close();
        } catch (Exception e){
            System.out.println("Error editing Buku...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<buku> showBuku(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM buku";
        System.out.println("Mengambil data Buku...");
        
        List<buku> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()) {
                    buku b = new buku(
                            Integer.parseInt(rs.getString("buku_id")),
                            rs.getString("judul_buku"),
                            rs.getString("pengarang"),
                            rs.getString("penerbit"),
                            Integer.parseInt(rs.getString("tahun_terbit")),
                            Integer.parseInt(rs.getString("status")));
                    
                    list.add(b);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
    
    public void deleteBuku(int id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM buku WHERE buku_id = " + id + "";
        System.out.println("Deleteing Buku...");
        
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Buku "+id);
            statement.close();
        } catch (Exception e){
            System.out.println("Error deleting buku...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    

}
