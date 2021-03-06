package typings.saslAnonymous.mod

import typings.saslAnonymous.saslAnonymousBooleans.`true`
import typings.saslAnonymous.saslAnonymousStrings.ANONYMOUS
import typings.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousMechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_AnonymousMechanism: ANONYMOUS
  def response(cred: Credentials): String
}

object AnonymousMechanism {
  @scala.inline
  def apply(challenge: String => Unit, clientFirst: `true`, name: ANONYMOUS, response: Credentials => String): AnonymousMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[AnonymousMechanism]
  }
}

