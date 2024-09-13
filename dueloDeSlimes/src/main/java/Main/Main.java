/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author wingert
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Start ver = new Start();
        Slime aSlime = new Slime();
        Slime bSlime = new Slime();
        Turn turn = new Turn(aSlime, bSlime);

        ver.imprimir();

        System.out.println("Escolha o ancestral do slime A:");
        int aSlimeAncestor = sc.nextInt();
        System.out.println();
        System.out.println("Escolha o ancestral do slime B:");
        int bSlimeAncestor = sc.nextInt();
        System.out.println("""
                           
                           -----------------------------------
                           INICIADO O JOGO
                           -----------------------------------""");
        turn.runTurnA();
        turn.runTurnB();

    }
}
