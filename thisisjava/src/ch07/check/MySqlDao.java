package ch07.check;

public class MySqlDao implements DataAccessObject {
	String dbName = "MySql";

	@Override
	public void select() {
		System.out.println(dbName + " DB에서 검색");

	};

	@Override
	public void insert() {
		System.out.println(dbName + " DB에 삽입");

	};

	@Override
	public void update() {
		System.out.println(dbName + " DB를 수정");

	};

	@Override
	public void delete() {
		System.out.println(dbName + " DB에서 삭제");

	};
}
