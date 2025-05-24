public class Warrior extends Character {
    private int energy;
    private int defense;

    public Warrior() {
        this.energy = 20;
        this.defense = 5;
    }

    public Warrior(String name, double hitPoint, String gender) {
        super(name, hitPoint, gender);
        this.energy = 20;
        this.defense = 5;
    }

    private void rest() {
        energy += 20;
        System.out.println("Energy is updated:" + energy);
    }

    @Override
    public void regeneratePower() {
        rest();

    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage() * 1.2;
    }

    public void attack() {

        if (energy < 10) {
            System.out.println("Not Enough Energy Get Rest");
        } else {
            energy -= 10;
            super.attack();
            System.out.println("Your Energy now:" + energy);
        }

    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Defense:"+defense);
        System.out.println("Energy:"+energy);
    }
}
