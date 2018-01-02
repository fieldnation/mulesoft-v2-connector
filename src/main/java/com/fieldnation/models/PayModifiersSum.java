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


import java.io.IOException;
import java.math.BigDecimal;

/**
 * PayModifiersSum
 */

public class PayModifiersSum {
  @SerializedName("all")
  private BigDecimal all = null;

  @SerializedName("charged")
  private BigDecimal charged = null;

  @SerializedName("uncharged")
  private BigDecimal uncharged = null;

  public PayModifiersSum all(BigDecimal all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/

  public BigDecimal getAll() {
    return all;
  }

  public void setAll(BigDecimal all) {
    this.all = all;
  }

  public PayModifiersSum charged(BigDecimal charged) {
    this.charged = charged;
    return this;
  }

   /**
   * Get charged
   * @return charged
  **/

  public BigDecimal getCharged() {
    return charged;
  }

  public void setCharged(BigDecimal charged) {
    this.charged = charged;
  }

  public PayModifiersSum uncharged(BigDecimal uncharged) {
    this.uncharged = uncharged;
    return this;
  }

   /**
   * Get uncharged
   * @return uncharged
  **/

  public BigDecimal getUncharged() {
    return uncharged;
  }

  public void setUncharged(BigDecimal uncharged) {
    this.uncharged = uncharged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayModifiersSum payModifiersSum = (PayModifiersSum) o;
    return Objects.equals(this.all, payModifiersSum.all) &&
        Objects.equals(this.charged, payModifiersSum.charged) &&
        Objects.equals(this.uncharged, payModifiersSum.uncharged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, charged, uncharged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayModifiersSum {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    charged: ").append(toIndentedString(charged)).append("\n");
    sb.append("    uncharged: ").append(toIndentedString(uncharged)).append("\n");
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

