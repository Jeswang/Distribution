package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxis extends XInterface {
  /** the returned property set must support the service {@link GridProperties} */
  val GridProperties: XPropertySet
  var ScaleData: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.ScaleData
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  val SubGridProperties: SafeArray[XPropertySet]
  /** the returned property sets must support the service TickProperties */
  val SubTickProperties: SafeArray[XPropertySet]
  /** the returned property set must support the service {@link GridProperties} */
  def getGridProperties(): XPropertySet
  def getScaleData(): ScaleData
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  def getSubGridProperties(): SafeArray[XPropertySet]
  /** the returned property sets must support the service TickProperties */
  def getSubTickProperties(): SafeArray[XPropertySet]
  def setScaleData(aScale: ScaleData): Unit
}

object XAxis {
  @scala.inline
  def apply(
    GridProperties: XPropertySet,
    ScaleData: ScaleData,
    SubGridProperties: SafeArray[XPropertySet],
    SubTickProperties: SafeArray[XPropertySet],
    acquire: () => Unit,
    getGridProperties: () => XPropertySet,
    getScaleData: () => ScaleData,
    getSubGridProperties: () => SafeArray[XPropertySet],
    getSubTickProperties: () => SafeArray[XPropertySet],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScaleData: ScaleData => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(GridProperties = GridProperties, ScaleData = ScaleData, SubGridProperties = SubGridProperties, SubTickProperties = SubTickProperties, acquire = js.Any.fromFunction0(acquire), getGridProperties = js.Any.fromFunction0(getGridProperties), getScaleData = js.Any.fromFunction0(getScaleData), getSubGridProperties = js.Any.fromFunction0(getSubGridProperties), getSubTickProperties = js.Any.fromFunction0(getSubTickProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScaleData = js.Any.fromFunction1(setScaleData))
  
    __obj.asInstanceOf[XAxis]
  }
}

