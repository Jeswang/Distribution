package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlicerSortType extends js.Object

/**
  *
  * Specifies the slicer sort behavior for Slicer.sortBy API.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends js.Object {
  /**
    * Sort slicer items in ascending order by item captions.
    *
    */
  @js.native
  sealed trait ascending extends SlicerSortType
  
  /**
    * Sort slicer items in the order provided by the data source.
    *
    */
  @js.native
  sealed trait dataSourceOrder extends SlicerSortType
  
  /**
    * Sort slicer items in descending order by item captions.
    *
    */
  @js.native
  sealed trait descending extends SlicerSortType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SlicerSortType with String] = js.native
  /* "Ascending" */ @js.native
  object ascending extends TopLevel[ascending with String]
  
  /* "DataSourceOrder" */ @js.native
  object dataSourceOrder extends TopLevel[dataSourceOrder with String]
  
  /* "Descending" */ @js.native
  object descending extends TopLevel[descending with String]
  
}

