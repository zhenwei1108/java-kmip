package com.github.wegoo.kmip.objects;

import com.github.wegoo.kmip.enums.IEnum;
import com.github.wegoo.kmip.enums.TypeEnum;

/**
 * @author: zhangzhenwei
 * @description: 枚举
 * @date: 2023/7/18  08:53
 * @since: 1.0.0
 */
public class KmipEnum extends AbstractKmipObject<IEnum>{

  @Override
  byte[] getBytesValue() {
    return value.getEncode();
  }

  @Override
  public TypeEnum getType() {
    return TypeEnum.Enum;
  }
}
