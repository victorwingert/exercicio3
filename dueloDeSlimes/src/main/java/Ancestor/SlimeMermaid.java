package Ancestor;

import Main.Slime;

public class SlimeMermaid extends Slime {

    public SlimeMermaid() {
    }

    @Override
    public void especial(Slime defenderSlime) {
        if (getEnergy() < 6) {
            return;
        }

        setEnergy(2);
        defenderSlime.setEnergy(0);
    }

    @Override
    public void habilidade() {
        System.out.println("Fica com 2 de energia para zerar a energia do alvo (precisa de 6 de energia para usar)");
    }
}
