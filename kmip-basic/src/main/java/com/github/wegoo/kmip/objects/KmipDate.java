package com.github.wegoo.kmip.objects;

import com.github.wegoo.bytes.tools.BytesTools;
import com.github.wegoo.kmip.enums.TypeEnum;
import java.util.Date;

/**
 * @author: zhangzhenwei
 * @description: com.github.wegoo.kmip.objects 时间
 * @date: 2023/7/18  08:49
 * @since: 1.0.0
 */
public class KmipDate extends AbstractKmipObject<Date>{

  @Override
  byte[] getBytesValue() {
    return BytesTools.longToBytes(value.getTime());
  }

  @Override
  public TypeEnum getType() {
    return TypeEnum.KmipDate;
  }
}
