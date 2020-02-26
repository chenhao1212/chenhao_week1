package com.chenhao.seniorl.week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenhao.seniorl.week1.entity.Condition;
import com.chenhao.seniorl.week1.entity.Goods;
import com.chenhao.seniorl.week1.entity.Type;
import com.chenhao.seniorl.week1.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	
	@RequestMapping("queryAllGoods")
	public String queryAllGoods(Model m,Condition con) {
		if(con.getPageNum()==null) {
			con.setPageNum(1);
		}
		PageHelper.startPage(con.getPageNum(), 3);
		List<Goods> list=service.queryAllGoods(con);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		m.addAttribute("list", list);
		m.addAttribute("page", page);
		m.addAttribute("con", con);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("selectAllType")
	public Object selectAllType() {
		List<Type> list=service.selectAllType();
		return list;
	}
	
}
