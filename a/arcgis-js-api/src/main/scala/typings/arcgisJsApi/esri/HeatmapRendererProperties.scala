package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapRendererProperties extends RendererProperties {
  /**
    * The area of influence for each point in the layer. This is defined as a radius in pixels. The default is `10`, which means the pixels within a 10-pixel radius of the point's location are assigned an intensity value corresponding to their distance from the nearby point. Increasing this value creates a larger heatmap with more hotspots. Decreasing it makes a smaller heatmap with fewer hotspots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius)
    *
    * @default 10
    */
  var blurRadius: js.UndefOr[Double] = js.undefined
  /**
    * An array of objects describing the renderer's color ramp. The ratio of a pixel's intensity value to the [maxPixelIntensity](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxPixelIntensity) of the renderer is mapped to a corresponding [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#color) along a continuous ramp. The color of the first stop (i.e. the stop with the lowest `ratio` value) must have an alpha value of `0` for the underlying basemap to be visible in the app.  The default value is the following:
    * ```js
    * [
    *   { ratio: 0, color: "rgba(255, 140, 0, 0)" },
    *   { ratio: 0.75, color: "rgba(255, 140, 0, 1)" },
    *   { ratio: 0.9, color: "rgba(255, 0,   0, 1)" }
    * ]
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops)
    */
  var colorStops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.undefined
  /**
    * The name of the attribute field used to weight the intensity of each heatmap point.  For example, suppose you have a layer of points representing buildings containing a field `num_units` for the number of units in the building (if it's an apartment complex). You could weight the heatmap renderer based on the `num_units` field to create a heatmap representing the density of housing units in a city.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The pixel intensity value that determines which pixels are assigned the final color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops). Pixelx with intensity values above this number will be assigned the final (or hottest) color in the color ramp.  Typically, `minPixelIntensity` will be zero and `maxPixelIntensity` will be set to a high value appropriate for the dataset. The default may not be ideal for your dataset, so this value will likely need to change.  Determining the best values for `minPixelIntensity` and `maxPixelIntensity` is an exercise left up to the developer since different types, scales, densities, and distributions of data will require different values for these properties to create a visually pleasing separation of high and low intensity areas appropriate for the data and the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxPixelIntensity)
    *
    * @default 100
    */
  var maxPixelIntensity: js.UndefOr[Double] = js.undefined
  /**
    * The pixel intensity value used to determine which pixels will be assigned the initial color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops). Pixels with intensity values below this number will be excluded from the visualization.  When using a [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field) to weight the points, setting `minPixelIntensity` above zero might help to visually deemphasize frequently occurring but low value point clusters. This property does not actually filter the data or modify the calculated intensity value. Rather, it scales the color ramp such that a higher intensity value is required for a pixel to get a noticeable color.  Determining the best values for `minPixelIntensity` and  `maxPixelIntensity` is an exercise left up to the developer since different types, scales, densities, and distributions of data will require different values for these properties to create a visually pleasing separation of high and low intensity areas appropriate for the data and the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity)
    *
    * @default 0
    */
  var minPixelIntensity: js.UndefOr[Double] = js.undefined
}

object HeatmapRendererProperties {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfoProperties = null,
    blurRadius: Int | Double = null,
    colorStops: js.Array[HeatmapColorStopProperties] = null,
    field: String = null,
    maxPixelIntensity: Int | Double = null,
    minPixelIntensity: Int | Double = null
  ): HeatmapRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (authoringInfo != null) __obj.updateDynamic("authoringInfo")(authoringInfo.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (colorStops != null) __obj.updateDynamic("colorStops")(colorStops.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (maxPixelIntensity != null) __obj.updateDynamic("maxPixelIntensity")(maxPixelIntensity.asInstanceOf[js.Any])
    if (minPixelIntensity != null) __obj.updateDynamic("minPixelIntensity")(minPixelIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapRendererProperties]
  }
}

