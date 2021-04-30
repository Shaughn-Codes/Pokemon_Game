import java.util.Scanner;

public class Game_Logic {
    public Game_Logic(){

    }

    public void waitforCommand(){

        if (GameObjects.pc.inRoom == 0){
            createCharacter();
        }
        System.out.println("What to do?");
        Scanner sc  = new Scanner(System.in);
        String com = sc.nextLine();


        String[] words = com.split(" ");
        processCommand(words);


    }

    public void processCommand(String[] words){


    }

    public void createCharacter(){
        System.out.println("Welcome to the gaem. What is your naem?");
        Scanner sc = new Scanner(System.in);

        Game_Objects.pc.name = sc.next();
        System.out.println();
        Game_Objects.po.hp = 100;
        Game_Objects.pc.accuracy = 66;
        Game_Objects.pc.inRoom = 3;
    }
}
