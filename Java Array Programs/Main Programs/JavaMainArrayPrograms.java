//MAIN PROGRAMS - 14
// import java.util.Scanner;
// import java.util.Arrays;
/*1. Write a program to find the number of elements in an array. */
// class NumberOfElementsInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();
//         System.out.println("Enter the " + n + " values: ");
//         int[] myArray = new int[n];
//         for(int i = 0; i < n; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }
//         //Approach 1 to print no.of elements in the array.
//         System.out.print("The No.of elements in the array: " + myArray.length);

//         //Approach 2 to print no.of elements in the array.
//         int count = 0;
//         for(int i = 0; i < myArray.length; i++){
//             count++;         
//         }
//         System.out.println("\nThe No.of elements in the array: " + count);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 2. Write a program that finds the largest of the array's elements */
// class LargestInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int[] array = new int[n];
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }
//         int largest = array[0];
//         for(int i = 0; i < array.length; i++){
//             largest = (largest > array[i]) ? largest : array[i];
//         }
//         System.out.print("The Largest number entered in the array is : " + largest);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 3. Write a program that finds the second largest of the array's elements*/
// class SecondLargestInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int array[] = new int[n];
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }

//         int largest = array[0];
//         for(int i = 0; i < array.length; i++){
//             largest = (largest > array[i]) ? largest : array[i];
//         }

//         int largest2 = array[0];
//         for(int i = 0; i < array.length; i++){
//             if(array[i] == largest){
//                 continue;
//             }
//             else{
//                 largest2 = (largest2 > array[i]) ? largest2 : array[i];
//             }
//         }

//         System.out.print("The Largest Element in the array : " + largest);
//         System.out.print("\nThe Second Largest Element in the array : " + largest2);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 4. Write a program that finds the smallest element in the array */
// class SmallestElementOfTheArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int array[] = new int[n];
//         for(int i = 0; i < n; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }

//         int smallest = array[0];
//         for(int i = 0; i < array.length; i++){
//             smallest = (smallest < array[i]) ? smallest : array[i];
//         }

//         System.out.print("The Smallest element is : " + smallest);
//         input.close();
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 5. Write a program that finds the second smallest element in the array */
// class SecondSmallestNumberInArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = input.nextInt();

//         int[] array = new int[n];
        
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }
//         int smallest = array[0], secondSmallest = array[0];
//         for(int i = 0; i < array.length; i++){
//             smallest = (smallest < array[i]) ? smallest : array[i];
//         }
//         for(int i = 0; i < array.length; i++){
//             if(array[i] == smallest){
//                 continue;
//             }
//             else{
//                 secondSmallest = (secondSmallest < array[i]) ? secondSmallest : array[i]  ;
//             }
//         }
//         System.out.println("The Smallest value is : " + smallest);
//         System.out.print("The Second Smallest is : "+ secondSmallest);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 6. Write a program that finds the local maxima in the array
 * 
 *      Local Maxima means the element must be greater that the element before it and after it like,
 *      E.g:
 *              1,2,1 here -> local maxima is 2 as it greater than the value left to it and right to it.
 */
// class LocalMaximaInTheArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         System.out.println("Enter the " + n + " elements in to the array : ");
//         int[] array = new int[n];
//         for(int i = 0; i < n; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }

//         int low = 0, mid = 0, high = array.length-1, localMaxima = 0;
//         while(low <= high){
//             mid = (low + high) / 2;
//             if((mid == 0 || array[mid-1] < array[mid]) && (mid == array.length-1 || array[mid+1] < array[mid])){
//                 localMaxima = array[mid];
//                 break;
//             }
//             else if(mid > 0 && array[mid-1] > array[mid]){
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//             }
//         }

//         System.out.print("The Local Maxima is : " + localMaxima);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 7. Write a program that finds the local minima in the array */
// class LocalMinimaInTheArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = input.nextInt();

//         int[] array = new int[n];
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }

