package Main;

public abstract class Slime {

    private double life;
    private double damageMultiplicator;
    private double resistence;
    private double energy;
    private boolean energized;

    public Slime() {
        life = 10;
        damageMultiplicator = 1;
        resistence = 0;
        energy = 5;
        energized = false;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getDamageMultiplicator() {
        return damageMultiplicator;
    }

    public void setDamageMultiplicator(double damageMultiplicator) {
        this.damageMultiplicator = damageMultiplicator;
    }

    public double getResistence() {
        return resistence;
    }

    public void setResistence(double resistence) {
        this.resistence = resistence;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public boolean isEnergized() {
        return energized;
    }

    public void setEnergized(boolean energized) {
        this.energized = energized;
    }

    public void ataque() {
        if(energy < 1) {
            System.out.println("Energia insuficiente !");
        }
        
        if(energized == true) {
            double damage = damageMultiplicator-resistence+0.5;
        } else {
            double damage = damageMultiplicator-resistence+0;
        }
    }
    
    public void energizar() {
        if(energy < 2) {
            System.out.println("Energia insuficiente !");
        }
        
        energized = true;
    }
    
    public abstract void especial(Slime defenderSlime);
}
