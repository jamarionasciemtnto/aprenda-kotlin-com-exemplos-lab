// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO, MASTER }

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nome: String,var cpf: String,var dataNascimento: String,var email: String) {
     println("Usuário cadastrado")
     println("Nome: $nome")
     println("CPF: $cpf")
     println("Data de nasciimento: $dataNascimento")
     println("Email de acesso: $email")
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 540)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
//         TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
