package com.github.wegoo.kmip.objects;

import com.github.wegoo.kmip.enums.TypeEnum;

/**
 * @author: zhangzhenwei
 * @description: com.github.wegoo.kmip.objects 布尔
 * @date: 2023/7/16  13:50
 * @since: 1.0.0
 */
public class KmipBoolean extends AbstractKmipObject<Boolean>{

  @Override
  byte[] getBytesValue() {
    return new byte[]{(byte) (value ? 0x01 : 0x00)};
  }

  @Override
  public TypeEnum getType() {
    return TypeEnum.Boolean;
  }
}
