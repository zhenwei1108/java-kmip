package com.github.wegoo.kmip.objects;

import com.github.wegoo.bytes.tools.BytesTools;
import com.github.wegoo.kmip.enums.TagEnum;
import com.github.wegoo.kmip.enums.TypeEnum;
import lombok.AllArgsConstructor;

/**
 * @author: wegoo
 * @description: com.github.wegoo.kmip.objects
 * @date: 2023/7/9  12:03
 * @since: 1.0.0
 */
@AllArgsConstructor
public class KmipInteger extends AbstractKmipObject<Integer> {

  @Override
  public TypeEnum getType() {
    return TypeEnum.KmipInteger;
  }

  @Override
  public Integer getValue() {
    return this.value;
  }

  @Override
  byte[] getBytesValue() {
    return BytesTools.intToBytes(getValue());
  }
}
