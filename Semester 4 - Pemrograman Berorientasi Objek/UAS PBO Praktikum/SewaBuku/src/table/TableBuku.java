

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.buku;


public class TableBuku extends AbstractTableModel{
    private List<buku> list;

    public TableBuku(List<buku> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getJudulBuku();
            case 1:
                return list.get(rowIndex).getPengarang();
            case 2:
                return list.get(rowIndex).getPenerbit();
            case 3:
                return list.get(rowIndex).getTahun_terbit();
            case 4:
                return list.get(rowIndex).getStatus();
            case 5:
                return list.get(rowIndex).getIdBuku(); 
            default:
                return null;
                
                
        }
        
    }
    
    public String getColumnName(int column){
        switch(column) {
            case 0:
                return "Judul";
            case 1:
                return "Pengarang";
            case 2:
                return "Penerbit";
            case 3:
                return "Tahun Terbit";
            case 4:
                return "Status";
            default:
                return null;
                    
        }
    }
}
