package typings.algoliaClientAnalytics.mod

import typings.algoliaClientAnalytics.ReadonlyPromiseGetABTestR
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-analytics", "getABTest")
@js.native
object getABTest extends js.Object {
  def apply(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseGetABTestR
  ] = js.native
}

