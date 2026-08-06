package com.restaurant;

public abstract class Person implements OrderService {

	private int tableNo;
	private String itemName;

	public Person(int tableNO, String itemName) {
		this.tableNo = tableNO;
		this.itemName = itemName;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void orderDetails() {
		System.out.println("Table No: " + tableNo);
		System.out.println("Item Name: " + itemName);
	}
	
	public abstract void orderHandling();

}
