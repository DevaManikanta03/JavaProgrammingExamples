// import java.util.Scanner;
// import java.math.BigInteger;
/* 1. Write a program that performs factorial of a number using recursion */
// class FactorialOfANumberRecursive{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         double n = input.nextDouble();

//         FactorialOfANumberRecursive perform = new FactorialOfANumberRecursive();
//         double fact = perform.factorial(n);
//         System.out.printf("The Factorial of %.0f is %.0f", n, fact);
//     }
//     public double factorial(double val){
//         if(val == 0.0){
//             return 1.0;
//         }
//         else{
//             return val * (factorial(val - 1.0));
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that performs the factorial of a number without recursion */
// class FactorialOfANum{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         double n = input.nextDouble();

//         double ans = 1.0;
//         for(double i = 1.0; i <= n; i++){
//             ans *= i;
//         }
//         System.out.printf("The Factorial of %.0f is %.0f.", n, ans);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that prints the fibonacci numbers */
// class FibonacciNumbers{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the range: ");
//         int range = input.nextInt();
    
//         System.out.println("The Fibonacci Numbers from 0 to " + range + " are:");
//         int a = 0, b = 0, c = 1;
//         for(int i = 0; i <= range; i++){
//             a = b;
//             b = c;
//             c = a + b;
//             System.out.printf("%d ", a);
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that prints the nth fibonacci number using O(n) */
// class FibonacciNumberGenerator{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the nth value to find in fibonacci series: ");
//         long n = input.nextLong();
//         BigInteger a = new BigInteger("0");
//         BigInteger b = new BigInteger("0");
//         BigInteger c = new BigInteger("1");

//         for(long i = 0; i <= n; i++){
//             a = b;
//             b = c;
//             c = a.add(b);
//         }

//         System.out.print("The "+n+"th position of fibonacci number is : \n");
//         System.out.print(a);
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that prints the fibonacci series using recursion */
// class FibonacciRecursion{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();
//         int result = 0;
//         FibonacciRecursion perform = new FibonacciRecursion();
//         for(int i = 0; i <= n; i++){
//             result = perform.recursiveFibonacci(i);
//             System.out.print(result + " ");
//         }
//         input.close();
//     }

//     public int recursiveFibonacci(int n){
//         if(n == 0){
//             return 0;
//         }
//         else if(n == 1){
//             return 1;
//         }
//         else{
//             return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));        
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that prints the nth fibonacci generator by making it effincient using 
 * the implementation of 0(LOG N). Here I'm using the matrix exponentiation*/
// class EfficientFibonacciGenerator{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         long n = input.nextLong();
//         EfficientFibonacciGenerator fibonacci = new EfficientFibonacciGenerator();
//         fibonacci.getFibonacci(n);
//         input.close();
//     }
//     public void getFibonacci(long n){
//         if(n == 0){
//             System.out.println("The " + n + "th term of the Fibonacci Series is: 0");
//         }
//         else{
//             BigInteger m1[][] = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
//             MatrixExponentiation(m1, n-1);
//             System.out.print("The " + n + "th term of the Fibonacci Series is : \n" + m1[0][0]);
//         }
//     }

//     private void MatrixExponentiation(BigInteger m1[][], long n){
//         if(n == 0 || n == 1){
//             return;
//         }
//         BigInteger m2[][] = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
//         MatrixExponentiation(m1, n / 2);
//         MatrixMultiplication(m1, m1);
//         if(n % 2 != 0){
//             MatrixMultiplication(m1, m2);
//         }
//     }

//     private void MatrixMultiplication(BigInteger m1[][], BigInteger m2[][]){
//         BigInteger a = (m1[0][0].multiply(m2[0][0])).add(m1[0][1].multiply(m2[1][0]));
//         BigInteger b = (m1[0][0].multiply(m2[0][1])).add(m1[0][1].multiply(m2[1][1]));
//         BigInteger c = (m1[1][0].multiply(m2[0][0])).add(m1[1][1].multiply(m2[1][0]));
//         BigInteger d = (m1[1][0].multiply(m2[0][1])).add(m1[1][1].multiply(m2[1][1]));

//         m1[0][0] = a;
//         m1[0][1] = b;
//         m1[1][0] = c;
//         m1[1][1] = d;
//     }
// }