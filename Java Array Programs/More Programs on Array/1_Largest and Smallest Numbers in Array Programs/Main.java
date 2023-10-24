import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 1. Write a program that finds the number of elements in a array in Java */
// class NumberOfElements{
//     public static void main(String[] args){
//         int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int count = 0;

//         for(int i : myArray){
//             count++;
//         }
//         System.out.println("The Array : " + Arrays.toString(myArray));    
//         System.out.println("The No.of Elements are : " + count);
//         System.out.println("The No.of Elements are : " + myArray.length);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that finds the largest in the array */
// class LargestElementInTheArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of your array : ");
//         int size = input.nextInt();

//         int[] myArray = new int[size];
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }

//         int largest = myArray[0];
//         for(int i = 0; i < myArray.length; i++){
//             largest = (largest < myArray[i]) ? myArray[i] : largest;
//         }

//         System.out.print("The Largest Value : " + largest);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that finds the first and second largest in the array */
// class FirstSecondLargest{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();
        
//         int myArray[] = new int[n];
//         System.out.print("Enter the " + n + " values : \n");

//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }

//         int firstLargest = myArray[0];
//         int secondLargest = myArray[1];

//         for(int i = 0; i < myArray.length; i++){
//             firstLargest = (firstLargest < myArray[i]) ? myArray[i] : firstLargest;
//         }
//         for(int i = 0; i < myArray.length; i++){
//             if(myArray[i] == firstLargest){
//                 continue;
//             }
//             else{
//                 secondLargest = (secondLargest < myArray[i]) ? myArray[i] : secondLargest;
//             }
//         }
//         System.out.println("The First Largest : " + firstLargest);
//         System.out.print("The Second Largest : " + secondLargest);
//         input.close(); 
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that finds the second largest and including first smallest in the array */
// class SecondSmallestAndLargest{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int[] myArray = new int[n];
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }

//         int largest = myArray[0], secondLargest = myArray[1], smallest = myArray[0];
//         for(int i = 0; i < myArray.length; i++){
//             largest = (largest < myArray[i]) ? myArray[i] : largest;
//             smallest = (smallest > myArray[i]) ? myArray[i] : smallest;
//         }
//         for(int i = 0; i < myArray.length; i++){
//             if(myArray[i] == largest){
//                 continue;
//             }
//             else{
//                 secondLargest = (secondLargest < myArray[i]) ? myArray[i] : secondLargest;
//             }
//         }
//         System.out.print("The Second Largest : " + secondLargest);
//         System.out.print("\nThe Smallest : " + smallest);
//         input.close();
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that finds the first and second largest and smallest in the array */
// class FirstSecondSmallestLargest{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();
//         System.out.print("Enter the " + n + " elements into the array : \n");
        
//         int[] array = new int[n];
//         for(int i = 0; i < n; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }

//         int firstSmall = array[0], secondSmall = array[1], firstLarge = array[0], secondLarge = array[0];

//         for(int i = 0; i < array.length; i++){
//             firstSmall = (firstSmall < array[i]) ? firstSmall : array[i];
//             firstLarge = (firstLarge > array[i]) ? firstLarge : array[i];
//         }

//         System.out.print("The First Large : " + firstLarge);
//         System.out.print("\nThe First Small : " + firstSmall);

//         for(int i = 0; i < array.length; i++){
//             if(array[i] == firstSmall) continue;
//             else  secondSmall = (secondSmall < array[i]) ? secondSmall : array[i];
//         }

//         System.out.print("\nThe Second Small : " + secondSmall);

//         for(int i = 0; i < array.length; i++){
//             if(array[i] == firstLarge) continue;
//             else secondLarge = (secondLarge > array[i]) ? secondLarge : array[i];
//         }

//         System.out.print("\nThe Second Large : " + secondLarge);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that finds the next greater element in the array */
class PrintNextGreaterNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        
        System.out.println("Enter the "+n+" elements into the array: ");
        int myArray[] = new int[n];

        for(int i = 0; i < myArray.length; i++){
            System.out.print("["+(i+1)+"] : ");
            myArray[i] = input.nextInt();
        }
        Stack<Integer> container = new Stack<>();       
        container.push(myArray[0]);
        for(int i = 0; i < myArray.length; i++){
            if(container.empty()){
                container.push(myArray[i]);
                continue;
            }
            while(!container.empty() && container.peek() < myArray[i]){
                System.out.println(container.peek() + " --> " + myArray[i]);
                container.pop();
            }
            container.push(myArray[i]);
        }

        while(!container.empty()){
            System.out.println(container.pop() + " --> " + "-1");
        }
    }
}