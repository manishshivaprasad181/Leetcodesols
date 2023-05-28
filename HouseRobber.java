class Solution {
    public int [] memo;
    public int rob(int[] nums) {
        memo=new int[100];
        Arrays.fill(memo,-1);
        return robfrom(0,nums);
        
    }
    public int robfrom(int i,int[]nums){
        if(i>=nums.length)
        return 0;
        if(memo[i]>-1)
        return memo[i];
        int ans=Math.max(robfrom(i+1,nums),robfrom(i+2,nums)+nums[i]);
        memo[i]=ans;
        return ans;
    }
}
