package moneycalculator;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eva
 */
public class CsvFileCurrencyLoader implements CurrencyLoader {
    private final String filename;

    public CsvFileCurrencyLoader(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Currency> load() {

        List<Currency> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader (filename))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] split = line.split(",");
                result.add(new Currency(split[0], split[1], split[2]));
            }
  
        } catch (IOException ex) {
        }
        return result;
    }
    
}
