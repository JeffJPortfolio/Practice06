package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if (str.equals("앱")) {
        	app();
        }
        else {
        	super.execute(str);
        }
    }
 
    //메소드작성
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    protected void app(){
        System.out.println("앱실행");
    }
    
    
}
