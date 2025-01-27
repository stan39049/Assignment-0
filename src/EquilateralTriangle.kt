class EquilateralTriangle(_name: String): Triangle(_name) {
    fun setDimensions(_side: Int){
        super.setDimensions(_side, _side, _side)
    }
}