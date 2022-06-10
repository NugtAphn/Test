package Tuan05;

import java.util.Scanner;

public class Main1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien NV = new NhanVien();
        HocVien HV = new HocVien();
        byte choose;
        do {
            System.out.print("1. Nhap 1 Hoc Vien");
            System.out.print("\n2. Nhap 1 Nhan Vien");
            System.out.print("\n3. Xuat 1 Hoc Vien");
            System.out.print("\n4. Xuat 1 Nhan Vien");
            System.out.print("\n5. Ket Thuc");
            System.out.print("\nNhap Option: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    HV.NhapHV();
                    break;
                case 2:
                    NV.NhapNV();
                    break;
                case 3:
                    HV.XuatHV();
                    break;
                case 4:
                    NV.XuatNV();
                    break;
                case 5:
                    System.out.println("Ket thuc");;
                    break;
                default:
                    System.out.println("No Function");
                    break;
            }
            System.out.println("\nEnter\n");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 5);
    }      
}

