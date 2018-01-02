/*
 * Field Nation V2 API
 *
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 *
 *
 * Do not edit the class manually.
 */


package com.fieldnation.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import com.fieldnation.models.BillingAddress;
import com.fieldnation.models.CreditCard;
import java.io.IOException;

/**
 * Publish
 */

public class Publish {
  @SerializedName("credit_card_id")
  private String creditCardId = null;

  @SerializedName("credit_card")
  private CreditCard creditCard = null;

  @SerializedName("billing_address")
  private BillingAddress billingAddress = null;

  public Publish creditCardId(String creditCardId) {
    this.creditCardId = creditCardId;
    return this;
  }

   /**
   * Get creditCardId
   * @return creditCardId
  **/

  public String getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(String creditCardId) {
    this.creditCardId = creditCardId;
  }

  public Publish creditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Get creditCard
   * @return creditCard
  **/

  public CreditCard getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  public Publish billingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/

  public BillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Publish publish = (Publish) o;
    return Objects.equals(this.creditCardId, publish.creditCardId) &&
        Objects.equals(this.creditCard, publish.creditCard) &&
        Objects.equals(this.billingAddress, publish.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardId, creditCard, billingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publish {\n");
    
    sb.append("    creditCardId: ").append(toIndentedString(creditCardId)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

