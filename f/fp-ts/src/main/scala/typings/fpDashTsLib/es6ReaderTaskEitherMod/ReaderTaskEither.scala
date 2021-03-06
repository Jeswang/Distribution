package typings
package fpDashTsLib.es6ReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/ReaderTaskEither", "ReaderTaskEither")
@js.native
class ReaderTaskEither[E, L, A] protected () extends js.Object {
  def this(value: js.Function1[/* e */ E, fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]]) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _U: E = js.native
  val _URI: URI = js.native
  /** @obsolete */
  def alt(fy: ReaderTaskEither[E, L, A]): ReaderTaskEither[E, L, A] = js.native
  /** @obsolete */
  def ap[B](fab: ReaderTaskEither[E, L, js.Function1[/* a */ A, B]]): ReaderTaskEither[E, L, B] = js.native
  /**
    * Flipped version of `ap`
    * @obsolete
    */
  def ap_[B, C](`this`: ReaderTaskEither[E, L, js.Function1[/* b */ B, C]], fb: ReaderTaskEither[E, L, B]): ReaderTaskEither[E, L, C] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the first
    * @obsolete
    */
  def applyFirst[B](fb: ReaderTaskEither[E, L, B]): ReaderTaskEither[E, L, A] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the second
    * @obsolete
    */
  def applySecond[B](fb: ReaderTaskEither[E, L, B]): ReaderTaskEither[E, L, B] = js.native
  /** @obsolete */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): ReaderTaskEither[E, V, B] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, ReaderTaskEither[E, L, B]]): ReaderTaskEither[E, L, B] = js.native
  /** @obsolete */
  def fold[R](left: js.Function1[/* l */ L, R], right: js.Function1[/* a */ A, R]): fpDashTsLib.es6ReaderMod.Reader[E, fpDashTsLib.es6TaskMod.Task[R]] = js.native
  /**
    * @since 1.6.1
    * @obsolete
    */
  def local[E2](f: js.Function1[/* e */ E2, E]): ReaderTaskEither[E2, L, A] = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): ReaderTaskEither[E, L, B] = js.native
  /** @obsolete */
  def mapLeft[M](f: js.Function1[/* l */ L, M]): ReaderTaskEither[E, M, A] = js.native
  /**
    * Transforms the failure value of the `ReaderTaskEither` into a new `ReaderTaskEither`
    * @obsolete
    */
  def orElse[M](f: js.Function1[/* l */ L, ReaderTaskEither[E, M, A]]): ReaderTaskEither[E, M, A] = js.native
  /** Runs the inner `TaskEither` */
  def run(e: E): js.Promise[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  def value(e: E): fpDashTsLib.es6TaskEitherMod.TaskEither[L, A] = js.native
}

