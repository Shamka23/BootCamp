package rpg;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Barbarian King");
        Character archer = new Archer("Archer Queen");

        System.out.println(archer.health);

        while(archer.health > 0){
            warrior.attack(archer);
        }

        System.out.println(archer.health);

        System.out.println(warrior.health);

        while(warrior.health > 0){
            archer.attack(warrior);
        }

        System.out.println(warrior.health);
    }
}
