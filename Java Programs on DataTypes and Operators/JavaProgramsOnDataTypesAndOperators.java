/*1. Write a program to convert Integer value into Binary */
// import java.util.Scanner;
// class IntegerToBinary{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int val = input.nextInt();

//         int rem = 0, bin = 0, pow = 0;

//         while(val > 0){
//             rem = val % 2;
//             bin += rem * Math.pow(10, pow);
//             pow++;
//             val /= 2;
//         }

//         System.out.print("The Value in binary: " + bin);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program to convert Integer value to Byte, Character, Float (Type Casting) 
 * The process of converting refers to Type casting. Which can be done implicitly and explicity. Explicity means the programmer will perform the type casting this is the process is often termed as narrowing. Implilcitly means the compiler/system will automatically perform the type casting this is the process is often termed as widening.
 * 
 * The explicit type casting has a syntax like '(targetDataType) actualData'
*/
// import java.util.Scanner;
// class IntToByteCharFloat{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of I: ");
//         int i = input.nextInt();

//         byte b = (byte) i;
//         char c = (char) i;
//         float f = (float) i;

//         // Here we have converted the Int to Byte, Char, Float this is done in explicity specifying the type of the data.

//         System.out.print("The value of I : " + i);
//         System.out.print("\nThe Value of I as Byte: " + b);
//         System.out.print("\nThe Value of I as Character: " + c);
//         System.out.print("\nThe Value of I as Floating Point Value: " + f);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program to convert Long value into Byte*/
// import java.util.Scanner;
// class LongToByte{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the long value: ");
//         long val = input.nextLong();

//         //converting long to byte
//         byte byteVal = (byte) val;
//         System.out.print("The long value in byte data type: " + byteVal);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that depicts the use of binary literals.
 * 
 * Binary Literals : These are the values that are very useful and handy to store the direct binary value of any types.
 *      the binary literal of the 'int'.
 * int binaryVal = 0b1010;
 * here, the '0b' is the notation that is used to add the value in integer or anyother type.
*/
// class BinaryLiterals{
//     public static void main(String[] args){
//         int val1 = 0b101; //5
//         byte val2 = 0b1010; //10
//         short val3 = 0b10101; //21
//         char val4 = 0b11; //'♥'
//         long val5 = 0b10110; //22
        
//         System.out.println("The Integer Value in output: " + val1);
//         System.out.println("The Byte Value in output: " + val2);
//         System.out.println("The Short Value in output: " + val3);
//         System.out.println("The Character Value in output: \'" + val4 + "\'");
//         System.out.println("The Long Value in output: " + val5);
        
//         int result = val1 + (int) val3;
//         System.out.print("The Addition of " + val1 + " and " + val2 + " is: " + (val1 + val2));

//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that perform all the arithmetic and relational Operations */
// import java.util.Scanner;
// class ArithmeticAndRelationOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value a: ");
//         int a = input.nextInt();

//         System.out.print("Enter the value b: ");
//         int b = input.nextInt();

//         System.out.println("Arithmetic Operations: ");
//         System.out.printf("%d + %d : %d" , a, b, (a + b));
//         System.out.printf("\n%d - %d : %d" , a, b, (a - b));
//         System.out.printf("\n%d * %d : %d" , a, b, (a * b));
//         System.out.printf("\n%d / %d : %d" , a, b, (a / b));
//         System.out.printf("\n%d %% %d : %d\n" , a, b, (a % b));
//         System.out.printf("\nRelational Operations: ");
//         System.out.printf("\n%d < %d : %b" , a, b, (a < b));
//         System.out.printf("\n%d > %d : %b" , a, b, (a > b));
//         System.out.printf("\n%d != %d : %b" , a, b, (a != b));
//         System.out.printf("\n%d == %d : %b" , a, b, (a ==b));
//         System.out.printf("\n%d >= %d : %b" , a, b, (a >= b));
//         System.out.printf("\n%d <=  %d : %b" , a, b, (a <= b));
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that performs all the boolean Operations */
// import java.util.Scanner;
// class BooleanOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter only \'true\' or \'false\'");
        
//         System.out.print("Enter the boolean value as a: ");
//         boolean a = input.nextBoolean();

//         System.out.print("Enter the boolean value as b: ");
//         boolean b = input.nextBoolean();

//         System.out.printf("\n%b & %b: %b", a, b, (a & b));
//         System.out.printf("\n%b | %b: %b", a, b, (a | b));
//         System.out.printf("\n%b ^ %b: %b", a, b, (a ^ b));
//         System.out.printf("\n!%b: %b", a, (!a));
//         System.out.printf("\n(%b & %b) | (%b & %b) : %b", a, b, b, a, ((a & b) | (b & a)));
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that finds the largest of three numbers using ternary operations */
// import java.util.Scanner;
// class LargeOfThree{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of a: ");
//         int a = input.nextInt();
//         System.out.print("Enter the value of b: ");
//         int b = input.nextInt();
//         System.out.print("Enter the value of c: ");
//         int c = input.nextInt();

//         int large = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

//         System.out.printf("The Largest of %d, %d and %d is: %d",a, b, c, large);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*8. Write a program that demonstrate the use of pre and post increment | decrement operations */
// import java.util.Scanner;
// class IncrementDecrement{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of a: ");
//         int a = input.nextInt();
//         int postIncrement = ++a;
//         System.out.print("The Value of \'a\' on post increment: " + postIncrement);
//         System.out.print("\nThe Value of \'a\' on pre increment : " + (a++));
//         System.out.print("\nThe Acutal value of pre increment: " + a);
//         System.out.print("\nThe Post Decrement of \'a\' is: " + (--a));
//         System.out.print("\nThe Pre Decrement of \'a\' is: " + (a--));
//         System.out.print("\nThe Actual of pre decrement: " +a);
//     }
// }