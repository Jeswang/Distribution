package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.popupPopupMod.PopupComponent
import typings.semanticUiReact.popupPopupMod.PopupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Popup", JSImport.Namespace)
@js.native
object popupMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[PopupProps, ComponentState, js.Any] {
    def this(props: PopupProps) = this()
    def this(props: PopupProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[PopupComponent]
  
}

