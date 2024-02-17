//setando os valores
package com.example.approomexemplo.controller

sealed interface ContatoAcoes{
    object CadastrarContato: ContatoAcoes
    object VisualizarDialog: ContatoAcoes
    object OcultarDialog: ContatoAcoes

    data class SetNome(val nome: String): ContatoAcoes
    data class SetSobrenome(val sobrenome: String): ContatoAcoes
    data class SetTelefone(val telefone: String): ContatoAcoes
}