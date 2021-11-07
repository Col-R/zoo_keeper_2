public class Bat extends Mammal {
    public Bat(int energy){
        super(300);
    }
    public void fly(){
        energy -= 50;
        System.out.println("The bat takes flight!");
    }
    public void eatHumans(){
        energy += 25;
        System.out.println("The bat feeds!");
    }
    public void attackTown(){
        energy -= 100;
        System.out.println("The bat is destroying the town!");
    }
}
