package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenInstancePublicPortsResult extends js.Object {
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the time stamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object OpenInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): OpenInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenInstancePublicPortsResult]
  }
}

