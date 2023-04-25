package interfaceTest2;

public class UserInfoOracleDAO implements UsesrInfoDAO {

	@Override
	public void insertUserInfo(UserInfoVO userInfoVO) {
		System.out.println("insert into ORACLE DB userID =" + userInfoVO.getUserID());
		
	}

	@Override
	public void updateUserInfo(UserInfoVO userInfoVO) {
		System.out.println("update into ORACLE DB userID =" + userInfoVO.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfoVO userInfoVO) {
		System.out.println("delete into ORACLE DB userID =" + userInfoVO.getUserID());
	}
	

}
