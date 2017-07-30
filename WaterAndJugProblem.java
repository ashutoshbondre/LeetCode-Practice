public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y==z || x==z || y==z) return true;
        if(x+y<z) return false;
        int gcd = GCD(x,y);
        return z%gcd==0;
    }
    public int GCD(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

// https://www.youtube.com/watch?v=0Oef3MHYEC0