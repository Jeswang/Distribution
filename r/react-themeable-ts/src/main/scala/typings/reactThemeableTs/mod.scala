package typings.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Validator
import typings.reactThemeableTs.hocMod.IThemeDecoratorArgs
import typings.reactThemeableTs.hocMod.TDecComponent
import typings.reactThemeableTs.themeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ThemeProvider ()
    extends typings.reactThemeableTs.themeProviderMod.ThemeProvider
  
  val themeable: IStaticFn = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  /* static members */
  @js.native
  object ThemeProvider extends js.Object {
    var childContextTypes: StringDictionary[Validator[_]] = js.native
    var defaultProps: StringDictionary[js.Object] = js.native
  }
  
}

