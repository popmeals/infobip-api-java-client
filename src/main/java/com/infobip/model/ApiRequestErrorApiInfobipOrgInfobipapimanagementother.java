/*
 * Infobip Client API Libraries OpenAPI Specification
 * OpenAPI specification containing public endpoints supported in client API libraries.
 *
 * Contact: support@infobip.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.infobip.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** ApiRequestErrorApiInfobipOrgInfobipapimanagementother */
public class ApiRequestErrorApiInfobipOrgInfobipapimanagementother {
  public static final String SERIALIZED_NAME_SERVICE_EXCEPTION = "serviceException";

  @SerializedName(SERIALIZED_NAME_SERVICE_EXCEPTION)
  private ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother serviceException = null;

  public ApiRequestErrorApiInfobipOrgInfobipapimanagementother serviceException(
      ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother serviceException) {

    this.serviceException = serviceException;
    return this;
  }

  /**
   * Get serviceException
   *
   * @return serviceException
   */
  public ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother getServiceException() {
    return serviceException;
  }

  public void setServiceException(
      ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother serviceException) {
    this.serviceException = serviceException;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestErrorApiInfobipOrgInfobipapimanagementother
        apiRequestErrorApiInfobipOrgInfobipapimanagementother =
            (ApiRequestErrorApiInfobipOrgInfobipapimanagementother) o;
    return Objects.equals(
        this.serviceException,
        apiRequestErrorApiInfobipOrgInfobipapimanagementother.serviceException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceException);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestErrorApiInfobipOrgInfobipapimanagementother {\n");
    sb.append("    serviceException: ").append(toIndentedString(serviceException)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}