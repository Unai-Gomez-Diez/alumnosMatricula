package com.ugdGomezDiez.alumnos

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ugdGomezDiez.alumnos.ui.theme.AlumnosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlumnosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
        matricular()
    }

    private fun matricular(){
        var subject1= Subject(1,"Sistemas de gestion empresarial")
        var subject2= Subject(2,"Desarollo de interfaces")
        var subject3= Subject(3,"Programacion de servicios y procesos")
        var alumn1=Alumn(1,"Unai")
        alumn1.enrollmentList.add(subject1)
        alumn1.enrollmentList.add(subject2)
        alumn1.enrollmentList.add(subject3)


        Log.d("@dev","Alumno: $alumn1")

    }

}

    data class Subject(var id: Int, var name: String = "")
    data class Alumn(var id: Int, var name: String, val enrollmentList: MutableList<Subject> = mutableListOf())

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlumnosTheme {
        Greeting("Android")
    }
}