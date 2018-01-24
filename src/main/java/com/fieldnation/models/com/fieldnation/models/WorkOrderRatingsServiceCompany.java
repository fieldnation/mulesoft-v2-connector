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
import com.fieldnation.models.WorkOrderRatingsServiceCompanyOverall;

/**
 * WorkOrderRatingsServiceCompany
 */

public class WorkOrderRatingsServiceCompany {
  @SerializedName("overall")
  private WorkOrderRatingsServiceCompanyOverall overall = null;

  public WorkOrderRatingsServiceCompany overall(WorkOrderRatingsServiceCompanyOverall overall) {
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/

  public WorkOrderRatingsServiceCompanyOverall getOverall() {
    return overall;
  }

  public void setOverall(WorkOrderRatingsServiceCompanyOverall overall) {
    this.overall = overall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkOrderRatingsServiceCompany workOrderRatingsServiceCompany = (WorkOrderRatingsServiceCompany) o;
    return Objects.equals(this.overall, workOrderRatingsServiceCompany.overall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overall);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkOrderRatingsServiceCompany {\n");
    
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
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

