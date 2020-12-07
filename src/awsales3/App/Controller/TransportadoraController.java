
package awsales3.App.Controller;

import awsales3.App.Controller.SwingWorkers.AsyncCreateTranportadora;
import awsales3.App.Controller.SwingWorkers.AsyncLoadTransportadora;
import awsales3.App.Models.Transportadora;
import javax.swing.JTable;

public class TransportadoraController {
    public void createTranportadora(Transportadora transportadora){
        AsyncCreateTranportadora act = new AsyncCreateTranportadora(transportadora);
        act.execute();
    }
    
    public void loadTransportadoras(JTable tabela){
        AsyncLoadTransportadora alt = new AsyncLoadTransportadora(tabela);
        alt.execute();
    }
}
