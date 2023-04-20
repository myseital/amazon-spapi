/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package spapi.model.productPricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * BatchOffersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-13T13:52:33.511+08:00")
public class BatchOffersResponse {
  @SerializedName("headers")
  private HttpResponseHeaders headers = null;

  @SerializedName("status")
  private GetOffersHttpStatusLine status = null;

  @SerializedName("body")
  private GetOffersResponse body = null;

  public BatchOffersResponse headers(HttpResponseHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public HttpResponseHeaders getHeaders() {
    return headers;
  }

  public void setHeaders(HttpResponseHeaders headers) {
    this.headers = headers;
  }

  public BatchOffersResponse status(GetOffersHttpStatusLine status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetOffersHttpStatusLine getStatus() {
    return status;
  }

  public void setStatus(GetOffersHttpStatusLine status) {
    this.status = status;
  }

  public BatchOffersResponse body(GetOffersResponse body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "")
  public GetOffersResponse getBody() {
    return body;
  }

  public void setBody(GetOffersResponse body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOffersResponse batchOffersResponse = (BatchOffersResponse) o;
    return Objects.equals(this.headers, batchOffersResponse.headers) &&
        Objects.equals(this.status, batchOffersResponse.status) &&
        Objects.equals(this.body, batchOffersResponse.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, status, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOffersResponse {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

