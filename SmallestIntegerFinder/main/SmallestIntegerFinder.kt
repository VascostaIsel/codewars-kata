class SmallestIntegerFinder {

  fun findSmallestInt(nums: List<Int>): Int {
    var num = nums.first()
    nums.forEach { n -> if (n < num) num = n }
    return num
  }

}
