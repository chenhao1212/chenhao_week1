package com.chenhao.seniorl.week1.service;

import java.util.List;

import com.chenhao.seniorl.week1.entity.Condition;
import com.chenhao.seniorl.week1.entity.Goods;
import com.chenhao.seniorl.week1.entity.Type;

public interface GoodsService {

	List<Goods> queryAllGoods(Condition con);

	List<Type> selectAllType();

}
