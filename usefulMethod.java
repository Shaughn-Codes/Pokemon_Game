package Pokemon_Game;

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

}
