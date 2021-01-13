package com.yuan.dict;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lijiabin
 * @Description 数据字段remark详细 (admin为推荐医生 sid为医生常用语 不会同时存在)
 * @Date 2020-12-14 19:34:43
 * @Version 1.0.0
 **/
@Data
@NoArgsConstructor
public class IODictRemarkDetail {

  private List<String> choiceDoctorsIds;
  private List<String> words;
}
