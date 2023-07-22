package com.github.wegoo.kmip.objects;

import com.github.wegoo.bytes.tools.BytesTools;
import com.github.wegoo.kmip.enums.TypeEnum;
import java.util.List;
import java.util.Objects;

/**
 * @author: zhangzhenwei
 * @description: 结构
 * @date: 2023/7/22  22:52
 * @since: 1.0.0
 */
public class KmipStructures extends AbstractKmipObject<List<AbstractKmipObject<Objects>>> {

  @Override
  byte[] getBytesValue() {
    byte[] result = new byte[0];
    for (AbstractKmipObject<Objects> kmipObject : value) {
      result = BytesTools.merge(result, kmipObject.getEncode());
    }
    return result;
  }

  @Override
  public TypeEnum getType() {
    return TypeEnum.Structure;
  }
}
