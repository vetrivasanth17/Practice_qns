public class SmallestArrayElement {
    public static void main(String[] args) {
        int[] arr={45,67,32,29,78};
        int small=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                //Update small if Smallest element is found
                small=arr[i];
            }
        }
        
        System.out.println("Smallest element is :"+small);
    }
}
