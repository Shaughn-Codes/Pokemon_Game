package Pokemon_Game;

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

    public void displayTrainer(){

    }
    Trainer Ash = new Trainer("Ash","Pikachu","Expert");
    Trainer Whitney = new Trainer("Whitey","Miltank","Intermediate");
    Trainer Brock = new Trainer("Brock","Onix","Mid");
}
