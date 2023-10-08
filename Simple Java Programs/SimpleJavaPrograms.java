// import java.util.Scanner;
// /* 1. Write a Program to check whether a given number is EVEN or ODD */
// class EvenOrOddNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number:  ");
//         double value = input.nextDouble();
//         System.out.printf("The %f is a %s number" ,value, ((value % 2 == 0.0)? "EVEN": "ODD"));
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
// /* 2. Write a program to find the sum of EVEN and ODD numbers */
// class SumOfEvenAndOddNum{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value from where to start?: ");
//         int from  = input.nextInt();
//         System.out.print("Enter the value to where to stop? ");
//         int to = input.nextInt();

//         int sumOfEven = 0, sumOfOdd = 0;
//         System.out.print("The Even numbers and Odd numbers from " + from + " and " + to + "\n");
//         System.out.print("Even Numbers: ");
//         for(int i = from ; i <= to; i++){
//             if(i % 2 == 0){
//                 System.out.print(i + ", ");
//                 sumOfEven += i;
//             }
//         }
//         System.out.print("\nThe Sum of All Even numbers from " + from + " and to " + to + " : " + sumOfEven);
//         System.out.print("\nOdd Numbers: ");
//         for(int i = from ; i <= to; i++){
//             if(i % 2 != 0){
//                 System.out.print(i + ", ");
//                 sumOfOdd += i;
//             }
//         }
//         System.out.print("\nThe Sum of All Odd numbers from " + from + " and to " + to + " : " + sumOfOdd);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program to check whether a number entered is positive or negative. */
// class PositiveOrNegative{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         double val = input.nextDouble();
//         System.out.print("The entered number: " + val + " is a " + ((val < 0)? "Negative Number" : "Positive Number"));
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program to find the largest of three numbers */
// class LargestOfThree{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the values of A, B, C: ");
//         System.out.print("\nEnter the value of a: ");
//         double a = input.nextDouble();
//         System.out.print("\nEnter the value of b: ");
//         double b = input.nextDouble();
//         System.out.print("\nEnter the value of c: ");
//         double c = input.nextDouble();

//         System.out.printf("The Largest of Three entered numebers {%f , %f, %f} is: %f", a, b, c,  ((a > b) ? ((a > c)?a:c) : ((b > c)?b:c) ));
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program to swap two numbers */
// class SwapTwoNumbers{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number 1: ");
//         double num1 = input.nextDouble();
//         System.out.print("Enter the number 2: ");
//         double num2 = input.nextDouble();
//         System.out.print("Before Swapping: ");
//         System.out.print("\nThe value of number 1: " + num1 + " The value of number 2: " + num2 + "\n");

//         //swapping..
//         double temp = num1;
//         num1 = num2;
//         num2 = temp;

//         System.out.print("\nAfter Swapping: ");
//         System.out.print("\nThe value of number 1: " + num1 + " The value of number 2: " + num2 + "\n");
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program to find the number of integers divisible by 5 */
// class IntegersDivisibleBy5{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("From Where should I start ? : ");
//         double from = input.nextDouble();
//         System.out.print("Until Where should I stop ? : ");
//         double to = input.nextDouble();

//         int count = 0, sumOf5 = 0;
//         System.out.print("The Numbers which are divisible by 5 from : " + from + " to: " + to + "\n");
//         for(double i = from ; i <= to; i++){
//             if(i % 5 == 0){
//                 count++;
//                 sumOf5 += i;
//                 System.out.print(i + ", ");
//             }
//         }
//         System.out.print("\nThe No.of Values : " + count);
//         System.out.print("\nThe Sum of all numbers divisible 5 in the specified range: " + sumOf5);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program to check if the two numbers are equal or not */
// class CheckTwoNumberEqual{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number 1: ");
//         double a = input.nextDouble();
//         System.out.print("Enter the number 2: ");
//         double b = input.nextDouble();

//         System.out.print("The Two numbers are " + ((a == b) ? "equal" : "not equal"));
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that finds the sum of digits of the number */
// class SumOfDigits{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();

//         int holder = val;

//         int rem = 0, sum = 0;
//         while(val > 0){
//             rem = val % 10;
//             sum += rem;
//             val /= 10;
//         }
//         System.out.print("The Sum of the digits of " + holder + ": " + sum);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that finds the sum of digits of the number by using recursion */
// class SumOfDigitsRecursive{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number:  ");
//         int val = input.nextInt();

