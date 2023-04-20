/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package spapi.model.fbaInbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The request schema for a putTransportDetails operation.
 */
@ApiModel(description = "The request schema for a putTransportDetails operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:14:03.832+08:00")
public class PutTransportDetailsRequest {
  @SerializedName("IsPartnered")
  private Boolean isPartnered = null;

  @SerializedName("ShipmentType")
  private ShipmentType shipmentType = null;

  @SerializedName("TransportDetails")
  private TransportDetailInput transportDetails = null;

  public PutTransportDetailsRequest isPartnered(Boolean isPartnered) {
    this.isPartnered = isPartnered;
    return this;
  }

   /**
   * Indicates whether a putTransportDetails request is for an Amazon-partnered carrier.
   * @return isPartnered
  **/
  @ApiModelProperty(required = true, value = "Indicates whether a putTransportDetails request is for an Amazon-partnered carrier.")
  public Boolean isIsPartnered() {
    return isPartnered;
  }

  public void setIsPartnered(Boolean isPartnered) {
    this.isPartnered = isPartnered;
  }

  public PutTransportDetailsRequest shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(required = true, value = "")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  public PutTransportDetailsRequest transportDetails(TransportDetailInput transportDetails) {
    this.transportDetails = transportDetails;
    return this;
  }

   /**
   * Information required to create an Amazon-partnered carrier shipping estimate, or to alert the Amazon fulfillment center to the arrival of an inbound shipment by a non-Amazon-partnered carrier.
   * @return transportDetails
  **/
  @ApiModelProperty(required = true, value = "Information required to create an Amazon-partnered carrier shipping estimate, or to alert the Amazon fulfillment center to the arrival of an inbound shipment by a non-Amazon-partnered carrier.")
  public TransportDetailInput getTransportDetails() {
    return transportDetails;
  }

  public void setTransportDetails(TransportDetailInput transportDetails) {
    this.transportDetails = transportDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTransportDetailsRequest putTransportDetailsRequest = (PutTransportDetailsRequest) o;
    return Objects.equals(this.isPartnered, putTransportDetailsRequest.isPartnered) &&
        Objects.equals(this.shipmentType, putTransportDetailsRequest.shipmentType) &&
        Objects.equals(this.transportDetails, putTransportDetailsRequest.transportDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPartnered, shipmentType, transportDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTransportDetailsRequest {\n");

    sb.append("    isPartnered: ").append(toIndentedString(isPartnered)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    transportDetails: ").append(toIndentedString(transportDetails)).append("\n");
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

