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
 * CompanyIntegration
 */

public class CompanyIntegration {
  @SerializedName("company_integration_id")
  private String companyIntegrationId = null;

  @SerializedName("company_id")
  private String companyId = null;

  @SerializedName("integration_type")
  private String integrationType = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("api_key")
  private String apiKey = null;

  @SerializedName("api_pass")
  private String apiPass = null;

  @SerializedName("api_domain_name")
  private String apiDomainName = null;

  @SerializedName("disable_notifications")
  private Boolean disableNotifications = null;

  @SerializedName("external_api_integration_id")
  private String externalApiIntegrationId = null;

  public CompanyIntegration companyIntegrationId(String companyIntegrationId) {
    this.companyIntegrationId = companyIntegrationId;
    return this;
  }

   /**
   * Get companyIntegrationId
   * @return companyIntegrationId
  **/

  public String getCompanyIntegrationId() {
    return companyIntegrationId;
  }

  public void setCompanyIntegrationId(String companyIntegrationId) {
    this.companyIntegrationId = companyIntegrationId;
  }

  public CompanyIntegration companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/

  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CompanyIntegration integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/

  public String getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }

  public CompanyIntegration active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/

  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CompanyIntegration apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public CompanyIntegration apiPass(String apiPass) {
    this.apiPass = apiPass;
    return this;
  }

   /**
   * Get apiPass
   * @return apiPass
  **/

  public String getApiPass() {
    return apiPass;
  }

  public void setApiPass(String apiPass) {
    this.apiPass = apiPass;
  }

  public CompanyIntegration apiDomainName(String apiDomainName) {
    this.apiDomainName = apiDomainName;
    return this;
  }

   /**
   * Get apiDomainName
   * @return apiDomainName
  **/

  public String getApiDomainName() {
    return apiDomainName;
  }

  public void setApiDomainName(String apiDomainName) {
    this.apiDomainName = apiDomainName;
  }

  public CompanyIntegration disableNotifications(Boolean disableNotifications) {
    this.disableNotifications = disableNotifications;
    return this;
  }

   /**
   * Get disableNotifications
   * @return disableNotifications
  **/

  public Boolean isDisableNotifications() {
    return disableNotifications;
  }

  public void setDisableNotifications(Boolean disableNotifications) {
    this.disableNotifications = disableNotifications;
  }

  public CompanyIntegration externalApiIntegrationId(String externalApiIntegrationId) {
    this.externalApiIntegrationId = externalApiIntegrationId;
    return this;
  }

   /**
   * Get externalApiIntegrationId
   * @return externalApiIntegrationId
  **/

  public String getExternalApiIntegrationId() {
    return externalApiIntegrationId;
  }

  public void setExternalApiIntegrationId(String externalApiIntegrationId) {
    this.externalApiIntegrationId = externalApiIntegrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIntegration companyIntegration = (CompanyIntegration) o;
    return Objects.equals(this.companyIntegrationId, companyIntegration.companyIntegrationId) &&
        Objects.equals(this.companyId, companyIntegration.companyId) &&
        Objects.equals(this.integrationType, companyIntegration.integrationType) &&
        Objects.equals(this.active, companyIntegration.active) &&
        Objects.equals(this.apiKey, companyIntegration.apiKey) &&
        Objects.equals(this.apiPass, companyIntegration.apiPass) &&
        Objects.equals(this.apiDomainName, companyIntegration.apiDomainName) &&
        Objects.equals(this.disableNotifications, companyIntegration.disableNotifications) &&
        Objects.equals(this.externalApiIntegrationId, companyIntegration.externalApiIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyIntegrationId, companyId, integrationType, active, apiKey, apiPass, apiDomainName, disableNotifications, externalApiIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIntegration {\n");
    
    sb.append("    companyIntegrationId: ").append(toIndentedString(companyIntegrationId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiPass: ").append(toIndentedString(apiPass)).append("\n");
    sb.append("    apiDomainName: ").append(toIndentedString(apiDomainName)).append("\n");
    sb.append("    disableNotifications: ").append(toIndentedString(disableNotifications)).append("\n");
    sb.append("    externalApiIntegrationId: ").append(toIndentedString(externalApiIntegrationId)).append("\n");
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

