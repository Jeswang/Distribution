package typings.antdMobile.actionSheetMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOption extends js.Object {
  var icon: ReactNode
  var title: String
}

object ShareOption {
  @scala.inline
  def apply(title: String, icon: ReactNode = null): ShareOption = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOption]
  }
}

