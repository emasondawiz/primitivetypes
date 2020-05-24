package example
import org.scalatest.WordSpec

class FunctionsSpecs extends WordSpec {
    "The max function should return the highest value between two integers" in {
        val highest=Function.max(8,3)
        assert(highest == 8)
    }
    "The power of the number to be returned is" in {
        val power=Function.power(3)
        assert(power == 9)
    }
    "The isOddNumber returns a boolean" in {
        val isodd=Function.isOddNumber(5)
        assert(isodd==false)
    }
}