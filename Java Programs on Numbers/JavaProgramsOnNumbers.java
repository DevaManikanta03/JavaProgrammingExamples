import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 1. Write a program that finds whether the entered number is prime or not, in a given range*/
// class FromToPrimeNumbers {
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number from: ");
//         int from = input.nextInt();
//         System.out.print("Enter the number to: ");
//         int to = input.nextInt();

//         System.out.print("The Prime Numbers from " + from + " to " + to + " are: \n");
//         for(int i = from; i <= to; i++){
//             FromToPrimeNumbers.isPrimeNumber(i);
//         }

//     }
//     public static void isPrimeNumber(int val){
//         int isPrime = 0;
//         if(val > 1){
//             isPrime = 1;
//             for(int i = 2; i < val - 1; i++){
//                 if(val % i == 0){
//                     isPrime = 0;
//                     break;
//                 }
//                 else{
//                     isPrime = 1;
//                 }
//             }
//         }
//         if(val == 2){
//                 isPrime = 1;
//         }
//         if(isPrime == 1){
//             System.out.print(val + " ");
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that checks whether the entered number is a prime number or not */
// class PrimeOrNotPrimeNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();
//         int isPrime = 0;
//         if(val > 1){
//             isPrime = 1;
//             for(int i = 2; i < val - 1; i++){
//                 if(val % i == 0){
//                     isPrime = 0;
//                     break;
//                 }
//                 else{
//                     isPrime = 1;
//                 }
//             }
//         }
//         if(val == 2 || val == 1){
//             isPrime = 1;
//         }

//         if(isPrime == 1){
//             System.out.print("The " + val + " is a prime number");
//         }
//         else{
//             System.out.print("The " + val + " is not a prime number");
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that checks whether a number is prime or not using recursion */
// class RecursivePrimeOrNotPrime{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();
        
//         int isPrime = RecursivePrimeOrNotPrime.isPrimeNumber(val, 2);
//         if(isPrime == 1){
//             System.out.print("The Entered number is Prime number");
//         }
//         else{
//             System.out.print("The Entered number is not a Prime number");
//         }
//     }
//     public static int isPrimeNumber(int val, int n){
//         if(n < val){
//             if(val % n != 0){
//                 return isPrimeNumber(val, ++n);
//             }
//             else{
//                 return 0;
//             }
//         }
//         return 1;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that checks whether the entered number is a Perfect or Not a Perfect */
/* Descritption: The Perfect number is a number , where the divisors of the number will be summed up and return the same number like :
 * for Eg: 6 - divisors of 6 are: 1 2 3 6
 * we don't take 6 as the divisor as itself it is the divisor.
 * so we take only 1 2 3
 * now sum them 1 + 2 + 3 = 6
 * hence the sum of the values are giving the same number hence the 6 is the perfect number
 */
// class PerfectOrNotPerfectNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();

//         int sum = 0;
//         for(int i = 1; i <= val; i++){
//             if(val % i == 0){
//                 if(val != i){
//                     sum += i;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         if(sum == val){
//             System.out.print("The Entered number is a PERFECT number");
//         }
//         else{
//             System.out.print("The Entered number is NOT PERFECT number");
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that checks whether the entered number is an Armstrong number or not */
/* Description: 
 * Armstrong number is the number where it first extracts the value of the no.of digits of the value
 * And then, it performs the individual digits addition with the no.of digits as power.
 * For eg:
 * 407 is the input number like there are 3 digits for 407 and hence (n = 3);
 * The Armstrong number finding algorithm performs the individual addition.
 * like:
 * (4 ^ 3) + (0 ^ 3) + (7 ^ 3) = 407
 * hence, the number and the computed number would be same results that the entered number is Armstrong number.
 */
// class ArmstrongNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();
//         int holder = val;
//         //We extract the number of digits
//         int rem = 0, digits = 0, sum = 0;
//         while(val > 0){
//             rem = val % 10;
//             digits++;
//             val /= 10;
//         }
//         System.out.print("The Number of digits (n) for your number "+ holder +": " + digits + "\n");

