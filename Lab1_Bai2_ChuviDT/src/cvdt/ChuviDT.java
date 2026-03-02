package cvdt;

import java.util.Scanner;

public class ChuviDT {

	public static void main(String[] args) {
		
		Scanner hcn = new Scanner (System.in);
		
		System.out.print("Nhập cạnh 1 HCN: ");
		double c1 = hcn.nextDouble();
		
		System.out.print("Nhập cạnh 2 HCN: ");
		double c2 = hcn.nextDouble();

		double chuvi = (c1+c2)*2;
		double dientich = c1*c2;
		
		System.out.println("\n--- KẾT QUẢ ---");
		System.out.println("Chu vi: " + chuvi);
        System.out.println("Diện tích: " + dientich);

        //in cạnh nhỏ hơn
        double canhnho = Math.min(c1, c2);
        System.out.println("Cạnh nhỏ hơn là: " + canhnho);
        
        hcn.close();
		
	}

}
