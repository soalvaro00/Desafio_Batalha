package Entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage = other.attack - this.armor;
        damage = Math.max(damage, 1);
        this.life -= damage;

        if (this.life < 0) {
            this.life = 0;
        }
    }

    public String status() {
        if (this.life == 0) {
            return this.name + ": morreu";
        } else {
            return this.name + ": " + this.life + " de vida";
        }
    }
}
