package com.yuan.dict.dao.mapper;

import static com.yuan.dict.dao.mapper.TDictDataDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.yuan.dict.model.DictData;
import com.yuan.mybatis.JsonbTypeHandler;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface TDictDataMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, dictValue, dictSort, dictType, dictCode, status, createBy, updateBy, createdAt, updatedAt, deletedAt, dictRemarkDetail);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT CURRVAL('seq_dict_data')", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<DictData> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DictDataResult")
    Optional<DictData> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DictDataResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_value", property="dictValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_sort", property="dictSort", jdbcType=JdbcType.INTEGER),
        @Result(column="dict_type", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_code", property="dictCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="dictRemarkDetail", typeHandler=JsonbTypeHandler.class, jdbcType=JdbcType.VARCHAR)
    })
    List<DictData> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TDictData, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TDictData, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long insertReturningId(DictData record) {
        return MyBatis3Utils.insert(this::insert, record, TDictData, c ->
            c.map(name).toProperty("name")
            .map(dictValue).toProperty("dictValue")
            .map(dictSort).toProperty("dictSort")
            .map(dictType).toProperty("dictType")
            .map(dictCode).toProperty("dictCode")
            .map(status).toProperty("status")
            .map(createBy).toProperty("createBy")
            .map(updateBy).toProperty("updateBy")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(deletedAt).toProperty("deletedAt")
            .map(dictRemarkDetail).toProperty("dictRemarkDetail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DictData record) {
        return MyBatis3Utils.insert(this::insert, record, TDictData, c ->
            c.map(name).toProperty("name")
            .map(dictValue).toProperty("dictValue")
            .map(dictSort).toProperty("dictSort")
            .map(dictType).toProperty("dictType")
            .map(dictCode).toProperty("dictCode")
            .map(status).toProperty("status")
            .map(createBy).toProperty("createBy")
            .map(updateBy).toProperty("updateBy")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(deletedAt).toProperty("deletedAt")
            .map(dictRemarkDetail).toProperty("dictRemarkDetail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long insertSelectiveReturningId(DictData record) {
        return MyBatis3Utils.insert(this::insert, record, TDictData, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(dictValue).toPropertyWhenPresent("dictValue", record::getDictValue)
            .map(dictSort).toPropertyWhenPresent("dictSort", record::getDictSort)
            .map(dictType).toPropertyWhenPresent("dictType", record::getDictType)
            .map(dictCode).toPropertyWhenPresent("dictCode", record::getDictCode)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
            .map(deletedAt).toPropertyWhenPresent("deletedAt", record::getDeletedAt)
            .map(dictRemarkDetail).toPropertyWhenPresent("dictRemarkDetail", record::getDictRemarkDetail)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(DictData record) {
        return MyBatis3Utils.insert(this::insert, record, TDictData, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(dictValue).toPropertyWhenPresent("dictValue", record::getDictValue)
            .map(dictSort).toPropertyWhenPresent("dictSort", record::getDictSort)
            .map(dictType).toPropertyWhenPresent("dictType", record::getDictType)
            .map(dictCode).toPropertyWhenPresent("dictCode", record::getDictCode)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", record::getUpdatedAt)
            .map(deletedAt).toPropertyWhenPresent("deletedAt", record::getDeletedAt)
            .map(dictRemarkDetail).toPropertyWhenPresent("dictRemarkDetail", record::getDictRemarkDetail)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DictData> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TDictData, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DictData> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TDictData, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DictData> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TDictData, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DictData> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TDictData, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(DictData record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(dictValue).equalTo(record::getDictValue)
                .set(dictSort).equalTo(record::getDictSort)
                .set(dictType).equalTo(record::getDictType)
                .set(dictCode).equalTo(record::getDictCode)
                .set(status).equalTo(record::getStatus)
                .set(createBy).equalTo(record::getCreateBy)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(createdAt).equalTo(record::getCreatedAt)
                .set(updatedAt).equalTo(record::getUpdatedAt)
                .set(deletedAt).equalTo(record::getDeletedAt)
                .set(dictRemarkDetail).equalTo(record::getDictRemarkDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DictData record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(dictValue).equalToWhenPresent(record::getDictValue)
                .set(dictSort).equalToWhenPresent(record::getDictSort)
                .set(dictType).equalToWhenPresent(record::getDictType)
                .set(dictCode).equalToWhenPresent(record::getDictCode)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt)
                .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
                .set(deletedAt).equalToWhenPresent(record::getDeletedAt)
                .set(dictRemarkDetail).equalToWhenPresent(record::getDictRemarkDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(DictData record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(dictValue).equalTo(record::getDictValue)
            .set(dictSort).equalTo(record::getDictSort)
            .set(dictType).equalTo(record::getDictType)
            .set(dictCode).equalTo(record::getDictCode)
            .set(status).equalTo(record::getStatus)
            .set(createBy).equalTo(record::getCreateBy)
            .set(updateBy).equalTo(record::getUpdateBy)
            .set(createdAt).equalTo(record::getCreatedAt)
            .set(updatedAt).equalTo(record::getUpdatedAt)
            .set(deletedAt).equalTo(record::getDeletedAt)
            .set(dictRemarkDetail).equalTo(record::getDictRemarkDetail)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(DictData record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(dictValue).equalToWhenPresent(record::getDictValue)
            .set(dictSort).equalToWhenPresent(record::getDictSort)
            .set(dictType).equalToWhenPresent(record::getDictType)
            .set(dictCode).equalToWhenPresent(record::getDictCode)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(createBy).equalToWhenPresent(record::getCreateBy)
            .set(updateBy).equalToWhenPresent(record::getUpdateBy)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(record::getUpdatedAt)
            .set(deletedAt).equalToWhenPresent(record::getDeletedAt)
            .set(dictRemarkDetail).equalToWhenPresent(record::getDictRemarkDetail)
            .where(id, isEqualTo(record::getId))
        );
    }
}