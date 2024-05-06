package br.com.cursoalura.challenge_currencyconverter.model;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private String currentCurrency;
    private String currencyToConvert;
    private double currencyToConvertRate;
    private double amount;
    private double amountConverted;

    public double getAmountConverted() {
        return amountConverted;
    }

    public void setAmountConverted(double amountConverted) {
        this.amountConverted = amountConverted;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrentCurrency() {
        return currentCurrency;
    }

    public void setCurrentCurrency(String currentCurrency) {
        this.currentCurrency = currentCurrency;
    }

    public String getCurrencyToConvert() {
        return currencyToConvert;
    }

    public void setCurrencyToConvert(String currencyToConvert) {
        this.currencyToConvert = currencyToConvert;
    }

    public double getCurrencyToConvertRate() {
        return currencyToConvertRate;
    }

    public void setCurrencyToConvertRate(double currencyToConvertRate) {
        this.currencyToConvertRate = currencyToConvertRate;
    }

    public CurrencyConverter(String currentCurrency, String currencyToConvert, double amount){
        this.currentCurrency = currentCurrency;
        this.currencyToConvert = currencyToConvert;
        this.amount = amount;
    }

    public CurrencyConverter(CurrencyConverterAPI currentApi){
    this.currentCurrency = currentApi.base_code();
    this.currencyToConvert = currentApi.target_code();
    this.currencyToConvertRate = Double.valueOf(currentApi.conversion_rate());
    this.amountConverted = Double.valueOf(currentApi.conversion_result());

    }

    @Override
    public String toString() {
        return "Moeda Base:"+currentCurrency+
                ";\n"+
                "Conversão para:"+currencyToConvert+
                ";\n"+
                "Valor Moeda Base: 1.00"+
                ";\n"+
                "Valor da Moeda Base em relação a Moeda Convertida:"+currencyToConvertRate+
                ";\n"+
                "Quantia:"+amount+
                ";\n"+
                "Quantia Convertida:"+amountConverted;
    }
}
