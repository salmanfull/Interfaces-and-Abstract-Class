/*
 * This Abstract class can be extended only by those classes which have 'is-a' relationship.
 * Since MySql and Oracle are relational databases they can extend them but class like MongoDB cannot.
 */
public abstract class RelationalDB {
	public abstract void createUser();

	public abstract void deleteUser();
}
