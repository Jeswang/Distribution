package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClusterPlacemarkProperties extends IDataManager {
  var geoObjects: js.Array[IGeoObject]
}

object IClusterPlacemarkProperties {
  @scala.inline
  def apply(events: IEventManager, geoObjects: js.Array[IGeoObject], get: (String, js.Object) => js.Object): IClusterPlacemarkProperties = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geoObjects = geoObjects.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[IClusterPlacemarkProperties]
  }
}

