public class Solution {
    public int trap(int[] a) {
        int res=0;
        int n = a.length;
        int left =0;
        int right =n-1;
        int maxleft=0;
        int maxright=0;
        while(left<=right)
        {
            if(a[left]<=a[right])
            {
                if(a[left]>=maxleft) maxleft=a[left];
                else
                res+=maxleft-a[left];
                left++;
            }
            else
            {
                if(a[right]>maxright) maxright=a[right];
                else res+=maxright-a[right];
                right--;
            }
        }
        return res;
    }
}