package moneycalculator;

import moneycalculator.persistence.CurrencyLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.persistence.file.CsvFileCurrencyLoader;
import moneycalculator.persistence.rest.RestExchangeRateLoader;

public class Main {

    public static void main(String[] args) {
        CurrencyLoader currencyLoader = new CsvFileCurrencyLoader("currencies.csv");
        ExchangeRateLoader exchageRateLoader = new RestExchangeRateLoader();
        
        MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame(currencyLoader.currencies());
        
        
        
    }
    
}
