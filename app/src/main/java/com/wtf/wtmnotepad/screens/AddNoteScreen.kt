package com.wtf.wtmnotepad.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wtf.wtmnotepad.components.NoteItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddNoteScreen(){
    var title by remember { mutableStateOf("")}
    var newNote by remember { mutableStateOf("")}

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "Add a New Note") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Add ,contentDescription = "Add Note " )
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Edit, contentDescription = "More Options" )
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = androidx.compose.ui.Modifier
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                OutlinedTextField(
                    value = title,
                    onValueChange = {titleInput -> title= titleInput},
                    label = { Text(text = "Enter Note Title", fontWeight = FontWeight.Black)},
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .padding(top = 15.dp)
                        .fillMaxWidth()
                        .height(60.dp),
                    maxLines = 2, // Adjust as needed
                )
                Spacer(modifier = Modifier.height(5.dp))
                OutlinedTextField(
                    value = newNote,
                    onValueChange = {newNoteInput -> newNote = newNoteInput},
                    label = { Text(text = "Enter content of the note")},
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxWidth()
                        .height(100.dp),
                    maxLines = 9, // Adjust as needed
                )
                Button(
                    onClick = { },
                    modifier = Modifier
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Add Note")
                }
            }
        }
    )
}

@Preview
@Composable
fun AddNoteScreenPreview(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
//        AddNoteScreen()
    }
}