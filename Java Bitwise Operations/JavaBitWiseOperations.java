// import java.util.Scanner;
/* 1. Write a menu driven program that performs all the bitwise operations. */
// class BitWiseOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number - 1 : ");
//         int a = input.nextInt();
//         System.out.print("Enter a number - 2 : ");
//         int b = input.nextInt();
               
//         // &, ^, ~, |, <<, >>, >>>

//         int option = 0;
//         while(option != -1){
//             System.out.println("Press 1 to perform BINARY AND : & ");
//             System.out.println("Press 2 to perform BINARY OR : | ");
//             System.out.println("Press 3 to perform BINARY NOT : ~ ");
//             System.out.println("Press 4 to perform BINARY XOR : ^ ");
//             System.out.println("Press 5 to perform BINARY LEFT SHIFT : << ");
//             System.out.println("Press 6 to perform BINARY RIGHT SHIFT : >> ");
//             System.out.println("Press 7 to perform BINARY UNSIGNED RIGHT SHIFT : >>> ");
//             System.out.println("Press -1 to EXIT.");
            
//             System.out.print("Enter your option : ");
//             option = input.nextInt();

//             switch(option){
//                 case 1:{
//                     System.out.print("\n-----------BINARY AND-----------\n");
//                     System.out.println(Integer.toBinaryString(a) + " ---> " + a);
//                     System.out.println(Integer.toBinaryString(b) + " ---> " + b);
//                     System.out.println("==============================");
//                     System.out.println(Integer.toBinaryString((a&b)) + " ---> " + (a & b));
//                     break;
//                 }
//                 case 2:{
//                     System.out.print("\n-----------BINARY OR-----------\n");
//                     System.out.println(Integer.toBinaryString(a) + " ---> " + a);
//                     System.out.println(Integer.toBinaryString(b) + " ---> " + b);
//                     System.out.println("==============================");
//                     System.out.println(Integer.toBinaryString((a|b)) + " ---> " + (a | b));
//                     break;
//                 }
//                 case 3:{
//                     System.out.print("\n-----------BINARY NOT-----------\n");
//                     System.out.println(Integer.toBinaryString(a) + " ---> " + a);
//                     System.out.println("==============================");
//                     System.out.println(Integer.toBinaryString((~a)) + " ---> " + (~a));
//                     System.out.println(Integer.toBinaryString(b) + " ---> " + b);
//                     System.out.println("==============================");
//                     System.out.println(Integer.toBinaryString((~b)) + " ---> " + (~b));
//                     break;
//                 }
//                 case 4:{
//                     System.out.print("\n-----------BINARY XOR-----------\n");
//                     System.out.println(Integer.toBinaryString(a) + " ---> " + a);
//                     System.out.println(Integer.toBinaryString(b) + " ---> " + b);
//                     System.out.println("==============================");
//                     System.out.println(Integer.toBinaryString((a^b)) + " ---> " + (a ^ b));
//                     break;
//                 }
//                 case 5:{
//                     int pos1, pos2;
//                     System.out.print("Enter how much bits positions to be moved for " + a + " : ");
//                     pos1 = input.nextInt();

//                     System.out.println("Performing the BINARY LEFT SHIFT as : "+a+" << "+pos1);
//                     System.out.println(Integer.toBinaryString(a) + " << " + pos1);
//                     System.out.println("===============================");
//                     int ans1 = a << pos1;
//                     System.out.println(Integer.toBinaryString((ans1)) + " ---> " + ans1);

//                     System.out.print("Enter how much bits positions to be moved for " + b + " : ");
//                     pos2 = input.nextInt();
                    
//                     System.out.println("Performing the BINARY LEFT SHIFT as : "+b+" << "+pos2);
//                     System.out.println(Integer.toBinaryString(b) + " << " + pos2);
//                     System.out.println("===============================");
//                     int ans2 = b << pos2;
//                     System.out.println(Integer.toBinaryString((ans2)) + " ---> " + ans2);
//                     break;
//                 }
//                 case 6:{
//                     int pos1, pos2;
//                     System.out.print("Enter how much bits positions to be moved for " + a + " : ");
//                     pos1 = input.nextInt();

//                     System.out.println("Performing the BINARY RIGHT SHIFT as : "+a+" >> "+pos1);
//                     System.out.println(Integer.toBinaryString(a) + " >> " + pos1);
//                     System.out.println("===============================");
//                     int ans1 = a >> pos1;
//                     System.out.println(Integer.toBinaryString((ans1)) + " ---> " + ans1);

