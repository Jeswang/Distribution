package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "pair")
@js.native
object pairNs extends js.Object {
  @js.native
  class Pair[A] protected ()
    extends fpDashTsLib.libPairMod.Pair[A] {
    def this(fst: A, snd: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Pair = js.native
  val pair: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libPairMod.URI] = js.native
  def getEq[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getShow[L, A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libPairMod.Pair[A]] = js.native
}

