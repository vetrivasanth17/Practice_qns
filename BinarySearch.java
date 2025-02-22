public class BinarySearch {
    public static void main(String[] args) {

        int[]  arr={3,9,16,27,32,34,56,67,77};
        int key=67;
        int first=0;
        int end=arr.length-1;
        int mid;

        while(first<=end){
            mid=(first+end)/2;

            if(arr[mid]==key){//Compare Key with mid Index
                System.out.println("Element found at Index: "+mid);
                return;//Exit Ater Finding the Element
            }

           else if(arr[mid]<key){
                first=mid+1;//Search in the Right Half
            }

            else{
                end=mid-1;//Search in Left Half
            }
        }

        System.out.println("Element not found");
    }
}