//                     System.out.print("Enter how much bits positions to be moved for " + b + " : ");
//                     pos2 = input.nextInt();
                    
//                     System.out.println("Performing the BINARY RIGHT SHIFT as : "+b+" >> "+pos2);
//                     System.out.println(Integer.toBinaryString(b) + " >> " + pos2);
//                     System.out.println("===============================");
//                     int ans2 = b >> pos2;
//                     System.out.println(Integer.toBinaryString((ans2)) + " ---> " + ans2);
                    
//                     break;
//                 }
//                 case 7:{
//                     int pos1, pos2;
//                     System.out.print("Enter how much bits positions to be moved for " + a + " : ");
//                     pos1 = input.nextInt();

//                     System.out.println("Performing the BINARY UNSIGNED RIGHT SHIFT as : "+a+" >>> "+pos1);
//                     System.out.println(Integer.toBinaryString(a) + " >>> " + pos1);
//                     System.out.println("===============================");
//                     int ans1 = a >>> pos1;
//                     System.out.println(Integer.toBinaryString((ans1)) + " ---> " + ans1);

//                     System.out.print("Enter how much bits positions to be moved for " + b + " : ");
//                     pos2 = input.nextInt();
                    
//                     System.out.println("Performing the BINARY UNSIGNED RIGHT SHIFT as : "+b+" >>> "+pos2);
//                     System.out.println(Integer.toBinaryString(b) + " >>> " + pos2);
//                     System.out.println("===============================");
//                     int ans2 = b >>> pos2;
//                     System.out.println(Integer.toBinaryString((ans2)) + " ---> " + ans2);
//                     break;
//                 }
//                 case -1:{
//                     System.out.print("EXIT!!\n\n");
//                     break;
//                 }
//                 default: {
//                     System.out.print("\nEnter a valid option from 1 to 7 \n");
//                     break;
//                 }
//             }
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*2. Write a program that performs the arithmetic addition operation using binary operators */
// class AdditionBitwiseOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number 1 : ");
//         int a = input.nextInt();
//         System.out.print("Enter the number 2 : ");
//         int b = input.nextInt();

//         System.out.print("The Addition of " +a+ " and " +b+" is : " + AdditionBitwiseOperations.findAdd(a, b));
//     }

//     public static int findAdd(int $a, int $b){
//         int $carry = 0;
//         while($b != 0){
//             $carry = $a & $b;
//             $a ^= $b;
//             $b = $carry << 1;
//         }
//         return $a;
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that multiply the entered number by 4 using bitwise operation */
// class MultiplyBy4{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int a = input.nextInt();

//         int ans = a << 2;
//     /*
//      *      a << n -----(Mathematically Equal to..)----> a X 2 with the power as n ==> a X 2^n
//      */
//         System.out.print("The " +a+ " * " + 4 + " is : " + ans);
//         input.close();
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that checks if a particular bit is set to One or not */
// class CheckingIfACertainBitIsSet_or_Not{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int a = input.nextInt();
//         System.out.print("Enter the position that you want to check : ");
//         int pos = input.nextInt();

//         String binaryString = Integer.toBinaryString(a);
//         if((pos-1) == 0 && (binaryString.charAt(pos-1) == '1')){
//             System.out.print("Yes the first bit is set to 1, you can see : \'"+binaryString+"\'");
//         }
//         else if((pos-1) > 0 && (binaryString.charAt(pos-1) == '1')){
//             System.out.print("Yes the first bit is set to 1, you can see : \'"+binaryString+"\'");
//         }
//         else{
//             System.out.print("No there is not 1 bit set in the position ("+pos+") as you can see : " + binaryString);
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that checks if a particular bit is set to One change it to Zero or vice versa */
// class BitReplace{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int a = input.nextInt();

//         String binaryString = Integer.toBinaryString(a);
//         System.out.print(a + " in Binary : " + binaryString + "\n");
//         System.out.print("Enter the position of the bit where you want to change: ");
//         int pos = input.nextInt();
//         StringBuffer string = new StringBuffer(binaryString);
//         if(binaryString.charAt(pos-1) == '0'){
//             System.out.println("\nChanging the 0 to 1....");
//             string.setCharAt(pos-1, '1'); 
//         }
//         else{
//             System.out.println("\nChanging the 1 to 0....");
//             string.setCharAt(pos-1, '0');
//         }

//         System.out.println(a+" updated binary bit is : " + string);

