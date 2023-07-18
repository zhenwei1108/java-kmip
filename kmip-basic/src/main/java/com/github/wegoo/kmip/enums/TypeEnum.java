package com.github.wegoo.kmip.enums;

import java.util.stream.Stream;

/**
 * @author wegoo
 * @description: 项类型
 * @date 2022/9/26  23:12
 */
public enum TypeEnum implements IEnum{
  //结构
  Structure(0x01, 0),
  //整型
  Integer(0x02, 4),
  //长整型
  Long(0x03, 8),
  //大数
  BigInteger(0x04, 0),
  //枚举
  Enum(0x05, 4),
  //布尔
  Boolean(0x06, 8),
  //文本串
  String(0x07, 0),
  //字节串
  ByteString(0x08, 0),
  //日期
  Date(0x09, 8),
  //间隔
  Interval(0x0A, 4),
  ;


  private byte type;

  //允许长度
  private int maxLength;


  TypeEnum(int type, int maxLength) {
    this.type = (byte) type;
    this.maxLength = maxLength;
  }

  public int getType() {
    return type;
  }


  public int getMaxLength() {
    return maxLength;
  }

  public static TypeEnum matchType(int type) {
    return Stream.of(values()).filter(tag -> tag.getType() == type).findFirst().orElse(null);
  }


  @Override
  public byte[] getEncode() {
    return new byte[]{type};
  }
}
