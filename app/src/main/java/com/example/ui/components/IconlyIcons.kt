package com.example.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.rounded.Send
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Share
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

private fun buildVector(name: String, pathDataList: List<String>): ImageVector {
    val builder = ImageVector.Builder(
        name = name,
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    )
    val fillBrush = SolidColor(Color.Black)
    for (pd in pathDataList) {
        val nodes = addPathNodes(pd)
        builder.addPath(
            pathData = nodes,
            fill = fillBrush
        )
    }
    return builder.build()
}

object IconlyIcons {
  val Home: ImageVector = Icons.Rounded.Home
  val Search: ImageVector = Icons.Rounded.Search
  val Add: ImageVector = Icons.Rounded.Add
  val Profile: ImageVector = Icons.Rounded.Person
  val Share: ImageVector = Icons.Rounded.Share
  val Delete: ImageVector = Icons.Rounded.Delete
  val Edit: ImageVector = Icons.Rounded.Edit
  val ArrowBack: ImageVector = Icons.AutoMirrored.Rounded.ArrowBack
  val ArrowForward: ImageVector = Icons.AutoMirrored.Rounded.ArrowForward
  val ChevronRight: ImageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight
  val Check: ImageVector = Icons.Rounded.Check
  val Close: ImageVector = Icons.Rounded.Close
  val More: ImageVector = Icons.Rounded.MoreVert
  val Send: ImageVector = Icons.AutoMirrored.Rounded.Send
  val Refresh: ImageVector = Icons.Rounded.Refresh
  val Info: ImageVector = Icons.Rounded.Info
  val Lock: ImageVector = Icons.Rounded.Lock
  val Notification: ImageVector = Icons.Rounded.Notifications
  val Heart: ImageVector = buildVector("Heart", listOf("""M17,3H7c-1.1,0 -2,0.9 -2,2v16l7,-3 7,3V5c0,-1.1 -0.9,-2 -2,-2z"""))
  val HeartOutline: ImageVector = buildVector("HeartOutline", listOf("""M17,3L7,3c-1.1,0 -2,0.9 -2,2v16l7,-3 7,3L19,5c0,-1.1 -0.9,-2 -2,-2zM17,18l-5,-2.18L7,18L7,6c0,-0.55 0.45,-1 1,-1h8c0.55,0 1,0.45 1,1v12z"""))
  val Document: ImageVector = buildVector("Document", listOf("""M14.59,2.59c-0.38,-0.38 -0.89,-0.59 -1.42,-0.59L6,2c-1.1,0 -2,0.9 -2,2v16c0,1.1 0.89,2 1.99,2L18,22c1.1,0 2,-0.9 2,-2L20,8.83c0,-0.53 -0.21,-1.04 -0.59,-1.41l-4.82,-4.83zM15,18L9,18c-0.55,0 -1,-0.45 -1,-1s0.45,-1 1,-1h6c0.55,0 1,0.45 1,1s-0.45,1 -1,1zM15,14L9,14c-0.55,0 -1,-0.45 -1,-1s0.45,-1 1,-1h6c0.55,0 1,0.45 1,1s-0.45,1 -1,1zM13,8L13,3.5L18.5,9L14,9c-0.55,0 -1,-0.45 -1,-1z"""))
  val Receipt: ImageVector = buildVector("Receipt", listOf("""M14,9h-4C9.45,9 9,8.55 9,8v0c0,-0.55 0.45,-1 1,-1h4c0.55,0 1,0.45 1,1v0C15,8.55 14.55,9 14,9z""", """M14,12h-4c-0.55,0 -1,-0.45 -1,-1v0c0,-0.55 0.45,-1 1,-1h4c0.55,0 1,0.45 1,1v0C15,11.55 14.55,12 14,12z""", """M19.5,3.5L18,2l-1.5,1.5L15,2l-1.5,1.5L12,2l-1.5,1.5L9,2L7.5,3.5L6,2v14H4c-0.55,0 -1,0.45 -1,1v2c0,1.66 1.34,3 3,3h12c1.66,0 3,-1.34 3,-3V2L19.5,3.5zM15,20H6c-0.55,0 -1,-0.45 -1,-1v-1h3h4h3V20zM19,19c0,0.55 -0.45,1 -1,1s-1,-0.45 -1,-1v-2c0,-0.55 -0.45,-1 -1,-1h-2h-2H8V5h11V19z""", """M17,8m-1,0a1,1 0,1 1,2 0a1,1 0,1 1,-2 0""", """M17,11m-1,0a1,1 0,1 1,2 0a1,1 0,1 1,-2 0"""))
  val Camera: ImageVector = buildVector("Camera", listOf("""M12,12m-3,0a3,3 0,1 1,6 0a3,3 0,1 1,-6 0""", """M20,4h-3.17l-1.24,-1.35c-0.37,-0.41 -0.91,-0.65 -1.47,-0.65L9.88,2c-0.56,0 -1.1,0.24 -1.48,0.65L7.17,4L4,4c-1.1,0 -2,0.9 -2,2v12c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2L22,6c0,-1.1 -0.9,-2 -2,-2zM12,17c-2.76,0 -5,-2.24 -5,-5s2.24,-5 5,-5 5,2.24 5,5 -2.24,5 -5,5z"""))
  val Location: ImageVector = buildVector("Location", listOf("""M12,2c-4.2,0 -8,3.22 -8,8.2c0,3.18 2.45,6.92 7.34,11.23c0.38,0.33 0.95,0.33 1.33,0C17.55,17.12 20,13.38 20,10.2C20,5.22 16.2,2 12,2zM12,12c-1.1,0 -2,-0.9 -2,-2c0,-1.1 0.9,-2 2,-2c1.1,0 2,0.9 2,2C14,11.1 13.1,12 12,12z"""))
  val Calendar: ImageVector = buildVector("Calendar", listOf("""M20,3h-1L19,2c0,-0.55 -0.45,-1 -1,-1s-1,0.45 -1,1v1L7,3L7,2c0,-0.55 -0.45,-1 -1,-1s-1,0.45 -1,1v1L4,3c-1.1,0 -2,0.9 -2,2v16c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2L22,5c0,-1.1 -0.9,-2 -2,-2zM19,21L5,21c-0.55,0 -1,-0.45 -1,-1L4,8h16v12c0,0.55 -0.45,1 -1,1z"""))
  val Folder: ImageVector = buildVector("Folder", listOf("""M10.59,4.59C10.21,4.21 9.7,4 9.17,4H4c-1.1,0 -1.99,0.9 -1.99,2L2,18c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2V8c0,-1.1 -0.9,-2 -2,-2h-8l-1.41,-1.41z"""))
  val FolderOpen: ImageVector = buildVector("FolderOpen", listOf("""M20,6h-8l-1.41,-1.41C10.21,4.21 9.7,4 9.17,4L4,4c-1.1,0 -1.99,0.9 -1.99,2L2,18c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2L22,8c0,-1.1 -0.9,-2 -2,-2zM19,18L5,18c-0.55,0 -1,-0.45 -1,-1L4,9c0,-0.55 0.45,-1 1,-1h14c0.55,0 1,0.45 1,1v8c0,0.55 -0.45,1 -1,1z"""))
  val Filter: ImageVector = buildVector("Filter", listOf("""M11,18h2c0.55,0 1,-0.45 1,-1s-0.45,-1 -1,-1h-2c-0.55,0 -1,0.45 -1,1s0.45,1 1,1zM3,7c0,0.55 0.45,1 1,1h16c0.55,0 1,-0.45 1,-1s-0.45,-1 -1,-1L4,6c-0.55,0 -1,0.45 -1,1zM7,13h10c0.55,0 1,-0.45 1,-1s-0.45,-1 -1,-1L7,11c-0.55,0 -1,0.45 -1,1s0.45,1 1,1z"""))
  val Settings: ImageVector = buildVector("Settings", listOf("""M3,18c0,0.55 0.45,1 1,1h5v-2L4,17c-0.55,0 -1,0.45 -1,1zM3,6c0,0.55 0.45,1 1,1h9L13,5L4,5c-0.55,0 -1,0.45 -1,1zM13,20v-1h7c0.55,0 1,-0.45 1,-1s-0.45,-1 -1,-1h-7v-1c0,-0.55 -0.45,-1 -1,-1s-1,0.45 -1,1v4c0,0.55 0.45,1 1,1s1,-0.45 1,-1zM7,10v1L4,11c-0.55,0 -1,0.45 -1,1s0.45,1 1,1h3v1c0,0.55 0.45,1 1,1s1,-0.45 1,-1v-4c0,-0.55 -0.45,-1 -1,-1s-1,0.45 -1,1zM21,12c0,-0.55 -0.45,-1 -1,-1h-9v2h9c0.55,0 1,-0.45 1,-1zM16,9c0.55,0 1,-0.45 1,-1L17,7h3c0.55,0 1,-0.45 1,-1s-0.45,-1 -1,-1h-3L17,4c0,-0.55 -0.45,-1 -1,-1s-1,0.45 -1,1v4c0,0.55 0.45,1 1,1z"""))
  val Copy: ImageVector = buildVector("Copy", listOf("""M15,20H5V7c0,-0.55 -0.45,-1 -1,-1h0C3.45,6 3,6.45 3,7v13c0,1.1 0.9,2 2,2h10c0.55,0 1,-0.45 1,-1v0C16,20.45 15.55,20 15,20zM20,16V4c0,-1.1 -0.9,-2 -2,-2H9C7.9,2 7,2.9 7,4v12c0,1.1 0.9,2 2,2h9C19.1,18 20,17.1 20,16zM18,16H9V4h9V16z"""))
  val Shield: ImageVector = buildVector("Shield", listOf("""M11.19,1.36l-7,3.11C3.47,4.79 3,5.51 3,6.3V11c0,5.55 3.84,10.74 9,12 5.16,-1.26 9,-6.45 9,-12V6.3c0,-0.79 -0.47,-1.51 -1.19,-1.83l-7,-3.11c-0.51,-0.23 -1.11,-0.23 -1.62,0zM12,11.99h7c-0.53,4.12 -3.28,7.79 -7,8.94V12H5V6.3l7,-3.11v8.8z"""))
  val Premium: ImageVector = buildVector("Premium", listOf("""M10.92,12.75L12,11.93l1.07,0.81c0.39,0.29 0.92,-0.08 0.78,-0.55l-0.42,-1.36l1.2,-0.95C15,9.6 14.79,9 14.31,9h-1.4l-0.43,-1.34c-0.15,-0.46 -0.8,-0.46 -0.95,0L11.09,9H9.68C9.21,9 9,9.6 9.37,9.89l1.19,0.95l-0.42,1.36C10,12.67 10.53,13.04 10.92,12.75zM6,21.61c0,0.68 0.67,1.16 1.32,0.95L12,21l4.68,1.56C17.33,22.78 18,22.3 18,21.61v-6.33c1.24,-1.41 2,-3.25 2,-5.28c0,-4.42 -3.58,-8 -8,-8s-8,3.58 -8,8c0,2.03 0.76,3.87 2,5.28V21.61zM12,4c3.31,0 6,2.69 6,6s-2.69,6 -6,6s-6,-2.69 -6,-6S8.69,4 12,4z"""))
  val Verified: ImageVector = buildVector("Verified", listOf("""M23,12l-2.44,-2.79l0.34,-3.69l-3.61,-0.82L15.4,1.5L12,2.96L8.6,1.5L6.71,4.69L3.1,5.5L3.44,9.2L1,12l2.44,2.79l-0.34,3.7l3.61,0.82L8.6,22.5l3.4,-1.47l3.4,1.46l1.89,-3.19l3.61,-0.82l-0.34,-3.69L23,12zM9.38,16.01L7,13.61c-0.39,-0.39 -0.39,-1.02 0,-1.41l0.07,-0.07c0.39,-0.39 1.03,-0.39 1.42,0l1.61,1.62l5.15,-5.16c0.39,-0.39 1.03,-0.39 1.42,0l0.07,0.07c0.39,0.39 0.39,1.02 0,1.41l-5.92,5.94C10.41,16.4 9.78,16.4 9.38,16.01z"""))
  val Voice: ImageVector = buildVector("Voice", listOf("""M12,14c1.66,0 3,-1.34 3,-3L15,5c0,-1.66 -1.34,-3 -3,-3S9,3.34 9,5v6c0,1.66 1.34,3 3,3zM17.91,11c-0.49,0 -0.9,0.36 -0.98,0.85C16.52,14.2 14.47,16 12,16s-4.52,-1.8 -4.93,-4.15c-0.08,-0.49 -0.49,-0.85 -0.98,-0.85 -0.61,0 -1.09,0.54 -1,1.14 0.49,3 2.89,5.35 5.91,5.78L11,20c0,0.55 0.45,1 1,1s1,-0.45 1,-1v-2.08c3.02,-0.43 5.42,-2.78 5.91,-5.78 0.1,-0.6 -0.39,-1.14 -1,-1.14z"""))
  val Mic: ImageVector = Voice
  val BatteryAlert: ImageVector = buildVector("BatteryAlert", listOf("""M15.67,4L14,4L14,3c0,-0.55 -0.45,-1 -1,-1h-2c-0.55,0 -1,0.45 -1,1v1L8.33,4C7.6,4 7,4.6 7,5.33v15.33C7,21.4 7.6,22 8.34,22h7.32c0.74,0 1.34,-0.6 1.34,-1.33L17,5.33C17,4.6 16.4,4 15.67,4zM13,18h-2v-2h2v2zM13,13c0,0.55 -0.45,1 -1,1s-1,-0.45 -1,-1v-3c0,-0.55 0.45,-1 1,-1s1,0.45 1,1v3z"""))
  val ArrowDownward: ImageVector = buildVector("ArrowDownward", listOf("""M11,5v11.17l-4.88,-4.88c-0.39,-0.39 -1.03,-0.39 -1.42,0 -0.39,0.39 -0.39,1.02 0,1.41l6.59,6.59c0.39,0.39 1.02,0.39 1.41,0l6.59,-6.59c0.39,-0.39 0.39,-1.02 0,-1.41 -0.39,-0.39 -1.02,-0.39 -1.41,0L13,16.17V5c0,-0.55 -0.45,-1 -1,-1s-1,0.45 -1,1z"""))
  val ArrowUpward: ImageVector = buildVector("ArrowUpward", listOf("""M13,19V7.83l4.88,4.88c0.39,0.39 1.03,0.39 1.42,0 0.39,-0.39 0.39,-1.02 0,-1.41l-6.59,-6.59c-0.39,-0.39 -1.02,-0.39 -1.41,0l-6.6,6.58c-0.39,0.39 -0.39,1.02 0,1.41 0.39,0.39 1.02,0.39 1.41,0L11,7.83V19c0,0.55 0.45,1 1,1s1,-0.45 1,-1z"""))
  val Stop: ImageVector = buildVector("Stop", listOf("""M8,6h8c1.1,0 2,0.9 2,2v8c0,1.1 -0.9,2 -2,2H8c-1.1,0 -2,-0.9 -2,-2V8c0,-1.1 0.9,-2 2,-2z"""))
}
