package typings.azdata.mod.queryeditor

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "queryeditor.getQueryDocument")
@js.native
object getQueryDocument extends js.Object {
  def apply(fileUri: String): Thenable[QueryDocument] = js.native
}

