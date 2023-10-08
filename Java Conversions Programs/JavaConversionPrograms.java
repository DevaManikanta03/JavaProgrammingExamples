// import java.lang.*;
// import java.io.*;
// import java.util.Scanner;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 1. Write a program that converts the Decimal Number into binary */
// class DecimalToBinary {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the any decimal value : ");
//         int val = input.nextInt();
        
//         // Integer or any numeric value in java can be converted using the Integer.toBinaryString(int val);

//         String binaryVal = Integer.toBinaryString(val);
//         System.out.print("The Binary value of " + val + " is: "+ binaryVal);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that converts the Decimal Number into octal */
// class DecimalToOctal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the any decimal value: ");
//         int val = input.nextInt();

//         // Integer or any numeric value in java can be converted using the Integer.toOctalString(int val);

//         String octalVal = Integer.toOctalString(val);
//         System.out.print("The Octal value of " + val + " is: " + octalVal);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that converts the Decimal Number into hexadecimal */
// class DecimalToHexaDecimal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter any decimal value: ");
//         int val = input.nextInt();

//         //Integer or any numeric value in java can be converted using the Integer.toHexString(int val);

//         String hexaString = Integer.toHexString(val);
//         System.out.print("The Hexa Decimal value of "+ val + " is: " + hexaString);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that converts the Binary Number into decimal 
    #Beware of it is my own algorithm.. 😎
*/ 
// class BinaryToDecimal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value in binary: ");
//         int binVal = input.nextInt();
//         int rem = 0, decimalVal = 0, i = 0;
//         while(binVal > 0){
//             rem = binVal % 10;
//             decimalVal += rem * Math.pow(2, i);
//             i++;
//             binVal /= 10;
//         }
//         System.out.print(decimalVal);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that converts the entered Binary Number into:
 *  a. Hexa Decimal
 *  b. Octal
 */
// class BinaryToHexaOctal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value in binary: ");
//         int binValue = input.nextInt();

//         int decimalVal = BinaryToHexaOctal.convertBinaryToDecimal(binValue);

//         // toHexString() -- hexadecimal value && toOctalString() -- octal value

//         String hexaDecimal = Integer.toHexString(decimalVal);
//         String octalNumber = Integer.toOctalString(decimalVal);

//         System.out.print("The Binary Number: " + binValue);
//         System.out.print("\nThe Hexa Decimal: " + hexaDecimal);
//         System.out.print("\nThe Octal Number: " + octalNumber);
//     }

//     static int convertBinaryToDecimal(int val){
//         int rem = 0, decimalVal = 0, i = 0;
//         while(val > 0){
//             rem = val % 10;
//             decimalVal += rem * Math.pow(2, i);
//             i++;
//             val /= 10;
//         }
//         return decimalVal;
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that converts the binary value into gray code 

 * a. We first gets the decimal value input. 
 * b. We convert it into the binary for better understanding by using the convertDecimalToBinary() method.
 * c. We perform the actual binary operation using bit wise operators like:  (^) - XOR and (>>) - RIGHT SHIFT OPERATOR.
 *          Formula : val ^ (val >> 1) --> using the convertDecimalToGray() method.
 * d. We convert the resultant gray code value into binary again using the convertDecimalToBinary() method for better understanding.
 * 
 * GRAY CODE : is nothing but changing the one bit in the two binary successors.
 * for eg 5 --> 101
 * gray code of 5
 * 
 * 1 0 1
 * first step  : 1 0 1
 *               In this we take the first bit as usual and for the next bit we perform the XOR operation.
 *               as, first significant bit of 5 - 101 is 1;
 *               So, in gray code 1 will be the first bit.
 * 
 * second step : Then, 10 which are the next bits in 5 the resultant XOR of 10 will be appended to gray code like it will be 1 bcoz --> 1 ^ 0 ==> 1
 *               So, in gray code 1 will be the second bit as the first bit will be 1.
 *                  So the gray code : 1 1
 * 
 * Third step  : Then, 01 which are the next bits in 5 the resultant xor of 01 will be appended to gray code like it will be 1 bcoz --> 0 ^ 1 ==> 1
 *               So, in gray code 1 will be the third bit again.
 *               So, the gray code : 1 1 1  -----------> 5 in 1 0 1 
 * 
 * Hence The Gray code of 5 is 7
 *                      
 *              1 0 1      is      1 1 1 
 *         (Binary code)        (Gray code)  
 *  
