package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of dimensions of a data pilot source.
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XDimensionsSupplier extends XInterface {
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  val Dimensions: XNameAccess
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  def getDimensions(): XNameAccess
}

object XDimensionsSupplier {
  @scala.inline
  def apply(
    Dimensions: XNameAccess,
    acquire: () => Unit,
    getDimensions: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDimensionsSupplier = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions, acquire = js.Any.fromFunction0(acquire), getDimensions = js.Any.fromFunction0(getDimensions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDimensionsSupplier]
  }
}

