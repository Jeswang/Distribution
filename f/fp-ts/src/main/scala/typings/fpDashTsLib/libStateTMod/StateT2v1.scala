package typings
package fpDashTsLib.libStateTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateT2v1[M /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def ap[S, A, B](
    fab: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Function1[/* a */ A, B], S]]],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[B, S]]]
  def chain[S, A, B](
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[A, S]]],
    f: js.Function1[/* a */ A, js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[B, S]]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[B, S]]]
  def map[S, A, B](
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[A, S]]],
    f: js.Function1[/* a */ A, B]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[B, S]]]
  def of[S, A](a: A): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[A, S]]]
}

object StateT2v1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: (js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Function1[js.Any, js.Any], js.Any]]
    ], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]],
    chain: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]], js.Function1[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]]
    ]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]],
    map: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]], js.Function1[js.Any, js.Any]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]],
    of: js.Any => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Tuple2[js.Any, js.Any]]]
  ): StateT2v1[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[StateT2v1[M]]
  }
}

