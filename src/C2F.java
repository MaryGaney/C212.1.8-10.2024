import java.util.Scanner;

public class C2F {
    public static void main(String[] args){
        //taking input from the user
        //use scanner class
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        System.out.println("enter the temperature in celsius");
        celsius = in.nextDouble();

        //convert from c to f
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " celsius = " + fahrenheit);

    }

    public static double c2f(double celsius){
        return (celsius * 9/5.0) + 32;
    }
}
