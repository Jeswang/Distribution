package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.XrError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrManager
  * @augments pc.EventHandler
  * @classdesc Manage and update XR session and its states.
  * @description Manage and update XR session and its states.
  * @param {pc.Application} app - The main application.
  * @property {boolean} supported True if XR is supported.
  * @property {boolean} active True if XR session is running.
  * @property {string|null} type Returns type of currently running XR session or null if no session is running. Can be
  * any of pc.XRTYPE_*.
  * @property {string|null} spaceType Returns reference space type of currently running XR session or null if no session
  * is running. Can be any of pc.XRSPACE_*.
  * @property {pc.Entity|null} camera Active camera for which XR session is running or null.
  */
@JSGlobal("pc.XrManager")
@js.native
class XrManager protected () extends EventHandler {
  def this(app: Application) = this()
  /**
    * True if XR session is running.
    */
  var active: Boolean = js.native
  /**
    * Active camera for which XR session is running or null.
    */
  var camera: Entity | Null = js.native
  /**
    * Returns reference space type of currently running XR session or null if no session
    * is running. Can be any of pc.XRSPACE_*.
    */
  var spaceType: String | Null = js.native
  /**
    * True if XR is supported.
    */
  var supported: Boolean = js.native
  /**
    * Returns type of currently running XR session or null if no session is running. Can be
    * any of pc.XRTYPE_*.
    */
  var `type`: String | Null = js.native
  /**
    * @function
    * @name pc.XrManager#end
    * @description Attempts to end XR session and optionally fires callback when session is ended or failed to end.
    * @example
    * app.keyboard.on('keydown', function (evt) {
    *     if (evt.key === pc.KEY_ESCAPE && app.xr.active) {
    *         app.xr.end();
    *     }
    * });
    * @param {pc.callbacks.XrError} [callback] - Optional callback function called once session is started. The callback has one argument Error - it is null if successfully started XR session.
    */
  def end(): Unit = js.native
  def end(callback: XrError): Unit = js.native
  /**
    * @function
    * @name pc.XrManager#isAvailable
    * @description Check if specific type of session is available
    * @param {string} type - session type. Can be one of the following:
    *
    * * {@link pc.XRTYPE_INLINE}: Inline - always available type of session. It has limited features availability and is rendered into HTML element.
    * * {@link pc.XRTYPE_VR}: Immersive VR - session that provides exclusive access to VR device with best available tracking features.
    * * {@link pc.XRTYPE_AR}: Immersive AR - session that provides exclusive access to VR/AR device that is intended to be blended with real-world environment.
    *
    * @example
    * if (app.xr.isAvailable(pc.XRTYPE_VR)) {
    *     // VR is available
    * }
    * @returns {boolean} True if specified session type is available.
    */
  def isAvailable(`type`: String): Boolean = js.native
  /**
    * @function
    * @name pc.XrManager#start
    * @description Attempts to start XR session for provided {@link pc.CameraComponent} and optionally fires callback when session is created or failed to create.
    * @param {pc.CameraComponent} camera - it will be used to render XR session and manipulated based on pose tracking
    * @param {string} type - session type. Can be one of the following:
    *
    * * {@link pc.XRTYPE_INLINE}: Inline - always available type of session. It has limited features availability and is rendered into HTML element.
    * * {@link pc.XRTYPE_VR}: Immersive VR - session that provides exclusive access to VR device with best available tracking features.
    * * {@link pc.XRTYPE_AR}: Immersive AR - session that provides exclusive access to VR/AR device that is intended to be blended with real-world environment.
    *
    * @param {string} spaceType - reference space type. Can be one of the following:
    *
    * * {@link pc.XRSPACE_VIEWER}: Viewer - always supported space with some basic tracking capabilities.
    * * {@link pc.XRSPACE_LOCAL}: Local - represents a tracking space with a native origin near the viewer at the time of creation. It is meant for seated or basic local XR sessions.
    * * {@link pc.XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with a native origin at the floor in a safe position for the user to stand. The y axis equals 0 at floor level. Floor level value might be estimated by the underlying platform. It is meant for seated or basic local XR sessions.
    * * {@link pc.XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space with its native origin at the floor, where the user is expected to move within a pre-established boundary.
    * * {@link pc.XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the user is expected to move freely around their environment, potentially long distances from their starting point.
    *
    * @example
    * button.on('click', function () {
    *     app.xr.start(camera, pc.XRTYPE_VR, pc.XRSPACE_LOCAL);
    * });
    * @param {pc.callbacks.XrError} [callback] - Optional callback function called once session is started. The callback has one argument Error - it is null if successfully started XR session.
    */
  def start(camera: CameraComponent, `type`: String, spaceType: String): Unit = js.native
  def start(camera: CameraComponent, `type`: String, spaceType: String, callback: XrError): Unit = js.native
}

