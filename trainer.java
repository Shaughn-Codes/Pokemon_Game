package Pokemon_Game;
import java.util.Scanner;

public class Trainer {


    String name,pokemon,experience;

    public static void main(String[] args) throws Exception {
        Trainer.displayTrainer();


    }


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
        System.out.println("Hello welcome to Pokemon!");
        System.out.println("Please choose a Trainer: Ash, Whitney, Brock");
        String Trainer = scanner.next();

        if (Trainer.equals("Ash") || Trainer.equals("ash")){
            Trainer Ash = new Trainer("Ash","Pikachu","Expert");

            System.out.println("You choose " + Ash.name + " as your Trainer!, he is equipped with the pokemon " + Ash.pokemon +
                    " and has an experience of " + Ash.experience+ "!");
        } else if (Trainer.equals("Whitney")|| Trainer.equals("whitney")){
            Trainer Whitney = new Trainer("Whitey","Miltank","Intermediate");

            System.out.println("You choose " + Whitney.name +  " as your Trainer!, she is equipped with the pokemon "+ Whitney.pokemon +
                    " and has an experience of " + Whitney.experience + "!");
        } else if (Trainer.equals("Brock") || Trainer.equals("brock")){
            Trainer Brock = new Trainer("Brock","Onix","Mid");

            System.out.println("You choose " + Brock.name + " as your Trainer!, he is equipped with the Pokemon " + Brock.pokemon +
                    " and he has a experience of " + Brock.experience + "!");
            System.out.println("You choose " + Brock.getName() + " as your Trainer!, he is equipped with the Pokemon " + Brock.getPokemon() +
                    " and he has a experience of " + Brock.getExperience() + "!");

        } else {
            throw new Exception("Please type in the given options!");
        }

    }





}