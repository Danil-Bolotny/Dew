import java.io.IOException;
import java.util.Scanner;

public class MainStage2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int monthlyPayment = 0, loanPrincipal = 0, numberOfMonths = 0;
        while(true){
            System.out.println("Enter the loan principal: ");
            try {
                loanPrincipal = in.nextInt();
            } catch (Exception e) {
                System.out.println("Error in input data");
            }

            System.out.println("What do you want to calculate? \n" +
                    "type \"m\" – for number of monthly payments,  \n" +
                    "type \"p\" – for the monthly payment: ");
            try{
                String mode = in.next();
                if(mode.equals("m") || mode.equals("M")){
                    System.out.println("Enter the monthly payment: ");
                    monthlyPayment = in.nextInt();
                    int result = monthsForLoanRepay(loanPrincipal, monthlyPayment);
                    System.out.println("It will take " + result + " months to repay the loan");
                }
                else if(mode.equals("p") || mode.equals("P")){
                    System.out.println("Enter the number of months: ");
                    numberOfMonths = in.nextInt();
                    int moneyForLoanRepay = moneyForLoanRepay(loanPrincipal, numberOfMonths);
                    int restOfMoney = restOfMoney(loanPrincipal, numberOfMonths, moneyForLoanRepay);
                    System.out.println("Your monthly payment = " + moneyForLoanRepay +
                                       " and the last payment = " + restOfMoney);
                }
            }
            catch(Exception e){
                System.out.println("Error in input data");
            }
            System.out.println("-------------------------------------------------");
        }
    }

    private static int monthsForLoanRepay(int loanPrincipal, int monthlyPayment){
        return loanPrincipal / monthlyPayment;
    }

    private static int moneyForLoanRepay(int loanPrincipal, int numberOfMonths){
        return ((loanPrincipal % numberOfMonths) == 0)?
                loanPrincipal / numberOfMonths:
                (loanPrincipal / numberOfMonths) + 1;
    }

    private static int restOfMoney(int loanPrincipal, int numberOfMonths, int moneyForLoanRepay){
        return ((moneyForLoanRepay * numberOfMonths) == loanPrincipal)?
                0:
                loanPrincipal - (moneyForLoanRepay * (numberOfMonths - 1));
    }
}
