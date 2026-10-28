package com.plcoding.calculatorprep

import android.view.MotionEvent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalComposeUiApi
@Composable
//Very similar to the calculator button, but it is onToggle and uses our isDarkMode Boolean value
fun ThemeButton(
    isDarkMode: Boolean,
    symbol: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    onToggle: () -> Unit,
    textStyle: TextStyle = TextStyle()
) {
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .clip(RoundedCornerShape(100.dp))
            .clickable {
                onToggle()
            }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            style = textStyle,
            fontSize = 36.sp,
            color = contentColorFor(color)
        )
    }
}