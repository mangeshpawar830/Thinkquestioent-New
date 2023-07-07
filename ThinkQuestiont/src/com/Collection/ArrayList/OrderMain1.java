package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

import com.Collection.ArrayList.ListContainAnotherLst.Menu;

class Order1{
	int oid;
	int menuId;
	int oQty;
	public Order1(int oid, int menuId, int oQty) {
		this.oid = oid;
		this.menuId = menuId;
		this.oQty = oQty;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", menuId=" + menuId + ", oQty=" + oQty + "]";
	}

}
class Menu1{
	int mId;
	String mName;
	int mPrice;
	
	public Menu1(int mId, String mName, int mPrice) {
		this.mId = mId;
		this.mName = mName;
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "Menu1 [mId=" + mId + ", mName=" + mName + ", mPrice=" + mPrice + "]";
	}
}

public class OrderMain1 {
	public static void main(String[] args) {
		ArrayList<Order1>order=new ArrayList<>();
		order.add(new Order1(10,1,2));
		order.add(new Order1(20,1,3));
		order.add(new Order1(10,3,1));
		ArrayList<Menu1>menu=new ArrayList<>();
		menu.add(new Menu1(1, "Tea", 10));
		menu.add(new Menu1(2, "vadapav", 20));
		menu.add(new Menu1(3, "Dosa", 70));
		
		HashMap<String, Integer>hm=new HashMap<>();
		for(int i=0;i<menu.size();i++) {
			int totalBill=0;
			for(int j=0;j<order.size();j++) {
				if(menu.get(i).mId==order.get(j).menuId) {
					totalBill=totalBill+menu.get(i).mPrice*order.get(j).oQty;
				}
			}
			hm.put(menu.get(i).mName, totalBill);
			
		}
		System.out.println(hm);
		

	}

}
