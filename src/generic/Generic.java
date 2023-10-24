package generic;

import java.util.HashMap;
import java.util.Map;

import Account.Account;

public class Generic {
	// we use map generic Account collection  for storing the data
	static Map<Long, Account> map = new HashMap<Long, Account>();
	
	// MAP Name Method
	public static Map<Long, Account> getAllAccounts(){
//		System.out.println(map);
		return map;
	}
	

	public static void addAccount(Account acc) {
		//adding account object into map by fetching Account number from key of the map
		map.put(acc.getAccnumber(), acc);
	}

}
