import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution2
 * Description:
 *          建立一个哈希表，遍历数组中每一个元素，如果哈希表中存在 target - nums[i]，则返回对应索引数组，
 *          所不存在，则将 num[i] 及对应索引 i 添加至哈希表中
 * @author chuanchuan
 * @version 1.0
 * @create 2026/3/18 10:09
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
