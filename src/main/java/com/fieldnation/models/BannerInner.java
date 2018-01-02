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


import com.fieldnation.models.MinimalUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BannerInner
 */

public class BannerInner {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("author")
  private MinimalUser author = null;

  @SerializedName("groups")
  private List<Integer> groups = new ArrayList<Integer>();

  @SerializedName("company_ids")
  private List<Integer> companyIds = new ArrayList<Integer>();

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("starts_at")
  private String startsAt = null;

  @SerializedName("ends_at")
  private String endsAt = null;

  public BannerInner id(Integer id) {
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

  public BannerInner userId(Integer userId) {
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

  public BannerInner image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public BannerInner href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BannerInner deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public BannerInner author(MinimalUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  public MinimalUser getAuthor() {
    return author;
  }

  public void setAuthor(MinimalUser author) {
    this.author = author;
  }

  public BannerInner groups(List<Integer> groups) {
    this.groups = groups;
    return this;
  }

  public BannerInner addGroupsItem(Integer groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  public List<Integer> getGroups() {
    return groups;
  }

  public void setGroups(List<Integer> groups) {
    this.groups = groups;
  }

  public BannerInner companyIds(List<Integer> companyIds) {
    this.companyIds = companyIds;
    return this;
  }

  public BannerInner addCompanyIdsItem(Integer companyIdsItem) {
    this.companyIds.add(companyIdsItem);
    return this;
  }

   /**
   * Get companyIds
   * @return companyIds
  **/
  public List<Integer> getCompanyIds() {
    return companyIds;
  }

  public void setCompanyIds(List<Integer> companyIds) {
    this.companyIds = companyIds;
  }

  public BannerInner createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public BannerInner startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Get startsAt
   * @return startsAt
  **/
  public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public BannerInner endsAt(String endsAt) {
    this.endsAt = endsAt;
    return this;
  }

   /**
   * Get endsAt
   * @return endsAt
  **/
  public String getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BannerInner bannerInner = (BannerInner) o;
    return Objects.equals(this.id, bannerInner.id) &&
        Objects.equals(this.userId, bannerInner.userId) &&
        Objects.equals(this.image, bannerInner.image) &&
        Objects.equals(this.href, bannerInner.href) &&
        Objects.equals(this.deleted, bannerInner.deleted) &&
        Objects.equals(this.author, bannerInner.author) &&
        Objects.equals(this.groups, bannerInner.groups) &&
        Objects.equals(this.companyIds, bannerInner.companyIds) &&
        Objects.equals(this.createdAt, bannerInner.createdAt) &&
        Objects.equals(this.startsAt, bannerInner.startsAt) &&
        Objects.equals(this.endsAt, bannerInner.endsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, image, href, deleted, author, groups, companyIds, createdAt, startsAt, endsAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BannerInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    companyIds: ").append(toIndentedString(companyIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
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

