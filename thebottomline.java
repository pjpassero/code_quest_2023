import java.util.*;
public class thebottomline {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
        int testCases = Integer.parseInt(input.nextLine());
        for(int testcase = 0; testcase < testCases; testcase++) {
           String sentence = input.nextLine();
           int spacePosition = sentence.indexOf(" ");
           int numOne = Integer.parseInt(sentence.substring(0, spacePosition));
           int numTwo = Integer.parseInt(sentence.substring(spacePosition + 1));
           int difference = Math.abs(numOne - numTwo);
           if(numOne > numTwo) {
            
            System.out.println("Cassowary Craft sold " + difference + " more aircraft");
           } else if (numTwo > numOne) {
            System.out.println("Lead Balloons Ltd sold " + difference + " more aircraft");

           } else {
            System.out.println("Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft");

           }
        }
        }
}
}
