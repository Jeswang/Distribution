package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Generalization")
@js.native
class Generalization protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.Generalization {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Generalization")
@js.native
object Generalization extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.Generalization = js.native
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * The new Generalization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.domainmodelsMod.domainmodels.Generalization = js.native
}

