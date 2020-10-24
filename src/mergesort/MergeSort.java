
package mergesort;

/**
 *
 * @author DELL
 */
public class MergeSort {

   
     // declare and array of hundred elements
     static int[] arr = {100,91,99,92,98,93,97,94,96,95,90,81,89,82,88,83,87,84,86,85,80,71,79,72,78,73,77,74,76,75,70,69,68,67,66,65,64,63,62,61,60,51,59,52,58,53,57,54,56,55,50,41,49,42,48,43,47,44,46,45,40,31,39,32,38,33,37,34,36,35,30,21,29,22,28,23,27,24,26,25,20,11,19,12,18,13,17,14,16,15,10,1,9,2,8,3,7,4,6,5};
    
     // declare workspace
     static int[] workSpace = new int[100];
     public static void main(String[] args) {
        
         System.out.println("before merge sort");
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i]+" ");
        }

        
recMergeSort(workSpace,0,99);


         System.out.println("\nafter merge sort");
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i]+" ");
        } 
        
       
        

       
        
    }
            
 public static void recMergeSort(int[] workSpace, int lowerBound,int upperBound)
{
if(lowerBound == upperBound) // if range is 1,
return; // no use sorting
else
{ // find midpoint
int mid = (lowerBound+upperBound) / 2;
// sort low half
recMergeSort(workSpace, lowerBound, mid);
// sort high half
recMergeSort(workSpace, mid+1, upperBound);
// merge them
merge(workSpace, lowerBound, mid+1, upperBound);
} 
}
      
public static void merge(int[] workSpace, int lowPtr,int highPtr, int upperBound)
{
int j = 0; // workspace index
int lowerBound = lowPtr;
int mid = highPtr-1;
int n = upperBound-lowerBound+1; // # of items
while(lowPtr <= mid && highPtr <= upperBound)
if( arr[lowPtr] < arr[highPtr] )
    workSpace[j++] = arr[lowPtr++];
else
    workSpace[j++] = arr[highPtr++];
while(lowPtr <= mid)
    workSpace[j++] = arr[lowPtr++];
while(highPtr <= upperBound)
    workSpace[j++] = arr[highPtr++];
for(j=0; j<n; j++)
    arr[lowerBound+j] = workSpace[j];
}
    
}