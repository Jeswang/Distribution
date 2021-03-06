package typings.nivoScatterplot

import typings.nivoCore.mod.Dimensions
import typings.nivoScatterplot.mod.ScatterPlotCanvasProps
import typings.nivoScatterplot.mod.ScatterPlotSvgProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoScatterplotComponents extends nivoScatterplotProps {
  @scala.inline
  def ResponsiveScatterPlot: ComponentType[ResponsiveScatterPlotProps] = js.constructorOf[typings.nivoScatterplot.mod.ResponsiveScatterPlot].asInstanceOf[typings.react.mod.ComponentType[ResponsiveScatterPlotProps]]
  @scala.inline
  def ResponsiveScatterPlotCanvas: ComponentType[ResponsiveScatterPlotCanvasProps] = js.constructorOf[typings.nivoScatterplot.mod.ResponsiveScatterPlotCanvas].asInstanceOf[typings.react.mod.ComponentType[ResponsiveScatterPlotCanvasProps]]
  @scala.inline
  def ScatterPlot: ComponentType[ScatterPlotSvgProps with Dimensions] = js.constructorOf[typings.nivoScatterplot.mod.ScatterPlot].asInstanceOf[typings.react.mod.ComponentType[
  typings.nivoScatterplot.mod.ScatterPlotSvgProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def ScatterPlotCanvas: ComponentType[ScatterPlotCanvasProps with Dimensions] = js.constructorOf[typings.nivoScatterplot.mod.ScatterPlotCanvas].asInstanceOf[typings.react.mod.ComponentType[
  typings.nivoScatterplot.mod.ScatterPlotCanvasProps with typings.nivoCore.mod.Dimensions]]
}

