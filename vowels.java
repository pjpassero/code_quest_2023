import java.util.*;
public class vowels {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for(int i = 0; i <testCases; i++) {
                int vowelValues = 0;
                String sentence = input.nextLine();
                String[] vowels = {"a", "e", "i", "o", "u"};
                for(int j = 0; j < vowels.length; j++) {
                    for(int k = 0; k < sentence.length();k++) {
                        if(sentence.substring(k, k+1).equals(vowels[j])) {
                            vowelValues = vowelValues + 1;
                        }
                    }
                }
                System.out.println(vowelValues);
                vowelValues = 0;

            }
        }
    }
}