package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcBottomLineStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the bottom line. If not set, it's inherited from
    * plotOptions.pc.color.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotPcBottomLineStylesOptions {
  @scala.inline
  def apply(lineColor: ColorString = null, lineWidth: Int | Double = null): PlotPcBottomLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPcBottomLineStylesOptions]
  }
}

