import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=ob.nextInt();
        int sum=num1;


        while (true) {
            System.out.println("enter your operation");
            char b=ob.next().charAt(0);
            if (b == '+') {
                System.out.println("enter your second number");
                int num2 = ob.nextInt();

                sum = (sum + num2);

                System.out.println("Sum is " + sum);


            } else if (b == '-') {
                System.out.println("enter your second number");

                int num2 = ob.nextInt();
                sum = (sum - num2);

                System.out.println("Sutraction is " + sum);
            } else if (b == '*') {

                System.out.println("enter your second number");

                int num2 = ob.nextInt();
                sum = (sum * num2);

                System.out.println("multiplication is " + sum);

            } else if (b=='/'){
                System.out.println("enter your second number");

                int num2 = ob.nextInt();
                sum = (sum / num2);

                System.out.println("Division is " + sum);
            }
            else{
                System.exit(
                        1
                );
            }

        }


    }
}
