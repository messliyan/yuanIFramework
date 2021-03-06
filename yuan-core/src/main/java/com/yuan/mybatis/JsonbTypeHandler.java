package com.yuan.mybatis;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.ibatis.type.JdbcType;
import org.postgresql.util.PGobject;


public class JsonbTypeHandler<T> extends JsonTypeHandler<T> {

  public JsonbTypeHandler(Class<T> clazz) {
    super(clazz);
  }

  @Override

  public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType)
      throws SQLException {
    PGobject jsonObject = new PGobject();
    jsonObject.setType("jsonb");
    jsonObject.setValue(toJson(parameter));
    ps.setObject(i, jsonObject);
  }
}
