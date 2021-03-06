package typings.ember.mod.Ember

import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[T, K] = js.native
}

