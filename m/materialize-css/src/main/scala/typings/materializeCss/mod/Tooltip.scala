package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialTooltipOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typings.materializeCss.M.Tooltip

/* static members */
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Tooltip] = js.native
  def init(els: MElements, options: PartialTooltipOptions): js.Array[typings.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typings.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = js.native
}

