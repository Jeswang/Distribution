package typings.mocha.mod

import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha_.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
@JSImport("mocha", "afterEach")
@js.native
object afterEach extends TopLevel[HookFunction]

