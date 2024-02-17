//classe da interface do cadastro
//as instruções daqui serao chamadas no main activity
package com.example.approomexemplo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.approomexemplo.controller.ContatoAcoes
import com.example.approomexemplo.model.Contato
import androidx.compose.material3.Text as Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdicionarDialog(
    modifier: Modifier = Modifier,
    estado: Contato,
    evento: (ContatoAcoes) -> Unit
){
    AlertDialog(
    modifier = modifier,
        onDismissRequest = {
            
        },
        title = { Text(text = "Adicionar Contato") },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
            ///campo nome
            TextField(
              value =  estado.nome,
                onValueChange = {
                  evento(ContatoAcoes.SetNome(it))
                },
                placeholder = {
                    Text(text = "Nome")
                }
              )
               ////campo sobrenome
                TextField(
                    value =  estado.sobrenome,
                    onValueChange = {
                        evento(ContatoAcoes.SetSobrenome(it))
                    },
                    placeholder = {
                        Text(text = "Sobrenome")
                    }
                )

                ///campo telefone
                TextField(
                    value =  estado.telefone,
                    onValueChange = {
                        evento(ContatoAcoes.SetTelefone(it))
                    },
                    placeholder = {
                        Text(text = "Telefone")
                    }
                )
            }
        },
        confirmButton = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterEnd
            ){
                Button(
                    onClick = {
                        evento(ContatoAcoes.CadastrarContato)//conversa com a classse contatoacoes
                    }
                ) {
                    Text(text = "Cadastrar")
                }
            }
        }
    )
}