// import java.util.Scanner;
/*1. Write a program that finds the sum of series 1^2 + 2^2 + 3^2 +...+n^2*/
// class SumOfNSquares{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         System.out.printf("The Sum of Square from 1^2 + 2^2 +...+ %d^2\n", n);
//         int sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum += i*i;
//         }
//         System.out.print("The Sum: " + sum);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that finds the sum of series 1/1! + 2/2! + 3/3! +.....+ N/N!*/
// class SumOfNByNFactorial{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         SumOfNByNFactorial make = new SumOfNByNFactorial();
//         double sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum += (double) i / (make.performFactorial(i));
//         }
//         System.out.printf("1/1! + 2/2! +...+ %d/%d! : %.2f", n, n, sum);
//     }
//     public int performFactorial(int val){
//         int ans = 1, i = 1;
//         while(i <= val){
//             ans *= i;
//             i++;
//         }
//         return ans;
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that finds the sum of series 1/1! + 1/2! + 1/3! +.....+ 1/N!*/
// class SumOf1ByNFactorial{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();

//         SumOf1ByNFactorial perform = new SumOf1ByNFactorial();
//         double sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum +=  1.0 / (perform.factorial(i));
//         }
//         System.out.printf("The 1/1! + 1/2! + 1/3! + ... + 1/%d! sum is : %f", n, sum);
//     }
//     public double factorial(int val){
//         double ans = 1, i = 1;
//         while(i <= val){
//             ans *= i;
//             i++;
//         }
//         return ans;
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that finds the sum of series 1/1 + 1/4 + 1/9 +.....+ 1/(N^2)*/
// class SumOf1ByNSquare{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();

//         double sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum += 1.0 / (i*i);
//         }
//         System.out.printf("The Sum of Series: 1/1 + 1/4 + 1/9 +...+ 1/(%d^2) is: %f", n, sum);

//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that finds the sum of series 1/2 + 2/3 + 3/4 +...+ n/n+1*/
// class SumOfNByNPlus1{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();

//         double sum = 0;
//         for(double i = 1.0; i <= (double)n; i++){
//             sum += (i / (i+1));
//         }
//         System.out.printf("The Sum of series: 1/2 + 2/3 +....+ %d/%d: %.2f",n,(n+1),sum);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that finds the sum of series 1^2/1 + 2^2/2 + 3^2/3 +...+ n^2/n*/
// class SumOfNSquareByN{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the valeu of n: ");
//         int n = input.nextInt();

//         double sum = 0;
//         for(double i = 1.0; i <= (double) n; i++){
//             sum += ((i*i) / i);
//         }

//         System.out.printf("The Sum of Series: 1^2/1 + 2^2/2 + 3^2/3 +...+ %d^2/%d : %.2f", n, n, sum);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that finds the sum of series 1/1 + 1/2 + 1/3 +...+ 1/n this series is also called as 'Harmonic Series'*/
// class HarmonicSeries{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         System.out.print("The Harmonic Series: ");
//         double sum = 0;
//         for(double i = (double) n; i >= 1; i--){
//             sum += (1.0 / i);
//             System.out.printf("%.3f, ", sum);
//         }
//         System.out.printf("\nThe Harmonic Series Output: %.3f", sum);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that finds the sum of cubes of first n numbers */
// class SumOfNCube{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         long sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum += Math.pow(i, 3);
//         }
//         System.out.printf("The Sum of Series : 1^3 + 2^3 + 3^3 + ... + %d^3: %d", n, sum);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that finds the sum of even squares of first n numbers */
// class SumOfNSquaresEven{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();

//         long sum = 0;
//         for(int i = 1; i <= n; i++){
//             if(i % 2 == 0){
//                 sum += (i*i);
//             }
//         }
//         System.out.printf("The Sum of 1 to %d^2 only even values is: %d", n, sum);
//     }
// }