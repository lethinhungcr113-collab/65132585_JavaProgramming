
import java.util.Scanner;

public class thetich {

	public static void main(String[] args) {
		
		Scanner hv = new Scanner (System.in);
		
		System.out.print("Nhập cạnh của hình vuông: ");
		double c1 = hv.nextDouble();
		
		double thetich = c1*c1*c1;

		System.out.println("\n--- KẾT QUẢ ---");
		System.out.println("Thể tích khối lập phương: " + thetich);
		
		hv.close();
	}

}
