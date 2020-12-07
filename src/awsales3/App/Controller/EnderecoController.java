
package awsales3.App.Controller;

import awsales3.App.Controller.SwingWorkers.AsyncCreateAddress;
import awsales3.App.Controller.SwingWorkers.AsyncLoadAddress;
import awsales3.App.Models.Endereco;
import javax.swing.JTable;

public class EnderecoController {
     public void newAddress(Endereco endereco) {
        AsyncCreateAddress aca = new AsyncCreateAddress(endereco);
        aca.execute();
    }
    
    public void loadAddress(JTable table){
        AsyncLoadAddress ala = new AsyncLoadAddress(table);
        ala.execute();
    }
}
