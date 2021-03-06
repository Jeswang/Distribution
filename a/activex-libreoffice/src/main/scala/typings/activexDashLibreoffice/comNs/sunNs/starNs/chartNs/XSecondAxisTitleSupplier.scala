package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSecondAxisTitleSupplier extends XInterface {
  val SecondXAxisTitle: XShape
  val SecondYAxisTitle: XShape
  def getSecondXAxisTitle(): XShape
  def getSecondYAxisTitle(): XShape
}

object XSecondAxisTitleSupplier {
  @scala.inline
  def apply(
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    acquire: () => Unit,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, acquire = js.Any.fromFunction0(acquire), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
}

