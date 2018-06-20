package messenger.Implementation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.ManageContactList;

@Service
@Scope("singleton")
public class ManageContactListImpl implements ManageContactList {

	public boolean addContact(int userid, String contactname) {
		// TODO Auto-generated method stub
		if (userid == 1 && contactname == "user2")
			return true;
		return false;
	}

	public boolean deleteContact(int userid, int contactid) {
		// TODO Auto-generated method stub
		if (userid == 1 && contactid == 2)
			return true;
		return false;
	}

	public int[] getContactList(int userid) {
		// TODO Auto-generated method stub
		int[] intArray = new int[1];
		intArray[0] = 1;
		if (userid == 1)
			return intArray;
		return null;
	}

}
