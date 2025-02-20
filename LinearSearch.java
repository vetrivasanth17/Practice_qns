public class LinearSearch {
    public static void main(String... args) {
        int arr[]={1,3,6,9,8,4};
        int key=9;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                //Exit program once found
                return;
            }
        }
        
        System.out.println("Element not found");
    }
}
