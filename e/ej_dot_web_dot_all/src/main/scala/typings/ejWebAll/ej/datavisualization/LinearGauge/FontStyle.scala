package typings.ejWebAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Bold extends FontStyle
  
  //string
  @js.native
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Regular extends FontStyle
  
  //string
  @js.native
  sealed trait Strikeout extends FontStyle
  
  //string
  @js.native
  sealed trait Underline extends FontStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
  /* 0 */ @js.native
  object Bold extends TopLevel[Bold with Double]
  
  /* 1 */ @js.native
  object Italic extends TopLevel[Italic with Double]
  
  /* 2 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
  /* 3 */ @js.native
  object Strikeout extends TopLevel[Strikeout with Double]
  
  /* 4 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
}

