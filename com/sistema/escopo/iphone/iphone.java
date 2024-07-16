package com.sistema.escopo.iphone;

import reprodutorMusical.ReprodutorMusical;
import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}
	public void pausar () {
		System.out.println("Puasando reprodução...");
	}
	public void selecionarMusica (String musica) {
		System.out.println("Selecionando a música: " + musica);
	}
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	public void atender() {
		System.out.println("Atendendo ligação...");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	}
	public void adicionarNovaAba () {
		System.out.println("Adicionando nova aba");
	}
	public void atualizarPagina () {
		System.out.println("Atualizando Página...");
	}

	
}	
	


