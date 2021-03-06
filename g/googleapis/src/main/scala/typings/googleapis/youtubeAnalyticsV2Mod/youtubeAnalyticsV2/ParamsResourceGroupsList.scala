package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The `id` parameter specifies a comma-separated list of the YouTube group
    * ID(s) for the resource(s) that are being retrieved. Each group must be
    * owned by the authenticated user. In a `group` resource, the `id` property
    * specifies the group's YouTube group ID.  Note that if you do not specify
    * a value for the `id` parameter, then you must set the `mine` parameter to
    * `true`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This parameter can only be used in a properly authorized request. Set
    * this parameter's value to true to retrieve all groups owned by the
    * authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.native
  /**
    * This parameter can only be used in a properly authorized request.
    * **Note:** This parameter is intended exclusively for YouTube content
    * partners that own and manage many different YouTube channels.  The
    * `onBehalfOfContentOwner` parameter indicates that the request's
    * authorization credentials identify a YouTube user who is acting on behalf
    * of the content owner specified in the parameter value. It allows content
    * owners to authenticate once and get access to all their video and channel
    * data, without having to provide authentication credentials for each
    * individual channel. The account that the user authenticates with must be
    * linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * The `pageToken` parameter identifies a specific page in the result set
    * that should be returned. In an API response, the `nextPageToken` property
    * identifies the next page that can be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
}

