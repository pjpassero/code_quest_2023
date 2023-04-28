import java.util.*;
public class AreWeOnBudget {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
        int testCases = Integer.parseInt(input.nextLine());
        for(int testcase = 0; testcase < testCases; testcase++) {
          int lineItems = Integer.parseInt(input.nextLine());
          String budget = input.nextLine();
          String actual = input.nextLine();
          double newDiff = 0.0;
          int numLength = 0;
          int index = 0;
          double difference = 0;
          double[] budgetArr = new double[lineItems];
          double[]actualArr = new double[lineItems];
          for (int i =0; i < budget.length(); i++){
            if (budget.substring(i,i+1).equals(" ")){
                budgetArr[index] = Double.parseDouble(budget.substring(numLength, i));
                index++;
                numLength = i+1;
            }


            }
            budgetArr[index] = Double.parseDouble(budget.substring(numLength));
            numLength = 0;
            index = 0;
            for (int i =0; i < actual.length(); i++){
                if (actual.substring(i,i+1).equals(" ")){
                    actualArr[index] = Double.parseDouble(actual.substring(numLength, i));
                    index++;
                    numLength = i+1;
                }
    
    
                }
                actualArr[index] = Double.parseDouble(actual.substring(numLength));
            for (int i = 0; i <budgetArr.length; i++){
                difference+= actualArr[i] - budgetArr[i];

            }
            double avg = (difference/lineItems);
        
            long roundedInt = Math.round(avg * 100);
            long decimal = roundedInt%10;
            if (decimal >= 5){
            roundedInt++;
            }
            
            
            double result = (double) roundedInt/100;
            System.out.println(result);

          }


        }
    }
}

