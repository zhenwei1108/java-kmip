package com.github.wegoo.kmip.objects;

import com.github.wegoo.kmip.enums.TypeEnum;
import java.nio.charset.StandardCharsets;

/**
 * @author: zhangzhenwei
 * @description: com.github.wegoo.kmip.objects 字符串
 * @date: 2023/7/16  21:44
 * @since: 1.0.0
 */
public class KmipString extends AbstractKmipObject<String>{


  @Override
  byte[] getBytesValue() {
    return value.getBytes(StandardCharsets.UTF_8);
  }

  @Override
  public TypeEnum getType() {
    return TypeEnum.KmipString;
  }


}
