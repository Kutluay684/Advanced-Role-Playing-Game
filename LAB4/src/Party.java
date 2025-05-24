import java.util.ArrayList;

public class Party {

    private String partyName;
    private ArrayList<Character> members;
    private int powerBalance;
    private int reputation;

    public Party(String partyName, ArrayList<Character> members, int powerBalance, int reputation)
    {
        this.partyName = partyName;
        this.members = new ArrayList<>();
        this.powerBalance = powerBalance;
        this.reputation = reputation;
    }

    public Party()
    {

    }

    public void setMembers(ArrayList<Character> members) {this.members = members;}

    public ArrayList<Character> getMembers() {return members;}



    public void addMember(Character character) {
        if (getMembers().size() == 10) {
            System.out.println("Party is full!");
        } else {
            getMembers().add(character);
            System.out.println("Added:" + character);
        }
    }

    public void removeMember(Character character) {
        getMembers().remove(character);
        System.out.println("Removed:" + character);
    }

    public void calculatePowerBalance() {
        for (Character character : members) {
            powerBalance += character.calculateDamage();
        }

    }

    public void calculateReputation() {
        for (Character character : members) {
            reputation += character.getLevel();
        }

    }

    public void printPartyInfo() {
        System.out.print("AllMembers: ");
        for (Character character : members) {
            System.out.print("{" + character.getName() + "} ");
        }
        System.out.println();
        for (Character character : members) {
            System.out.println("Name" + character.getName());
            System.out.println("Experiences:" + character.getExperience());
            System.out.println("Gender:" + character.getGender());
            System.out.println("HitPoint:" + character.getHitPoint());
            System.out.println("Level:" + character.getLevel());
        }
        System.out.println("Total Damage:" + powerBalance);
        System.out.println("Reputation:" + reputation);

    }
}
