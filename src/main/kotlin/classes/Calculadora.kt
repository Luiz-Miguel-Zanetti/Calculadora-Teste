package classes

class Calculadora {

    companion object{

        fun soma( n1: Double, n2 : Double ): Double {
          //TODO("Faça a soma dos dois valores")


            return n1 + n2

        }

        fun multiplicação(n1: Double, n2 :Double) : Double{
            //TODO("Faça a multiplicação dos dois valores")
            return n1 * n2
        }

        fun subtração(n1 : Double, n2 : Double) : Double{
            //TODO("Faça a subtração dos dois valores")
            return n1 - n2

        }

        fun divisão(n1 : Double , n2 : Double) : Double {
            //TODO("Faça a divisão dos dois valores")
            return n1 /n2
        }

        fun raiz ( n1 : Double ): Double {
            //TODO("Ache a raiz quadrada do valor")
            return Math.sqrt(n1)


        }


        fun potencia( n1 : Double, n2 : Double ): Double{
           //TODO("Faça a potência do valor")

            return Math.pow(n1, n2)

        }

    }

}