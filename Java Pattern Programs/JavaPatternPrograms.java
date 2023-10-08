// import java.util.Scanner;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*1. Write a program which prints the solid rectangle pattern */
/* 
 *       * * * * *
 *       * * * * *
 *       * * * * *
 *       * * * * *
 */
// class SolidRectanglePattern{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }    
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write program which prints the below hollow rectangle 
 * 
 *      * * * * *
 *      *       *
 *      *       *
 *      *       *
 *      * * * * * 
*/
// class HollowRectanglePattern{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n; j++){
//                 if(i == 1 || i == n || j == 1 || j == n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  "); //double space here.
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write program which prints the below pattern 
    *
    * * 
    * * *
    * * * * 
*/ 
// class PyramidPattern1{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the value of N: ");
//         int N = input.nextInt();
        
//         for(int i = 1; i <= N; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write program which prints the below pattern 
    * * * *
    * * * 
    * * 
    *  
*/ 
// class PyramidPattern2{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int N = input.nextInt();

//         for(int i = N; i >= 1; i--){
//             for(int j = i; j >= 1; j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write program which prints the below pattern 
        * 
       * * 
      * * * 
     * * * *  
*/
// class PyramidPattern3{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write program which prints the below pattern 
     * * * *
      * * * 
       * *
        *
*/
// class PyramidPattern4{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
        
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write program which prints the below pattern 
     
        * 
       * * 
      * * * 
     * * * *
     * * * *
      * * * 
       * *
        *
*/
// class DiamondPattern{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
        
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that prints the following pattern 
 * 
 *              *
 *            * *
 *          * * *
 *        * * * *
*/
// class RightAngledTriangle{
//     public static void main(String[] args){
//         Scanner input  = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that prints the following pattern 
 *        * * * *
 *          * * *
 *            * *
 *              *
*/
// class RightAngledTriangle1{
//     public static void main(String[] args){
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that prints the following pattern 
 * 
 *        1
 *        1 2
 *        1 2 3
 *        1 2 3 4
*/
// class NumericPattern1{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 11. Write a program that prints the following pattern 
 * 
 *              1
 *            1 2
 *          1 2 3
 *        1 2 3 4
*/
// class NumericPattern2{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
        
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 12. Write a program that prints the following pattern 
 *     1 2 3 4
 *     1 2 3
 *     1 2
 *     1 
 *        
*/
// class NumericPattern3{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
        
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 13. Write a program that prints the following pattern 
 *     1 2 3 4
 *       1 2 3
 *         1 2
 *           1 
 *        
*/
// class NumericPattern4{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
        
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 14. Write a program that prints the following pattern 
 * 
 *         1
 *        1 2
 *       1 2 3
 *      1 2 3 4
*/
// class NumericPattern5{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print(k + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 15. Write a program that prints the following pattern 
 * 
 *         1 2 3 4
 *          1 2 3
 *           1 2 
 *            1
*/
// class NumericPattern6{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print(k + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 16. Write a program to print the floyd's triangle

1
2  3
4  5  6
7  8  9  10
11 12 13 14 15 */

// class NumericPattern7{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
//         int k = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(k + " ");
//                 k++;
//             }
//             System.out.print("\n");
//         }
//     }
// }
/* 17. Write a program the prints the 0 - 1 triangle in reverse order
  1
  0 1
  1 0 1
  0 1 0 1
  1 0 1 0 1
*/
// class NumericPattern8{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 if((i+j) % 2 == 0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 18. Write a program to print the following pattern
 * 
 *      *         *
 *      * *     * * 
 *      * * * * * *
 *      * * * * * *
 *      * *     * *
 *      *         *
 */ 
