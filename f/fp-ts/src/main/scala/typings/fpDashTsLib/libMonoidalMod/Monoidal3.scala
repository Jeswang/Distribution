package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoidal3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def mult[U, L, A, B](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], fb: fpDashTsLib.libHKTMod.Kind3[F, U, L, B]): fpDashTsLib.libHKTMod.Kind3[F, U, L, js.Tuple2[A, B]]
  def unit[U, L](): fpDashTsLib.libHKTMod.Kind3[F, U, L, scala.Unit]
}

object Monoidal3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    mult: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Tuple2[js.Any, js.Any]],
    unit: () => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, scala.Unit]
  ): Monoidal3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mult = js.Any.fromFunction2(mult), unit = js.Any.fromFunction0(unit))
  
    __obj.asInstanceOf[Monoidal3[F]]
  }
}

