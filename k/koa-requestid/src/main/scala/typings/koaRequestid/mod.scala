package typings.koaRequestid

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-requestid", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: AnonExpose): Middleware[DefaultState, DefaultContext] = js.native
}

