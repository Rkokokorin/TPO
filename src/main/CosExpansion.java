package main;

import java.util.stream.LongStream;

public class CosExpansion {
    private static final int n = 8;

    public static double expanse(double x) {
        x = ((x/Math.PI)%2)*Math.PI;
        if (x > Math.PI) x -= 2*Math.PI;
        if (x < -Math.PI) x += 2*Math.PI;

        double result = 0;

        for (int i = 0; i <= n; i++) {
            result += (Math.pow(-1, i) * Math.pow(x, 2*i)) /
                    factorial(2*i);
        }

        return result;
    }
    public static int factorial( int a){
        int result=1;
        while( a>0 ){
        result= result*a;
        a--;
        }
        return result;
    }
}