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


import com.fieldnation.models.ETA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JSON Payload
 */


public class Body13 {
  @SerializedName("eta")
  private List<ETA> eta = null;

  public Body13 eta(List<ETA> eta) {
    this.eta = eta;
    return this;
  }

  public Body13 addEtaItem(ETA etaItem) {
    if (this.eta == null) {
      this.eta = new ArrayList<ETA>();
    }
    this.eta.add(etaItem);
    return this;
  }

   /**
   * Get eta
   * @return eta
  **/

  public List<ETA> getEta() {
    return eta;
  }

  public void setEta(List<ETA> eta) {
    this.eta = eta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body13 body13 = (Body13) o;
    return Objects.equals(this.eta, body13.eta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body13 {\n");
    
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
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

