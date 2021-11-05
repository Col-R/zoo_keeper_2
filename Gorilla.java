public class Gorilla extends Mammal{
    public void throwThings(){
        energy = energy - 5;
        System.out.println("Throws some stuff. Current energy: "+ energy);
    }
    public void eatBanana() {
        energy = energy + 10;
        System.out.println("Eats a banana. Current energy: "+ energy);
    }
    public void climb(){
        energy = energy - 10;
        System.out.println("Climbs around. Current energy:  "+ energy);
    }
}
