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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The number of offer listings with the specified condition.
 */
@ApiModel(description = "The number of offer listings with the specified condition.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-13T13:52:33.511+08:00")
public class OfferListingCountType {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("condition")
  private String condition = null;

  public OfferListingCountType count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of offer listings.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The number of offer listings.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OfferListingCountType condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the item.
   * @return condition
  **/
  @ApiModelProperty(required = true, value = "The condition of the item.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingCountType offerListingCountType = (OfferListingCountType) o;
    return Objects.equals(this.count, offerListingCountType.count) &&
        Objects.equals(this.condition, offerListingCountType.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingCountType {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

