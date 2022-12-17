class Calculator {
    var num1: Float = 0f
        get() = field
        set(value) { field = value }


    var num2: Float = 0f
        get() = field
        set(value) { field = value }


    //Adds two numbers and returns the sum.
    fun add() : Float {
        return num1 + num2
    }


    //Subtracts num2 from num1 and returns the product.
    fun subtract() : Float {
        return num1 - num2
    }


    //Multiplies two numbers and returns the product.
    fun multiply() : Float {
        return num1 * num2
    }


    //Divides two numbers and returns the quotient.
    fun divide() : Float {
        if(num2 == 0f) {
            return 0f
        }
        return num1 / num2
    }


}