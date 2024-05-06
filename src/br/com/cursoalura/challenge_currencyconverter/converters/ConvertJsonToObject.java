package br.com.cursoalura.challenge_currencyconverter.converters;

import br.com.cursoalura.challenge_currencyconverter.model.CurrencyConverterAPI;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertJsonToObject {


    public CurrencyConverterAPI ConvertJsToObj(String jsonConvert) {
        Gson gson = null;
        try {
            gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .setPrettyPrinting()
                    .create();

        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro ao executar");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de endereço ou argumento passado, verifique");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O programa finalizou corretamente!");
        }
        return gson.fromJson(jsonConvert, CurrencyConverterAPI.class);
    }
}
