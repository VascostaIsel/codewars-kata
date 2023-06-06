import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
  
  @Test
  fun basicTests() {
    assertEquals(true, include(intArrayOf(1,2,3,4), 2))
    assertEquals(false, include(intArrayOf(1,2,4,5), 3))
  }
  
}
