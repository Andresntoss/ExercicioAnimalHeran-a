package heranca

open class Animal {
    var tamanho: Int = 0
    private set(value){
        field = value
    }
    var peso: Double = 0.0
    var cor: String = ""

    fun alteraTamanho(tamanho: Int){
        if(tamanho > 10) {
            println("Muito acima do normal")
        } else {
            this.tamanho = tamanho
        }

    }

    open fun correr() {
        println("Animal está correndo")
    }
}