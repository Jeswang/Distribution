package typings.pulumiAws.permissionMod

import typings.pulumiAws.lambdaFunctionMod.Function
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionArgs extends js.Object {
  /**
    * The AWS Lambda action you want to allow in this statement. (e.g. `lambda:InvokeFunction`)
    */
  val action: Input[String] = js.native
  /**
    * The Event Source Token to validate.  Used with [Alexa Skills][1].
    */
  val eventSourceToken: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the Lambda function whose resource policy you are updating
    */
  val function: Input[String | Function] = js.native
  /**
    * The principal who is getting this permission.
    * e.g. `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal
    * such as `events.amazonaws.com` or `sns.amazonaws.com`.
    */
  val principal: Input[String] = js.native
  /**
    * Query parameter to specify function version or alias name.
    * The permission will then apply to the specific qualified ARN.
    * e.g. `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
    */
  val qualifier: js.UndefOr[Input[String]] = js.native
  /**
    * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
    */
  val sourceAccount: js.UndefOr[Input[String]] = js.native
  /**
    * When granting Amazon S3 or CloudWatch Events permission to
    * invoke your function, you should specify this field with the Amazon Resource Name (ARN)
    * for the S3 Bucket or CloudWatch Events Rule as its value.  This ensures that only events
    * generated from the specified bucket or rule can invoke the function.
    * API Gateway ARNs have a unique structure described
    * [here](http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
    */
  val sourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * A unique statement identifier. By default generated by this provider.
    */
  val statementId: js.UndefOr[Input[String]] = js.native
  /**
    * A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statementId`.
    */
  val statementIdPrefix: js.UndefOr[Input[String]] = js.native
}

object PermissionArgs {
  @scala.inline
  def apply(
    action: Input[String],
    function: Input[String | Function],
    principal: Input[String],
    eventSourceToken: Input[String] = null,
    qualifier: Input[String] = null,
    sourceAccount: Input[String] = null,
    sourceArn: Input[String] = null,
    statementId: Input[String] = null,
    statementIdPrefix: Input[String] = null
  ): PermissionArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
    if (eventSourceToken != null) __obj.updateDynamic("eventSourceToken")(eventSourceToken.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (sourceAccount != null) __obj.updateDynamic("sourceAccount")(sourceAccount.asInstanceOf[js.Any])
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn.asInstanceOf[js.Any])
    if (statementId != null) __obj.updateDynamic("statementId")(statementId.asInstanceOf[js.Any])
    if (statementIdPrefix != null) __obj.updateDynamic("statementIdPrefix")(statementIdPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionArgs]
  }
}

