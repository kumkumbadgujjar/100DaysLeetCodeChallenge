class Solution {
    fun thirdMax(nums: IntArray): Int {
        var first: Long? = null
        var second: Long? = null
        var third: Long? = null

        for (num in nums) {
            val n = num.toLong()

            if (n == first || n == second || n == third) {
                continue
            }

            if (first == null || n > first!!) {
                third = second
                second = first
                first = n
            } 
            else if (second == null || n > second!!) {
                third = second
                second = n
            } 
            else if (third == null || n > third!!) {
                third = n
            }
        }

         return if (third == null) {
            first!!.toInt()
        } else {
            third!!.toInt()
        }

        
    }
}