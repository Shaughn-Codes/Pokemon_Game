import java.util.Scanner;

public class Battle {
    static int choice;
    static Scanner scan = new Scanner(System.in);
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
            usefulMethod.loading("Battle Start!. . . .\n", 30);
            System.out.println("PKMN Trainer Jerry Bloke would like to battle!");
            System.out.println("Trainer Jerry Bloke sent out " + gameStuff.jerry.pokemon + "." );
            System.out.println("Go "+ gameStuff.player.pokemon +"!");
            do{
                System.out.println("What will "+ gameStuff.player.pokemon +" do?");
                System.out.println("1. Scratch 2. Ember 3. Tackle 4. Slash");
                choice = scan.nextInt();

            }while(gameStuff.player.hp < 0 || gameStuff.jerry.hp < 0);
            
            
        
        }
        
        
        
            
}
