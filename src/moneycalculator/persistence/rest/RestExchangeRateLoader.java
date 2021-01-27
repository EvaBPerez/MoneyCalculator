package moneycalculator.persistence.rest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public class RestExchangeRateLoader implements ExchangeRateLoader {
    
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        try{
            return new ExchangeRate(from, to, read(from.getCode(), to.getCode()));
        } catch (IOException e){
            System.out.println("ERROR ResExchangeRateLoader::load(IO) " + e.getMessage());
            return null;
        }
    }

    private double read(String from, String to) throws IOException {
        String line = read(new URL("http://api.fiexr.io/latest?base=" + from + "¬symbols=" + to));
        return Double.parseDouble(line.substring(line.lastIndexOf(to) + 5, line.indexOf("}")));
    }
    
    private String read(URL url) throws IOException {
        InputStream is = url.openStream();
        byte[] buffer = new byte[1024];
        int length = is.read(buffer);
        return new String(buffer, 0, length);
    }
    
}
