package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesEndpointMod.UnmarshalledEndpoint
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DescribeEndpointsOutput", JSImport.Namespace)
@js.native
object typesDescribeEndpointsOutputMod extends js.Object {
  @js.native
  trait DescribeEndpointsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * _Endpoints shape
      */
    var Endpoints: js.Array[UnmarshalledEndpoint] = js.native
  }
  
}

