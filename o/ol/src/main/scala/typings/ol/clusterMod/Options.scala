package typings.ol.clusterMod

import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var geometryFunction: js.UndefOr[
    js.Function1[
      /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], 
      typings.ol.pointMod.default
    ]
  ] = js.undefined
  var source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default],
    attributions: AttributionLike = null,
    distance: Int | Double = null,
    geometryFunction: /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] => typings.ol.pointMod.default = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction1(geometryFunction))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

