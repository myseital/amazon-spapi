/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package spapi.model.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The available delivery confirmation options, and the fee charged, if any.
 */
@ApiModel(description = "The available delivery confirmation options, and the fee charged, if any.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-14T14:12:47.619+08:00")
public class AvailableDeliveryExperienceOption {
  @SerializedName("DeliveryExperienceOption")
  private DeliveryExperienceOption deliveryExperienceOption = null;

  @SerializedName("Charge")
  private CurrencyAmount charge = null;

  public AvailableDeliveryExperienceOption deliveryExperienceOption(DeliveryExperienceOption deliveryExperienceOption) {
    this.deliveryExperienceOption = deliveryExperienceOption;
    return this;
  }

   /**
   * Get deliveryExperienceOption
   * @return deliveryExperienceOption
  **/
  @ApiModelProperty(required = true, value = "")
  public DeliveryExperienceOption getDeliveryExperienceOption() {
    return deliveryExperienceOption;
  }

  public void setDeliveryExperienceOption(DeliveryExperienceOption deliveryExperienceOption) {
    this.deliveryExperienceOption = deliveryExperienceOption;
  }

  public AvailableDeliveryExperienceOption charge(CurrencyAmount charge) {
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAmount getCharge() {
    return charge;
  }

  public void setCharge(CurrencyAmount charge) {
    this.charge = charge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableDeliveryExperienceOption availableDeliveryExperienceOption = (AvailableDeliveryExperienceOption) o;
    return Objects.equals(this.deliveryExperienceOption, availableDeliveryExperienceOption.deliveryExperienceOption) &&
        Objects.equals(this.charge, availableDeliveryExperienceOption.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryExperienceOption, charge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableDeliveryExperienceOption {\n");

    sb.append("    deliveryExperienceOption: ").append(toIndentedString(deliveryExperienceOption)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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

