package dtb;

import java.util.Scanner;

public class SinhVien {

	public static void main(String[] args) {
		Scanner sv = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sv.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sv.nextDouble();

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        sv.close();
	}

}
