/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Controller;

import awsales3.App.Controller.SwingWorkers.AsyncLoadModel;
import javax.swing.JComboBox;

/**
 *
 * @author jkevi
 */
public class ModeloController {
    public void loadModelo(JComboBox jcb){
        AsyncLoadModel alm = new AsyncLoadModel(jcb);
        alm.execute();
    }
}
