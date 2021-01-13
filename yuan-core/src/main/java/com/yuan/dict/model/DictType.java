package com.yuan.dict.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class DictType {

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private Long dictId;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String dictName;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String dictLabel;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private Integer status;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String createBy;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String updateBy;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private LocalDateTime createdAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private LocalDateTime updatedAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private LocalDateTime deletedAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  private String remark;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public Long getDictId() {
    return dictId;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setDictId(Long dictId) {
    this.dictId = dictId;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getDictName() {
    return dictName;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setDictName(String dictName) {
    this.dictName = dictName;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getDictLabel() {
    return dictLabel;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setDictLabel(String dictLabel) {
    this.dictLabel = dictLabel;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public Integer getStatus() {
    return status;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setStatus(Integer status) {
    this.status = status;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getCreateBy() {
    return createBy;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getUpdateBy() {
    return updateBy;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public LocalDateTime getDeletedAt() {
    return deletedAt;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setDeletedAt(LocalDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String getRemark() {
    return remark;
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", dictId=").append(dictId);
    sb.append(", dictName=").append(dictName);
    sb.append(", dictLabel=").append(dictLabel);
    sb.append(", status=").append(status);
    sb.append(", createBy=").append(createBy);
    sb.append(", updateBy=").append(updateBy);
    sb.append(", createdAt=").append(createdAt);
    sb.append(", updatedAt=").append(updatedAt);
    sb.append(", deletedAt=").append(deletedAt);
    sb.append(", remark=").append(remark);
    sb.append("]");
    return sb.toString();
  }
}