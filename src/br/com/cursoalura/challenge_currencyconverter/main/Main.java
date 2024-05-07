package br.com.cursoalura.challenge_currencyconverter.main;

import br.com.cursoalura.challenge_currencyconverter.converters.ConvertJsonToObject;
import br.com.cursoalura.challenge_currencyconverter.converters.ConvertObjectToJson;
import br.com.cursoalura.challenge_currencyconverter.model.CurrencyConverter;
import br.com.cursoalura.challenge_currencyconverter.model.CurrencyConverterAPI;
import br.com.cursoalura.challenge_currencyconverter.search.SearchCurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        double amount = 0;
        String dataCurrentJson = "";
        List<CurrencyConverter> currencyList = new ArrayList<>();
        SearchCurrency dataCurrency = new SearchCurrency();
        ConvertJsonToObject convertJs = new ConvertJsonToObject();
        CurrencyConverter currentConvertObj = null;
        CurrencyConverterAPI myCurrentAPI = null;
        ConvertObjectToJson jsonList = null;
        FileWriter writeText = new FileWriter("CurrentConvert.txt");

        while(option != 15) {
            System.out.println("**********************************************");
            System.out.println("**********************************************");
            System.out.println("1 - Real Brasileiro ==> Dólar Americano");
            System.out.println("2 - Real Brasileiro ==> Peso Argentino");
            System.out.println("3 - Real Brasileiro ==> Peso Boliviano");
            System.out.println("4 - Real Brasileiro ==> Peso Chileno");
            System.out.println("5 - Real Brasileiro ==> Peso Colombiano");
            System.out.println("6 - Dólar Americano ==> Peso Argentino");
            System.out.println("7 - Dólar Americano ==> Real Brasileiro");
            System.out.println("8 - Dólar Americano ==> Peso Boliviano");
            System.out.println("9 - Dólar Americano ==> Peso Chileno");
            System.out.println("10 - Dólar Americano ==> Peso Colombiano");
            System.out.println("11 - Peso Argentino ==> Real Brasileiro");
            System.out.println("12 - Peso Colombiano ==> Real Brasileiro");
            System.out.println("13 - Peso Chileno ==> Real Brasileiro");
            System.out.println("14 - Peso Boliviano ==> Real Brasileiro");
            System.out.println("15 - Sair, Criar e Ver o Historico");
            System.out.println("**********************************************");
            System.out.println("**********************************************");
            System.out.println("Digite uma das opções:");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("BRL", "USD", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("BRL", "ARS", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("BRL", "BOB", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 4:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("BRL", "CLP", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 5:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("BRL", "COP", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 6:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("USD", "ARS", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 7:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("USD", "BRL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 8:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("USD", "BOL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 9:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("USD", "CLP", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 10:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("USD", "COL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 11:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("ARS", "BRL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 12:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("COL", "BRL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 13:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("CLP", "BRL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 14:
                    System.out.println("Digite o valor a ser convertido");
                    amount = scanner.nextDouble();
                    dataCurrentJson = dataCurrency.getCurrencyConvert("COP", "BRL", amount);
                    myCurrentAPI  = convertJs.convertJsToObj(dataCurrentJson);
                    currentConvertObj = new CurrencyConverter(myCurrentAPI);
                    currentConvertObj.setAmount(amount);
                    System.out.println(currentConvertObj);
                    currencyList.add(currentConvertObj);
                    break;
                case 15:
                    jsonList = new ConvertObjectToJson();
                    String jsonListConvert = jsonList.convertObjToJson(currencyList);
                    writeText.write(jsonListConvert);
                    writeText.close();
                    System.out.println(currencyList);
                    break;
            }
        }
    }
}