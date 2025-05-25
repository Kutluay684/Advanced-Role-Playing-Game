import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Seyda", "4124", new ArrayList<>());
        Player player2 = new Player("Kutluay", "4728", new ArrayList<>());
        Player player3 = new Player("Boac", "3456", new ArrayList<>());

        Character c1 = new Mage("Bard", 90, "Male");
        Character c2 = new Warrior("HayDayCow", 110, "Female");
        Character c3 = new Mage("Hattori", 85, "Female");
        Character c4 = new Warrior("StrangerThingsGirl", 130, "Male");


        player1.getCharacters().add(c1);
        player1.getCharacters().add(c2);
        player2.getCharacters().add(c3);
        player2.getCharacters().add(c4);
        player3.getCharacters().add(c1);
        player3.getCharacters().add(c4);

        Party party1 = new Party("WinnerT", new ArrayList<>(), 0, 0);
        Party party2 = new Party("SuiSideT", new ArrayList<>(), 0, 0);

        party1.addMember(c1);
        party1.addMember(c2);
        party2.addMember(c3);
        party2.addMember(c4);

        Battle battle = new Battle(party1, party2);
        battle.formteams();
        battle.startBattle();

        if (party1.getMembers().isEmpty()) {
            System.out.println("WinnerT Winner!");
        } else if (party2.getMembers().isEmpty()) {
            System.out.println("SuiSideT Winner!");
        }
    }

}