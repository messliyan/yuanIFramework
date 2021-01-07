package com.yuan.mybatis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.postgresql.util.PGobject;

/**
 * @author daqiang
 * @date 2020/5/28 7:04 下午
 **/
@Slf4j
public class SubjectJsonbTypeHandler extends BaseTypeHandler<String> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
      throws SQLException {
    log.info("自定义类型 JSONB 解析 : {} - {}", parameter, parameter.getClass().getName());
    PGobject jsonObject = new PGobject();
    jsonObject.setType("jsonb");
    jsonObject.setValue(parameter);
    ps.setObject(i, jsonObject);
  }

  @Override
  public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
    return Objects.toString(rs.getObject(columnName));
  }

  @Override
  public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    return Objects.toString(rs.getObject(columnIndex));
  }

  @Override
  public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    return Objects.toString(cs.getObject(columnIndex));
  }

}
