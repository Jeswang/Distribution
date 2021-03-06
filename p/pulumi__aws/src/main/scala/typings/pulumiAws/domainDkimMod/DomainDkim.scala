package typings.pulumiAws.domainDkimMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/domainDkim", "DomainDkim")
@js.native
class DomainDkim protected () extends CustomResource {
  /**
    * Create a DomainDkim resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainDkimArgs) = this()
  def this(name: String, args: DomainDkimArgs, opts: CustomResourceOptions) = this()
  /**
    * DKIM tokens generated by SES.
    * These tokens should be used to create CNAME records used to verify SES Easy DKIM.
    * See below for an example of how this might be achieved
    * when the domain is hosted in Route 53 and managed by this provider.
    * Find out more about verifying domains in Amazon SES
    * in the [AWS SES docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html).
    */
  val dkimTokens: Output_[js.Array[String]] = js.native
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/domainDkim", "DomainDkim")
@js.native
object DomainDkim extends js.Object {
  /**
    * Get an existing DomainDkim resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DomainDkim = js.native
  def get(name: String, id: Input[ID], state: DomainDkimState): DomainDkim = js.native
  def get(name: String, id: Input[ID], state: DomainDkimState, opts: CustomResourceOptions): DomainDkim = js.native
  /**
    * Returns true if the given object is an instance of DomainDkim.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean = js.native
}

