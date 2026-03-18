/**
 * ClassName: Solution1
 * Description:
 *          从索引 i = 0 遍历数组中每一个数，查询该索引后面是否存在值为 target - nums[i] 的元素
 * @author chuanchuan
 * @version 1.0
 * @create 2026/3/18 9:59
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] ==  target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
