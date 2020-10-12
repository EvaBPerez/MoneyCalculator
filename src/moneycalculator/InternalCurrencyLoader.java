package moneycalculator;


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
public class InternalCurrencyLoader implements CurrencyLoader {

    @Override
    public List<Currency> load() {
        List<Currency> list = new ArrayList<>();
        list.add(new Currency("USD", "Dolar americano", "$"));
        list.add(new Currency("EUR", "Euro", "€"));
        list.add(new Currency("GPB", "Libra británica", "&"));
        list.add(new Currency("MXN", "Peso mexicano", "$"));
        return list;
    }
    
}
