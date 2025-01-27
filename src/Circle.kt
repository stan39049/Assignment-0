class Circle() : Shape("Circle") {
    private var radius: Int = 0

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double{
        return Math.PI * radius * radius
    }

    fun setDimensions(_radius: Int){
        radius = _radius
    }
}
