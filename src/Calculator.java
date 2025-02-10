import java.util.Scanner; 

public class Calculator {  
    public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);  
        char choice; 
        
        do {
            System.out.println("===== Simple Calculator =====");  
            System.out.print("Enter first number: ");  
            double num1 = sc.nextDouble();  

            System.out.print("Enter operator (+, -, *, /): ");  
            char operator = sc.next().charAt(0);  

            System.out.print("Enter second number: ");  
            double num2 = sc.nextDouble();  

            double result = 0;  
            boolean valid = true;  

            if (operator == '+') {  
                result = num1 + num2;  
            } else if (operator == '-') {  
                result = num1 - num2;  
            } else if (operator == '*') {  
                result = num1 * num2;  
            } else if (operator == '/') {  
                if (num2 != 0) {  
                    result = num1 / num2;  
                } else {  
                    System.out.println("Error: Division by zero is not allowed.");  
                    valid = false;  
                }
            } else {  
                System.out.println("Invalid operator! Please use +, -, *, /");  
                valid = false;  
            }  

            if (valid) {  
                System.out.println("Result: " + result);  
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");  
            choice = sc.next().charAt(0);  

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the calculator!");  
        sc.close();  
    }  
}
