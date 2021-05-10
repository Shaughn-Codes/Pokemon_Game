import java.util.Random;

public class usefulMethod {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  // For clearing the console screen.
    }  

    public static void loading(String word, int j) throws InterruptedException {
        for(int x = 0; x < word.length(); x++) {
            System.out.print(word.charAt(x));
            Thread.sleep(j); // For printing each char slowly. Good for loading time.
        }
    }

    public static void battleLogo() throws InterruptedException {
        // Print the battle word
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

    public static void checkExp() throws InterruptedException {// Checking experience.
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
            }

            if(gameStuff.player.level >= 15 && gameStuff.player.wincCount == 2) {
                battle.battle2();
            }
            if(gameStuff.player.level >= 20 && gameStuff.player.wincCount == 3) {
                battle.battle3();
            }
            return;
        }
        else { 
            return;
        }
    }
}
