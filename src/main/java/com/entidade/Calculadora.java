package com.entidade;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author osmar
 */
public class Calculadora {
    
    public double getAdicao(double a, double b) throws JsonProcessingException {
        //Variável de retorno
        double resultado = 0;

        //Url do serviço
        String url = "http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/adicao/" + a + "/" + b;

        //Criar instância do cliente JAX-RS
        Client clienteJAXRS = ClientBuilder.newClient();

        //Criar o parser do JSON para o objeto Mensagem
        ObjectMapper objectMapper = new ObjectMapper();

        //Requisição GET do serviço        
        Response resposta = clienteJAXRS.target(url).request(MediaType.APPLICATION_JSON).get();

        // Verificar o código de resposta
        if (resposta.getStatus() == 200) {
            //Resposta bruta do servidor
            String jsonResposta = resposta.readEntity(String.class);

            System.out.println("Texto resposta do servidor: " + jsonResposta);

            //Preenche os objeto mensagem com os dados do JSON
            CalculadoraResultado calculadoraResultado = objectMapper.readValue(jsonResposta, CalculadoraResultado.class);

            //Guarda o resultado
            resultado = calculadoraResultado.getResultado();

        } else {
            System.out.println("Falha ao obter a calculadora. Código de resposta: " + resposta.getStatus());
        }

        return resultado;
    }

    public double getSubtracao(double a, double b) throws JsonProcessingException {
        //Variável de retorno
        double resultado = 0;

        //Url do serviço
        String url = "http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/subtracao/" + a + "/" + b;

        //Criar instância do cliente JAX-RS
        Client clienteJAXRS = ClientBuilder.newClient();

        //Criar o parser do JSON para o objeto Mensagem
        ObjectMapper objectMapper = new ObjectMapper();

        //Requisição GET do serviço        
        Response resposta = clienteJAXRS.target(url).request(MediaType.APPLICATION_JSON).get();

        // Verificar o código de resposta
        if (resposta.getStatus() == 200) {
            //Resposta bruta do servidor
            String jsonResposta = resposta.readEntity(String.class);

            System.out.println("Texto resposta do servidor: " + jsonResposta);

            //Preenche os objeto mensagem com os dados do JSON
            CalculadoraResultado calculadoraResultado = objectMapper.readValue(jsonResposta, CalculadoraResultado.class);

            //Guarda o resultado
            resultado = calculadoraResultado.getResultado();

        } else {
            System.out.println("Falha ao obter a calculadora. Código de resposta: " + resposta.getStatus());
        }

        return resultado;
    }

    public double getProduto(double a, double b) throws JsonProcessingException {
        double resultado = 0;

        //Url do serviço
        String url = "http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/produto/" + a + "/" + b;

        //Criar instância do cliente JAX-RS
        Client clienteJAXRS = ClientBuilder.newClient();

        //Criar o parser do JSON para o objeto Mensagem
        ObjectMapper objectMapper = new ObjectMapper();

        //Requisição GET do serviço        
        Response resposta = clienteJAXRS.target(url).request(MediaType.APPLICATION_JSON).get();

        // Verificar o código de resposta
        if (resposta.getStatus() == 200) {
            //Resposta bruta do servidor
            String jsonResposta = resposta.readEntity(String.class);

            System.out.println("Texto resposta do servidor: " + jsonResposta);

            //Preenche os objeto mensagem com os dados do JSON
            CalculadoraResultado calculadoraResultado = objectMapper.readValue(jsonResposta, CalculadoraResultado.class);

            //Guarda o resultado
            resultado = calculadoraResultado.getResultado();

        } else {
            System.out.println("Falha ao obter a calculadora. Código de resposta: " + resposta.getStatus());
        }

        return resultado;
    }

    public double getDivisao(double a, double b) throws JsonProcessingException {
        //Variável de retorno
        double resultado = 0;

        //Url do serviço
        String url = "http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/divisao/" + a + "/" + b;

        //Criar instância do cliente JAX-RS
        Client clienteJAXRS = ClientBuilder.newClient();

        //Criar o parser do JSON para o objeto Mensagem
        ObjectMapper objectMapper = new ObjectMapper();

        //Requisição GET do serviço        
        Response resposta = clienteJAXRS.target(url).request(MediaType.APPLICATION_JSON).get();

        // Verificar o código de resposta
        if (resposta.getStatus() == 200) {
            //Resposta bruta do servidor
            String jsonResposta = resposta.readEntity(String.class);

            System.out.println("Texto resposta do servidor: " + jsonResposta);

            //Preenche os objeto mensagem com os dados do JSON
            CalculadoraResultado calculadoraResultado = objectMapper.readValue(jsonResposta, CalculadoraResultado.class);

            //Guarda o resultado
            resultado = calculadoraResultado.getResultado();

        } else {
            System.out.println("Falha ao obter a calculadora. Código de resposta: " + resposta.getStatus());
        }

        return resultado;
    }
}