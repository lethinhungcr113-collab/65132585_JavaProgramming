import java.util.Scanner;

public class delta {

	public static void main(String[] args) {
		Scanner heso = new Scanner (System.in);

		System.out.print("Nhập hệ số a: ");
		double a = heso.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = heso.nextDouble();
		
		System.out.print("Nhập hệ số c: ");
		double c = heso.nextDouble();
		
		double delta = Math.pow(b, 2)-4*a*c;
		
		System.out.println("Delta = " + delta);
		
		if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn bậc hai ");
        }

        heso.close();
	}

}
