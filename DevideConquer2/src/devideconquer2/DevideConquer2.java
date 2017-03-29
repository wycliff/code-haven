package devideconquer2;

/**
 *
 * @author Wycliffe , Finding the minimum and the maximum using a recursive devide and conquer algorithm
 */
public class DevideConquer2 {

     private static  int S[]={100,40,21,72,120,8,7,14,52,47,90,180,13,17,19,1};
     private static int max;
     private static int min;
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        max= findMax(0, S.length-1);
        System.out.println("Max: " + max);
        
        min= findMin(0, S.length-1);
        System.out.println("Min: " + min);
        
        
       
    }
    
    private static int findMax(int a , int b){
        
        if(b-a==1)
            return S[a]>S[b]?S[a]:S[b];
        else if(a==b)
            return S[a];
        
        return Math.max( findMax(a, (a+b)/2),findMax ((a+b)/2 +1,  b));
        
    }
    
     private static int findMin(int a , int b){
        
         //The initial conditions
        if(b-a==1)
            return S[a]<S[b]?S[a]:S[b];
        
        else if(a==b)
            return S[a];
        
         //The recursive call 
        return Math.min( findMin(a, (a+b)/2), findMin ((a+b)/2 +1,  b));
        
    }
    
    
}


//So far in DAA 
/* a) Finding max and min using devide and conquer 
   b) Merge sort algorithm implemented 
*/
