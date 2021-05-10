import java.util.Random;
//Members: Qi Da Chen, Shaughn Bulgar, Simeon Karakatsiotis, Wai Pong.

/*
The usefulMethod method has several methods that are used for quality of life insurance
throughout the program.
 */
public class usefulMethod {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  // For clearing the console screen.
    }  

    public static void loading(String word, int j) throws InterruptedException {
        /*
        loading give the illusion that the game is loading in the terminal.
         */
        for(int x = 0; x < word.length(); x++) {
            System.out.print(word.charAt(x));
            Thread.sleep(j); // For printing each char slowly. Good for loading time.
        }
    }

    public static void battleLogo() throws InterruptedException {
        // Print the battle word while using the loading method and
        //give the illusion of an animated logo being displayed when being challenged.
        usefulMethod.loading("██████╗   █████╗ ████████╗████████╗██╗     ███████╗██╗\n", 5);
        usefulMethod.loading("██╔══██╗ ██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝██║\n", 5);
        usefulMethod.loading("██████╦╝ ███████║   ██║      ██║   ██║     █████╗  ██║\n", 5); 
        usefulMethod.loading("██╔══██╗ ██╔══██║   ██║      ██║   ██║     ██╔══╝  ╚═╝\n", 5); 
        usefulMethod.loading("██████╦╝ ██║  ██║   ██║      ██║   ███████╗███████╗██╗\n", 5); 
        usefulMethod.loading("╚═════╝   ╚═╝ ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝╚═╝\n", 5);
    }

    public static int randomNumber(int x) { // Random number generator
        Random dice = new Random();
        int number;

        number = dice.nextInt(x);

        return number;
    }

    public static void checkExp() throws InterruptedException {
        /*
        Checking experience level of the player
        and leveling up themselves as well as their pokemon.
         */
        if(gameStuff.player.experience >= 100) {
            System.out.println("\nYour " + gameStuff.player.pokemon[0] + " have leveled up!");
            gameStuff.player.level++;
            System.out.println(gameStuff.player.pokemon[0] + " is now level " + gameStuff.player.level + "\n");
            gameStuff.player.experience = 0;
            gameStuff.player.hp = gameStuff.player.hp + 10;
            gameStuff.player.attack = gameStuff.player.attack + 5;
            gameStuff.player.defense = gameStuff.player.defense + 5;
            if(gameStuff.player.level >= 10 && gameStuff.player.wincCount == 1) {
                battle.battle1();
                // having a level 10 or higher exp and 1 win will call battle 1
            }

            if(gameStuff.player.level >= 15 && gameStuff.player.wincCount == 2) {
                battle.battle2();
                // having a level 15 or higher exp and 2 wins will call battle 2
            }
            if(gameStuff.player.level >= 20 && gameStuff.player.wincCount == 3) {
                battle.battle3();
                // having a level 20 or higher exp and 3 wins will call the final battle
            }
            return;
        }
        else { 
            return;
        }
    }
}
