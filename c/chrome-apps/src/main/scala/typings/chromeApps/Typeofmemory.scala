package typings.chromeApps

import typings.chromeApps.chrome.system.memory.MemoryInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmemory extends js.Object {
  /** Get physical memory information. */
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit
}

object Typeofmemory {
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Typeofmemory = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
  
    __obj.asInstanceOf[Typeofmemory]
  }
}

