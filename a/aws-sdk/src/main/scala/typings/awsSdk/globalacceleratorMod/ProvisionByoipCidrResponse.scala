package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionByoipCidrResponse extends js.Object {
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}

object ProvisionByoipCidrResponse {
  @scala.inline
  def apply(ByoipCidr: ByoipCidr = null): ProvisionByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidr != null) __obj.updateDynamic("ByoipCidr")(ByoipCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrResponse]
  }
}

