# 💱 Conversor de Moedas em Java - Alura Challenge

Este é um projeto desenvolvido como parte do Challenge Back-End Java da Alura, focado em aplicar os conceitos fundamentais da linguagem, incluindo Orientação a Objetos, manipulação de coleções e consumo de APIs.

O objetivo do projeto é um conversor de moedas interativo que funciona via console. Ele utiliza a ExchangeRate-API para obter taxas de câmbio em tempo real, permitindo ao usuário realizar diversas conversões de forma rápida e precisa.

---

## 🧠 Visão Geral 

O Conversor de Moedas é uma aplicação simples, mas completa, para praticar os fundamentos de:

- Programação orientada a objetos (POO)
- Consumo de APIs REST com `HttpClient`
- Desserialização de JSON com `GSON`
- Manipulação de entrada e saída (console e arquivos)
- Boas práticas de organização de código e documentação

A aplicação permite converter valores entre diferentes moedas com base na cotação atual obtida da **ExchangeRate API**.

---

## ⚙️ Funcionalidades

- **Menu Interativo**: O usuário interage com um menu no console para escolher as moedas que deseja converter.
- **Conversões Múltiplas**: O programa oferece um mínimo de 6 opções de conversão, incluindo pares populares como:
  - Dólar (USD) ➡️ Real (BRL)
  - Real (BRL) ➡️ Dólar (USD)
  - Dólar (USD) ➡️ Peso Argentino (ARS)
  - Peso Argentino (ARS) ➡️ Dólar (USD)
  - Dólar (USD) ➡️ Euro (EUR)
  - Euro (EUR) ➡️ Dólar (USD)
- **Dados em Tempo Real**: As taxas de câmbio são obtidas dinamicamente a cada execução, garantindo valores atualizados via **API REST**.
- **Consumo de API**: O projeto se conecta à ExchangeRate-API usando `HttpClient` do Java.
- **Desserialização de JSON**: A resposta da API é convertida para objetos Java utilizando a biblioteca `GSON`.

---

## 🏗️ Arquitetura do Projeto

O sistema foi desenvolvido com foco na clareza e modularidade, dividido em três classes principais:

| Classe             | Responsabilidade                                   |
|--------------------|----------------------------------------------------|
| **Main**           | Gerencia o menu e interação com o usuário.         |
| **ConversorDeMoedas** | Processa a lógica de conversão e formata os resultados. |
| **ServicoCambio**  | Faz requisições HTTP à API de câmbio e retorna as taxas. |

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Biblioteca GSON
- Java HTTP Client (nativo do Java)
- IntelliJ IDEA ou VS Code
- ExchangeRate-API
- Maven

---

## ⚙️ Pré-requisitos para Execução

1. Java JDK (versão 17 ou superior) instalado
2. Maven instalado
3. Chave de API da ExchangeRate-API (cadastro gratuito)
4. IDE configurada (IntelliJ, Eclipse ou VS Code)

---

## 🔑 API Utilizada: Configurando a API Key

O projeto utiliza a [ExchangeRate API](https://www.exchangerate-api.com/) — gratuita e simples de integrar.

Endpoint:
https://v6.exchangerate-api.com/v6/SUA_CHAVE_AQUI/latest/USD

## ⚙️ Para configurar:
1. Abra o projeto na sua IDE favorita
2. Navegue até a classe que faz a consulta (ex: `ConsultaApi.java`)
3. Encontre a variável `apiKey`
4. Substitua `"SUA_CHAVE_API"` pela sua chave:
   ```java
// Antes
String apiKey = "SUA_CHAVE_API";

// Depois
String apiKey = "1234abcd5678efgh9012ijkl";

---  

## 🚀 Como Executar o Projeto
-Clone este repositório:
git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git cd conversor-moedas-java

- Adicione a dependência GSON no pom.xml:
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version>
</dependency>

- Compile o projeto com Maven:
mvn clean install

- Ou baixe o .jar da GSON: 🔗 GSON Maven Repository
Insira sua chave da API no arquivo ServicoCambio.java:
private static final String API_KEY = "SUA_CHAVE_AQUI";

- Execute o .jar gerado:
java -jar target/nome-do-seu-arquivo.jar
Ou
java -cp ".;src;gson.jar" Main

---

## 🧑‍💻 Autor
Ramos Nunes
💼 DEV Java | aluno Alura
🔗 LinkedIn

---

## 🏁 Licença
Este projeto é de código aberto, distribuído sob a licença MIT.
Sinta-se à vontade para usar, estudar e modificar conforme desejar

---

🚀 “A prática constante é o caminho da maestria. Cada linha de código é um passo em direção ao domínio.”
Desafio Java > Conversor de Moedas > Alura
