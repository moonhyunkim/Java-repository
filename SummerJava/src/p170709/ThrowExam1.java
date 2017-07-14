package p170709;

import java.io.*;
import java.util.*;

public class ThrowExam1 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("받아랏 ");
			throw e;
		}catch(Exception e) {
			System.out.println("에러를.."+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되어따");
		System.out.println("현재시각은 "+ new Date());
	}
}
