package academy.learnprogramming;

import java.util.*;

public class Main {
    private static final int MAXELEMENTS = 10;
    private static final Scanner scanner = new Scanner(System.in);

    private static int[] getIntegers(){
        int[] theInts = new int[MAXELEMENTS];
        int count = 0;
        System.out.println("Enter "+MAXELEMENTS+" integer(s)?");
        while (count < MAXELEMENTS ){
            if ( scanner.hasNextInt()) {
                theInts[count++] = scanner.nextInt();
            }
            else
                break;
        }
        return theInts;
    }

    private static void printArray(String text, int[] theInts){
        System.out.println(text);
        for ( Integer i : theInts)
        {
            if (i!=0){
                System.out.println(i);
            }
        }
    }

    private static void streamPrintArray(String text, int[] theInts){
        System.out.println(text);
        Arrays.stream(theInts).forEach(System.out::println);
    }

    private static int[] sortArray(int[] theInts){
        int[] newInts = Arrays.copyOf(theInts,theInts.length);
        Arrays.sort(newInts);
        return newInts;
    }


    public static void main(String[] args) {
        int[] theInts = getIntegers();
        printArray("Before sort:",theInts);
        streamPrintArray("After sort:",sortArray(theInts));
    }
}
