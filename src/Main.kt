fun main() {
    val circle: Shape = Circle()
    val equilateralTriangle: Shape = EquilateralTriangle()
    val square: Shape = Square()
    val triangle: Shape = Triangle()

    print("Enter circle radius: ")
    (circle as Circle).setDimensions(readln().toInt())
    print("Enter equilateral triangle side length: ")
    (equilateralTriangle as EquilateralTriangle).setDimensions(readln().toInt())
    print("Enter square length and height: ")
    (square as Square).setDimensions(readln().toInt(), readln().toInt())
    print("Enter each side length for triangle: ")
    (triangle as Triangle).setDimensions(readln().toInt(), readln().toInt(), readln().toInt())

    println("${circle.name}:")
    println("Dimensions:")
    circle.printDimensions()
    println("Area: ${circle.getArea()}")

    println("${equilateralTriangle.name}:")
    println("Dimensions:")
    equilateralTriangle.printDimensions()
    println("Area: ${equilateralTriangle.getArea()}")

    println("${square.name}:")
    println("Dimensions:")
    square.printDimensions()
    println("Area: ${square.getArea()}")

    println("${triangle.name}:")
    println("Dimensions:")
    triangle.printDimensions()
    println("Area: ${triangle.getArea()}")
}