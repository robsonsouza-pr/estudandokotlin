import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()

//exemplo de template string
    var numero: Int = args[0].toInt()
    println("${if (numero < 12) "Bom dia," else "Boa tarde, "}Kotlin!")
}

//exemplo de como usar funções
fun dayOfWeek(){

    println("Que dia é hoje?")

    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1->println("Domingo")
        2->println("Segunda")
        3->println("TerÇa")
        4->println("quarta")
        5->println("quinta")
        6->println("sexta")
        else -> println("Sábado")
    }
}