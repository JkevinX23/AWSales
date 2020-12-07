
package awsales3.App.Controller;

import awsales3.App.Controller.SwingWorkers.AsyncCreatePedido;
import awsales3.App.Controller.SwingWorkers.AsyncLoadPedidos;
import awsales3.App.Models.Pedido;
import javax.swing.JTable;


public class PedidoController {
   public void loadPedidos(JTable table){
       AsyncLoadPedidos alp = new AsyncLoadPedidos(table);
       alp.execute();
   } 
    public void createPedido(Pedido pedido){
     AsyncCreatePedido acp = new AsyncCreatePedido(pedido);
     acp.execute();
 }
}
