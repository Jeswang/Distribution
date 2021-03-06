package typings.gapiClientSpanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilter extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * An expression for filtering the results of the request. Filter rules are
    * case insensitive. The fields eligible for filtering are:
    *
    * &#42; name
    * &#42; display_name
    * &#42; labels.key where key is the name of a label
    *
    * Some examples of using filters are:
    *
    * &#42; name:&#42; --> The instance has a name.
    * &#42; name:Howl --> The instance's name contains the string "howl".
    * &#42; name:HOWL --> Equivalent to above.
    * &#42; NAME:howl --> Equivalent to above.
    * &#42; labels.env:&#42; --> The instance has the label "env".
    * &#42; labels.env:dev --> The instance has the label "env" and the value of
    * the label contains the string "dev".
    * &#42; name:howl labels.env:dev --> The instance's name contains "howl" and
    * it has the label "env" with its value
    * containing "dev".
    */
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Number of instances to be returned in the response. If 0 or less, defaults
    * to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If non-empty, `page_token` should contain a
    * next_page_token from a
    * previous ListInstancesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the project for which a list of instances is
    * requested. Values are of the form `projects/<project>`.
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

