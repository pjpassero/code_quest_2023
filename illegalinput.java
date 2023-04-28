import java.util.*;
public class illegalinput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
        int testCases = Integer.parseInt(input.nextLine());
        for(int testcase = 0; testcase < testCases; testcase++) {
            String sentence = input.nextLine();
                if(sentence.indexOf("';") > -1 && sentence.indexOf("--") > -1) {
                    System.out.println("REJECTED");
                } else if(sentence.toLowerCase().indexOf("' or 1=1") > -1) {
                    System.out.println("REJECTED");
                } else if(sentence.indexOf("${") > -1 && sentence.indexOf("}") > -1 || sentence.indexOf("$(") > -1 && sentence.indexOf(")") > -1) {
                    System.out.println("REJECTED");

                } else if(sentence.indexOf("&& sudo") > -1 || sentence.indexOf("&& su -") > -1) {
                    System.out.println("REJECTED");

                } else if(sentence.indexOf(";;") > -1) {
                    System.out.println("REJECTED");

                } else if(sentence.toLowerCase().indexOf("<script") > -1) {
                    System.out.println("REJECTED");

                } else if(sentence.indexOf("%s") > -1 || sentence.indexOf("%x") > -1 || sentence.indexOf("%n") > -1) {
                    System.out.println("REJECTED");

                } else {
                    System.out.println(sentence);
                }
            
         }
        }
}
}
