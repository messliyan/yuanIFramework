package com.yuan.dict.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TDictTypeDynamicSqlSupport {

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final TDictType TDictType = new TDictType();

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Long> dictId = TDictType.dictId;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> dictName = TDictType.dictName;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> dictLabel = TDictType.dictLabel;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Integer> status = TDictType.status;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> createBy = TDictType.createBy;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> updateBy = TDictType.updateBy;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<LocalDateTime> createdAt = TDictType.createdAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<LocalDateTime> updatedAt = TDictType.updatedAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<LocalDateTime> deletedAt = TDictType.deletedAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> remark = TDictType.remark;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final class TDictType extends SqlTable {

    public final SqlColumn<Long> dictId = column("dict_id", JDBCType.BIGINT);

    public final SqlColumn<String> dictName = column("dict_name", JDBCType.VARCHAR);

    public final SqlColumn<String> dictLabel = column("dict_label", JDBCType.VARCHAR);

    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

    public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

    public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);

    public final SqlColumn<LocalDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

    public final SqlColumn<LocalDateTime> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

    public final SqlColumn<LocalDateTime> deletedAt = column("deleted_at", JDBCType.TIMESTAMP);

    public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

    public TDictType() {
      super("s_yuan.t_dict_type");
    }
  }
}