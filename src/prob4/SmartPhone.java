package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if ( function.equals("음악") ) {
			Music();
			return;
		}
		if ( function.equals("앱") ) {
			App();
			return;
		}
		
		super.execute( function );
	}
	
	
	private void Music(){
		System.out.println("다운로드해서 음악재생");
	}
	
	private void App(){
		System.out.println("앱실행");
	}
}
