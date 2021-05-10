import java.util.Scanner;

public class maps {
    class Node {
        int nodeData;
        Node next;
        Node perv;

        Node (int data) {
            nodeData = data;
            next = null;
            perv = null; 
        }
    }

    static Node head;
    static Node end;
    static int wildChance;
    static String direction;
    static Node current;
    static Scanner scan = new Scanner(System.in);

    public void add(int nodeData) {
        Node createNode = new Node(nodeData);

        if(head == null) {
            head = createNode;
            end = createNode;
        }
        else {
            end.next = createNode;
            createNode.perv = end;
            end = createNode;
            end.next = head;
            head.perv = end;
        }
    }

    public static void addingMaps() {
        maps mapList = new maps();

        mapList.add(1); // Town
        mapList.add(2); // Route 1
        mapList.add(3); // Route 2
        mapList.add(4); // Route 3
        mapList.add(5); // Route 4
        mapList.add(6); // Route 5
    }

    public static void preAdventure() throws InterruptedException {
        town();
    }
    public static void town() throws InterruptedException {
        usefulMethod.clearScreen();
        current = head;
        System.out.println("You are at town "); // Town start. THE BEGINNING
        System.out.println("Where would you like to go? ");
        System.out.println("(N) Route 1, (NW) Route 5");
        System.out.println("\nType in the letter(s) for the direction you wanna go.");

        System.out.print("Direction: ");
        direction = scan.next();

        if(direction.equalsIgnoreCase("n")) {
            current = head.next;
            if(current.nodeData == 2) {
                routeOne();
            }
        }
        else if(direction.equalsIgnoreCase("nw")) {
            current = head.perv;
            if(current.nodeData == 6) {
                routeFive();
            }
        }
    }

    public static void routeOne() throws InterruptedException {
        usefulMethod.clearScreen();
        System.out.println("You are in Route 1.");
        wildChance = usefulMethod.randomNumber(100);

        if(wildChance < 50) {
            System.out.println("There is nothing here.");
            System.out.println("\nWhere would you like to go?");
        }
        else if(wildChance >= 50) {
            usefulMethod.battleLogo();
            System.out.println("A wild " + gameStuff.pet.rattata[0] + " appeared.");
            System.out.println("Go " + gameStuff.player.pokemon[0] + "!");
            battle.battleWild(gameStuff.player.hp, gameStuff.pet.HP);
            System.out.println("You are still in Route 1");
        }

        System.out.println("(N) Route 3, (E) Route 2, (S) Town");
        System.out.println("\nType in the letter(s) for the direction you wanna go.");

        System.out.print("Direction: ");
        direction = scan.next();

        if(direction.equalsIgnoreCase("e")) {
            current = head.next.next;
            if(current.nodeData == 3) {
                routeTwo();
            }
        }
        else if(direction.equalsIgnoreCase("s")) {
            current = head;
            if(current.nodeData == 1) {
                town();
            }
        }
        else if(direction.equalsIgnoreCase("n")) {
            current = head.next.next.next;
            if(current.nodeData == 4) {
                routeThree();
            }
        }
    }

    public static void routeTwo() throws InterruptedException {
        usefulMethod.clearScreen();
        System.out.println("You are at Route 2");
        wildChance = usefulMethod.randomNumber(100);

        if(wildChance < 50) {
            System.out.println("There is nothing here.");
            System.out.println("\nWhere would you like to go?");
        }
        else if(wildChance >= 50) {
            usefulMethod.battleLogo();
            System.out.println("A wild " + gameStuff.pet.rattata[0] + " appeared.");
            System.out.println("Go " + gameStuff.player.pokemon[0] + "!");
            battle.battleWild(gameStuff.player.hp, gameStuff.pet.HP);
            System.out.println("\nYou are still in Route 2");
        }

        System.out.println("(NW) Route 3, (W) Route 1");
        System.out.println("\nType in the letter(s) for the direction you wanna go.");

        System.out.print("Direction: ");
        direction = scan.next();

        if(direction.equalsIgnoreCase("nw")) {
            current = head.next.next.next;
            if(current.nodeData == 4) {
                routeThree();
            }
        }
        else if(direction.equalsIgnoreCase("w")) {
            current = head.next;
            if(current.nodeData == 2) {
                routeOne();
            }
        }
    }

