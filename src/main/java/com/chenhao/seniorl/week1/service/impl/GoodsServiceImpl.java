package com.chenhao.seniorl.week1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenhao.seniorl.week1.dao.GoodsDao;
import com.chenhao.seniorl.week1.entity.Condition;
import com.chenhao.seniorl.week1.entity.Goods;
import com.chenhao.seniorl.week1.entity.Type;
import com.chenhao.seniorl.week1.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> queryAllGoods(Condition con) {
		// TODO Auto-generated method stub
		return dao.queryAllGoods(con);
	}

	@Override
	public List<Type> selectAllType() {
		// TODO Auto-generated method stub
		return dao.selectAllType();
	}
	
}
