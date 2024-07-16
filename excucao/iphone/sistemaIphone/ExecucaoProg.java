package excucao.iphone.sistemaIphone;
import com.sistema.escopo.iphone.iphone;
public class ExecucaoProg extends iphone{
	
 public static void main(String[] args) {
	iphone novoIphone = new iphone();
	novoIphone.tocar();
	novoIphone.pausar();
	novoIphone.selecionarMusica("Não me perdoei");
	novoIphone.ligar("(86) 98159-9270");
	novoIphone.atender();
	novoIphone.iniciarCorreioVoz();
	novoIphone.exibirPagina("https://github.com/FelipeDevOficial");
	novoIphone.adicionarNovaAba();
	novoIphone.atualizarPagina();
	
}
}
