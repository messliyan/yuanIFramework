package com.yuan.dict;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class IODictRemarkDetail {
    private List<String> choiceDoctorsIds;
    private List<String> words;

    public static IODictRemarkDetail init() {
        return new IODictRemarkDetail() {{
            setWords(new ArrayList<>() {{
                add("请问目前有什么症状？");
                add("这种症状持续多长时间了？");
                add("还有其他不舒服吗？");
                add("爬楼梯能爬几层？");
                add("做过什么检查吗？");
                add("检查什么时间做的？");
                add("目前服用什么药物？");
                add("是否一直规律服药？");
            }});
        }};
    }
}
