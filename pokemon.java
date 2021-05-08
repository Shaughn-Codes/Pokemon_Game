package Pokemon_Game;

import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) throws InterruptedException {
        
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
            usefulMethod.loading("\nGoodbye . .", 200);
        }
        scan.close();
    }
}
