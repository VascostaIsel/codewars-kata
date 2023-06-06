class SmallestIntegerFinder {

  fun findSmallestInt(nums: List<Int>): Int = nums.minOrNull() ?: nums.first()

}
