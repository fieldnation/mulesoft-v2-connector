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


import com.fieldnation.models.MinimalOnboardingStep;
import com.fieldnation.models.NetworkOption;
import com.fieldnation.models.OnboardingType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Network
 */

public class Network {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets access
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    PENDING("pending"),
    
    ACTIVE("active"),
    
    SUSPENDED("suspended");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String text) {
      for (AccessEnum b : AccessEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("access")
  private List<AccessEnum> access = null;

  @SerializedName("view_available")
  private Boolean viewAvailable = null;

  @SerializedName("inactive_routing")
  private Boolean inactiveRouting = null;

  @SerializedName("onboarding_complete")
  private Boolean onboardingComplete = null;

  @SerializedName("onboarding_type")
  private OnboardingType onboardingType = null;

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("options")
  private List<NetworkOption> options = null;

  @SerializedName("onboarding_steps")
  private List<MinimalOnboardingStep> onboardingSteps = null;

  public Network id(Integer id) {
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

  public Network name(String name) {
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

  public Network description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Network access(List<AccessEnum> access) {
    this.access = access;
    return this;
  }

  public Network addAccessItem(AccessEnum accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<AccessEnum>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * Get access
   * @return access
  **/

  public List<AccessEnum> getAccess() {
    return access;
  }

  public void setAccess(List<AccessEnum> access) {
    this.access = access;
  }

  public Network viewAvailable(Boolean viewAvailable) {
    this.viewAvailable = viewAvailable;
    return this;
  }

   /**
   * Get viewAvailable
   * @return viewAvailable
  **/

  public Boolean isViewAvailable() {
    return viewAvailable;
  }

  public void setViewAvailable(Boolean viewAvailable) {
    this.viewAvailable = viewAvailable;
  }

  public Network inactiveRouting(Boolean inactiveRouting) {
    this.inactiveRouting = inactiveRouting;
    return this;
  }

   /**
   * Get inactiveRouting
   * @return inactiveRouting
  **/

  public Boolean isInactiveRouting() {
    return inactiveRouting;
  }

  public void setInactiveRouting(Boolean inactiveRouting) {
    this.inactiveRouting = inactiveRouting;
  }

  public Network onboardingComplete(Boolean onboardingComplete) {
    this.onboardingComplete = onboardingComplete;
    return this;
  }

   /**
   * Get onboardingComplete
   * @return onboardingComplete
  **/

  public Boolean isOnboardingComplete() {
    return onboardingComplete;
  }

  public void setOnboardingComplete(Boolean onboardingComplete) {
    this.onboardingComplete = onboardingComplete;
  }

  public Network onboardingType(OnboardingType onboardingType) {
    this.onboardingType = onboardingType;
    return this;
  }

   /**
   * Get onboardingType
   * @return onboardingType
  **/

  public OnboardingType getOnboardingType() {
    return onboardingType;
  }

  public void setOnboardingType(OnboardingType onboardingType) {
    this.onboardingType = onboardingType;
  }

  public Network actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Network addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/

  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public Network options(List<NetworkOption> options) {
    this.options = options;
    return this;
  }

  public Network addOptionsItem(NetworkOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<NetworkOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/

  public List<NetworkOption> getOptions() {
    return options;
  }

  public void setOptions(List<NetworkOption> options) {
    this.options = options;
  }

  public Network onboardingSteps(List<MinimalOnboardingStep> onboardingSteps) {
    this.onboardingSteps = onboardingSteps;
    return this;
  }

  public Network addOnboardingStepsItem(MinimalOnboardingStep onboardingStepsItem) {
    if (this.onboardingSteps == null) {
      this.onboardingSteps = new ArrayList<MinimalOnboardingStep>();
    }
    this.onboardingSteps.add(onboardingStepsItem);
    return this;
  }

   /**
   * Get onboardingSteps
   * @return onboardingSteps
  **/

  public List<MinimalOnboardingStep> getOnboardingSteps() {
    return onboardingSteps;
  }

  public void setOnboardingSteps(List<MinimalOnboardingStep> onboardingSteps) {
    this.onboardingSteps = onboardingSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.id, network.id) &&
        Objects.equals(this.name, network.name) &&
        Objects.equals(this.description, network.description) &&
        Objects.equals(this.access, network.access) &&
        Objects.equals(this.viewAvailable, network.viewAvailable) &&
        Objects.equals(this.inactiveRouting, network.inactiveRouting) &&
        Objects.equals(this.onboardingComplete, network.onboardingComplete) &&
        Objects.equals(this.onboardingType, network.onboardingType) &&
        Objects.equals(this.actions, network.actions) &&
        Objects.equals(this.options, network.options) &&
        Objects.equals(this.onboardingSteps, network.onboardingSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, access, viewAvailable, inactiveRouting, onboardingComplete, onboardingType, actions, options, onboardingSteps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    viewAvailable: ").append(toIndentedString(viewAvailable)).append("\n");
    sb.append("    inactiveRouting: ").append(toIndentedString(inactiveRouting)).append("\n");
    sb.append("    onboardingComplete: ").append(toIndentedString(onboardingComplete)).append("\n");
    sb.append("    onboardingType: ").append(toIndentedString(onboardingType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    onboardingSteps: ").append(toIndentedString(onboardingSteps)).append("\n");
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

