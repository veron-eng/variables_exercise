import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        String firstName = "Veron";
//        String lastName = "Sundaram";
//
//        String name = firstName + " " + lastName;
//
//        System.out.println(name);

//        int num1 = 10;
//        int num2 = 20;
//
//        System.out.println(num1 + num2);
//
//        float result = (float)num1 / num2;
//
//        System.out.println(result);
//
//        int num3 = 8;
//
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("please write your first and last name");
        String response = scanner.nextLine();

        System.out.println("Hello " + response);

        System.out.println("please write your first number");
         int num1 = scanner.nextInt();

        System.out.println("please write your second number");
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);


    }
}