import java.util.Scanner;

public class battle {
    
    static int choice;
    static Scanner scan = new Scanner(System.in);
   

    public static void starterBattle() throws InterruptedException{

        System.out.println("\nAnnoying teen: Hey kid, I see that you got your " 
                          + gameStuff.player.pokemon[0] + ". Let's fight (You cannot reject this)");
        Thread.sleep(2000);
        usefulMethod.clearScreen();
        usefulMethod.battleLogo();
        System.out.println("Pokemon Trainer Jerry Bloke forced you into battle!");
        System.out.println("Trainer Jerry Bloke sent out " + gameStuff.jerry.pokemon[0] + "." );
        System.out.println("Go "+ gameStuff.player.pokemon[0] +"!");
        
        battleSystemPVP(gameStuff.player.hp, gameStuff.jerry.hp);

    }
        
    public static void battle1() throws InterruptedException  {

        System.out.println("Pokemon Trainer Jerry: Hey kid! Let's fight again");
        System.out.println("(Yep, you can't rejcect this again");

        Thread.sleep(2000);
        usefulMethod.clearScreen();
        usefulMethod.battleLogo();
        System.out.println("Trainer Jerry Bloke sent out " + gameStuff.jerry.pokemon[1] + "." );
        System.out.println("Go "+ gameStuff.player.pokemon[0] +"!");

        gameStuff.jerry.hp = gameStuff.pet.HP + (5 * 10);
        gameStuff.jerry.attack = gameStuff.jerry.attack + (5 * 5);
        gameStuff.jerry.defense = gameStuff.jerry.defense + (5 * 5);
        battleSystemPVP(gameStuff.player.hp, gameStuff.jerry.hp);     
    }

    public static void battle2() throws InterruptedException {

        System.out.println("Trainer Jerry: You have walked in front of my path, so you wanna fight.");
        System.out.println("(You know the rules already)");

        Thread.sleep(2000);
        usefulMethod.clearScreen();
        usefulMethod.battleLogo();
        System.out.println("Trainer Jerry Bloke sent out " + gameStuff.jerry.pokemon[1] + "." );
        System.out.println("Go "+ gameStuff.player.pokemon[0] +"!");

        gameStuff.jerry.hp = gameStuff.pet.HP + (10 * 10);
        gameStuff.jerry.attack = gameStuff.jerry.attack + (10 * 5);
        gameStuff.jerry.defense = gameStuff.jerry.defense + (10 * 5);
        battleSystemPVP(gameStuff.player.hp, gameStuff.jerry.hp); 
    }

    public static void battle3() throws InterruptedException {

        System.out.println("Trainer Jerry: We have meet again, blah blah blah.");
        System.out.println("(I know. But I promise this is the last one");

        Thread.sleep(2000);
        usefulMethod.clearScreen();
        usefulMethod.battleLogo();
        System.out.println("Trainer Jerry Bloke sent out " + gameStuff.jerry.pokemon[1] + "." );
        System.out.println("Go "+ gameStuff.player.pokemon[0] +"!");

        gameStuff.jerry.hp = gameStuff.pet.HP + (15 * 10);
        gameStuff.jerry.attack = gameStuff.jerry.attack + (15 * 5);
        gameStuff.jerry.defense = gameStuff.jerry.defense + (15 * 5);
        gameStuff.player.hp = 2;
        battleSystemPVP(gameStuff.player.hp, gameStuff.jerry.hp);

        System.out.println("Trainer Jerry: I was hungry....");

        Thread.sleep(2000);
        usefulMethod.clearScreen();

        System.out.println("You have beat the game! Congratulation!");
        Thread.sleep(2000);
        usefulMethod.clearScreen();

        game.credit();
    }
    
