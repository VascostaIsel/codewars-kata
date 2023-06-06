import org.junit.Assert.assertEquals
import org.junit.Test

class GrassHopperTest {
    
  @Test
  fun basicTests() {
    assertEquals(1, GrassHopper.summation(1))
    assertEquals(36, GrassHopper.summation(8))
  }
  
}
