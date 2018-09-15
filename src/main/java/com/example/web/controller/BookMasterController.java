package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 【クラスの説明】 
 * 本マスタのコントローラクラス
 * 
 * 【変更履歴】 1.00 2018/09/16 新規作成
 * 
 * @author T.Yagi
 * 
 * @version 1.00
 *
 */
@Controller
public class BookMasterController {

	@RequestMapping("/")
	public ModelAndView init(ModelAndView view) {
		view.setViewName("bookMaster");

		return view;
	}
}
