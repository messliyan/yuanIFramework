package com.yuan.dict.model;

import com.yuan.dict.IODictRemarkDetail;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class DictData {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dictValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer dictSort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dictType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dictCode;

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
    private IODictRemarkDetail dictRemarkDetail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDictValue() {
        return dictValue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDictSort() {
        return dictSort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDictType() {
        return dictType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDictCode() {
        return dictCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
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
    public IODictRemarkDetail getDictRemarkDetail() {
        return dictRemarkDetail;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDictRemarkDetail(IODictRemarkDetail dictRemarkDetail) {
        this.dictRemarkDetail = dictRemarkDetail;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", dictValue=").append(dictValue);
        sb.append(", dictSort=").append(dictSort);
        sb.append(", dictType=").append(dictType);
        sb.append(", dictCode=").append(dictCode);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", dictRemarkDetail=").append(dictRemarkDetail);
        sb.append("]");
        return sb.toString();
    }
}