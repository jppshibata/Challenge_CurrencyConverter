package br.com.cursoalura.challenge_currencyconverter.model;

public class CurrencyConverter {
    private String currentCurrency;
    private String currencyToConvert;
    private double currencyToConvertRate;
    private double amount;
    private double amountConverted;
    private String dataCreated;


    public void setAmount(double amount) {
        this.amount = amount;
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
    this.dataCreated = currentApi.time_last_update_utc().substring(0,16);
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