*/
// class BinaryToGrayCode{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter any decimal value: ");
//         int val = input.nextInt();

//         int binaryVal = BinaryToGrayCode.convertDecimalToBinary(val);
//         System.out.print("The Binary number of " + val + " is: " + binaryVal);
        
//         int grayCode = BinaryToGrayCode.convertDecimalToGray(val);
//         System.out.print("\nThe Gray Code of " + binaryVal + " is: " + BinaryToGrayCode.convertDecimalToBinary(grayCode) + " --> " + grayCode);
//     }

//     public static int convertDecimalToBinary(int val){
//         int rem = 0, binaryVal = 0, i = 0;
//         while(val > 0){
//             rem = val % 2;
//             binaryVal += rem * Math.pow(10, i);
//             i++;
//             val /= 2;
//         }
//         return binaryVal;
//     }

//     public static int convertDecimalToGray(int val){
//         return val ^ (val >> 1);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that converts the gray value into binary code */
// class GrayCodeToBinary{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value in gray code: ");
//         int grayCode = input.nextInt();

//         int binaryOfGray = GrayCodeToBinary.convertNumberIntoBinary(grayCode);
//         int actualVal = GrayCodeToBinary.convertGrayCodeToActual(grayCode);
//         int actualValInBinary = GrayCodeToBinary.convertNumberIntoBinary(actualVal);

//         System.out.println("The Gray Code: " + grayCode + " in binary: " + binaryOfGray);
//         System.out.println("The Actual Value : " + actualVal + " it is in binary: " + actualValInBinary);
//     }

//     public static int convertNumberIntoBinary(int val){ 
//         int rem = 0, decimal = 0, i = 0;
//         while(val > 0){
//             rem = val % 2;
//             decimal += rem * Math.pow(10, i);
//             i++;
//             val /= 2;
//         }
//         return decimal;
//     }

//     public static int convertGrayCodeToActual(int val){
//         int a = val;
        
//         for(int n = val >> 1; n != 0; n >>= 1){
//             a ^= n;
//         }
//         return a;
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that converts the octal number to decimal number */
// class OctalToDecimal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Octal Value: ");
//         int octalValue = input.nextInt();
        
//         int decimalValue = OctalToDecimal.convertOctalToDecimal(octalValue);
//         System.out.print("The Octal Value ("+ octalValue +") in Decimal: " + decimalValue);
//     }
//     public static int convertOctalToDecimal(int val){
//         int rem = 0, decimal = 0, i = 0;
//         while(val > 0){
//             rem = val % 10;
//             decimal += rem * Math.pow(8, i);
//             i++;
//             val /= 10;
//         }
//         return decimal;
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that converts the octal number to binary number */
// class OctalToBinary{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the octal value: ");
//         int octalValue = input.nextInt();

//         int decimalVal = OctalToBinary.convertOctalToDecimal(octalValue);

//         System.out.print("The Octal value ("+octalValue+") in decimal ("+decimalVal+") and in binary: " + Integer.toBinaryString(decimalVal));
//     }
//     public static int convertOctalToDecimal(int val){
//         int rem = 0, decimal = 0, i = 0;

//         while(val > 0){
//             rem = val % 10;
//             decimal += rem * Math.pow(8, i);
//             i++;
//             val /= 10;
//         }
//         return decimal;
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that converts the octal number to hexadecimal number */
// class OctalToHexaDecimal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the octal value: ");
//         int octalValue = input.nextInt();

