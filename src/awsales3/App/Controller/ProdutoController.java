
package awsales3.App.Controller;

import javax.swing.JTable;
import awsales3.App.Controller.SwingWorkers.AsyncLoadProduct;

public class ProdutoController {
    public void loadProduct(JTable table){
        AsyncLoadProduct alp = new AsyncLoadProduct(table);
        alp.execute();
    }
    
}
