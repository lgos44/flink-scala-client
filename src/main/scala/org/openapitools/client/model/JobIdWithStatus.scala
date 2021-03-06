/**
 * Flink Monitoring REST API
 * OpenAPI for Flink Monitoring REST API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JobIdWithStatus (
  id: String,
  status: JobIdWithStatusEnums.Status
) extends ApiModel

object JobIdWithStatusEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val CREATED = Value("CREATED")
    val RUNNING = Value("RUNNING")
    val FAILING = Value("FAILING")
    val FAILED = Value("FAILED")
    val CANCELLING = Value("CANCELLING")
    val CANCELED = Value("CANCELED")
    val FINISHED = Value("FINISHED")
    val RESTARTING = Value("RESTARTING")
    val SUSPENDING = Value("SUSPENDING")
    val SUSPENDED = Value("SUSPENDED")
    val RECONCILING = Value("RECONCILING")
  }

}

