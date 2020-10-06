package br.com.alura.servlet;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.alura.servico.AgendamentoEmailServico;

@WebServlet("emails")
public class AgendamentoEmailServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Inject	
	private AgendamentoEmailServico servico;
	
}
