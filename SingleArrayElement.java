public class SingleArrayElement{
    public static void main(String[] args) {
        int[] arr={1,2,1,4,2};

        int result=0;
        for(int i=0;i<arr.length;i++){
            //XOR each element with result
            result ^=arr[i];
        }

        System.out.println("Single number is :"+result);

    }
}
