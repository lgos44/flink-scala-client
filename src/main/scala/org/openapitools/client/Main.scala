package org.openapitools.client
import java.io.File

import akka.actor.ActorSystem
import org.openapitools.client.api.MonitoringApi
import org.openapitools.client.core.{ApiInvoker, ApiKeyValue}
import org.openapitools.client.core.ApiInvoker.ApiRequestImprovements

object Main extends App {
  implicit val system = ActorSystem()
  implicit val ec = system.dispatcher

  val invoker = ApiInvoker()
  implicit val key = ApiKeyValue("")
  MonitoringApi().uploadJar(Some(new File("/home/lgos/projects/zephyros-cep/sql-job-builder/target/scala-2.11/sqlJobBuilder-assembly-0.0.1.jar"))).response(invoker).andThen{
    case x => println(x)
  }

}
