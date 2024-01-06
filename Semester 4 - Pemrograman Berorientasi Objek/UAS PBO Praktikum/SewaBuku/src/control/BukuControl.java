

package control;


import dao.bukuDao;
import java.util.List;
import model.buku;
import table.TableBuku;

public class BukuControl {
    private bukuDao bDao = new bukuDao();
    
    public void insertDataBuku(buku b) {
        bDao.insertBuku(b);
    }
    
    public TableBuku showDataBuku (){
        List<buku> dataBuku = bDao.showBuku();
        TableBuku tableBuku = new TableBuku(dataBuku);
        return tableBuku;
    }
    
    public void updateDataBuku(buku b) {
        bDao.updateBuku(b);
    }
    
    public void deleteDataBuku(int id){
       bDao.deleteBuku(id);
    }
}
