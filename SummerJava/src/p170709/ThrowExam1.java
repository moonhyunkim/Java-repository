package p170709;

import java.io.*;
import java.util.*;

public class ThrowExam1 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("�޾ƶ� ");
			throw e;
		}catch(Exception e) {
			System.out.println("������.."+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ��");
		System.out.println("����ð��� "+ new Date());
	}
}
