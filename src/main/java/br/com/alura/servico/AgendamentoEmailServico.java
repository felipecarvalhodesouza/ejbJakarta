package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;


@Stateless
public class AgendamentoEmailServico {
	
	public List<String> listar(){
		return List.of("joao@alura.com.br");
	}
}

/**
 * Foi buscado no standalone o session bean para
 * configurar o número maximo de pools por causa
 * da falta de estado
 * slsb-strict-max-pool
 */
