package com.steelhouse.audience;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;


@Controller
@Slf4j
public class RunStorage {

  @Resource
  Storage storage;

  @GetMapping("/greeting")
  public String greeting(Model model) {
    storage.doThis();
    return "dddddone";
  }
}

