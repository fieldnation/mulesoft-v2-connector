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
import com.google.gson.annotations.SerializedName;
import com.fieldnation.models.Network;

/**
 * onboarding
 */


public class OnboardingStep {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("network")
  private Network network = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("complete")
  private Boolean complete = null;

  public OnboardingStep id(Integer id) {
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

  public OnboardingStep network(Network network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/

  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public OnboardingStep name(String name) {
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

  public OnboardingStep complete(Boolean complete) {
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
    OnboardingStep onboardingStep = (OnboardingStep) o;
    return Objects.equals(this.id, onboardingStep.id) &&
        Objects.equals(this.network, onboardingStep.network) &&
        Objects.equals(this.name, onboardingStep.name) &&
        Objects.equals(this.complete, onboardingStep.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, network, name, complete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingStep {\n");
    
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

