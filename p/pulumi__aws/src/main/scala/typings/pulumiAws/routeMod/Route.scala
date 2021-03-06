package typings.pulumiAws.routeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.RouteSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/route", "Route")
@js.native
class Route protected () extends CustomResource {
  /**
    * Create a Route resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteArgs) = this()
  def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the route.
    */
  val arn: Output_[String] = js.native
  /**
    * The creation date of the route.
    */
  val createdDate: Output_[String] = js.native
  /**
    * The last update date of the route.
    */
  val lastUpdatedDate: Output_[String] = js.native
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: Output_[String] = js.native
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  val name: Output_[String] = js.native
  /**
    * The route specification to apply.
    */
  val spec: Output_[RouteSpec] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The name of the virtual router in which to create the route.
    */
  val virtualRouterName: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/route", "Route")
@js.native
object Route extends js.Object {
  /**
    * Get an existing Route resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Route = js.native
  def get(name: String, id: Input[ID], state: RouteState): Route = js.native
  def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = js.native
  /**
    * Returns true if the given object is an instance of Route.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = js.native
}

