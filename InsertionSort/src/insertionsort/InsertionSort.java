
package insertionsort;

/* This algorithm has as sorted and unsorted partiotions
*/
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Comparable[] item= {7,12,5,8,3,6};
          insertionSort(item,item.length );
    }
    
/*
* Precondition: size <= item.length; item[0]...item[size-1]
* are non-null values all Comparable to each other.
* Postcondition: The array contains the values it initially
* had but with item[0]...item[size-1] in ascending order.
*/
    
public static void insertionSort (Comparable[] item, int size)
{
     /*
        The loop below changes the position of start to the  next index. 
        Starting with k=0, 1, 2, ... , size-1
     */
    for (int k = 1; k < size; k++){
    insertInOrder (item, k);
    }
    
    for (int k = 1; k < size; k++){
    System.out.println(item[k]);
    }
    
    
} //=======================


private static void insertInOrder (Comparable[] item, int m)
{ 
    
Comparable save = item[m];
for (; m > 0 && item[m - 1].compareTo (save) > 0; m--){
item[m] = item[m - 1]; //progressive shifts to right, of numbers after comparison with the no in consideration

}
    
item[m] = save; //putting our saved to the m index finally reached.(inserting)
                //by this point the value of m has changesd to the place where the copied/saved value of m ca be inserted
                //the hange occurred in the above loop 
} //=======================
    
}
