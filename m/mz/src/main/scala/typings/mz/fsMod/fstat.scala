package typings.mz.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz/fs", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def apply(
    fd: Double,
    callback: js.Function2[ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, _ | Unit]
  ): Unit = js.native
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
}

