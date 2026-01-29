package rpg;

abstract class Character {
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int health = 100;

    public Character(String name) {
        this.name = name;
        this.strength = 5;
        this.dexterity = 5;
        this.intelligence = 5;
    }

    public Character(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    protected void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    abstract void attack(Character opponent);
}
