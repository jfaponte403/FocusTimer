package com.matchcode.todo.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.matchcode.todo.presentation.theme.ToDoTheme

@Composable
fun AutoResizedText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = MaterialTheme.typography .displayLarge,
) {
    val fontSizeFactor = 0.95
    var timeTextStyle by remember { mutableStateOf(textStyle) }
    Text(
        text = text,
        modifier = modifier.fillMaxSize(),
        softWrap = false,
        style = timeTextStyle,
        onTextLayout = {
            result -> if (result.didOverflowWidth) {
                timeTextStyle = timeTextStyle.copy(
                    fontSize = timeTextStyle.fontSize * fontSizeFactor
                )
            }
        }
    )
}

@Preview(showBackground = true, name = "AutoResizedTextPreview")
@Composable
fun AutoResizedTextPreview() {
    ToDoTheme {
        AutoResizedText(text = "Hello World")
    }
}