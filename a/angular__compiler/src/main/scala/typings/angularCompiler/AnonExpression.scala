package typings.angularCompiler

import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.InvokeFunctionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: InvokeFunctionExpr
  var `type`: ExpressionType_
}

object AnonExpression {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, `type`: ExpressionType_): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpression]
  }
}

