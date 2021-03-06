package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCatalogsAssociationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of catalog associations to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from the previous call to `ListAssociations`.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The resource name of the `Catalog` whose `Associations` are being
    * retrieved. In the format `catalogs/<catalog>`.
    */
  var parent: js.UndefOr[String] = js.native
}

