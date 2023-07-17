package com.github.wegoo.kmip.objects;

import com.github.wegoo.bytes.tools.BytesTools;
import com.github.wegoo.kmip.enums.TagEnum;
import com.github.wegoo.kmip.enums.TypeEnum;

/**
 * @author: zhangzhenwei
 * @description: com.github.wegoo.kmip.objects 长整形
 * @date: 2023/7/16  13:24
 * @since: 1.0.0
 */
public class KmipLong extends AbstractKmipObject<Long>{

  @Override
  byte[] getBytesValue() {
    return BytesTools.longToBytes(value);
  }


  @Override
  public TypeEnum getType() {
    return TypeEnum.KmipLong;
  }

  @Override
  public Long getValue() {
    return value;
  }
}
