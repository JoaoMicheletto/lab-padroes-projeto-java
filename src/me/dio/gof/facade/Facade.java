package me.dio.gof.facade;

import me.dio.gof.subsistema1.crm.CrmService;
import me.dio.gof.subsistema2.cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
