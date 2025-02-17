package study_ch08_exercise;

public class Ex8_13 {

	public static void main(String[] args) {
		
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
			System.out.println(e.getCause());
		}
		
	}

	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch(SpaceException2 e) {
			InstallException ie = new InstallException("설치중 예외발생");
			ie.initCause(e);
			throw ie;
		} catch(MemoryException2 me) {
			InstallException ie = new InstallException("설치중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {
		if(!enoughSpace()) {
			throw new SpaceException2("설치 공간이 부족합니다.");
		} 
		if(!enoughMemory()) {
			throw new MemoryException2("메모리가 부족합니다.");
		}
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
}

class SpaceException2 extends Exception {
	SpaceException2(String str) {
		super(str);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String str) {
		super(str);
	}
}

class InstallException extends Exception {
	InstallException(String str) {
		super(str);
	}
}
