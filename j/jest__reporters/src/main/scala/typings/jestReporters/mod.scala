package typings.jestReporters

import typings.jestReporters.coverageReporterMod.default
import typings.jestReporters.typesMod.Context
import typings.jestReporters.typesMod.CoverageReporterOptions
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestReporters.typesMod.TestSchedulerContext
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.AssertionResult
import typings.jestTestResult.typesMod.Suite
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BaseReporter ()
    extends typings.jestReporters.baseReporterMod.BaseReporter {
    /* CompleteClass */
    override def getLastError(): Error | Unit = js.native
    /* CompleteClass */
    override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
  }
  
  @js.native
  class CoverageReporter protected () extends default {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
  
  @js.native
  class DefaultReporter protected ()
    extends typings.jestReporters.defaultReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class NotifyReporter protected ()
    extends typings.jestReporters.notifyReporterMod.default {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class SummaryReporter protected ()
    extends typings.jestReporters.summaryReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class VerboseReporter protected ()
    extends typings.jestReporters.verboseReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object VerboseReporter extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
  @js.native
  object utils extends js.Object {
    def formatTestPath(config: GlobalConfig, testPath: String): String = js.native
    def formatTestPath(config: ProjectConfig, testPath: String): String = js.native
    def printDisplayName(config: ProjectConfig): String = js.native
    def relativePath(config: GlobalConfig, testPath: String): AnonBasename = js.native
    def relativePath(config: ProjectConfig, testPath: String): AnonBasename = js.native
    def trimAndFormatPath(pad: Double, config: GlobalConfig, testPath: String, columns: Double): String = js.native
    def trimAndFormatPath(pad: Double, config: ProjectConfig, testPath: String, columns: Double): String = js.native
  }
  
}

