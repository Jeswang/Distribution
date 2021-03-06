package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesBackupDescriptionMod.UnmarshalledBackupDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DeleteBackupOutput", JSImport.Namespace)
@js.native
object typesDeleteBackupOutputMod extends js.Object {
  @js.native
  trait DeleteBackupOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the description of the backup created for the table.</p>
      */
    var BackupDescription: js.UndefOr[UnmarshalledBackupDescription] = js.native
  }
  
}

