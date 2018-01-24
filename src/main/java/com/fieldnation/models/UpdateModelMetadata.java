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
import com.fieldnation.models.UpdateModelMetadataData;
import com.fieldnation.models.UpdateModelMetadataUniversalContext;

/**
 * UpdateModelMetadata
 */

public class UpdateModelMetadata {
  @SerializedName("universal_context")
  private UpdateModelMetadataUniversalContext universalContext = null;

  @SerializedName("data")
  private UpdateModelMetadataData data = null;

  public UpdateModelMetadata universalContext(UpdateModelMetadataUniversalContext universalContext) {
    this.universalContext = universalContext;
    return this;
  }

   /**
   * Get universalContext
   * @return universalContext
  **/

  public UpdateModelMetadataUniversalContext getUniversalContext() {
    return universalContext;
  }

  public void setUniversalContext(UpdateModelMetadataUniversalContext universalContext) {
    this.universalContext = universalContext;
  }

  public UpdateModelMetadata data(UpdateModelMetadataData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/

  public UpdateModelMetadataData getData() {
    return data;
  }

  public void setData(UpdateModelMetadataData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateModelMetadata updateModelMetadata = (UpdateModelMetadata) o;
    return Objects.equals(this.universalContext, updateModelMetadata.universalContext) &&
        Objects.equals(this.data, updateModelMetadata.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(universalContext, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateModelMetadata {\n");
    
    sb.append("    universalContext: ").append(toIndentedString(universalContext)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

