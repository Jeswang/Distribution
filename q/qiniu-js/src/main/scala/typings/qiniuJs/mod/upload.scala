package typings.qiniuJs.mod

import typings.qiniuJs.PartialConfig
import typings.qiniuJs.PartialExtra
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "upload")
@js.native
object upload extends js.Object {
  def apply(
    file: Blob,
    key: js.UndefOr[scala.Nothing],
    token: String,
    putExtra: PartialExtra,
    config: PartialConfig
  ): Observable = js.native
  def apply(file: Blob, key: String, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = js.native
  def apply(file: Blob, key: Null, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = js.native
}

