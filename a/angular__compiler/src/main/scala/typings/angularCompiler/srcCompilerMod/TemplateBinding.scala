package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateBinding")
@js.native
class TemplateBinding protected ()
  extends typings.angularCompiler.astMod.TemplateBinding {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    key: String,
    keyIsVar: Boolean,
    name: String
  ) = this()
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    key: String,
    keyIsVar: Boolean,
    name: String,
    value: typings.angularCompiler.astMod.ASTWithSource
  ) = this()
}

