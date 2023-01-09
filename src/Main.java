/*Create a small application that will assign and print out an example of all the primitive data types in Java. hint: None of these datatypes have a capital letter.

        Extra
        byte, short, int, long, char, float, double, and boolean.


        How come you can just print all of these datatypes?
        Why are those called primitive data types?
        Why can't you assign a double to an integer?
        DOUBLES need more space in memory so we might loose content
        You could cast them explicitely
        But why can you assign an integer to a char?
        Why can't you assign a long to a int?*/



public class Main // Declares a class called main
{
// Variables are strictly typed
// since they are declared in a class, they need to be static and thus cannot be changed
static int x = 26546676;       // The int data type is a 32-bit signed Java primitive data type.
   static short y = 32767;        // The short data type is a 16-bit signed Java primitive integer data type. Its range is -32768 to 32767 (or -215 to 215 - 1).
   static byte z = 127;           // The byte data type is an 8-bit signed Java primitive integer data type Its range is -128 to 127 (-
    static long l = 021L;          // The long data type is a 64-bit signed Java primitive data type.
                            // All whole numbers in the range of long are called integer literals of long type. An integer literal of type long always ends with L or lowercase l.
                            //long  num1;
                            // num1 = 25L;        Decimal  format
                            //num1 = 031L;        Octal format
                            //num1 = 0X19L;       Hexadecimal  format
                            //num1 = 0b11001L;   Binary   format


    static char f = 'f';           // contains a single character in sigle quotes

    static float fl = 0.22F;           // real numbers containing a fractional value ranging from 1.4e-045 to 3.4e+038
                                // They need the F to be recognized as Floats otherwise java assumes their doubles
                                // uses . as a delimiter for the fraction

   static double dl = 3.1234537878;   // real numbers containing a fractional value ranging from 4.9e-324 to 1.8e+308
                                // uses . as a delimiter for the fraction

    static boolean t = true;      // Truth values in lowercase

    // Technically there's void which is the type representing the absence of a return type

    // a java programs execution starts with the main method
    //like this :
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(l);
        System.out.println(f);
        System.out.println(fl);
        System.out.println(dl);
        System.out.println(t);
        // x = dl; possible lossy conversion from double to int

    }







}
