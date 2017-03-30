
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySql mysql = new MySql();
		MongoDB mongo = new MongoDB();
		mysql.storeUsersInDB();
		mongo.storeUsersInDB();
	}

}
