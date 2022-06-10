package Tuan05;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
       ListC3 L = new ListC3(); 
       Scanner sc = new Scanner(System.in);
       byte choose;
        do {
            System.out.print("1. Nhap 1 Nhan Vien Quan Ly");
            System.out.print("\n2. Nhap 1 Hoc Vien");
            System.out.print("\n3. Nhap 1 Giao Vien");
            System.out.print("\n4. Xuat Danh Sach Nhan Vien Quan Ly / Hoc Vien / Giao Vien");
            System.out.print("\n5. Ket Thuc");
            System.out.print("\nNhap Option: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    NhanVienQL QL = new NhanVienQL();
                    QL.NhapQL();
                    L.Add(QL);
                    break;
                case 2:
                    HocVien HV = new HocVien();
                    HV.NhapHV();
                    L.Add(HV);
                    break;
                case 3:
                    GiaoVien GV = new GiaoVien();
                    GV.NhapGV();
                    L.Add(GV);
                    break;
                case 4:
                    System.out.print("1. Nhan Vien Quan Ly");
                    System.out.print("\n2. Hoc Vien");
                    System.out.print("\n3. Giao Vien");
                    System.out.print("\n!!! Nhap Lua Chon: ");
                    choose = sc.nextByte();
                    L.Out(choose);
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
