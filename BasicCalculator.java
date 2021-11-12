import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[]args){
        int FirstNumber ,SecondNumber ;
        char operator ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        FirstNumber =scanner.nextInt();
        System.out.println("Choose the operator:'*' ,'-' ,'/','%','+'");
        operator = scanner.next().charAt(0);
        System.out.println("Enter the Second Number:\n");
        SecondNumber =scanner.nextInt();
        //The switch statement helps the user in choosing the operator//
        switch (operator) {
            //Multiplication//
            case '*':
                int mult=(FirstNumber *SecondNumber);
                System.out.println("The multiplication is =" + mult);
                break;

            case '-':
               int sub= (FirstNumber -SecondNumber );
               System.out.println("The subtration value is =" +sub);
               break;
               //The division '/ sign //
            case '/':
               int div= (FirstNumber / SecondNumber);
               System.out.println("The division is =" + div);
               break;
             //The modulus '%'//
            case '%':
               int mod=(FirstNumber % SecondNumber) ;
               System.out.println("The Modulus value is =" + mod);
               break;
            //The addition '+' //
            case '+':
              int add = (FirstNumber + SecondNumber);
              System.out.println("The Addition value is  =" + add);
              break ;
        //unrecorgnized sign entered //
            default:
            System.out.println("The operator entered is Invalid");
                break;
        }

    }

}