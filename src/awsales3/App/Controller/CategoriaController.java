/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.App.Controller;

import awsales3.App.Controller.SwingWorkers.AsyncLoadCategoria;
import javax.swing.JComboBox;

/**
 *
 * @author jkevi
 */
public class CategoriaController {
    public void loadCategoria(JComboBox jbBox){
        AsyncLoadCategoria alc = new AsyncLoadCategoria(jbBox);
        alc.execute();
    }
}
