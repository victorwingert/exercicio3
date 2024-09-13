package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author wingert
 */
public class Slime {

    private double life;
    private double damageMultiplicator;
    private double resistence;
    private double energy;

    public Slime() {
        life = 10;
        damageMultiplicator = 1;
        resistence = 0;
        energy = 5;
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

}
