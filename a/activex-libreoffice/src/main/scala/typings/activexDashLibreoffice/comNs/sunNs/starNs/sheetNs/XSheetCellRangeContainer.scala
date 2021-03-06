package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access cell ranges in a collection via index and to add and remove cell ranges.
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetCellRangeContainer extends XSheetCellRanges {
  /**
    * adds the given range to the collection of cell ranges.
    * @param aCellRangeAddress contains the address of the new range.
    * @param bMergeRanges defines how the range should be added. To merge the ranges takes more time, but the memory usage is lower.
    */
  def addRangeAddress(aCellRangeAddress: CellRangeAddress, bMergeRanges: Boolean): Unit
  /**
    * adds the given ranges to the collection of cell ranges.
    * @param aCellRangeAddresses contains a sequence of addresses of all new ranges.
    * @param bMergeRanges defines how the ranges should be added. To merge the ranges takes more time, but the memory usage is lower.
    */
  def addRangeAddresses(aCellRangeAddresses: SeqEquiv[CellRangeAddress], bMergeRanges: Boolean): Unit
  /**
    * removes the given range from the collection of cell ranges.
    * @param aCellRangeAddress contains the address of the range to be removed.  The specified range must fit exactly to an element of the collection. The met
    * @throws com::sun::star::container::NoSuchElementException if the collection does not contain the specified range.
    */
  def removeRangeAddress(aCellRangeAddress: CellRangeAddress): Unit
  /**
    * removes the given ranges from the collection of cell ranges.
    * @param aCellRangeAddresses contains a sequence of addresses of all ranges to be removed.  All specified ranges must fit exactly to elements of the colle
    * @throws com::sun::star::container::NoSuchElementException if the collection does not contain any of the specified ranges.
    */
  def removeRangeAddresses(aCellRangeAddresses: SeqEquiv[CellRangeAddress]): Unit
}

object XSheetCellRangeContainer {
  @scala.inline
  def apply(
    Cells: XEnumerationAccess,
    Count: Double,
    ElementType: `type`,
    RangeAddresses: SafeArray[CellRangeAddress],
    RangeAddressesAsString: String,
    acquire: () => Unit,
    addRangeAddress: (CellRangeAddress, Boolean) => Unit,
    addRangeAddresses: (SeqEquiv[CellRangeAddress], Boolean) => Unit,
    getByIndex: Double => js.Any,
    getCells: () => XEnumerationAccess,
    getCount: () => Double,
    getElementType: () => `type`,
    getRangeAddresses: () => SafeArray[CellRangeAddress],
    getRangeAddressesAsString: () => String,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRangeAddress: CellRangeAddress => Unit,
    removeRangeAddresses: SeqEquiv[CellRangeAddress] => Unit
  ): XSheetCellRangeContainer = {
    val __obj = js.Dynamic.literal(Cells = Cells, Count = Count, ElementType = ElementType, RangeAddresses = RangeAddresses, RangeAddressesAsString = RangeAddressesAsString, acquire = js.Any.fromFunction0(acquire), addRangeAddress = js.Any.fromFunction2(addRangeAddress), addRangeAddresses = js.Any.fromFunction2(addRangeAddresses), getByIndex = js.Any.fromFunction1(getByIndex), getCells = js.Any.fromFunction0(getCells), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getRangeAddresses = js.Any.fromFunction0(getRangeAddresses), getRangeAddressesAsString = js.Any.fromFunction0(getRangeAddressesAsString), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRangeAddress = js.Any.fromFunction1(removeRangeAddress), removeRangeAddresses = js.Any.fromFunction1(removeRangeAddresses))
  
    __obj.asInstanceOf[XSheetCellRangeContainer]
  }
}

