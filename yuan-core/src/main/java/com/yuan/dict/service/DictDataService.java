package com.yuan.dict.service;

import com.yuan.dict.IODictRemarkDetail;
import com.yuan.dict.dao.mapper.TDictDataMapper;
import com.yuan.dict.model.DictData;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.yuan.dict.dao.mapper.TDictDataDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Slf4j
@Service
public class DictDataService {

    @Autowired
    private TDictDataMapper dictDataMapper;


    /**
     * 更新 常用语编辑 remark字段内容
     */
    public int upDateRemarkWords(Long sid, IODictRemarkDetail words) {
        DictData optionalDictData = getDictRemarkWords(sid).get();
        optionalDictData.getDictRemarkDetail().setWords(words.getWords());
        return dictDataMapper.updateByPrimaryKey(optionalDictData);
    }

    /**
     * 追加 常用语编辑 remark字段内容
     */
    public int appendRemarkWords(Long sid, String word) {
        DictData optionalDictData = getDictRemarkWords(sid).get();
        optionalDictData.getDictRemarkDetail().getWords().add(word);

        return dictDataMapper.updateByPrimaryKey(optionalDictData);
    }

    /**
     * 查询 常用语编辑 remark字段内容
     */
    public IODictRemarkDetail getRemarkWords(Long sid) {
        Optional<DictData> optionalDictData = getDictRemarkWords(sid);
        if (optionalDictData.isEmpty()) {//不存在则初始化
            IODictRemarkDetail newWordDetail = IODictRemarkDetail.init();
            dictDataMapper.insert(new DictData() {{
                setName("医生常用语");
                setDictValue(sid + "");
                setDictSort(1);
                setDictType("WS_doctors");
                setDictCode("0");
                setStatus(0);
                setCreateBy("admin");
                setDictRemarkDetail(newWordDetail);
            }});
            return newWordDetail;
        }

        return getDictRemarkWords(sid).get().getDictRemarkDetail();
    }

    /*
     *
     * @param sid
     * @author lijiabin
     * @descript  remark字段内容
     * @date 2020-12-15 11:38:07 11:38
     * @return
     */
    private Optional<DictData> getDictRemarkWords(Long sid) {

        return dictDataMapper.selectOne(SqlBuilder.select(
                TDictDataMapper.selectList)
                .from(TDictData)
                .where(
                        dictType,
                        isEqualTo("WS_doctors")
                ).and(dictValue,
                        isEqualTo(sid + ""))
                .and(status, isEqualTo(0))
                .build()
                .render(RenderingStrategies.MYBATIS3));
    }
}
