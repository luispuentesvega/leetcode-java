import java.util.HashMap;

class TwoSum {

    public static void main(String[] args) {
        TwoSum mySum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = mySum.twoSum(nums, target);
        System.out.print("["+res[0]+","+res[1]+"]\n");
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res[] = new int[2];
        for (int i=0; i < nums.length; i++){
            int remaining = target - nums[i];
            if (map.get(remaining) != null) {
                res[0] = map.get(remaining);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}