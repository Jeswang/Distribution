package typings.pulumiAws.nodejsAppLayerMod

import typings.pulumiAws.outputMod.opsworks.NodejsAppLayerEbsVolume
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/nodejsAppLayer", "NodejsAppLayer")
@js.native
class NodejsAppLayer protected () extends CustomResource {
  /**
    * Create a NodejsAppLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NodejsAppLayerArgs) = this()
  def this(name: String, args: NodejsAppLayerArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: Output_[js.UndefOr[Boolean]] = js.native
  val customConfigureRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
  val customDeployRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: Output_[js.UndefOr[String]] = js.native
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: Output_[js.UndefOr[String]] = js.native
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  val customSetupRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
  val customShutdownRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
  val customUndeployRecipes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: Output_[js.UndefOr[js.Array[NodejsAppLayerEbsVolume]]] = js.native
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: Output_[js.UndefOr[Double]] = js.native
  /**
    * A human-readable name for the layer.
    */
  val name: Output_[String] = js.native
  /**
    * The version of NodeJS to use. Defaults to "0.10.38".
    */
  val nodejsVersion: Output_[js.UndefOr[String]] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: Output_[String] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: Output_[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/nodejsAppLayer", "NodejsAppLayer")
@js.native
object NodejsAppLayer extends js.Object {
  /**
    * Get an existing NodejsAppLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NodejsAppLayer = js.native
  def get(name: String, id: Input[ID], state: NodejsAppLayerState): NodejsAppLayer = js.native
  def get(name: String, id: Input[ID], state: NodejsAppLayerState, opts: CustomResourceOptions): NodejsAppLayer = js.native
  /**
    * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean = js.native
}

