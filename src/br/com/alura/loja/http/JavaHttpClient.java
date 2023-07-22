package br.com.alura.loja.http;

import java.net.URI;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URI urlDaApi = new URI(url);
            URLConnection connection = urlDaApi.toURL().openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
        }
    }
    
}
