package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.Window")
@js.native
class Window protected () extends js.Object {
  val Caption: String = js.native
  @JSName("Collection")
  val Collection_Original: Windows = js.native
  val HWnd: Double = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val LinkedWindowFrame: Window = js.native
  @JSName("LinkedWindows")
  val LinkedWindows_Original: LinkedWindows = js.native
  var Top: Double = js.native
  val Type: vbextWindowType = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.Window_typekey")
  var VBIDEDotWindow_typekey: Window = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var WindowState: vbextWindowState = js.native
  def Close(): Unit = js.native
  def Collection(index: js.Any): Window = js.native
  def LinkedWindows(index: js.Any): Window = js.native
  def SetFocus(): Unit = js.native
}

