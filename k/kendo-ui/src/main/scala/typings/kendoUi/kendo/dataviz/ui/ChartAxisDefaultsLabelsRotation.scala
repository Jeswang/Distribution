package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisDefaultsLabelsRotation extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var angle: js.UndefOr[Double | String] = js.undefined
}

object ChartAxisDefaultsLabelsRotation {
  @scala.inline
  def apply(align: String = null, angle: Double | String = null): ChartAxisDefaultsLabelsRotation = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisDefaultsLabelsRotation]
  }
}

