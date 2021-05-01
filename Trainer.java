package Pokemon_Game;
import java.util.Scanner;

public class Trainer {
    String name,pokemon,experience;

    Trainer(String name, String Pokemon, String Experience){
        this.name = name;
        this.pokemon = Pokemon;
        this.experience = Experience;

    }

    public String getName(){return name;}

    public String getPokemon(){return pokemon;}

    public String getExperience(){return experience;}

    public void displayTrainer(String Trainer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a Trainer: Ash, Whitney, Brock");
        Trainer = scanner.nextLine();

        if (Trainer == "Ash" || Trainer == "ash"){
            System.out.println("You choose Ash as your Trainer!, he is equipped with the pokemon Pikachu" +
                    "and has an experiance of of Expert!");
        } else if (Trainer == "Whitney" || Trainer == "whitney"){
            System.out.println("You choose Whitney as your Trainer!, she is equipped with the pokemon Miltank"+
                    "and has an experance of Intermediate!");
        } else if (Trainer == "Brock" || Trainer == "brock"){
            System.out.println("You choose Brock as your Trainer!, he is equipped with the Pokemon Onix" +
                    "and he has a experience of Mid!");
        }

    }

//    Trainer Ash = new Trainer("Ash","Pikachu","Expert");
//    Trainer Whitney = new Trainer("Whitey","Miltank","Intermediate");
//    Trainer Brock = new Trainer("Brock","Onix","Mid");
}
