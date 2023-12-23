class Aluno(val id: Long, var nome: String)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String,
                    val nivel: Nivel = Nivel.BASICO,
                    var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) { inscritos.add(aluno) }
}

fun main() {
    val listaDeConteudos = listOf<ConteudoEducacional>()
    val formacao = Formacao(nome = "Formação DIO em Kotlin",
                            nivel = Nivel.INTERMEDIARIO,
                            conteudos = listaDeConteudos)
    
    formacao.matricular(Aluno(1, "Cláudia"))
    formacao.matricular(Aluno(2, "Rogério"))
    
    println(formacao.inscritos)
}
