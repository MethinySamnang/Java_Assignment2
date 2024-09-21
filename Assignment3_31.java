import java.util.Scanner;

public class Assignment3_31 {
    //1$=4100.00riel

    // Convert Riel to Dollar
    public static double dollar (double n){
       double dollar = n / 4100.00;
       return dollar;
    }

    public static double riel (double n){
        double riel = n * 4100.00;
        return riel;
    }

    public static void main(String[] args) {
        System.out.println("Welcome! Today's Exchange Rate is 1$ = 4100៛ 🤑✨");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0 (convert from $ to ៛) or 1 (convert from ៛ to $):");
        int user_choice = input.nextInt();

        System.out.print("Enter the amount you want to convert):");
        double n = input.nextInt();

        if (user_choice == 0){
            System.out.println("The converted amount is " + String.format("%.2f",riel(n)));
        } else if (user_choice == 1) {
            System.out.println("The converted amount is " + String.format("%.2f",dollar(n)));
        } else{
            System.out.println("Not Available");
        }


    }

}
