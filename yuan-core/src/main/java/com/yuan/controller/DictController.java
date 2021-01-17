package com.yuan.controller;

import com.yuan.dict.IODictRemarkDetail;
import com.yuan.dict.service.DictDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictController {


  @Autowired
  private DictDataService dictDataService;

  @RequestMapping("/upDateChatWords")
  public String upDateChatWords(IODictRemarkDetail words, Long sid) {
    dictDataService.upDateRemarkWords(sid, words);
    return "Response.instanceSuccess() upDateChatWords";
  }
  @RequestMapping("/appendChatWords")
  public String appendChatWords(String word, Long sid) {
    dictDataService.appendRemarkWords(sid, word);
    return "Response.instanceSuccess() appendChatWords";
  }
  @RequestMapping("/getChatWords")
  public IODictRemarkDetail getChatWords(Long sid) {
    return dictDataService.getRemarkWords(sid);
  }


}
