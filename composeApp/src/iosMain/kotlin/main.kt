import androidx.compose.ui.window.ComposeUIViewController
import org.sn.recipeskmpapp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
