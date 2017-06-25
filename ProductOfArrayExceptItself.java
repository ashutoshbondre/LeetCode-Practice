public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
int products[] = new int [nums.length];

// Get the products below the current index
int p=1;
for(int i=0;i<N;++i) {
  products[i]=p;
  p*=nums[i];
}

// Get the products above the curent index
p=1;
for(int i=N-1;i>=0;--i) {
  products[i]*=p;
  p*=nums[i];
}
return products;
    }
}