package Ancestor;

import Main.Slime;

public class SlimeAngel extends Slime {

    public SlimeAngel() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            System.out.println("Energia insuficiente para usar o especial!");
            return;
        }

        setResistence(getResistence() + 0.2);
        setEnergy(getEnergy() - 4);

        //System.out.println("O Slime Anjo ganhou 0.2 de resistência pelo resto do jogo!");
    }

    @Override
    public void habilidade() {
        System.out.print("Ganha 20% de resistência pelo resto do jogo");
    }
}
