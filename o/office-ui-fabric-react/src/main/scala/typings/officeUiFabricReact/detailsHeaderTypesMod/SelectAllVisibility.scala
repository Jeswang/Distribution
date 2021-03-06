package typings.officeUiFabricReact.detailsHeaderTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectAllVisibility extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types", "SelectAllVisibility")
@js.native
object SelectAllVisibility extends js.Object {
  @js.native
  sealed trait hidden extends SelectAllVisibility
  
  @js.native
  sealed trait none extends SelectAllVisibility
  
  @js.native
  sealed trait visible extends SelectAllVisibility
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectAllVisibility with Double] = js.native
  /* 1 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object visible extends TopLevel[visible with Double]
  
}

