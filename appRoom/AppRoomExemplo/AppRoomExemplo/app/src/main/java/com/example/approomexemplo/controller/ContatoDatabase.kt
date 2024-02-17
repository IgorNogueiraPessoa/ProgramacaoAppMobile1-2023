//esta classe efetua a conexao com o banco
package com.example.approomexemplo.controller

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contato::class],//referenciando a entidade da classe Contato (A tabela)
    version = 1
)

abstract class ContatoDatabase: RoomDatabase() {
    abstract val dao: ContatoDao
}