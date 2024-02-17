//tela de interface que exibe os contatos cadastradados
package com.example.approomexemplo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.approomexemplo.controller.ContatoAcoes
import com.example.approomexemplo.model.Contato

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContatoTela(
    estado: Contato,
    evento: (ContatoAcoes) -> Unit
){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    evento(ContatoAcoes.VisualizarDialog)
                }
            ){
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Adicionar Contato"
                )
            }
        }
    ){_ ->

    }
}