fun main(args: Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    //filtrando uma lista.
    //traga todas que contenham curry e ordene pelo tamanho
    var curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(curries.toString())

    //todas que comecam com c e terminam com e
    var novaLista = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    println(novaLista.toString())

    //pegue os três primeiros que comecem com c
    var lista3 = spices.take(3).filter { it.startsWith('c') }
    println(lista3.toString())
}