//         int low = 0, mid = 0, high = array.length-1, localMinima = 0;
//         while(low <= high){
//             mid = (low + high) / 2;
//             if((mid == 0 || array[mid-1] > array[mid]) && (mid == array.length-1 || array[mid+1] > array[mid])){
//                 localMinima = array[mid];
//                 break;
//             }
//             else if (mid > 0 && array[mid-1] > array[mid]){
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//             }
//         }
//         System.out.print("The Local Minima is : "+ localMinima);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 8. Write a program that merges the two arrays */
// class MergeArray{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of first array : ");
//         int aSize = input.nextInt();
//         System.out.print("Enter the size of second array : ");
//         int bSize = input.nextInt();

//         System.out.print("Enter the array 1 values\n");
//         int[] array1 = new int[aSize];
//         for(int i = 0; i < aSize; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array1[i] = input.nextInt();
//         }

//         System.out.print("Enter the array 2 values\n");
//         int[] array2 = new int[bSize];
//         for(int i = 0; i < bSize; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array2[i] = input.nextInt();
//         }

//         int[] mergedArray = MergeArray.mergeMyArrays(array1, array2);
//         System.out.print("The Merged array as Array1 and Array2:\n");
//         for(int i = 0; i < mergedArray.length; i++){
//             System.out.print("["+(i+1)+"] : "+mergedArray[i]+ "\n");
//         }
//     }

//     public static int[] mergeMyArrays(int[] array1, int[] array2){
//         int size = array1.length + array2.length;
//         int[] mergedArray = new int[size];
//         int index = 0;
//         for(int i = 0; i < array1.length; i++){
//             mergedArray[index] = array1[i];
//             index++;
//         }
//         for(int i = 0; i < array2.length; i++){
//             mergedArray[index] = array2[i];
//             index++;
//         }

//         return mergedArray;
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 9. Write a program that finds the sum and average of all elements in an array */
// class SumAndAverage{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter for how many you want to find the sum & average : ");
//         int size = input.nextInt();
        
//         int[] array = new int[size];
//         double sum = 0, avg = 0;
//         System.out.println("Enter the "+size+" values");
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//             sum += array[i];
//         }

//         avg = sum / size;
//         System.out.print("The Sum of entered numbers : " + sum);
//         System.out.print("\nThe Average of entered numbers : " + avg);
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 10. Write a program that finds the searched element in the array*/
// class SearchElement{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int size = input.nextInt();

//         int[] myArray = new int[size];

//         for(int i = 0; i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }
//         /* //Approach 1 : Linear Search..
//             System.out.print("Enter the key element that you want to search for : ");
//             int searchElement = input.nextInt();
//             SearchElement.findElement(searchElement, myArray);
//          */

//         //Approach 2 : Binary Search...
//         // System.out.print("Enter the key element that you want to search for : ");
//         // int searchElement = input.nextInt();
//         // SearchElement.findElementUsingBinarySearch(searchElement, myArray);

//         //Approach 3 : Built-in Binary Search
//         // System.out.print("Enter the key element that you want to search ");
//         // int searchElement = input.nextInt();
//         // SearchElement.findElementUsingBuiltInBinarySearch(searchElement, myArray);
//     }

//     public static void findElement(int val, int[] myArray){
//         int pos = 0; boolean pass = false;
//         for(int i = 0; i < myArray.length; i++){
//             if(myArray[i] == val){
//                 pos = i;
//                 pass = true;
//                 break;
//             }
//         }

//         if(pass){
//             System.out.print("You searched for " +val+ " which was found at ["+(pos+1)+"]");
//         }
//         else{
//             System.out.print("You searched for " +val+ " which was not found");
//         }
//     }

