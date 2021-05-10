import java.util.Scanner;

public class game {
    
    static String name;
    static int choice;
    static Scanner scan = new Scanner(System.in);

    public static void start() throws InterruptedException {
            CreateChar();
    }


    public static void CreateChar() throws InterruptedException {
        System.out.println("\nProfessor Oak: Hello! My name is Professor Oak.");
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
                    System.out.println("\nProfessor Oak: welcome to my lab, " + name);
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

    public static void pickPokemon() throws InterruptedException {

        String position;

        System.out.println("Follow me. Let get you a pokemon.");
        usefulMethod.loading("Walking . . . . \n", 150);
        usefulMethod.clearScreen();

        System.out.println("\nProfessor Oak: Here is 3 pokemon balls. Inside every ball there is an unique pokemon.");
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
                    gameStuff.player.pokemon = gameStuff.pet.charmander; // Pokemon name and skills name 
                    gameStuff.player.move = gameStuff.pet.cMove; // Moves damage in array
                    gameStuff.player.nature = gameStuff.pet.cNature; // The nature
                    gameStuff.player.level = gameStuff.pet.cLevel; // Starting lvl
                    gameStuff.player.hp = gameStuff.pet.HP; // Starting hp
                    gameStuff.player.attack = gameStuff.pet.cAttack; // Starting attack
                    gameStuff.player.defense = gameStuff.pet.cDefense; // Starting defense

                    gameStuff.jerry.pokemon = gameStuff.pet.squirtle; // This part is for Jerry
                    gameStuff.jerry.move = gameStuff.pet.sMove;
                    gameStuff.jerry.nature = gameStuff.pet.sNature;
                    gameStuff.jerry.level = gameStuff.pet.sLevel;
                    gameStuff.jerry.hp = gameStuff.pet.HP;
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
                    gameStuff.player.move = gameStuff.pet.sMove;
                    gameStuff.player.nature = gameStuff.pet.sNature;
                    gameStuff.player.level = gameStuff.pet.sLevel;
                    gameStuff.player.hp = gameStuff.pet.HP;
                    gameStuff.player.attack = gameStuff.pet.sAttack;
                    gameStuff.player.defense = gameStuff.pet.sDefense;

                    gameStuff.jerry.pokemon = gameStuff.pet.bulbasaur;
                    gameStuff.jerry.move = gameStuff.pet.bMove;
                    gameStuff.jerry.nature = gameStuff.pet.bNature;
                    gameStuff.jerry.level = gameStuff.pet.bLevel;
                    gameStuff.jerry.hp = gameStuff.pet.HP;
                    gameStuff.jerry.attack = gameStuff.pet.bAttack;
                    gameStuff.jerry.defense = gameStuff.pet.bDefense;
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
                    gameStuff.player.move = gameStuff.pet.bMove;
                    gameStuff.player.nature = gameStuff.pet.bNature;
                    gameStuff.player.level = gameStuff.pet.bLevel;
                    gameStuff.player.hp = gameStuff.pet.HP;
                    gameStuff.player.attack = gameStuff.pet.bAttack;
                    gameStuff.player.defense = gameStuff.pet.bDefense;

                    gameStuff.jerry.pokemon = gameStuff.pet.charmander;
                    gameStuff.jerry.move = gameStuff.pet.cMove;
                    gameStuff.jerry.nature = gameStuff.pet.cNature;
                    gameStuff.jerry.level = gameStuff.pet.cLevel;
                    gameStuff.jerry.hp = gameStuff.pet.HP;
                    gameStuff.jerry.attack = gameStuff.pet.cAttack;
                    gameStuff.jerry.defense = gameStuff.pet.cDefense;
                }
                else {
                    System.out.println();
                }
            }
        } while (choice == 2);
        
        Thread.sleep(2000);
        usefulMethod.clearScreen();
        System.out.println("\nAs you leave the lab");
        usefulMethod.loading(". . . . .", 150);
        maps.addingMaps();
        battle.starterBattle();

        maps.preAdventure();
        
    }

    public static void credit() throws InterruptedException {
        System.out.println(" █████╗  ██████╗  ███████╗██████╗  ██╗████████╗");
        System.out.println("██╔══██╗ ██╔══██╗ ██╔════╝██╔══██╗ ██║╚══██╔══╝");
        System.out.println("██║  ╚═╝ ██████╔╝ █████╗  ██║  ██║ ██║   ██║");
        System.out.println("██║  ██╗ ██╔══██╗ ██╔══╝  ██║  ██║ ██║   ██║");
        System.out.println("╚█████╔╝ ██║  ██║ ███████╗██████╔╝ ██║   ██║");
        System.out.println(" ╚════╝  ╚═╝  ╚═╝ ╚══════╝╚═════╝  ╚═╝   ╚═╝");

        usefulMethod.loading("Group member's name: Qi Da Chen, Shaughn Bulgar, Simeon Karakatsiotis, Wai Pong.\n\n", 50);
        Thread.sleep(50);
        usefulMethod.loading("Game dialogue created by Simeon Karakatsiotis.\n\n", 50);
        Thread.sleep(50);
        usefulMethod.loading("Pokemon and skill are created by Wai Pong.\n\n", 50);
        Thread.sleep(50);
        usefulMethod.loading("Battle system created by Qi Da Chen, Simeon Karakatsiotis, and Shaughn Bulgar.\n\n", 50);
        Thread.sleep(50);
        usefulMethod.loading("Map created by Wai Pong, Qi Da Chen, and Shaughn Bulgar\n\n", 50);
        Thread.sleep(50);
        usefulMethod.loading("Data structure used in the game: Recursion (battle system) and linked list (maps)\n\n", 50);
        Thread.sleep(50);
        usefulMethod.loading("Function that are used in the game: Slow printing, console clearing, experience check, etc\n\n", 50);
        Thread.sleep(1000);

        pokemon.thankYou();
    }

}
