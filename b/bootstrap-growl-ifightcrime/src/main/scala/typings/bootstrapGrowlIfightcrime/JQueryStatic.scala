package typings.bootstrapGrowlIfightcrime

import typings.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime.Options
import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * Show standard Bootstrap alerts into hovering "Growl-like" notifications
    * @param message to show.
    * @param options should be an options object.
    * @returns The element.
    */
  def bootstrapGrowl(message: String): JQuery_[HTMLElement] = js.native
  def bootstrapGrowl(message: String, options: Options): JQuery_[HTMLElement] = js.native
}

