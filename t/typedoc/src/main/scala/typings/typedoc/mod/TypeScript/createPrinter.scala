package typings.typedoc.mod.TypeScript

import typings.typescript.mod.PrintHandlers
import typings.typescript.mod.Printer
import typings.typescript.mod.PrinterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createPrinter")
@js.native
object createPrinter extends js.Object {
  def apply(): Printer = js.native
  def apply(printerOptions: PrinterOptions): Printer = js.native
  def apply(printerOptions: PrinterOptions, handlers: PrintHandlers): Printer = js.native
}

