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


import com.fieldnation.models.UpdateModelMetadata;
import com.fieldnation.models.UpdateModelParams;
import java.io.IOException;

/**
 * UpdateModel
 */

public class UpdateModel {
  @SerializedName("metadata")
  private UpdateModelMetadata metadata = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("service_name")
  private String serviceName = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("params")
  private UpdateModelParams params = null;

  public UpdateModel metadata(UpdateModelMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public UpdateModelMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(UpdateModelMetadata metadata) {
    this.metadata = metadata;
  }

  public UpdateModel timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public UpdateModel serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public UpdateModel version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public UpdateModel params(UpdateModelParams params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/

  public UpdateModelParams getParams() {
    return params;
  }

  public void setParams(UpdateModelParams params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateModel updateModel = (UpdateModel) o;
    return Objects.equals(this.metadata, updateModel.metadata) &&
        Objects.equals(this.timestamp, updateModel.timestamp) &&
        Objects.equals(this.serviceName, updateModel.serviceName) &&
        Objects.equals(this.version, updateModel.version) &&
        Objects.equals(this.params, updateModel.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, timestamp, serviceName, version, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateModel {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

