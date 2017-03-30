
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             RelationalDB mysql = new MySql();
             RelationalDB oracle = new Oracle();
             mysql.createUser();
             mysql.deleteUser();
             oracle.createUser();
             oracle.deleteUser();
	}

}
