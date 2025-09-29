package com.example.a501homework3_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a501homework3_3.data.ContactRepository
import com.example.a501homework3_3.ui.components.ContactList
import com.example.a501homework3_3.ui.theme._501homework33Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _501homework33Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ContactListScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ContactListScreen(
    modifier: Modifier = Modifier
) {
    val contacts = ContactRepository.getSampleContacts()
    
    ContactList(
        contacts = contacts,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ContactListScreenPreview() {
    _501homework33Theme {
        ContactListScreen()
    }
}