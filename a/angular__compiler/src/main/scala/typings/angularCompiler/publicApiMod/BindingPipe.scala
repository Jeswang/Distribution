package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BindingPipe")
@js.native
class BindingPipe protected ()
  extends typings.angularCompiler.srcCompilerMod.BindingPipe {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    exp: typings.angularCompiler.astMod.AST,
    name: String,
    args: js.Array[_],
    nameSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}

