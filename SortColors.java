import java.util.Arrays;
public class SortColors{
    public static void sort(int[] nums) {
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
    }
}

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
public static void main(String[] args){
int nums[]={1,0,2,0,0,2,1,0};
sort(nums);
System.out.println(Arrays.toString(nums));
}
}
