package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.animate
import typings.plotlyJs.plotlyJsStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderStep extends js.Object {
  /**
  	 * Sets the arguments values to be passed to the Plotly
  	 * method set in `method` on slide.
  	 */
  var args: js.Array[_]
  /**
  	 * When true, the API method is executed. When false, all other behaviors are the same
  	 * and command execution is skipped. This may be useful when hooking into, for example,
  	 * the `plotly_sliderchange` method and executing the API command manually without losing
  	 * the benefit of the slider automatically binding to the state of the plot through the
  	 * specification of `method` and `args`.
  	 */
  var execute: Boolean
  /**
  	 * Sets the text label to appear on the slider
  	 */
  var label: String
  /**
  	 * Sets the Plotly method to be called when the slider value is changed.
  	 * If the `skip` method is used, the API slider will function as normal
  	 * but will perform no API calls and will not bind automatically to state
  	 * updates. This may be used to create a component interface and attach to
  	 * slider events manually via JavaScript.
  	 */
  var method: animate | typings.plotlyJs.plotlyJsStrings.relayout | typings.plotlyJs.plotlyJsStrings.restyle | skip | typings.plotlyJs.plotlyJsStrings.update
  /**
  	 * Sets the value of the slider step, used to refer to the step programatically.
  	 * Defaults to the slider label if not provided.
  	 */
  var value: String
  /**
  	 * Determines whether or not this step is included in the slider.
  	 */
  var visible: Boolean
}

object SliderStep {
  @scala.inline
  def apply(
    args: js.Array[_],
    execute: Boolean,
    label: String,
    method: animate | typings.plotlyJs.plotlyJsStrings.relayout | typings.plotlyJs.plotlyJsStrings.restyle | skip | typings.plotlyJs.plotlyJsStrings.update,
    value: String,
    visible: Boolean
  ): SliderStep = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SliderStep]
  }
}

