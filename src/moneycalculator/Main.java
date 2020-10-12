/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Currency> list = new CsvFileCurrencyLoader("currencies.csv").load();
        for (Currency currency : list) {
            System.out.println(currency);
        }
        
    }
    
}
