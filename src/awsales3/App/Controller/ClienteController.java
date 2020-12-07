package awsales3.App.Controller;

import awsales3.App.Controller.SwingWorkers.AsyncCreateUser;
import awsales3.App.Controller.SwingWorkers.AsyncLoadClient;
import awsales3.App.Models.Cliente;
import javax.swing.JTable;

public class ClienteController {

    public void newClient(Cliente client) {
        AsyncCreateUser acu = new AsyncCreateUser(client);
        acu.execute();
    }
    
    public void loadClient(JTable table){
        AsyncLoadClient alt = new AsyncLoadClient(table);
        alt.execute();
    }
}