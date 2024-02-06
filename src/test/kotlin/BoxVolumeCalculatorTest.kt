import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoxVolumeCalculatorTest {
    @Test
    fun getBoxVolume_ThreeDimensionsProvided_CalculatesCorrectVolume() {
        // given
        val length = 3
        val width = 4
        val height = 5

        // when
        val result = getBoxVolume(length, width, height)

        // then
        assertEquals(60, result)
    }

    @Test
    fun getBoxVolume_TwoDimensionsProvided_CalculatesCorrectVolumeWithDefaultHeight() {
        // given
        val length = 5
        val width = 10
        // Default height is 1

        // when
        val result = getBoxVolume(length, width)

        // then
        assertEquals(50, result)
    }

    @Test
    fun getBoxVolume_NegativeDimensionsProvided_ReturnsNegativeVolume() {
        // given
        val length = -2
        val width = 3
        val height = 4

        // when
        val result = getBoxVolume(length, width, height)

        // then
        assertEquals(-24, result)
    }
}
