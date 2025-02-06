public class LargestElement {
    public static void main(String[] args) {
        int arr[]={3,7,4,2};
        int largest=arr[0];

        for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){

            //Update largest if bigger element is found
            largest=arr[i];
        }
    }

    //print largest element in an Array
    System.out.println("Largest element is :"+largest);  
  }
}
