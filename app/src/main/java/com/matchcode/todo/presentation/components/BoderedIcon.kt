package com.matchcode.todo.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.matchcode.todo.R
import com.matchcode.todo.presentation.theme.ToDoTheme

@Composable
fun BorderedIcon(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    onTap: () -> Unit = {}
) {
    Icon(
        modifier = modifier
            .size(ToDoTheme.dimens.iconSizeNormal)
            .border(
                width = ToDoTheme.dimens.borderNormal,
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(ToDoTheme.dimens.roundedShapeNormal)
            )
            .padding(ToDoTheme.dimens.paddingSmall)
            .clickable { onTap() },
        imageVector = ImageVector.vectorResource(id = icon),
        contentDescription = null,
        tint = MaterialTheme.colorScheme.secondary
    )
}
//
//@Preview(showBackground = true, name = "BorderedIconPreview")
//@Composable
//fun BorderedIconPreview() {
//    ToDoTheme {
//        BorderedIcon(icon = R.drawable.ic_add)
//    }
//}
