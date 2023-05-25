import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return backtrack(nums, 0, 0, target, memo);
    }
    
    public int backtrack(int[] nums, int i, int sum, int target, Map<String, Integer> memo) {
        if (i == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        
        String key = i + "-" + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int positive = backtrack(nums, i + 1, sum + nums[i], target, memo);
        int negative = backtrack(nums, i + 1, sum - nums[i], target, memo);
        
        int totalCount = positive + negative;
        memo.put(key, totalCount);
        
        return totalCount;
    }
}
