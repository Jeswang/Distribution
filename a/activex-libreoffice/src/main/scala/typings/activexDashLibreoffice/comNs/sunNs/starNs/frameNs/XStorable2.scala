package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends {@link XStorable} . */
trait XStorable2 extends XStorable {
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    *
    * This is an extension of the {@link XStorable.store()} . This method allows to specify some additional parameters for storing process.
    * @param lArguments optional parameters for saving, can take values from subset of {@link com.sun.star.document.MediaDescriptor}
    * @see XStorable.store
    * @throws com::sun::star::lang::IllegalArgumentException the optional parameters contain unacceptable for save entry
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation
    */
  def storeSelf(lArguments: SeqEquiv[PropertyValue]): Unit
}

object XStorable2 {
  @scala.inline
  def apply(
    Location: String,
    acquire: () => Unit,
    getLocation: () => String,
    hasLocation: () => Boolean,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    store: () => Unit,
    storeAsURL: (String, SeqEquiv[PropertyValue]) => Unit,
    storeSelf: SeqEquiv[PropertyValue] => Unit,
    storeToURL: (String, SeqEquiv[PropertyValue]) => Unit
  ): XStorable2 = {
    val __obj = js.Dynamic.literal(Location = Location, acquire = js.Any.fromFunction0(acquire), getLocation = js.Any.fromFunction0(getLocation), hasLocation = js.Any.fromFunction0(hasLocation), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction2(storeAsURL), storeSelf = js.Any.fromFunction1(storeSelf), storeToURL = js.Any.fromFunction2(storeToURL))
  
    __obj.asInstanceOf[XStorable2]
  }
}

