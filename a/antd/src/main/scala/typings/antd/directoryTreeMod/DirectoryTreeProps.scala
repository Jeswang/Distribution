package typings.antd.directoryTreeMod

import typings.antd.AnonChecked
import typings.antd.treeTreeMod.AntTreeNode
import typings.antd.treeTreeMod.AntdTreeNodeAttribute
import typings.antd.treeTreeMod.TreeProps
import typings.rcTree.mod.CheckData
import typings.rcTree.mod.ExpandData
import typings.rcTree.mod.InternalTreeNode
import typings.rcTree.mod.OnDragEndData
import typings.rcTree.mod.OnDragEnterData
import typings.rcTree.mod.OnDragLeaveData
import typings.rcTree.mod.OnDragOverData
import typings.rcTree.mod.OnDragStartData
import typings.rcTree.mod.OnDropData
import typings.rcTree.mod.OnMouseEnterData
import typings.rcTree.mod.OnMouseLeaveData
import typings.rcTree.mod.OnRightClickData
import typings.rcTree.mod.SelectData
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryTreeProps extends TreeProps {
  var expandAction: js.UndefOr[ExpandAction] = js.undefined
}

object DirectoryTreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    blockNode: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedKeys: js.Array[String] | AnonChecked = null,
    children: ReactNode = null,
    className: String = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    expandAction: ExpandAction = null,
    expandedKeys: js.Array[String] = null,
    filterAntTreeNode: /* node */ AntTreeNode => Boolean = null,
    filterTreeNode: /* node */ InternalTreeNode => Boolean = null,
    icon: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactNode]) | ReactNode = null,
    loadData: /* node */ InternalTreeNode => js.Promise[_] = null,
    loadedKeys: js.Array[String] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onCheck: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Unit = null,
    onDragEnd: /* props */ OnDragEndData => Unit = null,
    onDragEnter: /* props */ OnDragEnterData => Unit = null,
    onDragLeave: /* props */ OnDragLeaveData => Unit = null,
    onDragOver: /* props */ OnDragOverData => Unit = null,
    onDragStart: /* props */ OnDragStartData => Unit = null,
    onDrop: /* props */ OnDropData => Unit = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Unit = null,
    onMouseEnter: /* props */ OnMouseEnterData => Unit = null,
    onMouseLeave: /* props */ OnMouseLeaveData => Unit = null,
    onRightClick: /* props */ OnRightClickData => Unit = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    switcherIcon: ReactElement = null
  ): DirectoryTreeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(blockNode)) __obj.updateDynamic("blockNode")(blockNode.asInstanceOf[js.Any])
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent.asInstanceOf[js.Any])
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (expandAction != null) __obj.updateDynamic("expandAction")(expandAction.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1(filterAntTreeNode))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1(filterTreeNode))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1(onRightClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryTreeProps]
  }
}

