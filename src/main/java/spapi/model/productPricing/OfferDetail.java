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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OfferDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-13T13:52:33.511+08:00")
public class OfferDetail {
  @SerializedName("MyOffer")
  private Boolean myOffer = null;

  @SerializedName("offerType")
  private OfferCustomerType offerType = null;

  @SerializedName("SubCondition")
  private String subCondition = null;

  @SerializedName("SellerId")
  private String sellerId = null;

  @SerializedName("ConditionNotes")
  private String conditionNotes = null;

  @SerializedName("SellerFeedbackRating")
  private SellerFeedbackType sellerFeedbackRating = null;

  @SerializedName("ShippingTime")
  private DetailedShippingTimeType shippingTime = null;

  @SerializedName("ListingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("quantityDiscountPrices")
  private List<QuantityDiscountPriceType> quantityDiscountPrices = null;

  @SerializedName("Points")
  private Points points = null;

  @SerializedName("Shipping")
  private MoneyType shipping = null;

  @SerializedName("ShipsFrom")
  private ShipsFromType shipsFrom = null;

  @SerializedName("IsFulfilledByAmazon")
  private Boolean isFulfilledByAmazon = null;

  @SerializedName("PrimeInformation")
  private PrimeInformationType primeInformation = null;

  @SerializedName("IsBuyBoxWinner")
  private Boolean isBuyBoxWinner = null;

  @SerializedName("IsFeaturedMerchant")
  private Boolean isFeaturedMerchant = null;

  public OfferDetail myOffer(Boolean myOffer) {
    this.myOffer = myOffer;
    return this;
  }

   /**
   * When true, this is the seller&#39;s offer.
   * @return myOffer
  **/
  @ApiModelProperty(value = "When true, this is the seller's offer.")
  public Boolean isMyOffer() {
    return myOffer;
  }

  public void setMyOffer(Boolean myOffer) {
    this.myOffer = myOffer;
  }

  public OfferDetail offerType(OfferCustomerType offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Indicates the type of customer that the offer is valid for.
   * @return offerType
  **/
  @ApiModelProperty(value = "Indicates the type of customer that the offer is valid for.")
  public OfferCustomerType getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferCustomerType offerType) {
    this.offerType = offerType;
  }

  public OfferDetail subCondition(String subCondition) {
    this.subCondition = subCondition;
    return this;
  }

   /**
   * The subcondition of the item. Subcondition values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.
   * @return subCondition
  **/
  @ApiModelProperty(required = true, value = "The subcondition of the item. Subcondition values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.")
  public String getSubCondition() {
    return subCondition;
  }

  public void setSubCondition(String subCondition) {
    this.subCondition = subCondition;
  }

  public OfferDetail sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier for the offer.
   * @return sellerId
  **/
  @ApiModelProperty(value = "The seller identifier for the offer.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public OfferDetail conditionNotes(String conditionNotes) {
    this.conditionNotes = conditionNotes;
    return this;
  }

   /**
   * Information about the condition of the item.
   * @return conditionNotes
  **/
  @ApiModelProperty(value = "Information about the condition of the item.")
  public String getConditionNotes() {
    return conditionNotes;
  }

  public void setConditionNotes(String conditionNotes) {
    this.conditionNotes = conditionNotes;
  }

  public OfferDetail sellerFeedbackRating(SellerFeedbackType sellerFeedbackRating) {
    this.sellerFeedbackRating = sellerFeedbackRating;
    return this;
  }

   /**
   * Information about the seller&#39;s feedback, including the percentage of positive feedback, and the total number of ratings received.
   * @return sellerFeedbackRating
  **/
  @ApiModelProperty(value = "Information about the seller's feedback, including the percentage of positive feedback, and the total number of ratings received.")
  public SellerFeedbackType getSellerFeedbackRating() {
    return sellerFeedbackRating;
  }

  public void setSellerFeedbackRating(SellerFeedbackType sellerFeedbackRating) {
    this.sellerFeedbackRating = sellerFeedbackRating;
  }

  public OfferDetail shippingTime(DetailedShippingTimeType shippingTime) {
    this.shippingTime = shippingTime;
    return this;
  }

   /**
   * The maximum time within which the item will likely be shipped once an order has been placed.
   * @return shippingTime
  **/
  @ApiModelProperty(required = true, value = "The maximum time within which the item will likely be shipped once an order has been placed.")
  public DetailedShippingTimeType getShippingTime() {
    return shippingTime;
  }

  public void setShippingTime(DetailedShippingTimeType shippingTime) {
    this.shippingTime = shippingTime;
  }

  public OfferDetail listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * The price of the item.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "The price of the item.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public OfferDetail quantityDiscountPrices(List<QuantityDiscountPriceType> quantityDiscountPrices) {
    this.quantityDiscountPrices = quantityDiscountPrices;
    return this;
  }

