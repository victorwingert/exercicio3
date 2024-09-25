package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Start ver = new Start();

        ver.imprimir();

        System.out.println("Escolha o ancestral do slime A:");
        int aSlimeAncestor = sc.nextInt();
        Slime aSlime = SlimeFactory.criarSlime(aSlimeAncestor);
        System.out.println();
        System.out.println("Escolha o ancestral do slime B:");
        int bSlimeAncestor = sc.nextInt();
        Slime bSlime = SlimeFactory.criarSlime(bSlimeAncestor);
        System.out.println("""
                           
                           -----------------------------------
                           INICIADO O JOGO
                           -----------------------------------""");
        
        Turn turn = new Turn(aSlime, bSlime);
        
        while(true) {
            turn.runTurnA();
            
            turn.runTurnB();
        }

    }
}
