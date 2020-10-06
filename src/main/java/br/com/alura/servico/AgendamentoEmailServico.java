package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class AgendamentoEmailServico {
	
	public List<String> lsitar(){
		return List.of("joao@alura.com.br");
	}
}
