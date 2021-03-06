package typings.sipJs.apiMod

import typings.sipJs.byerOptionsMod.ByerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Byer")
@js.native
class Byer protected ()
  extends typings.sipJs.byerMod.Byer {
  /**
    * Constructs a new instance of the `Byer` class.
    * @param session - The session the BYE will be sent from. See {@link Session} for details.
    * @param options - An options bucket. See {@link ByerOptions} for details.
    */
  def this(session: typings.sipJs.sessionMod.Session) = this()
  def this(session: typings.sipJs.sessionMod.Session, options: ByerOptions) = this()
}

