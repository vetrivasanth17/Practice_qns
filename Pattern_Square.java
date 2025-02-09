public class Pattern_Square {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    // Print '*' for the border (first row, last row, first column, last column)
                    System.out.print("*");
                }
                else{
                    // Print space for the inner part of the square
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
