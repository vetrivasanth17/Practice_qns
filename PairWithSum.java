public class PairWithSum {
    public static void main(String[] args) {
        int[] arr={1,2,4,0,5,3,7,6};
        int target=7;

        for(int i=0;i<arr.length;i++){
            //start from next element to avoid duplicates
            for(int j=i+1;j<arr.length;j++){
                //check if the sum equals the target
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+", "+arr[j]+")");
                }
            }
        }

    }
}
