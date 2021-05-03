package Pokemon_Game;
import java.util.ArrayList;
import java.util.List;

public class Room {
    int number;
    String name;
    ArrayList<String> desc = new ArrayList<String>();
    ArrayList<String> exit = new ArrayList<String>();

    public Room(int x){

        number = x;

    }

}
