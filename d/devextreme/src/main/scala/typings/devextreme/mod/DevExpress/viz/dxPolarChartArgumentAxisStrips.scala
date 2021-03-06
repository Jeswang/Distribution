package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisStrips extends dxPolarChartCommonAxisSettingsStripStyle {
  /** Specifies a color for a strip. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies an end value for a strip. */
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  /** An object that defines the label configuration options of a strip. */
  @JSName("label")
  var label_dxPolarChartArgumentAxisStrips: js.UndefOr[dxPolarChartArgumentAxisStripsLabel] = js.undefined
  /** Specifies a start value for a strip. */
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
}

object dxPolarChartArgumentAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | Date | String = null,
    label: dxPolarChartArgumentAxisStripsLabel = null,
    startValue: Double | Date | String = null
  ): dxPolarChartArgumentAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisStrips]
  }
}

