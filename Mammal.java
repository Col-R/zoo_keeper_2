/**
 * Mammal
 */
public class Mammal {
    protected int energy;

    public Mammal(int energy){
        this.energy = energy;
    }

    public void displayEnergy(){
        System.out.println("Current energy: " + this.energy);
    }
}