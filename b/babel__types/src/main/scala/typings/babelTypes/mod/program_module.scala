package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "program")
@js.native
object program_module extends js.Object {
  def apply(body: js.Array[Statement], directives: js.Array[Directive_], sourceType: module): Program_ = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceType: module,
    interpreter: InterpreterDirective_
  ): Program_ = js.native
}

