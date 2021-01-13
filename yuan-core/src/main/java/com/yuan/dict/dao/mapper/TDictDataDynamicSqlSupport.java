package com.yuan.dict.dao.mapper;

import com.yuan.dict.IODictRemarkDetail;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TDictDataDynamicSqlSupport {

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final TDictData TDictData = new TDictData();

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Long> id = TDictData.id;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> name = TDictData.name;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> dictValue = TDictData.dictValue;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Integer> dictSort = TDictData.dictSort;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> dictType = TDictData.dictType;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> dictCode = TDictData.dictCode;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<Integer> status = TDictData.status;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> createBy = TDictData.createBy;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<String> updateBy = TDictData.updateBy;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<LocalDateTime> createdAt = TDictData.createdAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<LocalDateTime> updatedAt = TDictData.updatedAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<LocalDateTime> deletedAt = TDictData.deletedAt;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final SqlColumn<IODictRemarkDetail> dictRemarkDetail = TDictData.dictRemarkDetail;

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  public static final class TDictData extends SqlTable {

    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

    public final SqlColumn<String> dictValue = column("dict_value", JDBCType.VARCHAR);

    public final SqlColumn<Integer> dictSort = column("dict_sort", JDBCType.INTEGER);

    public final SqlColumn<String> dictType = column("dict_type", JDBCType.VARCHAR);

    public final SqlColumn<String> dictCode = column("dict_code", JDBCType.VARCHAR);

    public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

    public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

    public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);

    public final SqlColumn<LocalDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

    public final SqlColumn<LocalDateTime> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

    public final SqlColumn<LocalDateTime> deletedAt = column("deleted_at", JDBCType.TIMESTAMP);

    public final SqlColumn<IODictRemarkDetail> dictRemarkDetail = column("remark", JDBCType.VARCHAR,
        "com.yuan.mybatis.JsonbTypeHandler");

    public TDictData() {
      super("s_yuan.t_dict_data");
    }
  }
}