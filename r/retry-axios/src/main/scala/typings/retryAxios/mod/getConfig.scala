package typings.retryAxios.mod

import typings.axios.mod.AxiosError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry-axios", "getConfig")
@js.native
object getConfig extends js.Object {
  def apply(err: AxiosError[_]): js.UndefOr[RetryConfig] = js.native
}

