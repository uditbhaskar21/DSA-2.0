package binarySearch;

public class sqrt {
    public static void main(String[] args) {
        int x = 16;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x){
        for(int i=1;i<= x/2;i++){
            if(i*i== x){
                return i;
            }
        }
        return -1;

    }
}
