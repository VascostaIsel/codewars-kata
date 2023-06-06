import kotlin.test.assertEquals
import org.junit.Test

class TestExample {

    @Test 
    fun basicTests() {
        assertEquals("aaaa", repeatStr(4, "a"))
        assertEquals("HelloHelloHello", repeatStr(3, "Hello"))
        assertEquals("", repeatStr(5, ""))
        assertEquals("", repeatStr(0, "kata"))
    }

}
