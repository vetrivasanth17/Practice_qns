public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr={5,4,3,2,1};

        //Two pointers approach
        int start=0;
        int end=arr.length-1;

        while(start<end){
            //swap arr[start] and arr[end]
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        
        //print the reversed Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    } 
}
