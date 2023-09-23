import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("jacque", "jacque@email.com")
    println(gamer1)

    val gamer2 = Gamer("Jeni", "jeni@email.com", "19/09/1992", "Jeni")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "18/09/2000"
        it.usuario = "jacqueskywalker"


    }.also {
        println(gamer1.idInterno)
    }
    println(gamer1)
    gamer1.usuario = "jacque"
    println(gamer1)
}