//         System.out.print("The " + string + " in decimal form : " + (BitReplace.convertBinToDec(string.toString())));
//     }

//     public static int convertBinToDec(String str){
//         int binary = Integer.parseInt(str);
//         int rem = 0, sum = 0, i = 0;
//         while(binary > 0){
//             rem = binary % 10;
//             sum += rem * Math.pow(2, i);
//             i++;
//             binary /= 10;
//         }

//         return sum;
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that checks if a particular bit is set to One change it to Zero or vice versa using biwise operations*/
// class BitReplaceByBitWiseOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value : ");
//         int a  = input.nextInt();
//         System.out.print("Acutal Entered number in binary: " + Integer.toBinaryString(a) + "\n");
//         /*  
//             Explanation: 

//             Formula for replace the bit from right to left indexed position using bitwise operators is

//             result = num ^ (1 << pos); 
            
//             Here, If the user enters 0 as the position with num as 5 the 0th binary position of the number is needed to be changed. 
//             5 --> 
//                 | 1 | 0 | 1 |
//                   2   1   0 
//             here the 0th position we have 1 right that should be changed using bitwise operations.

//             we take 0 as 'pos' and 1 << pos ==> 100 and the xor of 101 and 100 makes the last bit as 0.
        
//         */

//         System.out.print("Enter the position of the bit from right to left as it was 1 indexded :  ");
//         int pos = input.nextInt();

//         if(pos == 0 | pos < 0){
//             System.out.print("Error: Enter a valid index!!!");
//         }
//         else{
            
//             int result = a ^ (1 << (pos-1));
//             System.out.print("Updated Binary value of entered: " + Integer.toBinaryString(result)+"\n");
//             System.out.print("After changing the single bit the value of " + a + " turned as " + result);
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that checks if a particular bit is set to one or not using bitwise operations*/
// class CheckingIfACertainBitIsSet_or_Not2{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the value : ");
//         int a = input.nextInt();
//         System.out.print("Enter the position of the bit from right to left as 1 indexed : ");
//         int pos = input.nextInt();
//         int result = a & (1 << (pos-1));
//         if(result > 0){
//             System.out.print("Yes! At the specified position the bit is on..\nYou can see : " + Integer.toBinaryString(a));
//         }
//         else{
//             System.out.print("No! At the specified position the bit is off...\nYou can see : " + Integer.toBinaryString(a));
//         }
//         input.close();
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that converts the decimal number to binary number and count the number of 1s in the binary of the entered number */
// class BitCount_1{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the decimal value: ");
//         int a = input.nextInt();

//         BitCount_1 find = new BitCount_1();
//         int count = find.decimal_1_BitCountInBinary(a);
//         System.out.print("The Number of 1 bits in " +a+ "\'s binary format : " + Integer.toBinaryString(a) + " is : " + count);

//         //Approach 2: using inbuilt function/method called bitCount().
//         System.out.print("\nThe Number of 1 bits in " +a+ "\'s binary format : " + Integer.toBinaryString(a) + " is : " + Integer.bitCount(a));

//         //both works similar way.....
//         /*
//          * bitCount() is a method in Integer class of java.lang package, which allows us to find or count the number of bits are with 1 in a certain number binary format..
//          */
//     }

//     //Approach 1:
//     public int decimal_1_BitCountInBinary(int a){
//         int rem = 0, count = 0, sum = 0, i = 0;
//         while(a > 0){
//             rem = a % 2;
//             if(rem == 1){
//                 count++;
//             }
//             sum += rem * Math.pow(10, i);
//             i++;
//             a /= 2;
//         }
//         return count;
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that Swaps the two numbers using bit wise operations*/
// class SwappingUsingBitWiseOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number - a : ");
//         int a = input.nextInt();
//         System.out.print("Enter the number - b : ");
//         int b = input.nextInt();

//         //Swapping using XOR operation
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
//         System.out.print("After Swapping : \n");
//         System.out.print("The Value of a : " + a);
//         System.out.print("\nThe Value of b : " + b);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that count the 1 bits of entered decimal number using bitwise operations*/
// class SetBitCountUsingBitWiseOperations{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a = input.nextInt();

//         String binaryString = Integer.toBinaryString(a);
//         int count = 0;
//         for(int i = 0; i < binaryString.length(); i++){
//             if((a&(1 << i)) > 0){
//                 count++;
//             }
//         }

//         System.out.print("The Count of 1 bits in Binary of entered number ("+a+") is : "+count+"\nAs you can see in binary : " + binaryString);
//     }
// }
