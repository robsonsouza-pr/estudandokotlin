
fun main(args: Array<String>) {
    var sorte: String

    for (i in 1..19) {

        var aniversario = getAniversario()
        sorte = getMensagemBixcoitoDaSorte(aniversario)
        println("Sua sorte é $sorte")

        if (sorte.contains("Não foi dessa vez")) break
    }
}

fun getMensagemBixcoitoDaSorte(aniversaio: Int ): String{
    //criando lista
    var mensagens = mutableListOf("Não foi dessa vez","Não fuja de si mesmo","Vai Corintia!","Maloqueiro e sofredor")

    //tudo no Kotlin possui valor, o when tb. o valor dele é a última linha que ele passar
    //por isso, é obrigatorio ter um else. isso garante que ele vá passar por todas as possibilidades
    var index = when(aniversaio){
        in 1..20 ->3
        21,31 -> 2
        else -> aniversaio.rem(mensagens.size)
    }
    return mensagens[index]
}

fun getAniversario(): Int {
    //usando a funlção print
    print("\nQual o dia do seu aniversario")

    //capturando algo do teclado
    return readLine()?.toIntOrNull() ?: 1
}