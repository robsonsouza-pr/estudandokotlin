fun main(args: Array<String>){
    println("O que devo fazer hoje? ${OqueVouFazerHoje("feliz", "chuvoso", temperatura = 40)}")
}

fun OqueVouFazerHoje(mood: String, weather: String = "ensolarado", temperatura: Int = 24):String{

    //Sem colocar parametro no when ele funciona como um if else e vai testando todas as possibilidades
    //dá break na primeira que satisfazer
    return when{
        isFelixEnsolarado(mood, weather) -> "Vou caminhar"
        isTristeChuvosoEFrio(mood, weather, temperatura)->"Ficar na cama"
        isMuitoQuente(temperatura)-> "Vou nadar"
        else -> "Vou ficar de boa em casa"
    }

}

//funções simplificadas, não vejo muita utilidade, mas enfim
fun isMuitoQuente(temperatura: Int) = temperatura > 35
fun isTristeChuvosoEFrio(mood: String, weather: String, temperatura: Int) = mood=="triste" && weather == "chuvoso" && temperatura == 0
fun isFelixEnsolarado(mood: String, weather: String) = mood == "feliz" && weather =="ensolarado"