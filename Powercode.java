public class Powercode{
    public static void main(String args[]){
        int ans = Power(3, 2);
        System.out.println(ans);
    }
    public static int Power(int n , int k ){
        if(n==0){
            return 1;
        }
        return  k* Power(n-1, k);
    }
}