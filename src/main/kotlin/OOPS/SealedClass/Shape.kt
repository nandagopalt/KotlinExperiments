package OOPS.SealedClass

sealed class Shape {
    class Square(var length: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
    class Circle(var radius: Int) : Shape()
    object NotAShape : Shape()
}

fun evaluateShape(shape: Shape) {
    when (shape) {
        is Shape.Square -> println("Area of Square is  ${shape.length * shape.length}")
        is Shape.Rectangle -> println("Area of Rectangle is ${shape.length * shape.breadth}")
        is Shape.Circle -> println("Area of Circle is ${Math.PI * (shape.radius * shape.radius)}")
        is Shape.NotAShape -> println("Not a shape")
    }
}

fun main() {
    evaluateShape(Shape.Square(11))
    evaluateShape(Shape.Rectangle(2, 3))
    evaluateShape(Shape.Circle(11))
    evaluateShape(Shape.NotAShape)
}
