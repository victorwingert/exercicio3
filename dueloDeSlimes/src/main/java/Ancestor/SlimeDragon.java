package Ancestor;

import Main.Slime;

public class SlimeDragon extends Slime {

    public SlimeDragon() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            System.out.println("Energia insuficiente para usar o especial!");
            return;
        }

        setDamageMultiplicator(getDamageMultiplicator() + 0.2);
        setEnergy(getEnergy() - 4);

        //System.out.println("O Slime Dragão aumentou seu multiplicador de dano em 0.2 e está invulnerável por este turno!");
    }

    @Override
    public void habilidade() {
        System.out.println("Ganha 20% de dano e invulnerabilidade por um turno");
    }
}
