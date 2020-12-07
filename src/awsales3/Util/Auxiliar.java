/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awsales3.Util;

import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author jkevi
 */
public class Auxiliar {
    public String getCodigo(){
        int randInt = new Random().ints(1,30000,90000).findFirst().getAsInt();
        return String.valueOf(randInt);
    }
}