//     public static void findElementUsingBinarySearch(int val, int[] myArray){
//         int low = 0, high = myArray.length - 1, mid = 0; boolean pass = false;
//         Arrays.sort(myArray);
//         System.out.print("\n\nBinary Search only works on sorted array: \n");
//         for (int i : myArray) {
//             System.out.print("["+(low + 1)+"] : "+i + "\n");
//             low++;
//         }
//         low = 0;
//         while(low <= high){
//             mid = (low + high) / 2;
//             if(myArray[mid] == val){
//                 pass = true;
//                 break;
//             }
//             else if(myArray[mid] > val){
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//             }
//         }
//         if(pass){
//             System.out.print("You searched for " + val + " which was found at ["+(mid+1)+"]");
//         }
//         else{
//             System.out.print("You searched for " + val + " which was not found");
//         }
//     }

//     public static void findElementUsingBuiltInBinarySearch(int searchElement, int[] myArray){
//         //binary search needs the array to be sorted..
//         Arrays.sort(myArray);
//         int low = 0;
//         System.out.print("\n\nBinary Search only works on sorted array: \n");
//         for (int i : myArray) {
//             System.out.print("["+(low + 1)+"] : "+ i + "\n");
//             low++;
//         }
//         int index = Arrays.binarySearch(myArray, searchElement);
        
//         if(index >= 0){
//             System.out.print("\nYou searched for " + searchElement + " is found at " + (index+1));
//         }
//         else{
//             System.out.print("You searched for " + searchElement + " is not found!!");
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 11. Write a program that counts the occurance of the number in an element */
// class CountTheOccurance{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array :  ");
//         int size = input.nextInt();

//         int[] myArray = new int[size];

//         System.out.println("Enter the " +size+ " values");
//         for(int i = 0;  i < myArray.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             myArray[i] = input.nextInt();
//         }
//         System.out.print("Enter the element for which you want to find the occurance : ");
//         int occuraceOf = input.nextInt();
//         int count = 0;
//         for(int i = 0; i < myArray.length; i++){
//             if(myArray[i] == occuraceOf){
//                 count++;
//             }
//         }

//         System.out.print("The value " + occuraceOf + " have " + count + " occurances among the entered values!!");
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
/* 12. Write a program that removes the duplicate elements in the array*/
// class RemoveDuplicateElement{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = input.nextInt();

//         int[] array = new int[n];
//         int[] organizedArray = new int[n];
        
//         System.out.print("Enter the " + n + " values\n");
//         for(int i = 0; i < array.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array[i] = input.nextInt();
//         }
        
//         int newSize = 0; //defines the size of the array of later use...
//         for(int i = 0; i < array.length; i++){
//             boolean isDuplicate = false;
//             for(int j = 0; j < newSize; j++){
//                 if(array[i] == organizedArray[j]){
//                     isDuplicate = true;
//                     break;
//                 }
//             }

//             if(!isDuplicate){
//                 organizedArray[newSize] = array[i];
//                 newSize++;
//             }
//         }

//         int[] finalArray = new int[newSize];
//         for(int i = 0; i < newSize; i++){
//             finalArray[i] = organizedArray[i];
//         }

//         System.out.print("The New Array is:\n");
//         int s = 1;
//         for(int i : finalArray){
//             System.out.print("["+s+"] : " + i + "\n");        
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
// /* 13. Write a program that finds the union and intersection of the two arrays*/
// class UnionAndIntersection{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array 1 : ");
//         int aSize = input.nextInt();

//         System.out.print("Enter the size of the array 2 : ");
//         int bSize = input.nextInt();

//         System.out.print("Enter the " + aSize + " values in ARRAY 1 \n");
//         int[] array1 = new int[aSize];
//         for(int i = 0; i < array1.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array1[i] = input.nextInt();
//         }

//         System.out.print("Enter the " + bSize + " values in ARRAY 2 \n");
//         int[] array2 = new int[bSize];
//         for(int i = 0; i < array2.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             array2[i] = input.nextInt();
//         }

//         // Merging two array with no common between them - Union
//         // Getting values which are common in both arrays - Intersection.

//         UnionAndIntersection.performOperation(array1, array2);
//     }

