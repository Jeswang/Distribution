package typings.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "MessageBundle")
@js.native
class MessageBundle protected ()
  extends typings.angularCompiler.i18nMod.MessageBundle {
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _implicitTags: js.Array[String],
    _implicitAttrs: StringDictionary[js.Array[String]]
  ) = this()
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _implicitTags: js.Array[String],
    _implicitAttrs: StringDictionary[js.Array[String]],
    _locale: String
  ) = this()
}