    //--------------------PVP battle---------------------
    public static void battleSystemPVP(int trainerHP, int jerryHP) throws InterruptedException {
        
        int damage;
        
        if(trainerHP <= 1 && jerryHP <= 1) {
            System.out.println("\nYour pokemon and Jerry's pokemon both passed out....");
            System.out.println("Trainer Jerry: ......");
        
            Thread.sleep(2000);
            System.out.println("You have been sent back to town");
            System.out.println("Your " + gameStuff.player.pokemon[0] + " is healed");
            gameStuff.player.hp = gameStuff.pet.HP + (10 * (gameStuff.player.level - 5)); 
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            maps.town();
        }
        if(trainerHP <= 1 && jerryHP >= 1) {
            System.out.println("\nYou have been defeated!");
            System.out.println("Trainer Jerry Bloke: Suck it kid. Quit being a trainer.");

            Thread.sleep(2000);
            usefulMethod.clearScreen();
            System.out.println("You have been sent back to town.");
            System.out.println("Your " + gameStuff.player.pokemon[0] + " is healed");
            gameStuff.player.hp = gameStuff.pet.HP + (10 * (gameStuff.player.level - 5)); 
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            maps.town();
        }
        if(jerryHP <= 1 && trainerHP >= 1) {
            System.out.println("\nYou have defeat Trainer Jerry Bloke");
            System.out.println("100 exp is added to your pokemon");
            gameStuff.player.experience = gameStuff.player.experience + 100;
            gameStuff.player.wincCount = gameStuff.player.wincCount + 1;
            usefulMethod.checkExp();
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            return;
        }
        else {
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            System.out.println("\nWhat would you like to do? ");
            System.out.println("(1) Attack");
        
            System.out.print("Choice: ");
            choice = scan.nextInt();
        
            if(choice == 1) {
                System.out.println("\nHere are your moves: ");
                System.out.println("(1) " + gameStuff.player.pokemon[1]
                                    + " (2) " + gameStuff.player.pokemon[2]
                                    + " (3) " + gameStuff.player.pokemon[3]
                                    + " (4) " + gameStuff.player.pokemon[4]);
                
                System.out.print("Choice: ");
                choice = scan.nextInt();

                if(choice == 1) {
                    damage = gameStuff.jerry.defense - ((gameStuff.player.attack / 100) * gameStuff.player.move[0]);
                    jerryHP = jerryHP - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[1] + ".");
                    System.out.println("Jerry's " + gameStuff.jerry.pokemon[0] + " is now at " + jerryHP + " HP!");
                }
                else if(choice == 2) {
                    damage = gameStuff.jerry.defense - ((gameStuff.player.attack / 100) * gameStuff.player.move[1]);
                    jerryHP = jerryHP - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[2] + ".");
                    System.out.println("Jerry's " + gameStuff.jerry.pokemon[0] + " is now at " + jerryHP + " HP!");
                }
                else if(choice == 3) {
                    damage = gameStuff.jerry.defense - ((gameStuff.player.attack / 100) * gameStuff.player.move[2]);
                    jerryHP = jerryHP - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[3] + ".");
                    System.out.println("Jerry's " + gameStuff.jerry.pokemon[0] + " is now at " + jerryHP + " HP!");
                }
                else if(choice == 4) {
                    damage = gameStuff.jerry.defense - ((gameStuff.player.attack / 100) * gameStuff.player.move[3]);
                    jerryHP = jerryHP - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[4] + ".");
                    System.out.println("Jerry's " + gameStuff.jerry.pokemon[0] + " is now at " + jerryHP + " HP!");
                }
            }

            int ranNumber = usefulMethod.randomNumber(4);
            if(ranNumber == 0) {
                damage = gameStuff.player.defense - ((gameStuff.jerry.attack / 100) * gameStuff.jerry.move[0]); 
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.jerry.pokemon[0] + " used " + gameStuff.jerry.pokemon[1] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
            else if(ranNumber == 1) { 
                damage = gameStuff.player.defense - ((gameStuff.jerry.attack / 100) * gameStuff.jerry.move[1]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.jerry.pokemon[0] + " used " + gameStuff.jerry.pokemon[2] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
            else if(ranNumber == 2) { 
                damage = gameStuff.player.defense - ((gameStuff.jerry.attack / 100) * gameStuff.jerry.move[2]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.jerry.pokemon[0] + " used " + gameStuff.jerry.pokemon[3] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
            else if(ranNumber == 3) { 
                damage = gameStuff.player.defense - ((gameStuff.jerry.attack / 100) * gameStuff.jerry.move[3]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.jerry.pokemon[0] + " used " + gameStuff.jerry.pokemon[4] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
        }

        battleSystemPVP(trainerHP, jerryHP); // Recursive to keep the battle going. 
    }

    //--------------Wild battle--------------------------
    public static void battleWild(int trainerHP, int wildHp) throws InterruptedException {
        
        int damage;
        
        if(trainerHP <= 1 && wildHp <= 1) {
            System.out.println("\nYour pokemon and Rattata both passed out....");
        
            Thread.sleep(2000);
            System.out.println("You have been sent back to town");
            System.out.println("Your " + gameStuff.player.pokemon[0] + " is healed");
            gameStuff.player.hp = gameStuff.pet.HP + (10 * (gameStuff.player.level - 5)); 
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            maps.town();
        }
        if(trainerHP <= 1 && wildHp >= 1) {
            System.out.println("\nYou have been defeated!");
        
            Thread.sleep(2000);
            System.out.println("You have been sent back to town");
            System.out.println("Your " + gameStuff.player.pokemon[0] + " is healed");
            gameStuff.player.hp = gameStuff.pet.HP + (10 * (gameStuff.player.level - 5)); 
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            maps.town();
        }
        if(wildHp <= 1 && trainerHP >= 1) {
            System.out.println("\nYou have defeat " + gameStuff.pet.rattata[0]);
            System.out.println("100 exp is added to your pokemon");
            gameStuff.player.experience = gameStuff.player.experience + 100;
            usefulMethod.checkExp();
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            return;
        }
        else {
            Thread.sleep(2000);
            usefulMethod.clearScreen();
            System.out.println("\nWhat would you like to do? ");
            System.out.println("(1) Attack");
        
            System.out.print("Choice: ");
            choice = scan.nextInt();
        
            if(choice == 1) {
                System.out.println("\nHere are your moves: ");
                System.out.println("(1) " + gameStuff.player.pokemon[1]
                                    + " (2) " + gameStuff.player.pokemon[2]
                                    + " (3) " + gameStuff.player.pokemon[3]
                                    + " (4) " + gameStuff.player.pokemon[4]);
                
                System.out.print("Choice: ");
                choice = scan.nextInt();

                if(choice == 1) {
                    damage = gameStuff.pet.rDefense - ((gameStuff.player.attack / 100) * gameStuff.player.move[0]);
                    wildHp = wildHp - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[1] + ".");
                    System.out.println(gameStuff.pet.rattata[0] + " is now at " + wildHp + " HP!");
                }
                else if(choice == 2) {
                    damage = gameStuff.pet.rDefense - ((gameStuff.player.attack / 100) * gameStuff.player.move[1]);
                    wildHp = wildHp - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[2] + ".");
                    System.out.println(gameStuff.pet.rattata[0] + " is now at " + wildHp + " HP!");
                }
                else if(choice == 3) {
                    damage = gameStuff.pet.rDefense - ((gameStuff.player.attack / 100) * gameStuff.player.move[2]);
                    wildHp = wildHp - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[3] + ".");
                    System.out.println(gameStuff.pet.rattata[0] + " is now at " + wildHp + " HP!");
                }
                else if(choice == 4) {
                    damage = gameStuff.pet.rDefense - ((gameStuff.player.attack / 100) * gameStuff.player.move[3]);
                    wildHp = wildHp - damage;
                    System.out.println("\n" + gameStuff.player.pokemon[0] + " used " + gameStuff.player.pokemon[4] + ".");
                    System.out.println(gameStuff.pet.rattata[0] + " is now at " + wildHp + " HP!");
                }
            }

            int ranNumber = usefulMethod.randomNumber(4);
            if(ranNumber == 0) { 
                damage = gameStuff.player.defense - ((gameStuff.pet.rAttack / 100) * gameStuff.pet.rMove[0]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.pet.rattata[0] + " used " + gameStuff.pet.rattata[1] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
            else if(ranNumber == 1) { 
                damage = gameStuff.player.defense - ((gameStuff.pet.rAttack / 100) * gameStuff.pet.rMove[1]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.pet.rattata[0] + " used " + gameStuff.pet.rattata[2] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
            else if(ranNumber == 2) { 
                damage = gameStuff.player.defense - ((gameStuff.pet.rAttack / 100) * gameStuff.pet.rMove[2]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.pet.rattata[0] + " used " + gameStuff.pet.rattata[3] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
            else if(ranNumber == 3) { 
                damage = gameStuff.player.defense - ((gameStuff.pet.rAttack / 100) * gameStuff.pet.rMove[3]);
                trainerHP = trainerHP - damage;
                System.out.println("\n" + gameStuff.pet.rattata[0] + " used " + gameStuff.pet.rattata[4] + ".");
                System.out.println("Your " + gameStuff.player.pokemon[0] + " is now at " + trainerHP + " HP!");
            }
        }

        battleWild(trainerHP, wildHp); // Recursive to keep the battle going. 
    }
}
