package stream_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.*;
public class Bill_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bill_Class> bill = new ArrayList<>();
		bill.add(new Bill_Class("Samosa",5,10));
		bill.add(new Bill_Class("Dosa",6,2));
		bill.add(new Bill_Class("Jalebi",10,10));
		bill.add(new Bill_Class("Rosgulla",10,18));
		Collections.sort(bill);
		System.out.println("\n      *********Welcome Hotel ********\n");
		System.out.println("  ItemName  "+"Price    "+"Qty  "+"LineTotal  ");
		for (Bill_Class transaction : bill) {
			transaction.printStatement();
		}
		System.out.println("                           .........");
		
		double s=bill.stream().map(e->e.getPrice()*e.getQty()).reduce(0.0, (sum, element) -> sum + element);
		System.out.println("                      Total= "+s);
		System.out.println("                           .........");
		System.out.println("                  BillTotal= "+s*1.05+"\n "
				+ "          (Inclusive of 5% tax)");
		System.out.println("\n\n **************Keep Coming*****************");
		
	}
}