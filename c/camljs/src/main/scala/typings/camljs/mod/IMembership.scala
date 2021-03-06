package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsIn* methods instead. This interface will be removed in the next release */
trait IMembership extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWeb* methods instead */
  var SPWeb: IMembershipSPWeb
  /** DEPRECATED. Please use UserField(...).IsInCurrentUserGroups() instead */
  def CurrentUserGroups(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPGroup() instead */
  def SPGroup(groupId: Double): IExpression
}

object IMembership {
  @scala.inline
  def apply(CurrentUserGroups: () => IExpression, SPGroup: Double => IExpression, SPWeb: IMembershipSPWeb): IMembership = {
    val __obj = js.Dynamic.literal(CurrentUserGroups = js.Any.fromFunction0(CurrentUserGroups), SPGroup = js.Any.fromFunction1(SPGroup), SPWeb = SPWeb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMembership]
  }
}

