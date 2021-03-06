package typings.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "SessionState")
@js.native
object SessionState extends js.Object {
  /* "Established" */ val Established: typings.sipJs.sessionStateMod.SessionState.Established with String = js.native
  /* "Establishing" */ val Establishing: typings.sipJs.sessionStateMod.SessionState.Establishing with String = js.native
  /* "Initial" */ val Initial: typings.sipJs.sessionStateMod.SessionState.Initial with String = js.native
  /* "Terminated" */ val Terminated: typings.sipJs.sessionStateMod.SessionState.Terminated with String = js.native
  /* "Terminating" */ val Terminating: typings.sipJs.sessionStateMod.SessionState.Terminating with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.sessionStateMod.SessionState with String] = js.native
}

