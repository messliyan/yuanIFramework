package com.yuan.dict.dao.mapper;

import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.TDictType;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.createBy;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.createdAt;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.deletedAt;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.dictId;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.dictLabel;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.dictName;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.remark;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.status;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.updateBy;
import static com.yuan.dict.dao.mapper.TDictTypeDynamicSqlSupport.updatedAt;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.yuan.dict.model.DictType;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TDictTypeMapper {

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  BasicColumn[] selectList = BasicColumn
      .columnList(dictId, dictName, dictLabel, status, createBy, updateBy, createdAt, updatedAt,
          deletedAt, remark);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  static UpdateDSL<UpdateModel> updateAllColumns(DictType record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(dictId).equalTo(record::getDictId)
        .set(dictName).equalTo(record::getDictName)
        .set(dictLabel).equalTo(record::getDictLabel)
        .set(status).equalTo(record::getStatus)
        .set(createBy).equalTo(record::getCreateBy)
        .set(updateBy).equalTo(record::getUpdateBy)
        .set(createdAt).equalTo(record::getCreatedAt)
        .set(updatedAt).equalTo(record::getUpdatedAt)
        .set(deletedAt).equalTo(record::getDeletedAt)
        .set(remark).equalTo(record::getRemark);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  static UpdateDSL<UpdateModel> updateSelectiveColumns(DictType record,
      UpdateDSL<UpdateModel> dsl) {
    return dsl.set(dictId).equalToWhenPresent(record::getDictId)
        .set(dictName).equalToWhenPresent(record::getDictName)
        .set(dictLabel).equalToWhenPresent(record::getDictLabel)
        .set(status).equalToWhenPresent(record::getStatus)
        .set(createBy).equalToWhenPresent(record::getCreateBy)
        .set(updateBy).equalToWhenPresent(record::getUpdateBy)
        .set(createdAt).equalToWhenPresent(record::getCreatedAt)
        .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
        .set(deletedAt).equalToWhenPresent(record::getDeletedAt)
        .set(remark).equalToWhenPresent(record::getRemark);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  long count(SelectStatementProvider selectStatement);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
  int delete(DeleteStatementProvider deleteStatement);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
  int insert(InsertStatementProvider<DictType> insertStatement);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @ResultMap("DictTypeResult")
  Optional<DictType> selectOne(SelectStatementProvider selectStatement);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @Results(id = "DictTypeResult", value = {
      @Result(column = "dict_id", property = "dictId", jdbcType = JdbcType.BIGINT, id = true),
      @Result(column = "dict_name", property = "dictName", jdbcType = JdbcType.VARCHAR),
      @Result(column = "dict_label", property = "dictLabel", jdbcType = JdbcType.VARCHAR),
      @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
      @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
      @Result(column = "update_by", property = "updateBy", jdbcType = JdbcType.VARCHAR),
      @Result(column = "created_at", property = "createdAt", jdbcType = JdbcType.TIMESTAMP),
      @Result(column = "updated_at", property = "updatedAt", jdbcType = JdbcType.TIMESTAMP),
      @Result(column = "deleted_at", property = "deletedAt", jdbcType = JdbcType.TIMESTAMP),
      @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR)
  })
  List<DictType> selectMany(SelectStatementProvider selectStatement);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
  int update(UpdateStatementProvider updateStatement);

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default long count(CountDSLCompleter completer) {
    return MyBatis3Utils.countFrom(this::count, TDictType, completer);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int delete(DeleteDSLCompleter completer) {
    return MyBatis3Utils.deleteFrom(this::delete, TDictType, completer);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int deleteByPrimaryKey(Long dictId_) {
    return delete(c ->
        c.where(dictId, isEqualTo(dictId_))
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default long insertReturningId(DictType record) {
    return MyBatis3Utils.insert(this::insert, record, TDictType, c ->
        c.map(dictId).toProperty("dictId")
            .map(dictName).toProperty("dictName")
            .map(dictLabel).toProperty("dictLabel")
            .map(status).toProperty("status")
            .map(createBy).toProperty("createBy")
            .map(updateBy).toProperty("updateBy")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(deletedAt).toProperty("deletedAt")
            .map(remark).toProperty("remark")
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int insert(DictType record) {
    return MyBatis3Utils.insert(this::insert, record, TDictType, c ->
        c.map(dictId).toProperty("dictId")
            .map(dictName).toProperty("dictName")
            .map(dictLabel).toProperty("dictLabel")
            .map(status).toProperty("status")
            .map(createBy).toProperty("createBy")
            .map(updateBy).toProperty("updateBy")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(deletedAt).toProperty("deletedAt")
            .map(remark).toProperty("remark")
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default long insertSelectiveReturningId(DictType record) {
    return MyBatis3Utils.insert(this::insert, record, TDictType, c ->
        c.map(dictId).toPropertyWhenPresent("dictId", record::getDictId)
            .map(dictName).toPropertyWhenPresent("dictName", record::getDictName)
            .map(dictLabel).toPropertyWhenPresent("dictLabel", record::getDictLabel)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
            .map(deletedAt).toPropertyWhenPresent("deletedAt", record::getDeletedAt)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int insertSelective(DictType record) {
    return MyBatis3Utils.insert(this::insert, record, TDictType, c ->
        c.map(dictId).toPropertyWhenPresent("dictId", record::getDictId)
            .map(dictName).toPropertyWhenPresent("dictName", record::getDictName)
            .map(dictLabel).toPropertyWhenPresent("dictLabel", record::getDictLabel)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
            .map(deletedAt).toPropertyWhenPresent("deletedAt", record::getDeletedAt)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default Optional<DictType> selectOne(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectOne(this::selectOne, selectList, TDictType, completer);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default List<DictType> select(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectList(this::selectMany, selectList, TDictType, completer);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default List<DictType> selectDistinct(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TDictType, completer);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default Optional<DictType> selectByPrimaryKey(Long dictId_) {
    return selectOne(c ->
        c.where(dictId, isEqualTo(dictId_))
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int update(UpdateDSLCompleter completer) {
    return MyBatis3Utils.update(this::update, TDictType, completer);
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int updateByPrimaryKey(DictType record) {
    return update(c ->
        c.set(dictName).equalTo(record::getDictName)
            .set(dictLabel).equalTo(record::getDictLabel)
            .set(status).equalTo(record::getStatus)
            .set(createBy).equalTo(record::getCreateBy)
            .set(updateBy).equalTo(record::getUpdateBy)
            .set(createdAt).equalTo(record::getCreatedAt)
            .set(updatedAt).equalTo(record::getUpdatedAt)
            .set(deletedAt).equalTo(record::getDeletedAt)
            .set(remark).equalTo(record::getRemark)
            .where(dictId, isEqualTo(record::getDictId))
    );
  }

  @Generated("org.mybatis.generator.api.MyBatisGenerator")
  default int updateByPrimaryKeySelective(DictType record) {
    return update(c ->
        c.set(dictName).equalToWhenPresent(record::getDictName)
            .set(dictLabel).equalToWhenPresent(record::getDictLabel)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(createBy).equalToWhenPresent(record::getCreateBy)
            .set(updateBy).equalToWhenPresent(record::getUpdateBy)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
            .set(deletedAt).equalToWhenPresent(record::getDeletedAt)
            .set(remark).equalToWhenPresent(record::getRemark)
            .where(dictId, isEqualTo(record::getDictId))
    );
  }
}