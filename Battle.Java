

public class Battle {

    public static void lvlCheck() throws InterruptedException {
        if(gameStuff.player.pokemon.equalsIgnoreCase("Charmander")){
            if(gameStuff.pet.cLevel == 5){
                battle1();
            }
            if(gameStuff.pet.cLevel == 10){
        
            }
            if(gameStuff.pet.cLevel == 15){
        
            }
        }
        if(gameStuff.player.pokemon.equalsIgnoreCase("Bulbasaur")){
            if(gameStuff.pet.bLevel == 5){
            
            }
        }
        if(gameStuff.player.pokemon.equalsIgnoreCase("Squirtle")){
            if(gameStuff.pet.sLevel == 5){
            
            }
        }
        }
        public static void battle1() throws InterruptedException  {
            usefulMethod.loading("Battle Start!. . . .\n", 300);
            System.out.println("PKMN Trainer Jerry Bloke would like to battle!");
            System.out.println("Go "+ gameStuff.player.pokemon +"!");
        
        }
        
        
        
            
}
