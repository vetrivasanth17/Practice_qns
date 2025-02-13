import java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};

        //calculate total length of merged Array
        int length=arr1.length+arr2.length;
        int[] merged=new int[length];

        for(int i=0;i<arr1.length;i++){
            merged[i]=arr1[i];
        }

        for(int j=0;j<arr2.length;j++){
            //Start placing arr2 element after arr1
            merged[arr1.length+j]=arr2[j];
        }
        
        System.out.println(Arrays.toString(merged));
    }
}
