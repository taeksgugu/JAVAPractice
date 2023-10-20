package broker.twotier.test;

import java.util.ArrayList;
import java.util.Vector;

import broker.twotier.dao.Database;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;
import broker.twotier.vo.StockRec;
import oracle.sql.CustomDatum;

public class DatabaseTest {

	public static void main(String[] args)throws Exception{
		
		Database db = new Database("127.0.0.1");
//		db.addCustomer(new CustomerRec("999-999", "James", "NY"));
//		db.deleteCustomer("888-888");
		
//		db.updateCustomer(new CustomerRec("999-999", "James1", "NY1"));
//		
//		ArrayList<SharesRec> v = db.getPortfolio("111-111");
//		for(SharesRec sr : v) System.out.println(sr);
		
//		System.out.println(db.getCustomer("111-111"));
//		ArrayList<CustomerRec> list = db.getAllCustomers();
//		for(CustomerRec c:list) System.out.println(c);
//		ArrayList<StockRec> list = db.getAllStocks();
//		for(StockRec sr:list) System.out.println(sr);
		
		
	}

}
