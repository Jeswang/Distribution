package typings.knockoutPreRendered

import typings.std.Document_
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplyMemoizedBindingsToNextSibling extends js.Object {
  def applyMemoizedBindingsToNextSibling(bindings: js.Any, nodeName: String): String = js.native
  def ensureTemplateIsRewritten(template: String, templateEngine: KnockoutTemplateEngine, templateDocument: Document_): js.Any = js.native
  def ensureTemplateIsRewritten(template: Node, templateEngine: KnockoutTemplateEngine, templateDocument: Document_): js.Any = js.native
  def memoizeBindingAttributeSyntax(htmlString: String, templateEngine: KnockoutTemplateEngine): js.Any = js.native
}

