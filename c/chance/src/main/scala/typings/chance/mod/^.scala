package typings.chance.mod

import org.scalablytyped.runtime.TopLevel
import typings.chance.Chance.Chance
import typings.chance.Chance.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chance", JSImport.Namespace)
@js.native
class ^ () extends Chance {
  def this(generator: js.Function0[_]) = this()
  def this(seed: Seed) = this()
  /* CompleteClass */
  override var seed: Seed = js.native
}

@JSImport("chance", JSImport.Namespace)
@js.native
object ^ extends TopLevel[ExportedChance]

