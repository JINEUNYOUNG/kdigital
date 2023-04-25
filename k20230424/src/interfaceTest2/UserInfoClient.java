package interfaceTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class UserInfoClient {

	public static void main(String[] args) {
		
		String dbType = "";
		FileInputStream fis = null;
		
		String filepath = "C:\\k_digital\\workspace\\k20230424\\src\\interfaceTest2\\db.properties";
		
		try {
			fis = new FileInputStream(filepath);
//			System.out.println("디스크에 파일이 존재합니다.");
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			int ch;
//			String prop = "";
//			while ((ch = fis.read()) != -1) {
//				System.out.print((char)ch);
//				prop += (char) ch;
//		} 
//			System.out.println("\n"+prop);
//			System.out.println(Arrays.toString(prop.split("=")));
			Properties properties = new Properties();
			properties.load(fis);
//			System.out.println(properties.getProperty("DBTYPE","없음"));
			dbType = properties.getProperty("DBTYPE","없음");
			System.out.println("dbtype은 "+dbType);
			
		}catch (FileNotFoundException e) {
			System.out.println("경로에 파일이 없습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		UserInfoVO vo = new UserInfoVO();
		vo.setUserID("qer");
		vo.setUserName("홍길동");
		vo.setUserPassword("123");
		System.out.println(vo);
		
		UsesrInfoDAO dao = null;
		if (dbType.equals("MYSQL")) {
			dao = new UserInfoMysqlDAO();
		} else if (dbType.equals("ORACLE")) {
			dao = new UserInfoOracleDAO();
		} else {
			System.out.println(dbType + "는 지원되지않는 데이터 베이스 입니다.");
			return;
		}
		dao.insertUserInfo(vo);
		dao.updateUserInfo(vo);
		dao.deleteUserInfo(vo);
		
	}
}