//         SumOfDigitsRecursive instance = new SumOfDigitsRecursive();
//         int sumOfDigits = instance.sumOfDigitRec(val);
//         System.out.print("The Sum of the digits of " + val + " is: " + sumOfDigits);
//     }
//     public int sumOfDigitRec(int val){
//         if(val == 0){
//             return 0;
//         }
//         else{
//             int rem = val % 10;
//             return rem + sumOfDigitRec(val / 10);
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that extracts the digits from the number */
// class DigitsExtracter{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = input.nextInt();
//         int val = num, rem = 0, i = 1;
//         System.out.print("Extracting the digits...: \n");
//         while(num > 0){
//             rem = num % 10;
//             System.out.printf("%d at %d\'s position.\n", rem, i);
//             i *= 10;
//             num /= 10;
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 11.Write a program that peforms the increment by 1 to all digits of a given integer.*/
// class IncrementByDigits{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = input.nextInt();
//         int val = num, rem = 0, newNum = 0, i = 1;
//         while(num > 0){
//             rem = num % 10;
//             rem++;
//             newNum += rem * i;
//             i *= 10;
//             num /= 10;
//         }
//         System.out.print("Incrementing the each digit by 1 for the number : " + newNum);
//     }
// }
/* 12. Write a program that performs all the arithmetic operations. */
// class ArithmeticOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number 1: ");
//         int a = input.nextInt();
//         System.out.print("Enter the number 2: ");
//         int b = input.nextInt();
//         System.out.printf("%d + %d = %d\n", a, b, (a+b));
//         System.out.printf("%d - %d = %d\n", a, b, (a-b));
//         System.out.printf("%d * %d = %d\n", a, b, (a*b));
//         System.out.printf("%d / %d = %d\n", a, b, (a/b));
//         System.out.printf("%d %% %d = %d\n", a, b, (a%b));
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 13. Write a program that converts the decimal number to binary using recursion */
// class BinaryToDecimalRecursion{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();
//         System.out.print("The Binary Equvalient to the number: " + val + " is: " + BinaryToDecimalRecursion.binaryToDecimal(val)); 
//     }

//     public static String binaryToDecimal(int val){
//         if(val > 0){
//             int rem = val % 2;
//             return rem + "" + binaryToDecimal(val/2);
//         }
//         return "";
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 14. Write a program that prints the multiplication table of the entered number */
// class PrintMultiplication{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();

//         System.out.printf("How many steps for the table-%d: ", val);
//         int steps = input.nextInt();
//         for(int i = 1; i <= steps; i++){
//             System.out.printf("%d * %d = %d\n", val, i, (val * i));
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 15. Write a program that reads the grade of the student and displays an equvalient description */
// class GradesDescription{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter your grade (A, B, C, D, E, F): ");
//         String grade = input.nextLine();
//         grade = grade.toLowerCase();
        
//         switch(grade){
//             case "a": 
//                 System.out.print("Congratulations, you got the First Class!");
//                 break;
//             case "b":
//                 System.out.print("Not Bad! You are doing well, a bit hardwork is necessary");
//                 break;
//             case "c":
//                 System.out.print("Poor! You are almost there! Hard work always pays off");
//                 break;
//             case "d":
//                 System.out.print("Extermely Poor! The HardWork and Dedication is must on your studies, Believe that you can ace it!");
//                 break;
//             case "e":
//                System.out.print("You are not well in your studies, kindly consult a better guidance, and remember that Hardwork is the key.");
//                break;
//             case "f":
//                 System.out.print("You have failed and you need to seek the help from the guiders or mentors of yours, which is very awful to hear");
//                 break;
//             default:
//                 System.out.print("Invalid! Grade Don't try to test me I aware of your tricks you fool! enter in the listed options.");
//                 break;
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 16. Write a program that checks whether the entered characer is Vowel, Consonant or digit and symbol*/
// class VowelConsonantDigitSymbol{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the character: ");
//         char ch = input.next().charAt(0);
//         if(Character.isDigit(ch)){
//             System.out.print("You have entered an Digit");
//         }
//         else if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
//             System.out.print("You have entered an Vowel");
//         }

//         else{
//             if(!(Character.isAlphabetic(ch)) && !(Character.isDigit(ch))){
//                 System.out.print("You have enetered an Symbol");
//             }
//             else{
//                 System.out.print("You have entered an Consonant");
//             }
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 17. Write a program that checks whether a given character is upper case or lower case, or digit*/
// class UpperLowerCasesDigit{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the character: ");
//         char ch = input.next().charAt(0);

//         if(Character.isDigit(ch)){
//             System.out.print("The Entered Character is Digit.");
//         }
//         else if(Character.isLowerCase(ch)){
//             System.out.print("The Entered Character is in Lower Case.");
//         }
//         else if(Character.isUpperCase(ch)){
//             System.out.print("The Entered Character is in Upper Case.");
//         }
//         else{
//             System.out.print("The Entere Character is a printable character, it can be a symbol or a unicode.");
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 18. Write a program that accepts the height of the person and categorize as Taller, Dwarf, Average. */
// class HeightCategorization{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your height in cm's: ");
//         int height = input.nextInt();

//         if(height > 175){
//                 System.out.print("You are tall in Height!");
//         }
//         else if(height <= 175 && height > 155){
//             System.out.print("You are Average in Height!");
//         }
//         else{
//             System.out.print("You are Dwarf (Short) in Height!");
//         }
//     }
// }