package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a progress bar. */
trait XProgressBar extends XInterface {
  /** returns the current progress value of the progress bar. */
  var Value: Double
  /** returns the current progress value of the progress bar. */
  def getValue(): Double
  /** sets the background color (RGB) of the control. */
  def setBackgroundColor(Color: Color): Unit
  /** sets the foreground color (RGB) of the control. */
  def setForegroundColor(Color: Color): Unit
  /**
    * sets the minimum and the maximum progress value of the progress bar.
    *
    * If the minimum value is greater than the maximum value, the method exchanges the values automatically.
    */
  def setRange(Min: Double, Max: Double): Unit
  /** sets the progress value of the progress bar. */
  def setValue(Value: Double): Unit
}

object XProgressBar {
  @scala.inline
  def apply(
    Value: Double,
    acquire: () => Unit,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setBackgroundColor: Color => Unit,
    setForegroundColor: Color => Unit,
    setRange: (Double, Double) => Unit,
    setValue: Double => Unit
  ): XProgressBar = {
    val __obj = js.Dynamic.literal(Value = Value, acquire = js.Any.fromFunction0(acquire), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XProgressBar]
  }
}

