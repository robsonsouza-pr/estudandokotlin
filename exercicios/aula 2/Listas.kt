fun main(args: Array<String>){

    //inicializando um Array com um intervalor de números, no caso, de 11 a 15
     var numeros = Array(5,{i-> (i+11)})

    //criando uma lista mutável de String e iterando o array de inteiros
    var texto = mutableListOf<String>()
    for(n in numeros){
        texto.add(n.toString())

    }
    println(texto.toString())

}