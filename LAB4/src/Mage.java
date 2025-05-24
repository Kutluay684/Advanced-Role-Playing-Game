import java.util.Random;

public class Mage extends Character {
    public Mage() {
        this.mana = 10;
        this.criticalChance = 0.10;
    }

    public Mage(String name, double hitPoint, String gender) {
        super(name, hitPoint, gender);
        this.mana = 10;
        this.criticalChance = 0.10;
    }

    private int mana;
    private double criticalChance;
    boolean flaghit;

    private void drinkPotion() {
        mana += 10;
        System.out.println("Mana:" + mana);
    }

    @Override
    public void attack() {
        if (mana < 5) {
            System.out.println("Not enough mana. Drink potion.");
        } else {
            if (Math.random() < criticalChance) {
                System.out.println("Critical Hit!");
                flaghit = true;
            } else {
                System.out.println("Attacked!");
                super.attack();
                System.out.println("Remaining Mana:" + mana);
            }

        }
    }

    public double calculateDamage() {

        if (flaghit) {
            return getHitPoint() * 1.6;
        }
        else
        {
            return getHitPoint() * 0.8;
        }
    }

    @Override
    public void regeneratePower() {
        drinkPotion();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana" + mana);
    }
}