//         int decimalVal = OctalToHexaDecimal.convertOctalToDecimal(octalValue);
//         System.out.print("The Octal value ("+octalValue+") in decimal ("+decimalVal+") and in Hexa Decimal: " + Integer.toHexString(decimalVal));
//     }
//     public static int convertOctalToDecimal(int val){
//         int rem = 0, decimal = 0, i = 0;
//         while(val > 0){
//             rem = val % 10;
//             decimal += rem * Math.pow(8, i);
//             i++;
//             val /= 10;
//         }
//         return decimal;
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 11. Write a program that converts the hexadecimal number to decimal number*/
// class HexaDecimalToDecimal{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the hexa decimal value: ");
//         String hexaDecimal = input.nextLine();

//         int decimalVal = HexaDecimalToDecimal.convertHexaDecimalToDecimal(hexaDecimal);
//         System.out.println("The Hexa Decimal " + hexaDecimal + " in Decimal : " + decimalVal);
//     }

//     public static int convertHexaDecimalToDecimal(String val){
//         int digitVal, decimal = 0 , power = 0, len = val.length(), k = 0;
        
//         for(int i = len - 1; i >= 0; i--){
//             char ch = val.charAt(i);
//             if(Character.isDigit(ch)){
//                 digitVal = Character.getNumericValue(ch);
//             }
//             else{
//                 digitVal = (ch - 'A') + 10;
//             }
//             decimal += digitVal * Math.pow(16, k);
//             k++;
//         }
//         return decimal;
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 12. Write a program that converts the hexadecimal number to binary number*/
// class HexaDecimalToBinary{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the hexa decimal value: ");
//         String hexaVal = input.nextLine();
        
//         HexaDecimalToBinary perform = new HexaDecimalToBinary();
//         int decimalVal = perform.convertHexaDecimalToDecimal(hexaVal);
//         String binaryVal = Integer.toBinaryString(decimalVal);
//         System.out.print("The Hexa Decimal ("+hexaVal+") in Binary: " + binaryVal);
//     }

//     public int convertHexaDecimalToDecimal(String val){
//         int digitVal = 0, len = val.length(), decimal = 0, k = 0;

//         for(int i = len - 1; i >= 0; i--){
//             char ch = val.charAt(i);
//             if(Character.isDigit(ch)){
//                 digitVal = Character.getNumericValue(ch);
//             }
//             else{
//                 digitVal = (ch - 'A') + 10;
//             }
//             decimal += digitVal * Math.pow(16, k);
//             k++;
//         }
//         return decimal;
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 13. Write a program that converts the Celcius to Fahrenheit degrees*/
// class CelciusToFahrenheit{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the degrees in Celcius: ");
//         double celcius = input.nextDouble();

//         double fahrenhiet = (celcius * 1.8) + 32;

//         System.out.printf("The Celcius degrees %.2f°C\nFahrenheit is: %.2f°F", celcius, fahrenhiet);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 14. Write a program that converts the Fahrenheit to Celcius degrees*/
// class FahrenheitToCelcius{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the degrees in Fahrenhiet: ");
//         double fahrenheit = input.nextDouble();

//         double celcius = (fahrenheit - 32) * 0.56;

//         System.out.printf("The Fahrenheit degrees %.2f°F in Celcius degree is %.2f°C", fahrenheit, celcius);
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*15. Write a program that converts the Decimal Number to Binary using recursion */
// class DecimalToBinaryRecursion{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Decimal Value: ");
//         int decimalVal = input.nextInt();

//         DecimalToBinaryRecursion perform = new DecimalToBinaryRecursion();
//         String binaryVal = perform.convertDecimalToBinary(decimalVal);
//         System.out.print("The Binary Value: " + binaryVal);
//     }

//     public String convertDecimalToBinary(int val){
//         int a;
//         if(val > 0){
//             a = val % 2;
//             return ((convertDecimalToBinary(val/2)) + "" + a);
//         }
//         return "";
//     }
// }