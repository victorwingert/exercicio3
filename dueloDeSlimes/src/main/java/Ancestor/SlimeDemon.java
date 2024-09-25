package Ancestor;

import Main.Slime;

public class SlimeDemon extends Slime {

    public SlimeDemon() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            System.out.println("Energia insuficiente para usar o especial!");
            return;
        }

        setDamageMultiplicator(getDamageMultiplicator() + 0.2);
        setEnergy(getEnergy() - 4);

        //System.out.println("O Slime Demônio ganhou 0.2 de multiplicador de dano pelo resto do jogo!");
    }

    @Override
    public void habilidade() {
        System.out.print("Ganha 20% de dano pelo resto do jogo");
    }
}
