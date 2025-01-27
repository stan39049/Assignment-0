class Square(_name: String) : Shape(_name) {
    private var length: Int = 0
    private var height: Int = 0

    override fun printDimensions() {
        println("length: $length")
        println("length: $height")
    }

    override fun getArea(): Double{
        return (length * height).toDouble()
    }

    fun setDimensions(_length: Int, _height: Int){
        length = _length
        height = _height
    }
}