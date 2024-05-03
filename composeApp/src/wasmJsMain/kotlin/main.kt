import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import org.sn.recipeskmpapp.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("RecipesKmpApp") {
        App()
    }
}
