package br.com.relatorio.xpt.utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MoneyConverter {

    private MoneyConverter() {}

    public static double moneyConverter(String valor) throws ParseException {
        Locale locale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        return numberFormat.parse(valor).doubleValue();
    }
}
