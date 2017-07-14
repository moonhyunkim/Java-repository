package p170712;

import javax.sound.midi.Synthesizer;

public class thisExam {
	private int a=0, b=0, c=0 ;
	
	thisExam(){
		a=3;
		b=4;
		c=5;
	}
	
	thisExam(int one , int two, int three){
		this();
		c=three;
		
		System.out.println(a+" "+b+" "+c);
	}
	public static void main (String[] args) {
		
		thisExam thisEx = new thisExam(1, 1, 100);
		
	}
}
