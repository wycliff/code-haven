/*Strategy
Select the largest/ Smallest  item and put it in its correct place
Select the next largest item and put it in its correct place, etc
*/


package selectionsort;

//This code sorts the in non-decreasing order (Smallest to the largest)
public class SelectionSort {

   
   
    public static void main(String[] args) {
        // TODO code application logic here
        Comparable[] item= {7,12,5,8,3,6};
        selectionSort(item,item.length );
        
    }
    
/** Precondition: size <= item.length; item[0]...item[size-1]
* are non-null values all Comparable to each other.
* Postcondition: The array contains the values it initially
* had but with item[0]...item[size-1] in ascending order.
*/
    
   
 public static void selectionSort (Comparable[] item, int size)
{ 
    /*The loop below changes the position of start to the  next index. 
    Starting with k=0, 1, 2, ... , size-1
    */
    for (int k = 0; k < size - 1; k++){
    swapMinToFront (item, k, size - 1);
    System.out.println(item[k]);
    
    }
    
//    for(int k=0; k< size ; k++){
//    System.out.println(item[k]);
//    }

} //=======================


private static void swapMinToFront (Comparable[] item, int start, int end)
{ 
    /*
    This code (below) it finds the smallest to the right of element 'start'(depending on the element being considered)
    */
int indexSmallest = start;


for (int k = start + 1; k <= end; k++)
{ 
    if (item[k].compareTo (item[indexSmallest]) < 0)   /*compareTo => 1st-2nd  if soln < 0  the second is greater than first*/
     indexSmallest = k; // small
}
 
// below is just the very code to SWAP
Comparable saved = item[start];  // save initial start value in save
item[start] = item[indexSmallest]; // Assign new smallest first position 
item[indexSmallest] = saved; // put saved initial start value in place where smallest was.

} //=======================
    
}
