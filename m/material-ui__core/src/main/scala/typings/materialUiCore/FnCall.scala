package typings.materialUiCore

import typings.enzyme.mod.MountRendererProps
import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def apply[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
}

