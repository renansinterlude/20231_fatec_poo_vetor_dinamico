import java.util.ArrayList;

import javax.swing.JOptionPane;
public class GerenciadorDeMusicas {
    public static void main(String[] args) {
        var musicas = new ArrayList<Musica>(); // tipo generico (deixa o tipo que vai ser armazenado aberto)
        // var -> associa ao lado esquerdo o tipo do que esta escrito ao lado direito
        // var a = 2d -> a é do tipo double
        String menu = "0-Sair\n1-Cadastrar\n2-Avaliar música\n3-Ver a lista ordenada pelo nome\n4-Ver a lista ordenada pela avaliação";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu)); //converter pra int
            switch(op){
                case 1:
                    String titulo = JOptionPane.showInputDialog("Titulo da música: ");
                    Musica m = new Musica(titulo);
                    musicas.add(m);
                    break;
            }
        }while(op != 0);
    } // compilador inicializa variavel de instancia com 0. variaveis de parametros nao sao inicializadas
}
