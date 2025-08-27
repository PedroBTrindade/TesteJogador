import java.util.Scanner;

public class TesteJogador{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String nome;

        System.out.println("---Simulando Partida---");
        System.out.println("Digite o nome do jogador: ");
        nome= s.nextLine();

        Jogador heroi = new Jogador(nome);
        System.out.println("\nDerrotando inimigo...");
        heroi.addpts(50);
        System.out.println("\nRecebendo um ataque forte...");
        heroi.rcbdano(40);
        System.out.println("Usando poção forte...");
        heroi.rcbcura(30);
        System.out.println("Usando poção simples...");
        heroi.rcbcura(25);
        System.out.println("Um ataque devastador...");
        heroi.rcbdano(150);

    }
}