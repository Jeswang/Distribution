package typings.reduxBootstrap.interfacesMod.interfaces

import typings.react.mod._Global_.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostrapOptions extends js.Object {
  var container: js.UndefOr[String] = js.undefined
  var createHistory: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
  ] = js.undefined
  var devToolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
  var enhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.undefined
  var historyOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
  ] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
  var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.undefined
  var reducers: ReducersOption
  var render: js.UndefOr[js.Function] = js.undefined
  var routerProps: js.UndefOr[RouterProps] = js.undefined
  var routes: Element
}

object BoostrapOptions {
  @scala.inline
  def apply(
    reducers: ReducersOption,
    routes: Element,
    container: String = null,
    createHistory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any = null,
    devToolsOptions: DevToolsOptions = null,
    enhancers: js.Array[StoreEnhancer[_, js.Object]] = null,
    historyOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any = null,
    initialState: js.Any = null,
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]] = null,
    render: js.Function = null,
    routerProps: RouterProps = null
  ): BoostrapOptions = {
    val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (createHistory != null) __obj.updateDynamic("createHistory")(createHistory.asInstanceOf[js.Any])
    if (devToolsOptions != null) __obj.updateDynamic("devToolsOptions")(devToolsOptions.asInstanceOf[js.Any])
    if (enhancers != null) __obj.updateDynamic("enhancers")(enhancers.asInstanceOf[js.Any])
    if (historyOptions != null) __obj.updateDynamic("historyOptions")(historyOptions.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (middlewares != null) __obj.updateDynamic("middlewares")(middlewares.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (routerProps != null) __obj.updateDynamic("routerProps")(routerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoostrapOptions]
  }
}

