class MaxConsecutiveOnes{
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1,3,1,1,1,5};
        int count=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                //Update max if current count is Greater
                max=Math.max(max, count);
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
    }
}