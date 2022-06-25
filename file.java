import pkg.*;
class file{
	public static void main(String []k){
		add package_access = new add();
		package_access.show();
		System.out.println("-------main called------");
		int result = package_access.add(5,6);
		System.out.println(result);
	}
}