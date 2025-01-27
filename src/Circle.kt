class Circle(_name: String) : Shape(_name) {
    private var radius: Int = 0

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double{
        return Math.PI * radius * radius
    }

    fun setDimensions(rad: Int){
        radius = rad
    }
}
