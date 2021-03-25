package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entidade.AgendamentoEmail;

@Stateless
public class AgendamentoEmailServico {
	
	@Inject
	private AgendamentoEmailDAO dao;
	
	public List<AgendamentoEmail> listar(){
		return dao.listar();
	}
}

/**
 * Foi buscado no standalone o session bean para
 * configurar o n�mero maximo de pools por causa
 * da falta de estado
 * slsb-strict-max-pool
 */