// class PyramidPattern5{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             for(int k = 1; k <= 2*(n-i) ; k++){
//                 System.out.print("  "); //double space
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             for(int k = 1; k <= 2*(n-i) ; k++){
//                 System.out.print("  "); //double space
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 19. Write a program that prints the following pattern called as 'solid rhombus'
 *     
 *          * * * * * 
 *         * * * * *
 *        * * * * * 
 *       * * * * * 
 * 
*/
// class SolidRhombusPattern{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= n; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 20. Write a program that prints the following pattern called as 'hollow rhombus'
 *     
 *          * * * * * 
 *         *       *
 *        *       * 
 *       * * * * * 
 * 
*/
// class HollowRhombusPattern{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= n; k++){
//                 if(i == 1 || k == 1 || i == n || k == n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 21. Write a program to print the following pattern
 * 
 *      *         *
 *      * *     * * 
 *      *   * *   *
 *      *   * *   *
 *      * *     * *
 *      *         *
 */ 
// class PyramidPattern6{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 if(i == j || j == 1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }

//             for(int k = 1; k <= n - i; k++){
//                 System.out.print("  ");
//             }

//             for(int j = 1; j <= i; j++){
//                 if(i == j || j == 1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 if(i == j || j == 1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }

//             for(int k = 1; k <= n - i; k++){
//                 System.out.print("  ");
//             }

//             for(int j = 1; j <= i; j++){
//                 if(i == j || j == 1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 22. Write a program that prints the  diamond pattern by numbers */
/*
 *      1
 *     1 2
 *    1 2 3
 *    1 2 3
 *     1 2
 *      1
 */
// class NumericPattern9{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int k = 1; k <= n - i; k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         for(int i = n; i >= 1; i--){
//             for(int k = 1; k <= n - i; k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 23. Write a program that prints the following pattern 
 *          1
 *         2 2
 *        3 3 3
 *       4 4 4 4 
*/
// class NumericPattern10{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N : ");
//         int n = input.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 24. Write a program that prints the following palidromic pattern 
 *            1
 *          2 1 2
 *        3 2 1 2 3 
 *      4 3 2 1 2 3 4
*/
// class PalindromicPattern{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = input.nextInt();
        
//         for(int i = 1; i <= n; i++){
//             for(int a = 1; a <= n - i; a++){
//                 System.out.print("  ");
//             }
//             for(int b = i; b >= 1; b--){
//                 System.out.print( b + " ");
//             }
//             for(int c = 2; c <= i; c++){
//                 System.out.print(c + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 25. Write a program that prints the following pattern : Pascal's left angled triangle
 *    *
 *    * *
 *    * * * 
 *    * * * *
 *    * * * 
 *    * * 
 *    *
*/
// class PyramidPattern7{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of n: ");
//     int n = input.nextInt();
    
//     for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= i; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }

//     for(int i = n - 1; i >= 1; i--){
//       for(int j = 1; j <= i; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 26. Write a program that prints the following pattern : Pascal's right angled triangle
 *         *
 *       * *
 *     * * * 
 *   * * * *
 *     * * * 
 *       * * 
 *         *
*/
// class PyramidPattern8{
//   public static void main(String[] args){
//     Scanner input = new Scanner (System.in);
//     System.out.print("Enter the value of n: ");
//     int n = input.nextInt();

//     for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }

//     for(int i = n - 1; i >= 1; i--){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 25. Write a program that prints the following pattern : Pascal's right angled triangle
 *    * * * * 
 *     * * *
 *      * * 
 *       *
 *      * *
 *     * * * 
 *    * * * *
*/
// class PyramidPattern9{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();

//     for(int i = n; i >= 1; i--){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }

//     for(int i = 2; i <= n; i++){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 26. Write a program that prints the following pattern 
 *    * * * * 
 *     *   *
 *      * * 
 *       *
*/
// class PyramidPattern10{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();

//     for(int i = n; i >= 1; i--){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         if(i == k || k == 1 || i == n){
//           System.out.print("* ");
//         }
//         else{
//           System.out.print("  ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 27. Write a program that prints the following pattern 
 *  
 *       * 
 *      * *
 *     *   * 
 *    * * * *
*/
// class PyramidPattern11{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();
//     for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         if(k == 1 || k == i || i == n){
//           System.out.print("* ");
//         }
//         else{
//           System.out.print("  ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 28. Write a program that prints the following pattern 
 *
 *    * * * * 
 *     *   *
 *      * * 
 *       *
 *      * *
 *     *   * 
 *    * * * *
*/
// class PyramidPattern12{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();

//     for(int i = n; i >= 1; i--){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         if(i == n || i == k || k == 1){
//           System.out.print("* ");
//         }
//         else{
//           System.out.print("  ");
//         }
//       }
//       System.out.println();
//     }

//     for(int i = 2; i <= n; i++){
//       for(int j = 1; j <= n -i; j++){
//         System.out.print(" ");
//       }
//       for(int k = 1; k <= i; k++){
//         if(i == n || i == k || k == 1){
//           System.out.print("* ");
//         }
//         else{
//           System.out.print("  ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 29. Write a program that prints the following pattern 
 * 
 *    1 2 3 4 5
 *     2 3 4 5
 *      3 4 5
 *       4 5
 *        5
 *       4 5
 *      3 4 5
 *     2 3 4 5 
 *    1 2 3 4 5 
 * 
 */
// class NumericPattern11{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();
    
//     for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= i; j++){
//         System.out.print(" ");
//       }
//       for(int k = i; k <= n; k++){
//         System.out.printf("%d ", k);
//       }
//       System.out.print("\n");
//     }

//     for(int i = n - 1; i >= 1; i--){
//       for(int j = 1; j <= i; j++){
//         System.out.print(" ");
//       }
//       for(int k = n; k >= i; k--){
//         System.out.printf("%d ", k);
//       }
//       System.out.print("\n");
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*30. Write a program that prints the following pattern 
 *    
 *    A B C D E F
 *    A B C D E
 *    A B C D
 *    A B C 
 *    A B
 *    A 
 *    A B
 *    A B C
 *    A B C D
 *    A B C D E
 *    A B C D E F
 * 
*/
// class AlphabetPattern1{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the alphabetic letter in upper case: ");
//     char ch = input.next().charAt(0);
//     char ch1 = Character.toUpperCase(ch);
    
//     for(char i = ch1; i >= 'A'; i--){
//       for(char j = 'A'; j <= i; j++){
//         System.out.printf("%c ", j);
//       }
//       System.out.println();
//     }
//     for(char i = 'A'; i <= ch1; i++){
//       for(char j = 'A'; j <= i; j++){
//         System.out.printf("%c ", j);
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 31. Write a program that prints the following pattern

          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
      3 2 1 2 3
        2 1 2
          1
*/
// class NumericPattern12{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();
//     for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print("  ");
//       }
//       for(int k = i; k >= 1; k--){
//         System.out.print(k + " ");
//       }
//       for(int l = 2; l <= i; l++){
//         System.out.print(l + " ");
//       }
//       System.out.print("\n");
//     }
//     for(int i = n-1; i >= 1; i--){
//       for(int j = 1; j <= n - i; j++){
//         System.out.print("  ");
//       }
//       for(int k = i; k >= 1; k--){
//         System.out.print(k + " ");
//       }
//       for(int l = 2; l <= i; l++){
//         System.out.print(l + " ");
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 32. Write a program that prints the following pattern
Pascal's triangle program:
            1 
           1 1 
          1 2 1 
         1 3 3 1 
      
*/
// class NumericPattern13{
//   public static void main(String[] args){
//     Scanner input  = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();
    
//     int i, j, k, l;
    
//     for(i = 1; i <= n; i++){
//       for(j = 1; j <= n - i; j++){
//         System.out.print("  ");
//       }
//       for(k = 1; k <= i; k++){
//         System.out.print(k + " ");
//       }
//       for(l = k - 2; l >= 1; l--){
//         System.out.print(l + " ");
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 33. Write a program that prints the following pattern
    1 
    2 1 
    3 2 1 
    4 3 2 1   
*/
// class NumericPattern14{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();

//     for(int i = 1; i <= n; i++){
//       for(int j = i; j >= 1; j--){
//         System.out.printf("%d ", j);
//       }
//       System.out.println();
//     }
//   }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 34. Write a program that prints the multiplication pattern in a tabular form.*/
/*
      1| 2| 3| 4| 5| 6| 7| 8| 9| 10| 
      1| 
      2| 4| 
      3| 6| 9| 
      4| 8| 12| 16| 
      5| 10| 15| 20| 25| 
      6| 12| 18| 24| 30| 36| 
      7| 14| 21| 28| 35| 42| 49| 
      8| 16| 24| 32| 40| 48| 56| 64| 
      9| 18| 27| 36| 45| 54| 63| 72| 81| 
      10| 20| 30| 40| 50| 60| 70| 80| 90| 100| 
*/
// class NumericPattern15{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = input.nextInt();

//     for(int i = 1; i <= n; i++){
//       System.out.print(i + "| ");
//     }
//     System.out.println();
//     for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= i; j++){
//         System.out.print(i * j + "| ");
//       }
//       System.out.println();
//     }
//   }
// }