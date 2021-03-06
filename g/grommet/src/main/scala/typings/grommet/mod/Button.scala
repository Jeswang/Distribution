package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.buttonMod.ButtonProps
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Button")
@js.native
object Button extends TopLevel[
      FC[
        ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ])
      ]
    ]

