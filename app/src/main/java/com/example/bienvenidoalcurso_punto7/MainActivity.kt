package com.example.bienvenidocurso_punto7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidoalcurso_punto7.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Punto7Vista()
            }
        }
    }
}

@Composable
fun Punto7Vista() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        // Título principal
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        // Subtítulo o mensaje adicional
        Text(
            text = "Hello, Student!",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo de texto
        BasicTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            decorationBox = { innerTextField ->
                Text(
                    text = "Enter your name",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 16.sp
                )
                innerTextField()
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Botones en fila
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { /* Acción aceptar */ }, colors = ButtonDefaults.buttonColors()) {
                Text("Accept")
            }
            Button(onClick = { /* Acción rechazar */ }, colors = ButtonDefaults.buttonColors()) {
                Text("Decline")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Imagen decorativa
        Image(
            painter = painterResource(id = R.drawable.tecsup), // Reemplaza con el nombre de tu imagen, sin la extensión
            contentDescription = "Imagen Tecsup",
            modifier = Modifier.size(200.dp) // Ajusta el tamaño de la imagen según lo necesites
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPunto7Vista() {
    Punto7Vista()
}
