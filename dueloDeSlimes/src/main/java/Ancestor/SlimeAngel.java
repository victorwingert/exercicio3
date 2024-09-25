package Ancestor;

import Main.Slime;

public class SlimeAngel extends Slime {

    public SlimeAngel() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            return;
        }

        setResistence(getResistence() + 0.2);
        setEnergy(getEnergy() - 4);
    }

    @Override
    public void habilidade() {
        System.out.print("Ganha 20% de resistência pelo resto do jogo");
    }
}
