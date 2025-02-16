import java.util.Arrays;
class DoubleArrayElements{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            //Multiply each elements by 2 and store in new array
            b[i]=a[i]*2;
        }
System.out.println(Arrays.toString(b));
 }
}