package com.yuan.Enum;

/**
 * All code-styled enum type should implement this interface to provide a
 * consistent way to retrieve the code value of this enum.
 * <p>
 * FIXME this pattern assumes the enums are static, i.e. when there is a new
 * code value added in DB, we'll need to update the enum class to include the
 * new value. This requires a code change. To overcome this limitation, we could
 * possibly use a dynamic enum solution, e.g. article http://niceideas
 * .ch/roller2/badtrash/entry/java_create_enum_instances_dynamically, or
 * http://blog.xebia.com/2009/04/02/dynamic-enums-in-java/ Should later revisit
 * this and evaluate above options.
 * <p>
 * Created on 15-9-2.
 *
 * @author gdong
 */
public interface IntCodeEnum extends CodeEnum {

  /**
   * Returns the underlying code associated to this enum type. Sub-class (the
   * actual Enum type) should return associated code value stored in DB.
   *
   * @return the code value of this type
   */
  int getCode();

  /**
   * Returns the description of this code.
   *
   * @return the description of this code.
   */
  String getDescription();

  /**
   * Returns the enum of the given enum type class and the given code. This is
   * enhanced version of looking up of {@link Enum#valueOf(Class, String)},
   * which is looking up enum by its name
   *
   * @param cType the enum type class
   * @param code  the enum code value
   * @param <E>   the enum type
   * @return the enum representation of the given type and code
   */
  static <E extends IntCodeEnum> E getEnumForCode(Class<E> cType, int code) {
    if (!cType.isEnum()) {
      throw new IllegalArgumentException(
          "Class " + cType.getCanonicalName() + " is not a enum.");
    }
    E[] enumType = cType.getEnumConstants();
    for (E e : enumType) {
      if (e.getCode() == code) {
        return e;
      }
    }
    throw new IllegalArgumentException(
        "No enum constant for code " + code + " for enum type " +
            cType.getCanonicalName());
  }

  /**
   * Same as {@link Enum#valueOf(Class, String)}, linked here for completeness
   *
   * @param <E>   The enum type whose constant is to be returned
   * @param cType the {@code Class} object of the enum type from which to return
   *              a constant
   * @param name  the name of the constant to return
   * @return the enum constant of the specified enum type with the specified
   * name
   */
  static <E extends Enum<E>> E getEnumForName(Class<E> cType, String name) {
    return E.valueOf(cType, name);
  }
}
