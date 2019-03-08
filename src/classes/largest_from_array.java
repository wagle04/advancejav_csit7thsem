

package classes;

public class largest_from_array {
    public static void main(String args[]){
    int arr[]={43,12,54,78,90,1,45,67,88};
    int largest=arr[0];
    for (int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    System.out.println("Largest from array is "+largest);
    }
}
