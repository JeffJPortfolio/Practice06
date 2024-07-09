package com.javaex.ex06;

public class MyBase extends Base{
	
	public void service(String state) {
		if (state.equals("오후")) {
			noon();
		}
		else {
			super.service(state);
		}
		
    }
	@Override
    public void day() {
        System.out.println("낮에는 열심히 수업을 듣자");
    }

    public void noon() {
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다");
    }
}
