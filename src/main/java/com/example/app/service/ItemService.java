package com.example.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.domain.Item;

@Service
public class ItemService {
	private List<Item> itemList;

	public ItemService() {
		itemList = new ArrayList<>();
		itemList.add(new Item("マウス", 1800, getDate("2023/04/25")));
		itemList.add(new Item("キーボード", 4800, getDate("2023/05/14")));
		itemList.add(new Item("モニター", 19800, getDate("2023/06/10")));
		itemList.add(new Item("USB メモリ", 2980, getDate("2023/06/10")));
		itemList.add(new Item("Web カメラ", 14800, getDate("2023/07/01")));
	}

	// 全商品の情報を提供
	public List<Item> getItemList() {
		return itemList;
	}

	// 個別の商品情報を提供
	public Item getItemById(int id) {
		return itemList.get(id);
	}

	// 文字列の日付を LocalDate 型に変換
	private LocalDate getDate(String date) {
		String[] ymd = date.split("/");
		int y = Integer.parseInt(ymd[0]);
		int m = Integer.parseInt(ymd[1]);
		int d = Integer.parseInt(ymd[2]);
		return LocalDate.of(y, m, d);
	}
}