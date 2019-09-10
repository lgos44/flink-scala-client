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

case class IOMetricsInfo (
  readBytes: Option[Int] = None,
  readBytesComplete: Option[Boolean] = None,
  writeBytes: Option[Int] = None,
  writeBytesComplete: Option[Boolean] = None,
  readRecords: Option[Int] = None,
  readRecordsComplete: Option[Boolean] = None,
  writeRecords: Option[Int] = None,
  writeRecordsComplete: Option[Boolean] = None
) extends ApiModel

