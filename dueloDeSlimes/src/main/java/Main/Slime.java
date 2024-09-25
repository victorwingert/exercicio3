package Main;

public abstract class Slime {

    private double life;
    private double damageMultiplicator;
    private double resistence;
    private double energy;
    private boolean energized;
    private boolean noDamage;

    public Slime() {
        life = 10;
        damageMultiplicator = 1;
        resistence = 0;
        energy = 5;
        energized = false;
        noDamage = false;
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

    public boolean isNoDamage() {
        return noDamage;
    }

    public void setNoDamage(boolean noDamage) {
        this.noDamage = noDamage;
    }

    public void ataque(Slime alvo) {
        if (energy < 1) {
            System.out.println("Energia insuficiente !");
            return;
        }
        
        if (alvo.noDamage) {
            return;
        }

        double dano = damageMultiplicator - alvo.getResistence() + (energized ? 0.5 : 0);

        alvo.setLife(alvo.getLife() - dano);

        energy -= 1;
    }

    public void energizar() {
        if (energy < 2) {
            System.out.println("Energia insuficiente !");
        }

        energized = true;
        energy -= 2;
    }

    public abstract void especial(Slime defenderSlime);
    
    public abstract void habilidade();
}
