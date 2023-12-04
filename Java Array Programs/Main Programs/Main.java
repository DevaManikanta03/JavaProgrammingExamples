import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
/* 1. Find the largest of the elements in the array */
// class FindLargestElementInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();
import java.util.Set;

//         System.out.println("Enter the " + n + " elements into the array!");
//         int[] myArray = new int[n];
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }

//         int large = myArray[0];
//         for(int i = 0; i < myArray.length; i++){
//             large = large < myArray[i] ? myArray[i] : large;
//         }

//         System.out.print("Largest Value :  " + large);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Find the Smallest of the elements in the array */
// class FindSmallestElementInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int[] myArray = new int[n];
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }

//         int small = myArray[0];
//         for(int i = 0; i < myArray.length; i++){
//             small = (myArray[i] < small) ? myArray[i] : small;
//         }
//         System.out.print("The Smallest number is : " + small);
//         input.close();
//     }
// }
/*3. Write a java program to merge the arrays*/
// class MergeTwoArrays{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array 1: ");
//         int n = input.nextInt();

//         int[] arr1 = new int[n];

//         System.out.print("Enter the size of the array 2: ");
//         n = input.nextInt();

//         int[] arr2 = new int[n];

//         for(int i = 0; i < arr1.length; i++){
//             System.out.print("Arr1["+(i+1)+"] : ");
//             arr1[i] = input.nextInt();
//         }
//         System.out.println();
//         for(int i = 0; i < arr2.length; i++){
//             System.out.print("Arr2["+(i+1)+"] : ");
//             arr2[i] = input.nextInt();
//         }

//         // int mainSize = arr1.length + arr2.length;
//         int[] mergedArray = new int[arr1.length + arr2.length];
//         int j=0;
//         for(int i = 0; i < arr1.length; i++,j++){
//             mergedArray[j] = arr1[i];
//         }
//         for(int i = 0; i < arr2.length; i++,j++){
//             mergedArray[j] = arr2[i];
//         }
//         j=0;
//         System.out.println();
//         System.out.println("Merged Array : ");
//         for(int i : mergedArray){
//             System.out.println("MerArr["+(j+1)+"] : " + i);
//             ++j;
//         }
//         input.close();
//     }
// }
/*4. Find the sum and average of the elements in the array*/
// class SumAndAverageOfElementsInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int[] myArray = new int[n];
//         int sum = 0, avg = 0;
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("Arr1["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//             sum += myArray[i];
//         }
//         avg = sum / myArray.length;
//         System.out.println("\nSum : " + sum + " Average : " + avg);
//         input.close();
//     }
// }
/*5. Write a program to find the search key element*/
// class SearchKeyElement{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = input.nextInt();

//         int[] myArray = new int[n];
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }
//         System.out.print("Enter the key element : ");
//         int key = input.nextInt();

//         int pos = 0;
//         boolean flag = false;
//         for(int i = 0; i < myArray.length; i++){
//             if(key==myArray[i]){
//                 pos = i;
//                 flag = true;
//                 break;
//             }
//         }

//         if(flag){
//             System.out.print("The Element was found in ["+(pos+1)+"] : " + key);
//         }
//         else{
//             System.out.print("The Element was not found");
//         }
//         input.close();
//     }
// }
/*6. Write a program to remove the duplicate elements in the array */
// class RemoveDuplicateElements{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = input.nextInt();
//         int[] array = new int[n];
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"]: ");
//             array[i] = input.nextInt();
//         }
//         Set<Integer> mySet = new HashSet<Integer>();
//         for(int i = 0; i < array.length; i++){
//             mySet.add(array[i]);
//         }
//         Object[] updatedArray = mySet.toArray();
//         int[] newArray = new int[updatedArray.length];
//         for(int i = 0; i < updatedArray.length; i++){
//             newArray[i] = (int) updatedArray[i];
//         }
//         System.out.println("After removing the duplicate elements: ");
//         for(int i = 0; i < newArray.length; i++){
//             System.out.print("["+(i+1)+"] : " + newArray[i] + "\n");
//         }
//     }
// }
/*7. Write a program to perform the union and intersection of the arrays*/
// class UnionInterSectionOfArrays{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the Array 1: ");
//         int n = input.nextInt();
//         System.out.print("Enter the size of the Array 2: ");
//         int n1 = input.nextInt();
        
//         int[] arr1 = new int[n];
//         int[] arr2 = new int[n1];
//         System.out.print("Array 1: \n");
//         for(int i = 0; i < arr1.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             arr1[i] = input.nextInt();
//         }
//         System.out.print("Array 2: \n");
//         for(int i = 0; i < arr2.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             arr2[i] = input.nextInt();
//         }

//         //Union...
//         Set<Integer> unionArray = new HashSet<Integer>();
//         for(int i = 0; i < arr1.length; i++){
//             unionArray.add(arr1[i]);
//         }
//         for(int i = 0; i < arr2.length; i++){
//             unionArray.add(arr2[i]);
//         }
//         String ch = "(Union)";
//         System.out.printf("--Array1-- %s --Array2--\n", ch);
//         System.out.print(unionArray.toString() + "\n");

//         //Intersection...
//         Set<Integer> intersectionArray = new HashSet<Integer>();
//         for(int i = 0; i < arr1.length; i++){
//             for(int j = 0; j < arr2.length; j++){
//                 if(arr1[i] == arr2[j]){
//                     intersectionArray.add(arr1[i]);
//                 }
//             }
//         }
//         System.out.println("--Array 1-- (Intersection) --Array 2--");
//         System.out.print(intersectionArray.toString());
//     }
// }
/*8. Write a program to find the number of occurances of the element in the array*/
// class CountTheOccuranceOfElement{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();
        
//         int[] myArray = new int[n];
//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }

//         System.out.print("Enter the value to find the occurances: ");
//         int val = input.nextInt();

//         if(Arrays.toString(myArray).contains(Integer.toString(val))){
//             // System.out.print("Yes");
//             int count = 0;
//             for(int i = 0;  i < myArray.length; i++){
//                 if(myArray[i] == val){
//                     ++count;
//                 }
//             }
//             System.out.print("The value " + val + " occured : " + count + " times\n");
//         }
//         else{
//             System.out.print("No Element Was found in the array..");
//         }
//     }
// }