package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.AnonColumnK
import typings.oracleOraclejet.AnonColumnRow
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.edit
import typings.oracleOraclejet.oracleOraclejetStrings.navigation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CellContext[K, D] extends js.Object {
  var cell: D
  var componentElement: Element
  var data: D
  var datasource: (DataProvider[K, D]) | Null
  var extents: AnonColumnRow
  var indexes: AnonColumnRow
  var keys: AnonColumnK[K]
  var mode: edit | navigation
  var parentElement: Element
}

object CellContext {
  @scala.inline
  def apply[K, D](
    cell: D,
    componentElement: Element,
    data: D,
    extents: AnonColumnRow,
    indexes: AnonColumnRow,
    keys: AnonColumnK[K],
    mode: edit | navigation,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
}

