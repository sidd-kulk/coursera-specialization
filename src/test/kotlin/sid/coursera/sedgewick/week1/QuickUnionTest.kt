package sid.coursera.sedgewick.week1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuickUnionTest {

    @Test
    fun `should create union and test connections`() {
        val size = 5
        val quickUnion = QuickUnion(size)

        quickUnion.union(1,2)
        quickUnion.union(2,3)
        quickUnion.union(0,4)

        assert(arrayOf(4, 2, 3, 3, 4) contentEquals quickUnion.state().toTypedArray())
        assert(quickUnion.connected(1,2))
        assert(quickUnion.connected(1,3))
        assertFalse(quickUnion.connected(1,4))

        // exception condition, but should do nothing
        quickUnion.union(10,40)
    }
}