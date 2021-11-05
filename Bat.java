public class Bat extends Mammal {
    public int energy = 300;
    public void fly(){
        energy = energy - 50;
        System.out.println("The bat takes flight!");
    }
    public void eatHumans(){
        energy = energy + 25;
        System.out.println("The bat feeds!");
    }
    public void attackTown(){
        energy = energy - 100;
        System.out.println("The bat is destroying the town!");
    }
}
