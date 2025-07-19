package org.chtan.portfolio.myprofile.presentation.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.outlined.DeveloperMode
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

sealed class MyDropDownItems(
    val name: String,
    val leadingIcon: ImageVector,
    val trailingIcon: ImageVector? = null,
    val isDivider: Boolean = false,
    val type: String = "All"
) {
    data object Both : MyDropDownItems(
        name = "App Developer and Data Analyst",
        leadingIcon = Icons.Outlined.DeveloperMode,
    )

    data object AppDeveloper : MyDropDownItems(
        name = "App Developer",
        leadingIcon = Icons.Default.Apps,
        type = "App"
    )

    data object SelectDateRange : MyDropDownItems(
        name = "Data Analyst",
        leadingIcon = Icons.Default.Analytics,
        type = "Data"
    )

}

@Composable
fun DropdownMySkills(
    dropDownItems: List<MyDropDownItems>,
    onClick: (MyDropDownItems) -> Unit,
    selectedItem: MyDropDownItems
) {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
    ) {
            Row(
                modifier = Modifier.padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextButton(onClick={
                    expanded = !expanded
                }) {
                    Text(
                        text = selectedItem.name,
                        style = MaterialTheme.typography.bodySmall)
                    Icon(
                        modifier = Modifier.size(20.dp),
                        imageVector = selectedItem.leadingIcon,
                        contentDescription = ""
                    )
                }

            }


        DropdownMenu(
            modifier = Modifier.animateContentSize(),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
            expanded = expanded,
            onDismissRequest = { expanded = false }) {
            dropDownItems.forEach { menuItem ->
                DropdownMenuItem(text = { Text(menuItem.name) }, leadingIcon = {
                    Icon(
                        menuItem.leadingIcon, contentDescription = null
                    )
                }, onClick = {
                        onClick(menuItem)
                        expanded = false

                })
            }

        }
    }
}