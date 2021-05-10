import java.util.Scanner;
//Members: Qi Da Chen, Shaughn Bulgar, Simeon Karakatsiotis, Wai Pong.


/*
The pokemon class is the class that has the main method and starts the whole program
and has a thank you method for the end game.
 */
public class pokemon {
    public static void main(String[] args) throws InterruptedException {
        /*
        The main method starts the the program and displays and animated
        Pokemon logo as well as a greeting to the player and asks
        if they are ready to start the game.
         */
        
        int choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗");
        System.out.println("██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║");
        System.out.println("██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║");
        System.out.println("██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║");
        System.out.println("██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║");
        System.out.println("╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝\n");
    
        System.out.println("Welcome to Pokemon! Pick the number for the choices you want below.");
        System.out.println("(1) Start game");
        System.out.println("(2) Quit");
    
        System.out.print("Choice: ");
        choice = scan.nextInt();
    
        if(choice == 1) {
            game.start();
        }
        else if(choice == 2) {
            usefulMethod.loading("\nGoodbye . .", 150);
        }
        scan.close();
    }

    public static void thankYou() throws InterruptedException {
        /*
        the thank you method is thrown when the game is over
        and displays "thank you for playing this game."
         */
        usefulMethod.clearScreen();
        System.out.println("Thank you for playing this game!");
        Thread.sleep(1000);
        System.exit(0);
    }
}
