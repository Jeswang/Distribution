package typings.materialUiCore

import org.scalablytyped.runtime.TopLevel
import typings.materialUiCore.badgeBadgeMod.BadgeProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Badge", JSImport.Namespace)
@js.native
object badgeMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[BadgeProps, ComponentState, js.Any] {
    def this(props: BadgeProps) = this()
    def this(props: BadgeProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[BadgeProps]]
  
}

