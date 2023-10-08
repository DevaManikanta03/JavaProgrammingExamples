// import java.util.Scanner;
// import java.lang.StrictMath;
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 1. Write a program that prints the HCF or GCD of the two entered numbers */
// class GCDorHCF{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = input.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = input.nextInt();

//         System.out.print("The GCD or HCF of " + a + " and " + b + " is : ");

//         int hcf = 1;
//         int n = StrictMath.min(a, b);

//         for(int i = 2; i < n; i++){
//             while(a % i == 0 && b % i == 0){
//                 hcf *= i;
//                 a /= i;
//                 b /= i;
//             }
//         }
//         System.out.print(hcf);
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that prints the HCf or GCD of n numbers */
// class GCDOfN{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the how many numbers for how many number do you want to perform the GCD: ");
//         int n = input.nextInt();

//         int[] values = new int[n];

//         for(int i = 0; i < n; i++){
//             System.out.print("Enter number - " + (i+1) + " : ");
//             values[i] = input.nextInt();
//         }

        
//         int hcf = values[0];
//         for(int i = 0; i < n; i++){
//             hcf = GCDOfN.GCD(hcf, values[i]);
//         }

//         System.out.print("HCF or GCD : " + hcf);
//     }

//     public static int GCD(int a, int b){
//         int hcf = 1;
//         int min = StrictMath.min(a, b);
//         for(int i = 2; i < min; i++){
//             while(a % i == 0 && b % i == 0){
//                 hcf *= i;
//                 a /= i;
//                 b /= i;
//             }   
//         }
//         return hcf;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that finds the LCM of a single number */
// LCM is performed on two or more numbers and mathematically we can return the LCM as (n1 * n2) / GCD(n1, n2).
// On the other hand LCM of one number is itself. 
// class LCMOfNumber{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number - 1: ");
//         int a = input.nextInt();
//         System.out.print("Enter the number - 2: ");
//         int b = input.nextInt();

//         int gcd = LCMOfNumber.GCD(a, b);
//         int lcm = (a * b) / gcd;

//         System.out.print("The LCM of " + a + " and " + b + " is:  " + lcm);
//     }

//     public static int GCD(int a , int b){
//         int gcd = 1;
//         int min = StrictMath.min(a, b);
//         for(int i = 2; i < min; i++){
//             while(a % i == 0 && b % i == 0){
//                 gcd *= i;
//                 a /= i;
//                 b /= i;
//             }
//         }
//         return gcd;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that finds the LCM of N numbers entered by user*/
// class LCMOfN_Numbers{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the how many numbers? : ");
//         long n = input.nextLong();

//         long elements[] = new long[(int)n];

//         for(int i = 0; i < n; i++){
//             System.out.print("Enter the Numebr - " + (i+1) + " : ");
//             elements[i] = input.nextLong();
//         }

//         long lcm = LCMOfN_Numbers.getLcmOfArrayElements(elements);
//         System.out.print("The LCM of entered numbers is: " + lcm);
//     }

//     public static long getLcmOfArrayElements(long[] elements){
//         long lcm = 1, divisor = 2;
//         while(true){
//             int counter = 0;
//             boolean divisible = false;

//             for(int i = 0; i < elements.length; i++){

//                 if(elements[i] == 0){
//                     return 0;
//                 }
//                 if(elements[i] < 0){
//                     elements[i] *= (-1);
//                 }
//                 if(elements[i] == 1){
//                     counter++;
//                 }

//                 if(elements[i] % divisor == 0){
//                     divisible = true;
//                     elements[i] /= divisor;
//                 }
//             }
//             if(divisible){
//                 lcm *= divisor;
//             }
//             else{
//                 divisor++;
//             }

//             if(counter == elements.length){
//                 return lcm;
//             }
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that performs the LCM of N number by O(Log n) */
// class LCMOfN_NumbersByReducingTimeComplexity{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter how many numbers? : ");
//         int n = input.nextInt();
        
//         int elements[] = new int[n];

//         for(int i = 0; i < n; i++){
//             System.out.print("Enter the number - " + (i+1) + " is : ");
//             elements[i] = input.nextInt();
//         }  

//         int lcm = LCMOfN_NumbersByReducingTimeComplexity.findLCM(elements,  0);
//         System.out.print("The LCM of entered elements is : " + lcm);
//     }

//     public static int findLCM(int[] elements, int startIndex){
//         if(startIndex == elements.length-1){
//             return elements[startIndex];
//         }
//         int a = elements[startIndex];
//         int b = findLCM(elements, startIndex+1);
//         int lcm = (a * b) / (findGCD(a, b));
//         return lcm;
//     }

//     public static int findGCD(int a, int b){
//         return (b == 0? a : (findGCD(b, a%b)));
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that performs the GCD of two numbers using recursion */
// class GCDRecursive{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number - 1 : ");
//         int a = input.nextInt();
//         System.out.print("Enter the number - 2 : ");
//         int b = input.nextInt();

//         int gcd = GCDRecursive.findGCD(a, b);
//         System.out.print("The GCD of a : " + a + " and b : " + b + " is : " + gcd);
//     }

//     public static int findGCD(int a, int b){
//         if(b == 0){
//             return a;
//         }
//         else{
//             return findGCD(b, a % b);
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that performs the GCD and LCM of two numbers by the implementing the euclid's alogirthm */
// class EuclidAlgorithmGCD_LCM{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number 1 : ");
//         int a = input.nextInt();
//         System.out.print("Enter the number 2 : ");
//         int b = input.nextInt();

//         EuclidAlgorithmGCD_LCM helpMeTo = new EuclidAlgorithmGCD_LCM();
//         int gcd = helpMeTo.findGCD(a, b);
//         int lcm = helpMeTo.findLCM(a, b);

//         System.out.println("The LCM of " + a + " and " + b + " is : " + lcm);
//         System.out.println("The GCD of " + a + " and " + b + " is : " + gcd );
//     }

//     public int findGCD(int a, int b){
//         while(b > 0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     public int findLCM(int a, int b){
//         int lcm = (a * b) / findGCD(a, b);
//         return lcm;
//     }
// }