package typings.cypress

import typings.cypress.JQuery_.TriggeredEvent
import typings.cypress.JQuery_._SpecialEventHook
import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * When the `.trigger()` method finishes running all the event handlers for an event, it also looks for and runs any method on the target object by the same name unless of the handlers called `event.preventDefault()`. So, `.trigger( "submit" )` will execute the `submit()` method on the element if one exists. When a `_default` hook is specified, the hook is called just prior to checking for and executing the element's default method. If this hook returns the value `false` the element's default method will be called; otherwise it is not.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#_default-function-event-jquery-event-data-object }\`
    */
  def _default(event: TriggeredEvent[TTarget, TData, _, _], data: TData): Unit | `false`
}

object AnonDefault {
  @scala.inline
  def apply[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, _, _], TData) => Unit | `false`): AnonDefault[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = js.Any.fromFunction2(_default))
  
    __obj.asInstanceOf[AnonDefault[TTarget, TData]]
  }
}

