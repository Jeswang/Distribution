package typings.connectMongo.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-mongo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(connect: js.Function1[/* options */ js.UndefOr[SessionOptions], RequestHandler[ParamsDictionary]]): MongoStoreFactory = js.native
}

