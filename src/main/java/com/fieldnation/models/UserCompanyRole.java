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

/**
 * UserCompanyRole
 */

public class UserCompanyRole {
  @SerializedName("marketplace_manager")
  private Boolean marketplaceManager = null;

  public UserCompanyRole marketplaceManager(Boolean marketplaceManager) {
    this.marketplaceManager = marketplaceManager;
    return this;
  }

   /**
   * Get marketplaceManager
   * @return marketplaceManager
  **/

  public Boolean isMarketplaceManager() {
    return marketplaceManager;
  }

  public void setMarketplaceManager(Boolean marketplaceManager) {
    this.marketplaceManager = marketplaceManager;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCompanyRole userCompanyRole = (UserCompanyRole) o;
    return Objects.equals(this.marketplaceManager, userCompanyRole.marketplaceManager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceManager);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompanyRole {\n");
    
    sb.append("    marketplaceManager: ").append(toIndentedString(marketplaceManager)).append("\n");
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

