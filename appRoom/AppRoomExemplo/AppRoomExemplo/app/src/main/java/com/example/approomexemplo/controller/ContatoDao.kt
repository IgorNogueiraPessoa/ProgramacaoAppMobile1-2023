//classe responsável por fazer a manipulação dos comandos Data Acces Object
//Interface para fazer o caminho entre a tela e o banco

package com.example.approomexemplo.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao//anotation do pacote room
interface ContatoDao {
    @Upsert //update e insert de forma única
    suspend fun upsertContato(contato: Contato)

    @Delete
    suspend fun deleteContato(contato: Contato)

    //trazer todos os dados da tabela atraves do flow(lista)
    @Query("SELECT * FROM contato ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome(): Flow<List<Contato>>

    @Query("SELECT * FROM contato ORDER BY sobrenome ASC")
    fun getContatoOrdenadoPeloSobrenome(): Flow<List<Contato>>

    @Query("SELECT * FROM contato ORDER BY telefone ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>
}