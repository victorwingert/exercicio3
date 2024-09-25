package Ancestor;

import Main.Slime;

public class SlimeDemon extends Slime {

    public SlimeDemon() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            return;
        }

        setDamageMultiplicator(getDamageMultiplicator() + 0.2);
        setEnergy(getEnergy() - 4);
    }

    @Override
    public void habilidade() {
        System.out.print("Ganha 20% de dano pelo resto do jogo");
    }
}
