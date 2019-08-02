package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);//获取商品列表
	void decreaseNumbers(List<Item> list);//减库存
}