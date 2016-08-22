package spring.mvc.vfront01.Bean;

import java.io.File;

public class FileMakerBean {
	
	private final String folderPath = 
			"C:\\Users\\dohyung\\workspace\\Spring_Works\\vFront01\\src\\main\\webapp\\resources\\files\\";
	
	public void resetFile(){
		String filePath = folderPath + "workerList.txt";
		File newFile = new File(filePath);
		if(newFile.exists()){
			newFile.delete();
			newFile = new File(filePath);
		}
	}
	public void writeFile(File newFile){
		
//		workerList 가져오기
		
	}
	
}