//         int holder1 = holder;
//         while(holder > 0){
//             rem = holder % 10;
//             sum += Math.pow(rem, digits);
//             holder /= 10;
//         }

//         if(holder1 == sum){
//             System.out.print("The entered number is Armstrong Number");
//         }
//         else{
//             System.out.print("The entered number is not an Armstrong Number");
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that prints the armstrong number between 1 to 1000 */
// class ArmStrongNumberFromTo{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number from where to start? : ");
//         int from = input.nextInt();
//         System.out.print("Enter the number to where to stop: ");
//         int to  = input.nextInt();
//         System.out.print("Extracting the Armstrong numbers from " + from + " to \n");
//         for(int i = 1; i <= to; i++){
//             ArmStrongNumberFromTo.isArmStrongNumber(i);
//         }
//     }

//     public static void isArmStrongNumber(int val){
//         int holder1 = val, holder2 = val, digits = 0, rem = 0, sum = 0;
//         //Extracting the digits
//         while(holder1 > 0){
//             rem = holder1 % 10;
//             digits++;
//             holder1 /= 10;
//         }

//         while(holder2 > 0){
//             rem = holder2 % 10;
//             sum += Math.pow(rem, digits);
//             holder2 /= 10;
//         }
//         if(sum == val){
//             System.out.print(val + " ");
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that reveres the enered number */
// class ReverseNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();

//         int holder1 = val, holder2 = val;

//         int rem = 0, digits = 0;
//         //extracting no.of digits
//         while(holder1 > 0){
//             rem = holder1 % 10;
//             digits++;
//             holder1 /= 10;
//         }

//         int reversedDigit = 0;
//         while(holder2 > 0){
//             rem = holder2 % 10;
//             reversedDigit += rem * Math.pow(10, digits - 1); //Just we are performing the calculation and not updating the value of 'digits'
//             digits--; //here we are updating the value
//             holder2 /= 10;
//         }
//         System.out.print("The reversed number: " + reversedDigit);
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that reverses the entered number and checks whether the entered number is palindrome or not */
// class NumberPalindrome{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();
//         int reversedNumber = NumberPalindrome.reverseNumber(val);
//         if(reversedNumber == val){
//             System.out.print("The Entered number is a Palindrome.");
//         }
//         else{
//             System.out.print("The Entered number is not a Palindrome.");
//         }
//     }
    
//     public static int reverseNumber(int val){
//        int holder1 = val, holder2 = val, rem = 0, reversedDigits = 0, digits = 0;
//        while(holder1 > 0){
//             rem = holder1 % 10;
//             digits++;
//             holder1 /= 10;
//        }

//        while(holder2 > 0){
//             rem = holder2 % 10;
//             reversedDigits += rem * Math.pow(10, digits-1);
//             digits--;
//             holder2 /= 10;
//        }
//        return reversedDigits;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that reverses the number and find the sum of the reversed number using the do-while loop*/
// class ReverseDigitsSum{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();

//         int reverse = ReverseDigitsSum.reverseTheNumber(val);
//         System.out.print("The Reversed number : " + reverse);
//         int sumofDigits = ReverseDigitsSum.sumOfDigits(reverse);
//         System.out.print("\nThe Sum of Reversed number's digits: " + sumofDigits);
//     }
//     public static int reverseTheNumber(int val){
//         int holder1 = val, holder2 = val, rem = 0, reverseDigit = 0, digits = 0;

//         while(holder1 > 0){
//             rem = holder1 % 10;
//             digits++;
//             holder1 /= 10;
//         }

//         while(holder2 > 0){
//             rem = holder2 % 10;
//             reverseDigit += rem * (Math.pow(10, digits-1));
//             digits--;
//             holder2 /= 10;
//         }
//         return reverseDigit;
//     }
//     public static int sumOfDigits(int val){
//         int rem = 0, sum = 0;
//         do{
//             rem = val % 10;
//             sum += rem;   
//             val /= 10; 
//         }while(val > 0);

