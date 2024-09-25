package Ancestor;

import Main.Slime;

public class SlimeDragon extends Slime {

    public SlimeDragon() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            return;
        }

        setDamageMultiplicator(getDamageMultiplicator() + 0.2);
        setNoDamage(true);
        setEnergy(getEnergy() - 4);
    }

    @Override
    public void habilidade() {
        System.out.println("Ganha 20% de dano e invulnerabilidade por um turno");
    }
}
