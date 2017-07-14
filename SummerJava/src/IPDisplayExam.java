import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDisplayExam {
	public static void main(String[] args) {
		InetAddress ia = null;
		InetAddress []ia2 = null;
		
		try {
			ia = Inet4Address.getByName("www.naver.com");
			System.out.println("server HostAddress : " + ia.getHostAddress());
			System.out.println("server HostName : "+ ia.getHostName());
			System.out.println("--------------------");
			ia = InetAddress.getLocalHost();
			System.out.println("local HostAddress : "+ ia.getHostAddress());
			System.out.println("local Hostname :  "+ia.getHostName());
			System.out.println("--------------");
			ia2 = InetAddress.getAllByName("www.naver.com");
			for(InetAddress aa:ia2) {
				System.out.println(aa.getHostAddress());
				System.out.println(aa.getHostName());
			}
		}catch(UnknownHostException ee) {
			System.err.println("해당사이트는 유효하지 않습니다");
		}
	}
}
