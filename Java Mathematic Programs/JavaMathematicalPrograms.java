import java.util.Scanner;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 1. Write a program that performs the addition of two complex numbers*/
// class ComplexNumbersAddition{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the values of Complex Number - 1\n");
//         System.out.print("The Real Part: ");
//         double realPart = input.nextDouble();
//         System.out.print("The Imaginary Part: ");
//         double imgPart = input.nextDouble();
        
//         System.out.print("Enter the values of Complex Number - 2\n");
//         System.out.print("The Real Part: ");
//         double realPart1 = input.nextDouble();
//         System.out.print("The Imaginary Part: ");
//         double imgPart1 = input.nextDouble();
        
//         System.out.print("The Addition of: \n");
//         System.out.printf("The Complex Number 1: %.0f + %.0fi", realPart, imgPart);
//         System.out.printf("\nThe Complex Number 2: %.0f + %.0fi", realPart1, imgPart1);
//         System.out.printf("\nThe Sum : %.0f + %.0fi", (realPart + realPart1),(imgPart+imgPart));
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program to find the power of a number */
// class PowerOfNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("a ^ b [Mathematically..]\n");
//         System.out.print("Enter the value - a: ");
//         int a = input.nextInt();
//         System.out.print("Enter the power value - b: ");
//         int b = input.nextInt();
//         double ans = 1;
//         for(int i = 1; i <= b; i++){
//             ans *= a;
//         }
//         System.out.printf("The Value of %d power of %d (%d ^ %d): %.0f", a, b, a, b, ans);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program to implement the pow() function */
// class ImplementPowFunction{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of a: ");
//         int a = input.nextInt();
//         System.out.print("Enter the value of b: ");
//         int b = input.nextInt();

//         double val = Math.pow(a, b);
//         System.out.printf("The (%d ^ %d): %.0f", a, b, val);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program to find the product of two numbers using recursion */
// class ProductOf2Recursive{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of a: ");
//         int a = input.nextInt();
//         System.out.print("Enter the value of b: ");
//         int b = input.nextInt();

//         ProductOf2Recursive perform = new ProductOf2Recursive();
//         int multiply = perform.multiplication(a, b);

//         System.out.printf("The Product of %d and %d is: %d",a, b, multiply);
//     }

//     public int multiplication(int a, int b){
//         if(b > 0){
//             return (a + (multiplication(a, --b)));
//         }
//         return 0;
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program to implement the use of sin() function */
// class SinCosFunctionsImplementation{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the X in \'sin X°\': ");
//         double sinX = input.nextDouble();
        
//         double sinResult = Math.sin(sinX);
//         System.out.printf("\'sin %.3f°\': %.3f\n", sinX,sinResult);

//         System.out.print("Enter the X in \'cos X°\': ");
//         double cosX = input.nextDouble();
//         double cosResult = Math.cos(cosX);
//         System.out.printf("\'cos %.3f°\': %.3f", cosX,cosResult);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program to find the roots of the quadratic equations */
// class RootsOfQuadraticEquation{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the values (a,b,c) in the positions ax^2 + bx + c\n");
//         System.out.print("Enter the value of a : ");
//         double a = input.nextDouble();
//         System.out.print("Enter the value of b: ");
//         double b = input.nextDouble();
//         System.out.print("Enter the value of c: ");
//         double c = input.nextDouble();

//         double delta = (b * b) / (4 * a * c);

//         if(delta > 0){
//             System.out.print("The Roots are real!\n");
//             double root1 = (Math.sqrt(delta) - b) / (2 * a);
//             double root2 = ((Math.sqrt(delta) + b) * (-1)) / (2 * a);
//             System.out.print("The Root1 : " + root1 + "\nThe Root2 : " + root2);
//         }
//         else if(delta == 0){
//             System.out.print("The Roots are equal!\n");
//             double root1 = (Math.sqrt(delta) - b) / (2 * a);
//             System.out.print("The Root1: "+ root1 + "\nThe Root2: -"+root1);
//         }
//         else{
//             System.out.print("The Roots are imaginary roots!! They are just made up!");
//         }

//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program calculates the simple interest */
// class SimpleInterest{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Principal Amount (P) : ");
//         double p = input.nextDouble();
//         System.out.print("Enter the Rate of Interest (R) : ");
//         double r = input.nextDouble();
//         System.out.print("Enter the Time Period (T) : ");
//         double t = input.nextDouble();

//         double SI = (p * t * r) / 100;

//         System.out.print("The Simple Interest: " + SI);
//     }
// }
