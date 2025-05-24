
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String password;
    private ArrayList<Character> characters;

    public Player(String name, String password, ArrayList<Character> characters) {
        this.name = name;
        this.password = password;
        this.characters = new ArrayList<>();
    }
    public Player() {

    }

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public ArrayList<Character> getCharacters() {return characters;}

    public void setCharacters(ArrayList<Character> characters) {this.characters = characters;}


    public void printPlayerInfo()
    {
        System.out.println("Player Name:"+name);
        System.out.println("Player Password:"+password);
        for (Character character :characters)
        {
            System.out.println("Name:"+character.getName());
            System.out.println("Experiences:"+character.getExperience());
            System.out.println("Gender:"+character.getGender());
            System.out.println("HitPoint:"+character.getHitPoint());
            System.out.println("Level:"+character.getLevel());


        }
    }
    public double sumDamage()
    {
        double total=0;
         for (Character character : characters)
         {
             total +=character.calculateDamage();

         }
         return total;
    }
    public class Achievement
    {
        private List<String> unlockedAchievements=new ArrayList<>();
        public void addAchievement(String achive)
        {
            unlockedAchievements.add(achive);
        }
    }
}

