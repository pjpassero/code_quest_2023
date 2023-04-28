import java.util.*;
public class findingnemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
        int testCases = Integer.parseInt(input.nextLine());
        String nimo = "Nimo";
        for(int testcase = 0; testcase < testCases; testcase++) {
            String sentence = input.nextLine();
            int nimoPosition = sentence.indexOf(nimo);
            int numWord = 1;
            for(int k = 0; k < nimoPosition; k++) {
                if(sentence.substring(k, k+1).equals(" ")) {
                    numWord++;
                }   
            }
            System.out.println(numWord);

        }
        }
}
}
