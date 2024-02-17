//esta classe define as valores(entidades) da tabela
package com.example.approomexemplo.controller

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contato")//este recurso só fica definido após implementação dos plugins
data class Contato(
    //campos da tabela, dentro do parametro da classe
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val sobrenome: String,
    val telefone: String
)
