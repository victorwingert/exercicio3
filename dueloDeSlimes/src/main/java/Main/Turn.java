/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author wingert
 */
public class Turn {

    private Slime aSlime;
    private Slime bSlime;

    public Turn(Slime aSlime, Slime bSlime) {
        this.aSlime = aSlime;
        this.bSlime = bSlime;
    }

    public void runTurnA() {

        System.out.println("""
                               -----------------------------------
                               TURNO DO SLIME A
                               -----------------------------------""");
        int op = -1;
        Scanner sc = new Scanner(System.in);

        while (op != 0) {
            System.out.println();
            System.out.print("Vida atual dos slimes: ");
            System.out.println("A: " + aSlime.getLife() + " B: " + bSlime.getLife());
            System.out.println("""
                                   Digite a habilidade para o slime A usar: (energia restante: 5)
                                   0: Termina o turno
                                   1: Ataque
                                   2: Energizar
                                   3: Especial: Ganha 20% de dano pelo resto do jogo
                                   """);

            op = sc.nextInt();

            switch (op) {
                case 0:
                    return;
                case 1:
                    // FAZER ATAQUE;
                    break;
                case 2:
                    // SUBIR ENERGIA;
                    break;
                case 3:
                    // ESPECIAL;
                    break;
                default:
                    break;
            }
        }
    }

    public void runTurnB() {

        System.out.println("""
                               -----------------------------------
                               TURNO DO SLIME B
                               -----------------------------------""");
        int op = -1;
        Scanner sc = new Scanner(System.in);

        while (op != 0) {
            System.out.println();
            System.out.print("Vida atual dos slimes: ");
            System.out.println("A: " + aSlime.getLife() + " B: " + bSlime.getLife());
            System.out.println("""
                                   Digite a habilidade para o slime B usar: (energia restante: 5)
                                   0: Termina o turno
                                   1: Ataque
                                   2: Energizar
                                   3: Especial: Ganha 20% de dano pelo resto do jogo
                                   """);

            op = sc.nextInt();

            switch (op) {
                case 0:
                    return;
                case 1:
                    // FAZER ATAQUE;
                    break;
                case 2:
                    // SUBIR ENERGIA;
                    break;
                case 3:
                    // ESPECIAL;
                    break;
                default:
                    break;
            }
        }
    }

}
