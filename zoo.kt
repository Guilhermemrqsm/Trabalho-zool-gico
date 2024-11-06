data class Taxonomia(
    val reino: String,
    val filo: String,
    val classe: String,
    val ordem: String,
    val familia: String,
    val genero: String,
    val especie: String
)

class Animal(
    val taxonomia: Taxonomia,
    val apelido: String,
    val origem: String,
    val dieta: String,
    val tipoGaiola: String,
    val localizacaoCela: String
) {
    fun exibirInformacoes() {
        println("Apelido: $apelido")
        println("Origem: $origem")
        println("Dieta: $dieta")
        println("Tipo de Gaiola: $tipoGaiola")
        println("Localização da Cela: $localizacaoCela")
        println("Taxonomia: Reino=${taxonomia.reino}, Filo=${taxonomia.filo}, Classe=${taxonomia.classe}, " +
                "Ordem=${taxonomia.ordem}, Família=${taxonomia.familia}, Gênero=${taxonomia.genero}, Espécie=${taxonomia.especie}")
        println()
    }
}

class Zoo {
    private val animais = mutableListOf<Animal>()

    fun cadastrarAnimal(animal: Animal) {
        animais.add(animal)
        println("Animal cadastrado: ${animal.apelido}")
    }

    fun listarAnimais() {
        if (animais.isEmpty()) {
            println("Nenhum animal cadastrado.")
        } else {
            println("Animais no zoológico:")
            animais.forEach { it.exibirInformacoes() }
        }
    }
}

fun main() {
    val zoo = Zoo()

    val taxonomiaLeao = Taxonomia(
        "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Panthera", "Panthera leo"
    )
    val leao = Animal(
        taxonomiaLeao, "Simba", "África", "Carnívoro", "Savana", "Ala Norte - Cela 3"
    )

    val taxonomiaElefante = Taxonomia(
        "Animalia", "Chordata", "Mammalia", "Proboscidea", "Elephantidae", "Loxodonta", "Loxodonta africana"
    )
    val elefante = Animal(
        taxonomiaElefante, "Dumbo", "África", "Herbívoro", "Selva", "Ala Leste - Cela 5"
    )

    zoo.cadastrarAnimal(leao)
    zoo.cadastrarAnimal(elefante)

    zoo.listarAnimais()
}