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


import com.fieldnation.models.MinimalNetwork;
import java.io.IOException;

/**
 * MinimalOnboardingStep
 */

public class MinimalOnboardingStep {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("network")
  private MinimalNetwork network = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("complete")
  private Boolean complete = null;

  public MinimalOnboardingStep id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MinimalOnboardingStep network(MinimalNetwork network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/

  public MinimalNetwork getNetwork() {
    return network;
  }

  public void setNetwork(MinimalNetwork network) {
    this.network = network;
  }

  public MinimalOnboardingStep name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MinimalOnboardingStep complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/

  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimalOnboardingStep minimalOnboardingStep = (MinimalOnboardingStep) o;
    return Objects.equals(this.id, minimalOnboardingStep.id) &&
        Objects.equals(this.network, minimalOnboardingStep.network) &&
        Objects.equals(this.name, minimalOnboardingStep.name) &&
        Objects.equals(this.complete, minimalOnboardingStep.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, network, name, complete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimalOnboardingStep {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

