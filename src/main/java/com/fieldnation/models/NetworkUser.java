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

/**
 * network
 */


public class NetworkUser {
  @SerializedName("network_id")
  private Integer networkId = null;

  @SerializedName("user_id")
  private Integer userId = null;

  /**
   * Gets or Sets access
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    ACTIVE("active"),
    
    PENDING("pending"),
    
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
  private AccessEnum access = null;

  @SerializedName("view_available")
  private Boolean viewAvailable = null;

  @SerializedName("inactive_routing")
  private Boolean inactiveRouting = null;

  public NetworkUser networkId(Integer networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/

  public Integer getNetworkId() {
    return networkId;
  }

  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  public NetworkUser userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public NetworkUser access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/

  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public NetworkUser viewAvailable(Boolean viewAvailable) {
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

  public NetworkUser inactiveRouting(Boolean inactiveRouting) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkUser networkUser = (NetworkUser) o;
    return Objects.equals(this.networkId, networkUser.networkId) &&
        Objects.equals(this.userId, networkUser.userId) &&
        Objects.equals(this.access, networkUser.access) &&
        Objects.equals(this.viewAvailable, networkUser.viewAvailable) &&
        Objects.equals(this.inactiveRouting, networkUser.inactiveRouting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, userId, access, viewAvailable, inactiveRouting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkUser {\n");
    
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    viewAvailable: ").append(toIndentedString(viewAvailable)).append("\n");
    sb.append("    inactiveRouting: ").append(toIndentedString(inactiveRouting)).append("\n");
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

