package typings.cypress

import typings.cypress.JQuery_._SpecialEventHook
import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeardown[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  /**
    * The teardown hook is called when the final event of a particular type is removed from an element. The `this` keyword will be a reference to the element where the event is being cleaned up. This hook should return `false` if it wants jQuery to remove the event from the browser's event system (via `removeEventListener` or `detachEvent`). In most cases, the setup and teardown hooks should return the same value.
    *
    * If the setup hook attached event handlers or added data to an element through a mechanism such as `jQuery.data()`, the teardown hook should reverse the process and remove them. jQuery will generally remove the data and events when an element is totally removed from the document, but failing to remove data or events on teardown will cause a memory leak if the element stays in the document.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#teardown-function }\`
    */
  def teardown(): Unit | `false`
}

object AnonTeardown {
  @scala.inline
  def apply[TTarget](teardown: () => Unit | `false`): AnonTeardown[TTarget] = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
  
    __obj.asInstanceOf[AnonTeardown[TTarget]]
  }
}

