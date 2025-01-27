import kotlin.math.sqrt

open class Triangle(_name: String = "Triangle") : Shape(_name) {
    private var side1: Int = 0
    private var side2: Int = 0
    private var side3: Int = 0

    override fun printDimensions() {
        println("Side 1: $side1")
        println("Side 2: $side2")
        println("Side 3: $side3")
    }

    override fun getArea(): Double{
        val halfPerimeter = (side1 + side2 + side3).toDouble()/2
        return sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3))
    }

    fun setDimensions(_side1: Int, _side2: Int, _side3: Int){
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }
}