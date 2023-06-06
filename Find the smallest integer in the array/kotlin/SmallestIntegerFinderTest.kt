import kotlin.test.assertEquals
import org.junit.Test

class SmallestIntegerFinderTest {

  @Test
  fun basicTests() {
    val sif: SmallestIntegerFinder = SmallestIntegerFinder()
    assertEquals(10, sif.findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
  }
  
}
