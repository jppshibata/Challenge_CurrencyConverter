# Olá, Bem vindo ao meu projeto Conversor de Moedas Feito em Java
 
## Ferramentas utilizadas:

* Java

## Requisitos:
A aplicação foi desenvolvida e testada com a versão 17 do Java, mas deve funcionar com Java a partir da versão 11.

## Descrição da Aplicação:

### Conforme a proposta, o conversor de moedas permite que certos valores de moedas sejam convertidos e mostrados em outra determinada moeda, estes valores foram retirados de uma API chamada <a href="https://www.exchangerate-api.com/">Exchange Rate API</a>, o qual possui as informações necessárias para a execução dessa conversão.
 * Valor da moeda base;
 * Valor da moeda convertida;
 * Diferença entre a base e a moeda a se converter em relação a valor;
 * O Montante a ser convertido, o qual é fornecido um valor inicial antes desta resolução;
 * E como informação adicional, informações de quando que foi feito a solicitação dessa conversão pelo usuário (Dia e Dia da Semana, Mês, Ano).
 
 ### A aplicação de uma forma simplificada pega essas informações da API, e permite que o usuário escolha entre determinadas opções.
 
  * 1 - Real Brasileiro ==> Dólar Americano;
  * 2 - Real Brasileiro ==> Peso Argentino;
  * 3 - Real Brasileiro ==> Peso Boliviano
  * 4 - Real Brasileiro ==> Peso Chileno;
  * 5 - Real Brasileiro ==> Peso Colombiano;
  * 6 - Dólar Americano ==> Peso Argentino;
  * 7 - Dólar Americano ==> Real Brasileiro;
  * 8 - Dólar Americano ==> Peso Boliviano;
  * 9 - Dólar Americano ==> Peso Chileno;
  * 10 - Dólar Americano ==> Peso Colombiano;
  * 11 - Peso Argentino ==> Real Brasileiro;
  * 12 - Peso Colombiano ==> Real Brasileiro;
  * 13 - Peso Chileno ==> Real Brasileiro;
  * 14 - Peso Boliviano ==> Real Brasileiro;
  * 15 - Sair, Criar e Ver o Historico.
    
### Adendo que foram utilizadas as Bibliotecas Gson para que pudesse converter o Json fornecido da API para Objeto e vice-versa para que possa ter sido criado com o FileWriter o Log de uso da aplicação.
### Esse Log possui as seguintes informações:
* A Moeda Base
* A Moeda a ser convertida
* O valor da moeda a se converter em relação a base
* A quantia fornecida pelo usuário
* A quantia na moeda convertida
* Informações de data (dia, dia da semana, mẽs, ano) de quando foi feito essa solicitação. 

## Feito por:

### João Paulo Pagenotto Shibata

### Linkedin: https://www.linkedin.com/in/joao-paulo-pagenotto-shibata

```
