package Pokemon_Game;
import java.util.Scanner;

public class Trainer {

    String name,pokemon,experience;

    public Trainer(String name, String Pokemon, String Experience){
        this.name = name;
        this.pokemon = Pokemon;
        this.experience = Experience;

    }

    public String getName(){return name;}

    public String getPokemon(){return pokemon;}

    public String getExperience(){return experience;}

    public static void displayTrainer() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a Trainer: Ash, Whitney, Brock");
        String Trainer = scanner.nextLine();

        if (Trainer == "Ash" || Trainer == "ash"){
            Trainer Ash = new Trainer("Ash","Pikachu","Expert");

            System.out.println("You choose " + Ash.getName() + " as your Trainer!, he is equipped with the pokemon " + Ash.getPokemon() +
                    " and has an experience of " + Ash.getExperience()+ "!");
        } else if (Trainer == "Whitney" || Trainer == "whitney"){
            Trainer Whitney = new Trainer("Whitey","Miltank","Intermediate");

            System.out.println("You choose " + Whitney.getName() +  " as your Trainer!, she is equipped with the pokemon "+ Whitney.getPokemon() +
                    " and has an experience of " + Whitney.getExperience() + "!");
        } else if (Trainer == "Brock" || Trainer == "brock"){
            Trainer Brock = new Trainer("Brock","Onix","Beginner");

            System.out.println("You choose " + Brock.getName() + " as your Trainer!, he is equipped with the Pokemon " + Brock.getName() +
                    " and he has a experience of " + Brock.getExperience() + "!");
        } else {
            throw new Exception("Please type in the given options!");
        }

    }





}
