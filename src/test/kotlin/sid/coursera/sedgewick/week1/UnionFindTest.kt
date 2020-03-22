package sid.coursera.sedgewick.week1

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class UnionFindTest {

    @Test
    fun `should create union and test connections`() {
        val size = 5
        val unionFind = UnionFind(size)

        unionFind.union(1,2)
        unionFind.union(2,3)
        unionFind.union(0,4)

        assert(arrayOf(0,1,1,1,0) contentEquals unionFind.state().toTypedArray())
        assert(unionFind.connected(1,2))
        assert(unionFind.connected(1,3))
        assertFalse(unionFind.connected(1,4))
    }
}