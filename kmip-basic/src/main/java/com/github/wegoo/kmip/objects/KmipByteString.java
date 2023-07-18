package com.github.wegoo.kmip.objects;

import com.github.wegoo.kmip.enums.TypeEnum;

/**
 * @author: zhangzhenwei
 * @description: com.github.wegoo.kmip.objects 字节串
 * @date: 2023/7/18  08:48
 * @since: 1.0.0
 */
public class KmipByteString extends AbstractKmipObject<byte[]>{

  @Override
  byte[] getBytesValue() {
    return getValue();
  }

  @Override
  public TypeEnum getType() {
    return TypeEnum.KmipByteString;
  }
}
