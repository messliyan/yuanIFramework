package com.yuan.mybatis;


import com.yuan.Enum.CodeEnum;
import com.yuan.Enum.IntCodeEnum;
import com.yuan.Enum.StringCodeEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据类型转换
 * 数据库类型 <==> Java 枚举类型
 */
public class EnumCodeHandler<E extends Enum<E>>
    extends BaseTypeHandler<E> {

  private Class<E> type;

  public EnumCodeHandler(Class<E> type) {
    if (type == null) {
      throw new IllegalArgumentException("Type argument cannot be null");
    }
    this.type = type;
  }

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, E parameter,
      JdbcType jdbcType) throws
      SQLException {
    if (!(parameter instanceof CodeEnum)) {
      throw new IllegalArgumentException(
          "Enum type [" + parameter.getClass().getName() +
              "] should either implement [" +
              IntCodeEnum.class.getName() + "] or [" +
              StringCodeEnum.class.getName() + "]");
    }
    if (jdbcType == null) {
      if (parameter instanceof IntCodeEnum) {
        ps.setInt(i, ((IntCodeEnum) parameter).getCode());
      } else if (parameter instanceof StringCodeEnum) {
        ps.setString(i, ((StringCodeEnum) parameter).getCode());
      } else {
        throw new IllegalArgumentException(
            "Unknown enum type [" + parameter.getClass().getName() + "]");
      }
    } else {
      if (parameter instanceof IntCodeEnum) {
        ps.setObject(i, ((IntCodeEnum) parameter).getCode(),
            jdbcType.TYPE_CODE);
      } else if (parameter instanceof StringCodeEnum) {
        ps.setObject(i, ((StringCodeEnum) parameter).getCode(),
            jdbcType.TYPE_CODE);
      } else {
        throw new IllegalArgumentException(
            "Unknown enum type [" + parameter.getClass().getName() + "]");
      }
    }
  }

  @Override
  public E getNullableResult(ResultSet rs, String columnName)
      throws SQLException {
    String s = rs.getString(columnName);
    return s == null ? null : getEnumForCode(type, s);
  }

  @Override
  public E getNullableResult(ResultSet rs, int columnIndex)
      throws SQLException {
    String s = rs.getString(columnIndex);
    return s == null ? null : getEnumForCode(type, s);
  }

  @Override
  public E getNullableResult(CallableStatement cs, int columnIndex)
      throws SQLException {
    String s = cs.getString(columnIndex);
    return s == null ? null : getEnumForCode(type, s);
  }

  private E getEnumForCode(Class<E> cType, String code) {
    try {
      E[] names = cType.getEnumConstants();
      for (E e : names) {
        if (getCodeAsString(e).equals(code)) {
          return e;
        }
      }
      throw new CodeNotDefinedException("No code " + code + " found for enum: "
          + cType);
    } catch (Exception e) {
      throw new RuntimeException("No appropriate constructor found for enum "
          + cType, e);
    }
  }

  private String getCodeAsString(E theEnum) {
    if (theEnum instanceof IntCodeEnum) {
      return String.valueOf(((IntCodeEnum) theEnum).getCode());
    } else if (theEnum instanceof StringCodeEnum) {
      return ((StringCodeEnum) theEnum).getCode();
    }
    throw new IllegalArgumentException(
        "Enum type [" + theEnum.getClass().getName() +
            "] should either implement [" +
            IntCodeEnum.class.getName() + "] or [" +
            StringCodeEnum.class.getName() + "]");
  }
}
