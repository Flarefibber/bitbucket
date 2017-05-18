package HW_02_1;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit = false;
    private static int choice;
    private static CollectionHolder collectionHolder;
    public static void start() {
        initCollectionHolder();
    while (true){
        printMenu();
        doChoice();
        runMenu();
        if (isExit) return;
    }

    }
    private static void printMenu() {
        System.out.println("=====================================================");
        System.out.println("==================Make your choice:==================");
        System.out.println("     1: input collection again");
        System.out.println("     2: add a new value");
        System.out.println("     3: remove the specified item");
        System.out.println("     4: search an element by value");
        System.out.println("     5: item search by index");
        System.out.println("     6: search for the maximum element");
        System.out.println("     7: search the minimum element");
        System.out.println("     8: search of the arithmetic mean of all elements");
        System.out.println("     9: print collection");
        System.out.println("     0: exit");
        System.out.println("=====================================================");
    }
    private static void runMenu() {
        switch (choice)  {
            case 1: initCollectionHolder(); break;
            case 2: addCollection(); break;
            case 3: removeCollection(); break;
            case 4: indexOf(); break;
            case 5: get(); break;
            case 6: maximum_element(); break;
            case 7: minimum_element(); break;
            case 8: arithmetic_meant(); break;
            case 9: runPrintMenu(); break;
            default: runExitMenu();
        }
    }
    private static void doChoice() {
        do {
            choice = readInt("Your choice is: \n");
        } while (choice < 0 || choice > 9);
    }

    private static int readInt(String request) {
        System.out.print(request);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(request);
            }
        }
    }
    private static void initCollectionHolder() {
        int size = enterSizeArray();
        collectionHolder = new CollectionHolder();
        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            addCollection();
        }
    }

    private static void addCollection(){
        collectionHolder.addCollection(readInt("Add: \n"));

    }
    private static void removeCollection(){

        collectionHolder.removeCollection(getIndex());
    }

    private static void indexOf() {
        int value = collectionHolder.indexOfCollection(readInt("Enter a value to search for: \n"));
        if (value == -1)System.out.print("Value not found. \n");
        else System.out.print("Index value: " + value + "\n");
    }
    private static void get() {
        System.out.println("Value: "+collectionHolder.getCollection(getIndex())+ "\n");
    }

    private static void maximum_element() {
        System.out.println("Maximum element: "+collectionHolder.maximum_elementCollection()+ "\n");
    }
    private static void minimum_element() {
        System.out.println("Minimum element: "+collectionHolder.minimum_elementCollection()+ "\n");
    }
    private static void arithmetic_meant() {
        System.out.println("Arithmetic mean of all elements: "+collectionHolder.arithmetic_meanCollection()+ "\n");
    }

    private static int getIndex() {
        int index = -1;
        int size = collectionHolder.sizeCollection();
        while ((index < 0) || (index > size-1)) {
            index = readInt("Enter an index from 0 to " + (size-1) + ": \n");
        }
        return index;
    }
    private static int enterSizeArray() {
        int size;
        while ((size  = readInt("Enter how much you want to enter the items in the collection: \n")) < 1);
        return size;
    }
    private static void runPrintMenu() {
        collectionHolder.printCollection();
    }

    private static void runExitMenu() {
        scanner.close();
        isExit = true;
    }
}
