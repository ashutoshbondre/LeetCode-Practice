public class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0)
        {
            int a = n%10;
            sum=sum+(a*a);
            n=n/10;
        }
        if(sum>9)
        {
            return isHappy(sum);
        }
        if(sum==1 || sum==7)
        return true;
        return false;
    }
}
