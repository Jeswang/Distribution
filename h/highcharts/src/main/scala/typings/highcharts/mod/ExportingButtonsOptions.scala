package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingButtonsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
    *
    * In styled mode, export button styles can be applied with the
    * `.highcharts-contextbutton` class.
    */
  var contextButton: js.UndefOr[ExportingButtonsOptionsObject] = js.undefined
}

object ExportingButtonsOptions {
  @scala.inline
  def apply(contextButton: ExportingButtonsOptionsObject = null): ExportingButtonsOptions = {
    val __obj = js.Dynamic.literal()
    if (contextButton != null) __obj.updateDynamic("contextButton")(contextButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportingButtonsOptions]
  }
}

