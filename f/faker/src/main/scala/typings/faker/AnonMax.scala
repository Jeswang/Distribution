package typings.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null, precision: Int | Double = null): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

