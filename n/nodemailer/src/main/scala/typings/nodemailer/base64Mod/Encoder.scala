package typings.nodemailer.base64Mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/base64", "Encoder")
@js.native
class Encoder () extends Transform {
  def this(options: EncoderOptions) = this()
  var inputBytes: Double = js.native
  var options: EncoderOptions = js.native
  var outputBytes: Double = js.native
}

