package com.steelhouse.audience;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


@Controller
public class RunStorage {

  @Resource
  Storage storage;

  @GetMapping("/greeting")
  public String greeting(Model model) {
    storage.doThis();
    return "dddddone";
  }
}