  public OfferDetail addQuantityDiscountPricesItem(QuantityDiscountPriceType quantityDiscountPricesItem) {
    if (this.quantityDiscountPrices == null) {
      this.quantityDiscountPrices = new ArrayList<QuantityDiscountPriceType>();
    }
    this.quantityDiscountPrices.add(quantityDiscountPricesItem);
    return this;
  }

   /**
   * Get quantityDiscountPrices
   * @return quantityDiscountPrices
  **/
  @ApiModelProperty(value = "")
  public List<QuantityDiscountPriceType> getQuantityDiscountPrices() {
    return quantityDiscountPrices;
  }

  public void setQuantityDiscountPrices(List<QuantityDiscountPriceType> quantityDiscountPrices) {
    this.quantityDiscountPrices = quantityDiscountPrices;
  }

  public OfferDetail points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item.
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item.")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }

  public OfferDetail shipping(MoneyType shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * The shipping cost.
   * @return shipping
  **/
  @ApiModelProperty(required = true, value = "The shipping cost.")
  public MoneyType getShipping() {
    return shipping;
  }

  public void setShipping(MoneyType shipping) {
    this.shipping = shipping;
  }

  public OfferDetail shipsFrom(ShipsFromType shipsFrom) {
    this.shipsFrom = shipsFrom;
    return this;
  }

   /**
   * The state and country from where the item is shipped.
   * @return shipsFrom
  **/
  @ApiModelProperty(value = "The state and country from where the item is shipped.")
  public ShipsFromType getShipsFrom() {
    return shipsFrom;
  }

  public void setShipsFrom(ShipsFromType shipsFrom) {
    this.shipsFrom = shipsFrom;
  }

  public OfferDetail isFulfilledByAmazon(Boolean isFulfilledByAmazon) {
    this.isFulfilledByAmazon = isFulfilledByAmazon;
    return this;
  }

   /**
   * When true, the offer is fulfilled by Amazon.
   * @return isFulfilledByAmazon
  **/
  @ApiModelProperty(required = true, value = "When true, the offer is fulfilled by Amazon.")
  public Boolean isIsFulfilledByAmazon() {
    return isFulfilledByAmazon;
  }

  public void setIsFulfilledByAmazon(Boolean isFulfilledByAmazon) {
    this.isFulfilledByAmazon = isFulfilledByAmazon;
  }

  public OfferDetail primeInformation(PrimeInformationType primeInformation) {
    this.primeInformation = primeInformation;
    return this;
  }

   /**
   * Amazon Prime information.
   * @return primeInformation
  **/
  @ApiModelProperty(value = "Amazon Prime information.")
  public PrimeInformationType getPrimeInformation() {
    return primeInformation;
  }

  public void setPrimeInformation(PrimeInformationType primeInformation) {
    this.primeInformation = primeInformation;
  }

  public OfferDetail isBuyBoxWinner(Boolean isBuyBoxWinner) {
    this.isBuyBoxWinner = isBuyBoxWinner;
    return this;
  }

   /**
   * When true, the offer is currently in the Buy Box. There can be up to two Buy Box winners at any time per ASIN, one that is eligible for Prime and one that is not eligible for Prime.
   * @return isBuyBoxWinner
  **/
  @ApiModelProperty(value = "When true, the offer is currently in the Buy Box. There can be up to two Buy Box winners at any time per ASIN, one that is eligible for Prime and one that is not eligible for Prime.")
  public Boolean isIsBuyBoxWinner() {
    return isBuyBoxWinner;
  }

  public void setIsBuyBoxWinner(Boolean isBuyBoxWinner) {
    this.isBuyBoxWinner = isBuyBoxWinner;
  }

  public OfferDetail isFeaturedMerchant(Boolean isFeaturedMerchant) {
    this.isFeaturedMerchant = isFeaturedMerchant;
    return this;
  }

   /**
   * When true, the seller of the item is eligible to win the Buy Box.
   * @return isFeaturedMerchant
  **/
  @ApiModelProperty(value = "When true, the seller of the item is eligible to win the Buy Box.")
  public Boolean isIsFeaturedMerchant() {
    return isFeaturedMerchant;
  }

  public void setIsFeaturedMerchant(Boolean isFeaturedMerchant) {
    this.isFeaturedMerchant = isFeaturedMerchant;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetail offerDetail = (OfferDetail) o;
    return Objects.equals(this.myOffer, offerDetail.myOffer) &&
        Objects.equals(this.offerType, offerDetail.offerType) &&
        Objects.equals(this.subCondition, offerDetail.subCondition) &&
        Objects.equals(this.sellerId, offerDetail.sellerId) &&
        Objects.equals(this.conditionNotes, offerDetail.conditionNotes) &&
        Objects.equals(this.sellerFeedbackRating, offerDetail.sellerFeedbackRating) &&
        Objects.equals(this.shippingTime, offerDetail.shippingTime) &&
        Objects.equals(this.listingPrice, offerDetail.listingPrice) &&
        Objects.equals(this.quantityDiscountPrices, offerDetail.quantityDiscountPrices) &&
        Objects.equals(this.points, offerDetail.points) &&
        Objects.equals(this.shipping, offerDetail.shipping) &&
        Objects.equals(this.shipsFrom, offerDetail.shipsFrom) &&
        Objects.equals(this.isFulfilledByAmazon, offerDetail.isFulfilledByAmazon) &&
        Objects.equals(this.primeInformation, offerDetail.primeInformation) &&
        Objects.equals(this.isBuyBoxWinner, offerDetail.isBuyBoxWinner) &&
        Objects.equals(this.isFeaturedMerchant, offerDetail.isFeaturedMerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myOffer, offerType, subCondition, sellerId, conditionNotes, sellerFeedbackRating, shippingTime, listingPrice, quantityDiscountPrices, points, shipping, shipsFrom, isFulfilledByAmazon, primeInformation, isBuyBoxWinner, isFeaturedMerchant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetail {\n");
    
    sb.append("    myOffer: ").append(toIndentedString(myOffer)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    subCondition: ").append(toIndentedString(subCondition)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    conditionNotes: ").append(toIndentedString(conditionNotes)).append("\n");
    sb.append("    sellerFeedbackRating: ").append(toIndentedString(sellerFeedbackRating)).append("\n");
    sb.append("    shippingTime: ").append(toIndentedString(shippingTime)).append("\n");
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    quantityDiscountPrices: ").append(toIndentedString(quantityDiscountPrices)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shipsFrom: ").append(toIndentedString(shipsFrom)).append("\n");
    sb.append("    isFulfilledByAmazon: ").append(toIndentedString(isFulfilledByAmazon)).append("\n");
    sb.append("    primeInformation: ").append(toIndentedString(primeInformation)).append("\n");
    sb.append("    isBuyBoxWinner: ").append(toIndentedString(isBuyBoxWinner)).append("\n");
    sb.append("    isFeaturedMerchant: ").append(toIndentedString(isFeaturedMerchant)).append("\n");
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

