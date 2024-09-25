// TODO
//
// 
//
//
package Main;

import java.util.Scanner;

public class Turn {

    private Slime aSlime;
    private Slime bSlime;
    private boolean isFirstTurnA = true;
    private boolean isFirstTurnB = true;

    public Turn(Slime aSlime, Slime bSlime) {
        this.aSlime = aSlime;
        this.bSlime = bSlime;
    }

    public void runTurnA() {

        if (!isFirstTurnA) {
            aSlime.setEnergy(aSlime.getEnergy() + 2);
        } else {
            isFirstTurnA = false;
        }

        System.out.println("""
                               -----------------------------------
                               TURNO DO SLIME A
                               -----------------------------------""");
        int op = -1;
        Scanner sc = new Scanner(System.in);

        while (aSlime.getEnergy() > 0 && op != 0) {
            System.out.println();
            System.out.print("Vida atual dos slimes: ");
            System.out.println("A: " + aSlime.getLife() + " B: " + bSlime.getLife());
            System.out.println("Digite a habilidade para o slime A usar: (energia restante: " + aSlime.getEnergy() + ")");
            System.out.print("""
                                   0: Termina o turno
                                   1: Ataque
                                   2: Energizar
                                   """);
            System.out.print("3: Especial: ");
            aSlime.habilidade();
            System.out.println();

            op = sc.nextInt();

            switch (op) {
                case 0:
                    return;
                case 1:
                    aSlime.ataque(bSlime);
                    break;
                case 2:
                    aSlime.energizar();
                    break;
                case 3:
                    aSlime.especial(bSlime);
                    break;
                default:
                    System.out.println("Ação inválida! Tente novamente.");
            }

            if (checkGameOver()) {
                System.exit(0);
            }
        }
    }

    public void runTurnB() {

        if (!isFirstTurnB) {
            bSlime.setEnergy(bSlime.getEnergy() + 2);
        } else {
            isFirstTurnB = false;
        }

        System.out.println("""
                               -----------------------------------
                               TURNO DO SLIME B
                               -----------------------------------""");
        int op = -1;
        Scanner sc = new Scanner(System.in);

        while (bSlime.getEnergy() > 0 && op != 0) {
            System.out.println();
            System.out.print("Vida atual dos slimes: ");
            System.out.println("A: " + aSlime.getLife() + " B: " + bSlime.getLife());
            System.out.println("Digite a habilidade para o slime A usar: (energia restante: " + bSlime.getEnergy() + ")");
            System.out.print("""
                                   0: Termina o turno
                                   1: Ataque
                                   2: Energizar
                                   """);
            System.out.print("3: Especial: ");
            bSlime.habilidade();
            System.out.println();

            op = sc.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    bSlime.ataque(aSlime);
                    break;
                case 2:
                    bSlime.energizar();
                    break;
                case 3:
                    bSlime.especial(aSlime);
                    break;
                default:
                    System.out.println("Ação inválida! Tente novamente.");
            }

            if (checkGameOver()) {
                System.exit(0);
            }
        }
    }

    public boolean checkGameOver() {
        if (aSlime.getLife() <= 0) {
            System.out.println("""
                               -----------------------------------
                               Slime B venceu
                               -----------------------------------
                               """);
            return true;
        }
        if (bSlime.getLife() <= 0) {
            System.out.println("""
                               -----------------------------------
                               Slime A venceu
                               -----------------------------------
                               """);
            return true;
        }
        return false;
    }
}
