package typings.tslint.utilsMod

import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "getSourceFile")
@js.native
object getSourceFile extends js.Object {
  def apply(fileName: String, source: String): SourceFile = js.native
}

