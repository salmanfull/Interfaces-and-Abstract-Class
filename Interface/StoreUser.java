/*
 * Any class which want to provide the functionality of storing the user in database can implement this interface.
 * Classes no need to have 'is-a' relationship (they can be unrelated), 
 * but in-case of abstract class the classes extending classes should be related.
 */
public interface StoreUser {
	public void storeUsersInDB();
}
