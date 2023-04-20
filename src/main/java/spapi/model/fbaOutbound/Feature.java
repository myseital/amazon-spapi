/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package spapi.model.fbaOutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * A Multi-Channel Fulfillment feature.
 */
@ApiModel(description = "A Multi-Channel Fulfillment feature.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:14:09.026+08:00")
public class Feature {
  @SerializedName("featureName")
  private String featureName = null;

  @SerializedName("featureDescription")
  private String featureDescription = null;

  @SerializedName("sellerEligible")
  private Boolean sellerEligible = null;

  public Feature featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

   /**
   * The feature name.
   * @return featureName
  **/
  @ApiModelProperty(required = true, value = "The feature name.")
  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  public Feature featureDescription(String featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

   /**
   * The feature description.
   * @return featureDescription
  **/
  @ApiModelProperty(required = true, value = "The feature description.")
  public String getFeatureDescription() {
    return featureDescription;
  }

  public void setFeatureDescription(String featureDescription) {
    this.featureDescription = featureDescription;
  }

  public Feature sellerEligible(Boolean sellerEligible) {
    this.sellerEligible = sellerEligible;
    return this;
  }

   /**
   * When true, indicates that the seller is eligible to use the feature.
   * @return sellerEligible
  **/
  @ApiModelProperty(value = "When true, indicates that the seller is eligible to use the feature.")
  public Boolean isSellerEligible() {
    return sellerEligible;
  }

  public void setSellerEligible(Boolean sellerEligible) {
    this.sellerEligible = sellerEligible;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.featureName, feature.featureName) &&
        Objects.equals(this.featureDescription, feature.featureDescription) &&
        Objects.equals(this.sellerEligible, feature.sellerEligible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureDescription, sellerEligible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");

    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    sellerEligible: ").append(toIndentedString(sellerEligible)).append("\n");
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

