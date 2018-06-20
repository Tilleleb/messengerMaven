package messenger.Implementation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.ManageContactList;

@Service
@Scope("singleton")
public class ManageContactListImpl implements ManageContactList {

	public boolean addContact(int userid, int contactid) {

		return false;
	}

	public boolean deleteContact(int userid, int contactid) {

		return false;
	}

	public int[] getContactList(int userid) {

		return null;
	}

}
