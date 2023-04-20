/*
 * Selling Partner API for Sales
 * The Selling Partner API for Sales provides APIs related to sales performance.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package spapi.model.sales;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The response schema for the getOrderMetrics operation.
 */
@ApiModel(description = "The response schema for the getOrderMetrics operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-14T14:13:08.193+08:00")
public class GetOrderMetricsResponse {
  @SerializedName("payload")
  private OrderMetricsList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderMetricsResponse payload(OrderMetricsList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getOrderMetrics operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getOrderMetrics operation.")
  public OrderMetricsList getPayload() {
    return payload;
  }

  public void setPayload(OrderMetricsList payload) {
    this.payload = payload;
  }

  public GetOrderMetricsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Encountered errors for the getOrderMetrics operation.
   * @return errors
  **/
  @ApiModelProperty(value = "Encountered errors for the getOrderMetrics operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderMetricsResponse getOrderMetricsResponse = (GetOrderMetricsResponse) o;
    return Objects.equals(this.payload, getOrderMetricsResponse.payload) &&
        Objects.equals(this.errors, getOrderMetricsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderMetricsResponse {\n");

    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

