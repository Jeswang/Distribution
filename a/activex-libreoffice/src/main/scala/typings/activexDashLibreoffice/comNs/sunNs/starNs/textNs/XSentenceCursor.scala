package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to perform cursor movements through sentences. */
trait XSentenceCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: Boolean): Boolean
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): Boolean
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): Boolean
}

object XSentenceCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoEndOfSentence: Boolean => Boolean,
    gotoNextSentence: Boolean => Boolean,
    gotoPreviousSentence: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfSentence: Boolean => Boolean,
    isCollapsed: () => Boolean,
    isEndOfSentence: () => Boolean,
    isStartOfSentence: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XSentenceCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfSentence = js.Any.fromFunction1(gotoEndOfSentence), gotoNextSentence = js.Any.fromFunction1(gotoNextSentence), gotoPreviousSentence = js.Any.fromFunction1(gotoPreviousSentence), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfSentence = js.Any.fromFunction1(gotoStartOfSentence), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfSentence = js.Any.fromFunction0(isEndOfSentence), isStartOfSentence = js.Any.fromFunction0(isStartOfSentence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XSentenceCursor]
  }
}

