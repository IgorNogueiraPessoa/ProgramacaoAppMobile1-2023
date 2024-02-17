//classe de modelagem
package com.example.approomexemplo.model

data class Contato(
    val contato: List<Contato> = emptyList(),
    val nome: String = "",
    val sobrenome: String = "",
    val telefone: String = ""
)
