fun main(args: Array<String>){
    println("Posso adicionar mais peixes? ${ if (canAddFish(10.0, listOf(3,3,3))) "Sim" else "Não"}")
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    println("Tamanho do tanque $tankSize")
    println("Tem decoração $hasDecorations")
    println("Tamanho do peixe $fishSize")
    println("Currentfish ${currentFish.sum()}")
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}