//CÓDIGO PRINCIPAL 
//////////////////classes importadas
package app;
import java.util.Scanner;
import java.util.Random;

//////////////////classe principal
public class App {
    
    public static void main(String[] args) {
        String nome1;
        String nome2;
        int numero=0;
        int numero2=0;
       
        System.out.println("jogador 1: digite seu nome: ");
        Scanner scani = new Scanner(System.in);
        nome1 = scani.nextLine();

        System.out.println("Jogador 2: digite seu nome: ");
        Scanner scan2 = new Scanner(System.in);
        nome2 = scan2.nextLine();
         
//////////////////////////////////////////////PEDRA PAPEL E TESOURA 
////PedraPapelTesoura partida = new PedraPapelTesoura(); instancia a classe auxiliar´PedraPapelTesoura
////partida.jogar(numero, numero2, nome1, nome2); chama o método jogar, definido na classe auxiliar pedra papel e tesoura
PedraPapelTesoura partida = new PedraPapelTesoura();
partida.jogar(numero, numero2, nome1, nome2);

Resultados results = new Resultados();
results.resultado(numero, numero2, nome1, nome2);


// Gun arma = new Gun(); //Gun = Classe auxiliar da arma que determina momento de atirar // código que instancia(chama) a classe auxiliar Gun
//     arma.atirar(); //Método de atirar, definido na classe auxiliar Gun
     Gun arma = new Gun();
     arma.atirar();
    
    
  
    
    }
}