import java.util.Scanner;
public class game {
    
    static String name;
    static int choice;
    static Scanner scan = new Scanner(System.in);

    public static void start() throws Exception {
            CreateChar();
    }


    public static void CreateChar() throws Exception {
        System.out.println("\nHello! My name is Professor Oak.");
        System.out.println("I am in charge of this lab.");
    do {
        System.out.println("What is your name?");
            
        System.out.print("Name (no space please): ");
        name = scan.next();
       
        
        do{
            System.out.println("\nAre you sure you want \"" + name + "\" as your name?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");

            System.out.print("Choice: ");
            choice = scan.nextInt();
        
                if(choice == 1) {
                    System.out.println("\nwelcome to my lab, " + name);
                    gameStuff.player.name = name;
                }
                else if(choice != 1 || choice != 2) {
                    usefulMethod.clearScreen();
                    System.out.println("\nPick the right number please!");
                }
                else {}
            } while(choice != 1 && choice != 2);
        } while(choice != 1);
        
        pickPokemon();
    }

    public static void pickPokemon() throws Exception {

        String position;

        System.out.println("Follow me. Let get you a pokemon.");
        usefulMethod.loading("Walking . . . . \n", 100);
        usefulMethod.clearScreen();

        System.out.println("\nHere is 3 pokemon balls. Inside every ball there is an unique pokemon.");
        System.out.println("Pick a ball");

     do{
            System.out.print("Type left, middle or right: ");
            position = scan.next();

            if(position.equalsIgnoreCase("left")) {
                System.out.println("\nAy! You got Charmander");
                System.out.println("Do you want to keep this one?");
                System.out.println("(1) Yes");
                System.out.println("(2) No");

                System.out.print("Choice : ");
                choice = scan.nextInt();

                if(choice == 1) {
                    System.out.println("\nThis Charmander is yours!");
                    gameStuff.player.pokemon = gameStuff.pet.charmander;
                    gameStuff.player.nature = gameStuff.pet.cNature;
                    gameStuff.player.level = gameStuff.pet.cLevel;
                    gameStuff.player.hp = gameStuff.pet.cHP;
                    gameStuff.player.attack = gameStuff.pet.cAttack;
                    gameStuff.player.defense = gameStuff.pet.cDefense;
                    gameStuff.jerry.pokemon = gameStuff.pet.squirtle;
                    gameStuff.jerry.nature = gameStuff.pet.sNature;
                    gameStuff.jerry.level = gameStuff.pet.sLevel;
                    gameStuff.jerry.hp = gameStuff.pet.sHP;
                    gameStuff.jerry.attack = gameStuff.pet.sAttack;
                    gameStuff.jerry.defense = gameStuff.pet.sDefense;
                }
                else {
                    System.out.println();
                }
            }
            if(position.equalsIgnoreCase("middle")) {
                System.out.println("\nAy! You got Squirtle.");
                System.out.println("Do you want to keep this one?");
                System.out.println("(1) Yes");
                System.out.println("(2) No");

                System.out.print("Choice : ");
                choice = scan.nextInt();

                if(choice == 1) {
                    System.out.println("\nThis Squirtle is yours!");
                    gameStuff.player.pokemon = gameStuff.pet.squirtle;
                    gameStuff.player.nature = gameStuff.pet.sNature;
                    gameStuff.player.level = gameStuff.pet.sLevel;
                    gameStuff.player.hp = gameStuff.pet.sHP;
                    gameStuff.player.attack = gameStuff.pet.sAttack;
                    gameStuff.player.defense = gameStuff.pet.sDefense;
                }
                else {
                    System.out.println();
                }
            }
            if(position.equalsIgnoreCase("right")) {
                System.out.println("\nAy ! You got Bulbasaur.");
                System.out.println("Do you want to keep this one?");
                System.out.println("(1) Yes");
                System.out.println("(2) No");

                System.out.print("Choice : ");
                choice = scan.nextInt();

                if(choice == 1) {
                    System.out.println("\nThis Bulbasaur is yours!");
                    gameStuff.player.pokemon = gameStuff.pet.bulbasaur;
                    gameStuff.player.nature = gameStuff.pet.bNature;
                    gameStuff.player.level = gameStuff.pet.bLevel;
                    gameStuff.player.hp = gameStuff.pet.bHP;
                    gameStuff.player.attack = gameStuff.pet.bAttack;
                    gameStuff.player.defense = gameStuff.pet.bDefense;
                }
                else {
                    System.out.println();
                }
            }
        } while (choice == 2);

        firstBattle();
    }

    public static void firstBattle() throws Exception {
        Thread.sleep(2000);
        usefulMethod.clearScreen();
        System.out.println("\nAs you leave the lab");
        usefulMethod.loading(". . . . .", 10);

        System.out.println("\nAnnoying teen: Hey kid, I see that you got your "+gameStuff.player.pokemon + ". Let's fight (You cannot reject this)");
        Battle.lvlCheck();

    }

}
