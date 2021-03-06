package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatch extends js.Object {
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[Input[js.Array[Input[RouteSpecHttpRouteMatchHeader]]]] = js.native
  /**
    * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
    */
  var method: js.UndefOr[Input[String]] = js.native
  /**
    * The header value sent by the client must begin with the specified characters.
    * * `range`- (Optional) The object that specifies the range of numbers that the header value sent by the client must be included in.
    */
  var prefix: Input[String] = js.native
  /**
    * The client request header scheme to match on. Valid values: `http`, `https`.
    */
  var scheme: js.UndefOr[Input[String]] = js.native
}

object RouteSpecHttpRouteMatch {
  @scala.inline
  def apply(
    prefix: Input[String],
    headers: Input[js.Array[Input[RouteSpecHttpRouteMatchHeader]]] = null,
    method: Input[String] = null,
    scheme: Input[String] = null
  ): RouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatch]
  }
}

