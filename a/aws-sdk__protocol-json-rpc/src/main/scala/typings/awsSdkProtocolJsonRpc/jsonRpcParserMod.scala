package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import typings.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc/build/JsonRpcParser", JSImport.Namespace)
@js.native
object jsonRpcParserMod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected () extends ResponseParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
    val bodyCollector: js.Any = js.native
    val bodyParser: js.Any = js.native
    val parseServiceException: js.Any = js.native
    var resolveBodyString: js.Any = js.native
    val utf8Encoder: js.Any = js.native
    /**
      * Converts the output of an operation into JavaScript types.
      *
      * @param operation The operation model describing the structure of the HTTP
      *                  response received
      * @param input     The HTTP response received from the service
      */
    /* CompleteClass */
    override def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType] = js.native
  }
  
}