//         return sum;
//     }   
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that reverses the number using Recursion */
// class ReverseNumRecursion{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int val = input.nextInt();

//         int reversedVal = ReverseNumRecursion.reverseValue(val);
//         System.out.print("The Reversed Value: " + reversedVal);
//     }

//     public static int reverseValue(int val){
//         int reversedVal = 0, rem = 0, digits = 0;
//         int holder1 = val, holder2 = val;
//         while(holder1 > 0){
//             rem = holder1 / 10;
//             digits++;
//             holder1 /= 10;
//         }
//         while(holder2 > 0){
//             rem = holder2 % 10;
//             holder2 /= 10;
//             return (int) ((rem * Math.pow(10, digits - 1)) + reverseValue(holder2));
//         }
//         return 0;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 11. Write a program that prints the first N Natural numbers using Recursion. */
// class FirstN_NaturalNumbers{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the last number that you want: ");
//         int last = input.nextInt();
//         int first = 1;
//         FirstN_NaturalNumbers.printN_NaturalNumbers(first, last);
//     }

//     public static int printN_NaturalNumbers(int first, int last){
//         if(first <= last){
//             System.out.print(first + " ");
//             return printN_NaturalNumbers(++first, last);
//         }
//         return 1;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 12. Write a program that prints the Sum of N Natural numbers using Recursion. */
// class SumOfN_NaturalNumber{
//     static int sum = 0;
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         int myArray[] = new int[n];
//         System.out.print("Enter the " + n + " values\n");
//         for(int i = 0; i < n; i++){
//             System.out.print((i+1) + ": ");
//             myArray[i] = input.nextInt();
//         }
        
//         int sum = SumOfN_NaturalNumber.addTheElements(myArray, n, 0);
//         System.out.print("\n The Total sum of entered values: " + sum);
//     }

//     public static int addTheElements(int[] array, int n, int i){
//         if(i < n){
//             return array[i] + addTheElements(array, n, ++i);
//         }
//         else{
//             return 0;
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 13. Write the programs for:
 * a. to print 1 to N numbers using for loop
 * b. to print the first N square numbers
 * c. to find the sum of N square numbers
 * d. to find the sum of N cube numbers
*/
// class SquareCubeSum1_N{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int last = input.nextInt();
//         System.out.print("The First N numbers: 1 to " + last + "\n");
//         SquareCubeSum1_N.printNumbers(1, last);
//         System.out.print("\nThe Square of First N numbers: 1 to " + last + "\n");
//         SquareCubeSum1_N.printSquareNumbers(1, last);
//         System.out.print("\nThe Cube of First N numbers: 1 to " + last + "\n");
//         SquareCubeSum1_N.printCubeNumbers(1, last);
        
//         System.out.print("\nThe Sum of first N Square Numbers: " + SquareCubeSum1_N.sumOfN_Square(1, last));

//         System.out.print("\nThe Sum of first N Cube Numbers: " + sumOfN_Cube(1, last));
//     }

//     public static void printNumbers(int first, int last){
//         for(int i = first; i <= last; i++){
//             System.out.print(i + " ");
//         }
//     }
//     public static void printSquareNumbers(int first, int last){
//         for(int i = first; i <= last; i++){
//             System.out.print(i*i + " ");
//         }
//     }
//     public static void printCubeNumbers(int first, int last){
//         for(int i = first; i <= last; i++){
//             System.out.print(Math.pow(i, 3) + " ");
//         }
//     }

//     public static int sumOfN_Square(int first, int last){
//         int sum = 0;
//         for(int i = first; i <= last; i++){
//             sum += Math.pow(i, 2);
//         }
//         return sum;
//     }
//     public static int sumOfN_Cube(int first, int last){
//         int sum = 0;
//         for(int i = first; i <= last; i++){
//             sum += Math.pow(i, 3);
//         }
//         return sum;
//     }
// }
