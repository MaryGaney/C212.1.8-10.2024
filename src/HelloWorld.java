public class HelloWorld {
    public static void main(String[] args){
        // (sout)
        // System.out.println("Brave New World");

        //variables
        //primitive types
        //string is not, string is immutable
        //int
        //byte
        //short
        //long
        //double
        //float
        //char

        //formatted output
        //System.out.printf("format specifier", value)
        //%10.2f -> adds 10 spaces before, is a format specifier
        // -> 10 is field width specifier, 2 is the amt of decimals that the value will print
        System.out.printf("%10.2f for %-20s\n", Math.PI, "hello");

        //creation of strings
        String name1 = "name";
        //length of the string
        int n = name1.length();

    }
}
