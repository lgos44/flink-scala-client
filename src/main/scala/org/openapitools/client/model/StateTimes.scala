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

case class StateTimes (
  cREATED: Option[Int] = None,
  rUNNING: Option[Int] = None,
  fAILING: Option[Int] = None,
  fAILED: Option[Int] = None,
  cANCELLING: Option[Int] = None,
  cANCELED: Option[Int] = None,
  fINISHED: Option[Int] = None,
  rESTARTING: Option[Int] = None,
  sUSPENDED: Option[Int] = None,
  rECONCILING: Option[Int] = None
) extends ApiModel


