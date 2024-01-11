//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //ch1 first day notes
        //jvm is set of libraries and other tools
        //jre is development tools
        //jdk is broad environment to host everything

    //single line comments
    /*
        multi-line comments
     */

    //numeric types
        //int      \
        //byte      | Whole numbers
        //short     |
        //long     /
        //double    \ Floating point numbers
        //float     /
        //char        Characters (no math)

    //mathematical methods
    /*
        Math.sqrt(x) - Square root of x (>=0)
        Math.pow(x,y) - x^y (x>0, or x=0 and y>0, or x<0 and y is an integer)
        Math.sin(x) - Sine of x (x in radians)
        Math.cos(x) - Cosine of x
        Math.tan(x) - Tangent of x
        Math.toRadians(x) - Convert x degrees to radians
        Math.toDegrees(x) - Convert x radians to degrees
        Math.exp(x) - e^x
        Math.log(x) - Natural log (ln(x),x>0)
        Math.log10(x) - Decimal log(log base 10(x), x>0)
        Math.abs(x) - Absolute value |x|
        Math.round - Closest integer to x (as a long)
        Math.max(x,y) - The larger of x and y
        Math.min(x,y) - The smaller of x and y

     */

    /*
    Format types
    "%d" - Use d with an integer
    "%5d" - Spaces are added so that the field width is 5
    "Quantity: %5d" - Characters inside a format string but outside a format specifier appear in the output
    "%f" - use f with a floating-point number
    "%.2f" - Print two digits after the decimal point
    "%7.2f" - Spaces are added so that the field width is 7
    "%s" - Use s with a string
    "%d %.2f" - You can format multiple values at once
    "Hello%nWorld%n" - Each %n causes subsequent output to continue on a new line

     */
}