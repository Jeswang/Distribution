package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenMixin extends js.Object {
  val children: js.Array[SceneNode] = js.native
  def appendChild(child: SceneNode): Unit = js.native
  /**
    * If you only need to search immediate children, it is much faster
    * to call node.children.filter(callback) or node.findChildren(callback)
    */
  def findAll(): js.Array[SceneNode] = js.native
  def findAll(callback: js.Function1[/* node */ SceneNode, Boolean]): js.Array[SceneNode] = js.native
  def findChild(callback: js.Function1[/* node */ SceneNode, Boolean]): SceneNode | Null = js.native
  def findChildren(): js.Array[SceneNode] = js.native
  def findChildren(callback: js.Function1[/* node */ SceneNode, Boolean]): js.Array[SceneNode] = js.native
  /**
    * If you only need to search immediate children, it is much faster
    * to call node.children.find(callback) or node.findChild(callback)
    */
  def findOne(callback: js.Function1[/* node */ SceneNode, Boolean]): SceneNode | Null = js.native
  def insertChild(index: Double, child: SceneNode): Unit = js.native
}

