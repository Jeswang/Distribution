package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.pulumiPulumiStrings.pulumiColonpulumiColonStack
import typings.pulumiPulumi.resourceMod.ComponentResource
import typings.pulumiPulumi.resourceMod.ResourceTransformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  /**
    * Stack is the root resource for a Pulumi stack. Before invoking the `init` callback, it registers itself as the root
    * resource with the Pulumi engine.
    */
  @js.native
  trait Stack extends ComponentResource[Inputs] {
    /**
      * The outputs of this stack, if the `init` callback exited normally.
      */
    val outputs: Output_[Inputs] = js.native
    /**
      * runInit invokes the given init callback with this resource set as the root resource. The return value of init is
      * used as the stack's output properties.
      *
      * @param init The callback to run in the context of this Pulumi stack
      */
    def initialize(args: AnonInit): js.Promise[Inputs] = js.native
  }
  
  val rootPulumiStackTypeName: pulumiColonpulumiColonStack = js.native
  def getStackResource(): js.UndefOr[Stack] = js.native
  def registerStackTransformation(t: ResourceTransformation): Unit = js.native
  def runInPulumiStack(init: js.Function0[js.Promise[_]]): js.Promise[js.UndefOr[Inputs]] = js.native
}

