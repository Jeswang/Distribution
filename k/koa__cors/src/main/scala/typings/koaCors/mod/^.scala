package typings.koaCors.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@koa/cors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * CORS middleware factory.
    * @param options - Configuration options.
    * @returns cors middleware
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

