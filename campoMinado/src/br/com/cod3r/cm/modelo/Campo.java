package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	private boolean minado;
	private boolean aberto;
	private boolean marcado;
	
	private final int linha;
	private final int coluna;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.coluna = coluna;
		this.linha = linha;
	}
	 
	//boolean adicionarVizinho(Campo vizinho) {
		
	//}

}
