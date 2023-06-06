import kotlin.test.assertEquals
import org.junit.Test

class AbbrevNameTest {
    
  @Test
  fun basicTests() {
        assertEquals("S.H", abbrevName("Sam Harris"));
        assertEquals("P.F", abbrevName("Patrick Feenan"));
        assertEquals("E.C", abbrevName("Evan Cole"));
        assertEquals("P.F", abbrevName("P Favuzzi"));
        assertEquals("D.M", abbrevName("David Mendieta"));
    }
  
}