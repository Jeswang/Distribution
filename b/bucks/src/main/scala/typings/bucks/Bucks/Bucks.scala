package typings.bucks.Bucks

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucks extends js.Object {
  /**
    * Add a task.
    * @param task Function added async chain
    */
  def add(task: TaskWithNext): typings.bucks.Bucks.Bucks = js.native
  /**
    * Add delay execution.
    * @param ms number millisecond for delaying
    */
  def delay(ms: Double): typings.bucks.Bucks.Bucks = js.native
  /**
    * Destroy this object and call last callback function.
    * @param err If specify err and no callback, throw to execute failure callback
    */
  def destroy(): typings.bucks.Bucks.Bucks = js.native
  def destroy(err: Error): typings.bucks.Bucks.Bucks = js.native
  /**
    * Called when destroy async chain.
    */
  def dispose(): Unit = js.native
  /**
    * Add a empty task.
    */
  def empty(): typings.bucks.Bucks.Bucks = js.native
  /**
    * Complete creating async chain and start executing.
    * @param callback Last callback function
    * @param errback Handler for occurring error in last callback function
    */
  def end(): Unit = js.native
  def end(callback: Task): Unit = js.native
  def end(callback: Task, errback: js.Function1[/* err */ Error, _]): Unit = js.native
  /**
    * Add a task called only in case of error.
    * @param onError Function called only in case of error
    */
  def error(onError: js.Function2[/* err */ Error, /* next */ js.UndefOr[Task], _]): typings.bucks.Bucks.Bucks = js.native
  /**
    * Add tasks in asynchronous way and join their results.
    * @param tasks Functions called in asynchronous way and join their results
    */
  def parallel(tasks: js.Array[TaskWithNext]): typings.bucks.Bucks.Bucks = js.native
  /**
    * Add a task called only in case of success.
    * @param onSuccess Function called only in case of success
    */
  def `then`(onSuccess: js.Function2[/* res */ js.Any, /* next */ js.UndefOr[Task], _]): typings.bucks.Bucks.Bucks = js.native
  /**
    * Add tasks in asynchronous way and join their results.
    * @param tasks Functions added async chain
    */
  def waterfall(tasks: js.Array[TaskWithNext]): typings.bucks.Bucks.Bucks = js.native
}

