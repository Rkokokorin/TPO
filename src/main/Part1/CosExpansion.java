package main.Part1;
public class CosExpansion {
    private static final int n = 10;
    public static double expanse(double x) {
        x = ((x/Math.PI)%2)*Math.PI;
        if (x > Math.PI) x -= 2*Math.PI;
        if (x < -Math.PI) x += 2*Math.PI;
        double result=0;
        for (int i = 0; i <= n; i++) {
            result += (Math.pow(-1, i) * Math.pow(x, 2*i)) /
                    factorial(2*i);
        }
        return result;
    }
    public static long factorial( int a){
        long result=1;
        while( a>0 ){
        result= result*a;
        a--;
        }
        return result;
    }
}