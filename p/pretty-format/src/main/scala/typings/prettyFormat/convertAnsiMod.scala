package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.NewPlugin
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/ConvertAnsi", JSImport.Namespace)
@js.native
object convertAnsiMod extends js.Object {
  val default: NewPlugin = js.native
  def serialize(`val`: String, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
  def test(`val`: js.Any): Boolean = js.native
}

