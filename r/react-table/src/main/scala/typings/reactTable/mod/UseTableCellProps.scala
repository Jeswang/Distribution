package typings.reactTable.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableCellProps[D /* <: js.Object */] extends js.Object {
  var column: ColumnInstance[D] = js.native
  var row: Row[D] = js.native
  var value: CellValue = js.native
  def getCellProps(): TableCellProps = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native
  def render(`type`: String): ReactNode = js.native
  def render(`type`: String, userProps: js.Object): ReactNode = js.native
  @JSName("render")
  def render_Cell(`type`: typings.reactTable.reactTableStrings.Cell): ReactNode = js.native
  @JSName("render")
  def render_Cell(`type`: typings.reactTable.reactTableStrings.Cell, userProps: js.Object): ReactNode = js.native
}

