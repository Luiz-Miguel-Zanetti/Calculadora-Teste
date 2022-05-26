import classes.Calculadora

fun main() {

    while ( true ){

        println("                                         Bem vindo a calculadora do Luiz Miguel                               ")
        println()
        println( "Para começarmos, digite qual operação matematica deseja realizar." )
        println()
        println("1- Soma")
        println("2- Subtração")
        println("3- Multiplicação")
        println("4- Divisão")
        println("5- Raiz")
        println("6- Potência")
        println("7- Desligar Calculadora")
        println()

        print("Digite a sua opção: ")
        val opçaoEscolhida = readln().toInt()

          when(opçaoEscolhida){

              1->{

                  print("Digite o valor 1: ")
                  var n1 = readln().toDouble()
                  print("Digite o valor 2: ")
                  var n2 = readln().toDouble()

                  println()


                  println("A soma entre $n1 e $n2 é : ${Calculadora.soma(n1, n2)} ")

                  println()

              }

              2 ->{

                  print("Digite o valor 1: ")
                  var n1 = readln().toDouble()
                  print("Digite o valor 2: ")
                  var n2 = readln().toDouble()

                  println()


                  println("A subtração entre $n1 e $n2 é : ${Calculadora.subtração(n1, n2)} ")

                  println()


              }

              3 ->{

                  print("Digite o valor 1: ")
                  var n1 = readln().toDouble()
                  print("Digite o valor 2: ")
                  var n2 = readln().toDouble()

                  println()


                  println("A multiplicação entre $n1 e $n2 é : ${Calculadora.multiplicação(n1, n2)} ")

                  println()


              }

              4 ->{

                  print("Digite o valor 1: ")
                  var n1 = readln().toDouble()
                  print("Digite o valor 2: ")
                  var n2 = readln().toDouble()

                  println()


                  println("A divisão entre $n1 e $n2 é : ${Calculadora.divisão(n1, n2)} ")

                  println()


              }

              5->{

                  print("Digite o valor para achar sua raiz: ")
                  var n1 = readln().toDouble()

                  println()

                  println("A raiz quadrada do valor $n1 é :${Calculadora.raiz(n1)}")

                  println()
              }

              6->{

                  print("Digite a base : ")
                  var n1 = readln().toDouble()
                  print("Digite o expoente : ")
                  var n2 = readln().toDouble()

                  println()

                  println("A potência da base $n1 no expoente $n2 é ${Calculadora.potencia(n1, n2)}")

                  println()


              }

              7->{
                  println()
                  println("Calculadora desligada!")
                  break


              }

          }

    }



}