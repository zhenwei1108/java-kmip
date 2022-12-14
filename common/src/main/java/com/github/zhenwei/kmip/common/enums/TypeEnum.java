package com.github.zhenwei.kmip.common.enums;

import java.util.stream.Stream;

/**
 * @author zhangzhenwei
 * @description: 项类型
 * @date 2022/9/26  23:12
 */
public enum TypeEnum {
  //结构
  KmipStructure(0x01, 0),
  //整型
  KmipInteger(0x02, 4),
  //长整型
  KmipLong(0x03, 8),
  //大数
  KmipBigInteger(0x04, 0),
  //枚举
  KmipEnum(0x05, 4),
  //布尔
  KmipBoolean(0x06, 8),
  //文本串
  KmipString(0x07, 0),
  //字节串
  KmipByteString(0x08, 0),
  //日期
  KmipDate(0x09, 8),
  //间隔
  KmipInterval(0x0A, 4),
  ;


  private int type;

  //允许长度
  private int allowLen;

  public int getAllowLen() {
    return allowLen;
  }

  TypeEnum(int type, int allowLen) {
    this.type = type;
    this.allowLen = allowLen;
  }

  public int getType() {
    return type;
  }

  public String getHexValue() {
    return Integer.toHexString(type).toUpperCase();
  }

  public static TypeEnum matchType(int type) {
    return Stream.of(values()).filter(tag -> tag.getType() == type).limit(1).findFirst()
        .orElse(null);

  }


}
