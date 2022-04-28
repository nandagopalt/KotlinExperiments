sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
class Multiply(val left: Expr, val right: Expr): Expr()
object NotANumber: Expr()

fun eval(e: Expr): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        is Multiply -> eval(e.left) + eval(e.right)
        is NotANumber -> java.lang.Double.NaN
    }

fun main() {

}