import javafx.scene.paint.Color
import scalafx.application.JFXApp
import scalafx.Includes._
import scalafx.scene.Scene
import scalafx.scene.shape.Rectangle
import scalafx.stage.Stage

object Test extends JFXApp {
  stage = new Stage {
    title.value = "Hello Stage"
    width = 600
    height = 450
    scene = new Scene {
      fill = Color.LIGHTGREEN
      content = new Rectangle {
        x = 25
        y = 40
        width = 100
        height = 100
        fill <== when(hover) then Color.GREEN otherwise Color.RED
      }
    }
  }
}