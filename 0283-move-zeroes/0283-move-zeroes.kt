class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var index = 0

         for (num in nums) {
            if (num != 0) {
                nums[index] = num
                index++
            }
        }
        while (index < nums.size) {
            nums[index] = 0
            index++
        }
        
    }
}