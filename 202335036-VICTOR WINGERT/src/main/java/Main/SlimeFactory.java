package Main;

import Ancestor.SlimeAngel;
import Ancestor.SlimeDragon;
import Ancestor.SlimeMermaid;
import Ancestor.SlimeVampire;
import Ancestor.SlimeDemon;

public class SlimeFactory {

    public static Slime criarSlime(int tipo) {
        switch (tipo) {
            case 1:
                return new SlimeVampire();
            case 2:
                return new SlimeDragon();
            case 3:
                return new SlimeMermaid();
            case 4:
                return new SlimeAngel();
            case 5:
                return new SlimeDemon();
            default:
                throw new IllegalArgumentException("Tipo de Slime inválido!");
        }
    }
}
