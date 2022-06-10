package Tuan05;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
       ListC2 L = new ListC2(); 
       Scanner sc = new Scanner(System.in);
       byte choose;
        do {
            System.out.print("1. Nhap 1 Nhan Vien");
            System.out.print("\n2. Nhap 1 Hoc Vien");
            System.out.print("\n3. Xuat Danh Sach Nhan Vien / Hoc Vien");
            System.out.print("\n4. Ket Thuc");
            System.out.print("\nNhap Option: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    NhanVien NV = new NhanVien();
                    NV.NhapNV();
                    L.Add(NV);
                    break;
                case 2:
                    HocVien HV = new HocVien();
                    HV.NhapHV();
                    L.Add(HV);
                    break;
                case 3:
                    System.out.print("1. Nhan Vien");
                    System.out.print("\n2. Hoc Vien");
                    System.out.print("\n!!! Nhap Lua Chon: ");
                    choose = sc.nextByte();
                    L.Out(choose);
                    break;
                case 4:
                    System.out.println("Ket thuc");;
                    break;
                default:
                    System.out.println("No Function");
                    break;
            }
            System.out.println("\nEnter\n");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 4);
    }
}

