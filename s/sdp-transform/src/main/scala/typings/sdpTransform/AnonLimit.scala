package typings.sdpTransform

import typings.sdpTransform.sdpTransformStrings.AS
import typings.sdpTransform.sdpTransformStrings.CT
import typings.sdpTransform.sdpTransformStrings.RR
import typings.sdpTransform.sdpTransformStrings.RS
import typings.sdpTransform.sdpTransformStrings.TIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: Double | String
  var `type`: TIAS | AS | CT | RR | RS
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

