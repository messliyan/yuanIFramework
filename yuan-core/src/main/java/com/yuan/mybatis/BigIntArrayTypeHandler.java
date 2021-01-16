package com.yuan.mybatis;


import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedJdbcTypes(JdbcType.OTHER)
@MappedTypes(Long[].class)
public class BigIntArrayTypeHandler extends BaseTypeHandler<Long[]> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i,
      Long[] parameter, JdbcType jdbcType) throws SQLException {
    Connection c = ps.getConnection();
    Array inArray = c.createArrayOf("bigint", parameter);
    ps.setArray(i, inArray);
  }

  @Override
  public Long[] getNullableResult(ResultSet rs, String columnName)
      throws SQLException {
    Array outputArray = rs.getArray(columnName);
    if (outputArray == null) {
      return null;
    }
    return (Long[]) outputArray.getArray();
  }

  @Override
  public Long[] getNullableResult(ResultSet rs, int columnIndex)
      throws SQLException {
    Array outputArray = rs.getArray(columnIndex);
    if (outputArray == null) {
      return null;
    }
    return (Long[]) outputArray.getArray();
  }

  @Override
  public Long[] getNullableResult(CallableStatement cs, int columnIndex)
      throws SQLException {
    Array outputArray = cs.getArray(columnIndex);
    if (outputArray == null) {
      return null;
    }
    return (Long[]) outputArray.getArray();
  }
}
