package sid.coursera.sedgewick.week1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuickFindTest {

    @Test
    fun `should create union and test connections`() {
        val size = 5
        val unionFind = QuickFind(size)

        unionFind.union(1,2)
        unionFind.union(2,3)
        unionFind.union(0,4)

        assert(arrayOf(0,1,1,1,0) contentEquals unionFind.state().toTypedArray())
        assert(unionFind.connected(1,2))
        assert(unionFind.connected(1,3))
        assertFalse(unionFind.connected(1,4))

        // exception condition, but should do nothing
        unionFind.union(10,40)
    }
}