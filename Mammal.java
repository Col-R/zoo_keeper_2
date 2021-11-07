/**
 * Mammal
 */
public class Mammal {
    protected int energy = 100;

    public Mammal(int energy){
        this.energy = energy;
    }

    public int displayEnergy(){
        System.out.println("Current energy: " + this.energy);
        return energy;
    }
}