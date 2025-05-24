public class Character {

    private double hitPoint;
    private String gender;
    private int level;
    private int experience;
    private String name;

    public Character(String name, double hitPoint, String gender) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.gender = gender;
        this.level = 1;
        this.experience = 0;
    }

    public Character() {
        this.level = 1;
        this.experience = 0;
    }

    public double getHitPoint() {return hitPoint;}

    public void setHitPoint(double hitPoint) {this.hitPoint = hitPoint;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

    public int getLevel() {return level;}

    public void setLevel(int level) {this.level = level;}

    public int getExperience() {return experience;}

    public void setExperience(int experience) {this.experience = experience;}

    public double calculateDamage() {return getHitPoint();}


    public void attack() {
        System.out.println("Attacking" + getName() + "Damage Is" + calculateDamage());
        setExperience(getExperience() + 20);

    }

    public void regeneratePower() {
        System.out.println("Regenerating Power");
    }

    public void gainExperience(int xp) {

        setExperience(getExperience() + xp);
        if (getExperience() >= 100) {
            levelUp();
        }

    }

    public void levelUp() {
        setExperience(getExperience() - 100);
        setLevel(getLevel() + 1);
    }

    public void printInfo() {

        System.out.println("Character Name" + getName());
        System.out.println("Level" + getLevel());
        System.out.println("Gender" + getGender());
        System.out.println("Total Experiences" + getExperience());
        System.out.println("HitPoint" + getHitPoint());

    }

}
