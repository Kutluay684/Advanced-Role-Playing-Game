import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Battle {
    private Party party1;
    private Party party2;
    private List<Character> party1characters;
    private List<Character> party2characters;

    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
        this.party1characters = new ArrayList<>();
        this.party2characters = new ArrayList<>();
    }


    public void formteams() {
        Collections.shuffle(party1.getMembers());
        Collections.shuffle(party2.getMembers());

        int teamSize = Math.min(3, party1.getMembers().size());
        party1characters = party1.getMembers().subList(0, teamSize);
        party2characters = party2.getMembers().subList(0, teamSize);

    }

    public void startBattle() {


        while (!party2characters.isEmpty() || !party1characters.isEmpty()) {
            boolean party1Defend=false,party2Defend=false;
            if (party1characters.isEmpty() || party2characters.isEmpty()) {
                System.out.println("Battle  is over");
                break;
            }
            Random random = new Random();
            int attackerIndex=-1;
            int defenderIndex=-1;
            if (random.nextBoolean())
            {
                 attackerIndex = random.nextInt(party1characters.size());
                 defenderIndex = random.nextInt(party2characters.size());
                double damage = party1characters.get(attackerIndex).calculateDamage();
                party1characters.get(attackerIndex).attack();
                double newHP = party2characters.get(defenderIndex).getHitPoint() - damage;
                party2characters.get(defenderIndex).setHitPoint(newHP);
                party2Defend=true;
            }
            else
            {
                 attackerIndex = random.nextInt(party2characters.size());
                 defenderIndex = random.nextInt(party1characters.size());
                double damage = party2characters.get(attackerIndex).calculateDamage();
                party2characters.get(attackerIndex).attack();
                double newHP = party1characters.get(defenderIndex).getHitPoint() - damage;
                party1characters.get(defenderIndex).setHitPoint(newHP);
                party1Defend=true;

            }


            if (party1Defend && party1characters.get(defenderIndex).getHitPoint()<=0)
            {
                party1characters.remove(defenderIndex);
            }
            else if (party2Defend &&party2characters.get(defenderIndex).getHitPoint()<=0)
            {
                party2characters.remove(defenderIndex);
            }

        }

        if (party1characters.isEmpty()) {
            System.out.println("Party 2 wins!");
        } else if (party2characters.isEmpty()) {
            System.out.println("Party 1 wins!");
        }

    }
}
