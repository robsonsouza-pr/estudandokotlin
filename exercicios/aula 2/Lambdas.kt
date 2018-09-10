import java.lang.Math.random
import java.util.*

fun main (args: Array<String>){
    /* MIND BLOW: QUYANDO VC ADICIONA UM LAMBDA A UMA VARIÁVEL, TRANSFORMA A VARIÁVEL EM FUNÇÃO!!!*/
    var random1 = random()
    var random2 = {random()}

    println(random2())
    println(random2())
    println(random2())

    //random1 trouxe sempre o mesmo valor
    //já o random2  sempre vai mudar o valor, porque o kotlin executa a função toda vez que a variável for acessada

    /*mais lambdas, não entendi porra nenhuma
    não imprime o valor desses lambdas do caralho*/
    val rolarDado = { Random().nextInt(12)+1}
    println(rolarDado())

    /*
    val rolarDado = {sides: Int -> Random().nextInt(sides)+1}
    println(rolarDado)
    */

    /*
    val rolarDado = {sides: Int ->
        if (sides == 0 )0
        else Random().nextInt(sides)+1}
    println(rolarDado)
    */

   /* val rolarDado : (Int)-> Int = {sides: Int ->
        if (sides == 0 )0
        else Random().nextInt(sides)+1}
    println(rolarDado(0))*/
}