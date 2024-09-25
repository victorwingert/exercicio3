package Ancestor;

import Main.Slime;

public class SlimeVampire extends Slime {

    public SlimeVampire() {
    }
    
    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 4) {
            System.out.println("Energia insuficiente para usar o especial!");
            return;
        }

        defenderSlime.setLife(defenderSlime.getLife() - 2);
        setLife(getLife() + 1);
        setEnergy(getEnergy() - 4);

        //System.out.println("O Slime Vampiro causou 2 de dano e recuperou 1 de vida!");
    }

    @Override
    public void habilidade() {
        System.out.println("Causa 2 de dano e recupera 1 de vida");
    }
}
