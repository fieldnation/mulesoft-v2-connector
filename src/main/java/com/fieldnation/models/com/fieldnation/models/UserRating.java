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
import com.fieldnation.models.Rating;

/**
 * UserRating
 */

public class UserRating {
  @SerializedName("my_company")
  private Rating myCompany = null;

  @SerializedName("marketplace")
  private Rating marketplace = null;

  public UserRating myCompany(Rating myCompany) {
    this.myCompany = myCompany;
    return this;
  }

   /**
   * Get myCompany
   * @return myCompany
  **/

  public Rating getMyCompany() {
    return myCompany;
  }

  public void setMyCompany(Rating myCompany) {
    this.myCompany = myCompany;
  }

  public UserRating marketplace(Rating marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/

  public Rating getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(Rating marketplace) {
    this.marketplace = marketplace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRating userRating = (UserRating) o;
    return Objects.equals(this.myCompany, userRating.myCompany) &&
        Objects.equals(this.marketplace, userRating.marketplace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myCompany, marketplace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRating {\n");
    
    sb.append("    myCompany: ").append(toIndentedString(myCompany)).append("\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
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

