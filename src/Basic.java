import java.util.Scanner;
public class Basic {
    public static void main(String[] args){
//        System.out.println("Hello Ankit");
        //sum.java
//        int a = 5;
//        int b = 10;
//        int sum = a+b;
//        System.out.println(a+b);
        // Rectangle area
//        double length = 7.8;
//        double breadth = 8.0;
//        double area = length*breadth;
//        System.out.println(area);

        // simple interest
//        double P = 1000;
//        double R = 3.4;
//        double T = 3;
//        double SI = (P*R*T)/100;
//        System.out.println("simple interest is:"+SI);

        // Celcius to Fahrenheit

//        double temp_celcius = 37.8;
//        double temp_fahrenheit = (temp_celcius * 9/5) + 32;
//        System.out.println(temp_celcius+" after converting celcius to fahrenheit is "+temp_fahrenheit);

        //Swaping of two numbers
//        int a = 9;
//        int b = 0;
//        System.out.println("Before Swaping value of a and b is :" +a+" "+b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After Swapping value of a and b is : "+a+" "+b);

        // Factorial of a number
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of the number: ");
//        int num = sc.nextInt();
//        int ans = 1;
//        while(num >= 1){
//            ans *= num;
//            num -= 1;
//        }
//        System.out.println("The Factorial of num is "+ ans);

        //Fibonaaci number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the number: ");
        int num = sc.nextInt();
        int prev = 1;
        int prev1 = 1;
        if(num == 1 || num == 2){
            System.out.println(num+"th "+"fibonacci number is "+prev);
            return;
        }
        int i = 3;
        int ans = 0;
        while(i <= num){
            ans = prev + prev1;
            prev1 = prev;
            prev = ans;
            i++;
        }
        System.out.println(num+"th "+"fibonacci number is "+ ans);
    }
}
