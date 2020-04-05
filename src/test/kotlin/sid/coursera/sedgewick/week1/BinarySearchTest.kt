package sid.coursera.sedgewick.week1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinarySearchTest {

    @Test
    fun `search for a number in given array iteratively`() {
        val array = arrayOf<Int>(6,0,3,8,7,-5,2,4,-10,101,100)
        val binary = BinarySearch(array)

        assertTrue(binary.searchIterative(0))
        assertTrue(binary.searchIterative(2))
        assertTrue(binary.searchIterative(100))

        assertFalse(binary.searchIterative(9))
        assertFalse(binary.searchIterative(-8))
    }
}