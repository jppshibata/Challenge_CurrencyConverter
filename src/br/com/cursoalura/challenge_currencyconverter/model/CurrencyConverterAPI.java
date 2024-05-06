package br.com.cursoalura.challenge_currencyconverter.model;

public record CurrencyConverterAPI(String base_code, String target_code, double conversion_rate, double conversion_result ) {
}