    public static void routeThree() throws InterruptedException {
        usefulMethod.clearScreen();
        System.out.println("You are at Route 3");
        wildChance = usefulMethod.randomNumber(100);

        if(wildChance < 50) {
            System.out.println("There is nothing here.");
            System.out.println("\nWhere would you like to go?");
        }
        else if(wildChance >= 50) {
            usefulMethod.battleLogo();
            System.out.println("A wild " + gameStuff.pet.rattata[0] + " appeared.");
            System.out.println("Go " + gameStuff.player.pokemon[0] + "!");
            battle.battleWild(gameStuff.player.hp, gameStuff.pet.HP);
            System.out.println("You are still in Route 3");
        }

        System.out.println("(W) Route 4, (SW) Route 5, (S) Route 1, (SE) Route 2");
        System.out.println("\nType in the letter(s) for the direction you wanna go.");

        System.out.print("Direction: ");
        direction = scan.next();

        if(direction.equalsIgnoreCase("w")) {
            current = head.perv.perv;
            if(current.nodeData == 5) {
                routeFour();
            }
        }
        else if(direction.equalsIgnoreCase("sw")) {
            current = head.perv;
            if(current.nodeData == 6) {
                routeFive();
            }
        }
        else if(direction.equalsIgnoreCase("s")) {
            current = head.next;
            if(current.nodeData == 2) {
                routeOne();
            }
        }
        else if(direction.equalsIgnoreCase("se")) {
            current = head.next.next;
            if(current.nodeData == 3) {
                routeTwo();
            }
        }
    }

    public static void routeFour() throws InterruptedException {
        usefulMethod.clearScreen();
        System.out.println("You are at Route 4");
        wildChance = usefulMethod.randomNumber(100);

        if(wildChance < 50) {
            System.out.println("There is nothing here.");
            System.out.println("\nWhere would you like to go?");
        }
        else if(wildChance >= 50) {
            usefulMethod.battleLogo();
            System.out.println("A wild " + gameStuff.pet.rattata[0] + " appeared.");
            System.out.println("Go " + gameStuff.player.pokemon[0] + "!");
            battle.battleWild(gameStuff.player.hp, gameStuff.pet.HP);
            System.out.println("You are still in Route 4");
        }

        System.out.println("(S) Route 5, (E) Route 3");
        System.out.println("\nType in the letter(s) for the direction you wanna go.");

        System.out.print("Direction: ");
        direction = scan.next();

        if(direction.equalsIgnoreCase("s")) {
            current = head.perv;
            if(current.nodeData == 6) {
                routeFive();
            }
        }
        else if(direction.equalsIgnoreCase("e")) {
            current = head.next.next.next;
            if(current.nodeData == 4) {
                routeThree();
            }
        }
    }

    public static void routeFive() throws InterruptedException {
        usefulMethod.clearScreen();
        System.out.println("You are at Route 5");
        wildChance = usefulMethod.randomNumber(100);

        if(wildChance < 50) {
            System.out.println("There is nothing here.");
            System.out.println("\nWhere would you like to go?");
        }
        else if(wildChance >= 50) {
            usefulMethod.battleLogo();
            System.out.println("A wild " + gameStuff.pet.rattata[0] + " appeared.");
            System.out.println("Go " + gameStuff.player.pokemon[0] + "!");
            battle.battleWild(gameStuff.player.hp, gameStuff.pet.HP);
            System.out.println("You are still in Route 5");
        }

        System.out.println("(N) Route 4, (NE) Route 3, (SE) Town");
        System.out.println("\nType in the letter(s) for the direction you wanna go.");

        System.out.print("Direction: ");
        direction = scan.next();

        if(direction.equalsIgnoreCase("n")) {
            current = head.perv.perv;
            if(current.nodeData == 5) {
                routeFour();
            }
        }
        else if(direction.equalsIgnoreCase("ne")) {
            current = head.next.next.next;
            if(current.nodeData == 4) {
                routeThree();
            }
        }
        else if(direction.equalsIgnoreCase("se")) {
            current = head;
            if(current.nodeData == 1) {
                town();
            }
        }
    }

}