//     public static void performOperation(int[] arr1, int[] arr2){
//         int mergedArray[] = UnionAndIntersection.mergeArrays(arr1, arr2);
//         // System.out.println("The Merged Array : " + Arrays.toString(mergedArray));
//         int[] organizedArray = new int[mergedArray.length];
//         int newSize = 0;
//         for(int i = 0; i < mergedArray.length; i++){
//             boolean isDuplicate = false;
//             for(int j = 0; j < newSize; j++){
//                 if(mergedArray[i] == organizedArray[j]){
//                     isDuplicate = true;
//                     break;
//                 }
//             }

//             if(!isDuplicate){
//                 organizedArray[newSize] = mergedArray[i];
//                 newSize++;
//             }
//         }

//         int[] finalArray1 = new int[newSize];
//         for(int i = 0; i < newSize; i++){
//             finalArray1[i] = organizedArray[i];           
//         }

//         int k = 1;
//         System.out.print("The Union : \n");
//         for(int i : finalArray1){
//             System.out.println("["+(k)+"] : " + i);
//             k++;
//         }

//         int[] duplicateValues = new int[mergedArray.length];
//         int duplicateIndex = 0;

//         for(int i = 0; i < mergedArray.length; i++){
//             for(int j = i+1; j < mergedArray.length; j++){
//                 if(mergedArray[i] == mergedArray[j]){
//                     duplicateValues[duplicateIndex++] = mergedArray[i];
//                 }
//             }
//         }
//         k=1;
//         int finalArray2[] = new int[duplicateIndex];
//         for(int i = 0; i < finalArray2.length; i++){
//             finalArray2[i] = duplicateValues[i];
//         }
//         System.out.print("The Intersection : \n");
//         for(int i : finalArray2){
//             System.out.println("["+(k)+"] : " + i);
//             k++;
//         }
//     }

//     public static int[] mergeArrays(int[] arr1, int[] arr2){
        
//         int mergedArray[] = new int[arr1.length + arr2.length];
//         int index = 0;
//         for(int i = 0; i < arr1.length; i++){
//             mergedArray[index] = arr1[i];
//             index++; 
//         }

//         for(int i = 0; i < arr2.length; i++){
//             mergedArray[index] = arr2[i];
//             index++;
//         }

//         return mergedArray;
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////
// /* 14. Write a program that finds the union and intersection of the two arrays which uses the Set and HashSet */
// import java.util.HashSet;
// import java.util.Set;
// class UnionAndIntersectionHashSet_Set{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of the array 1 : ");
//         int aSize = input.nextInt();
//         System.out.print("Enter the size of the array 2 : ");
//         int bSize = input.nextInt();

//         int[] arr1 = new int[aSize];
//         int[] arr2 = new int[bSize];

//         System.out.print("Enter " + aSize + " values in the Array 1 \n");
//         for(int i = 0; i < arr1.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             arr1[i] = input.nextInt();
//         }
        
//         System.out.print("Enter " + bSize + " values in the Array 2 \n");
//         for(int i = 0; i < arr2.length; i++){
//             System.out.print("["+(i+1)+"] : ");
//             arr2[i] = input.nextInt();
//         }

//         UnionAndIntersectionHashSet_Set.performIt(arr1, arr2);
//     }

//     public static void performIt(int[] arr1, int[] arr2){
//         Set<Integer> obj = new HashSet<>();

//         for(int i = 0; i < arr1.length; i++){
//             obj.add(arr1[i]);
//         }
//         for(int i = 0; i < arr2.length; i++){
//             obj.add(arr2[i]);
//         }

//         System.out.print("\nThe Union of the arrays : \n");
//         int k = 1;
//         for(Integer i : obj){
//             System.out.println("["+k+"] : " + i);
//             k++;
//         }

//         obj.clear();

//         System.out.println("\nThe Intersection of the arrays : ");

//         for(int i = 0; i < arr1.length; i++){
//             obj.add(arr1[i]);
//         }
//         k=1;
//         for(int i = 0; i < arr2.length; i++){
//             if(obj.contains(arr2[i])){
//                 System.out.print("["+k+"] : " + arr2[i]+ "\n");
//                 k++;
//             }
//         }
//     }
// }