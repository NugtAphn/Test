package Tuan05;

import java.util.Scanner;

public class HocVien extends ConNguoi{
    private float D1,D2,D3;

    public HocVien(){
    }

    public HocVien(String Ten, String NgaySinh, float D1, float D2, float D3){
        super(Ten, NgaySinh);
        this.D1 = D1;
        this.D2 = D2;
        this.D3 = D3;
    }
    
    public float getD1() {
        return D1;
    }

    public void setD1(float D1) {
        this.D1 = D1;
    }

    public float getD2() {
        return D2;
    }

    public void setD2(float D2) {
        this.D2 = D2;
    }

    public float getD3() {
        return D3;
    }

    public void setD3(float D3) {
        this.D3 = D3;
    }
    
    public void NhapHV(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem 1: ");
        this.D1 = sc.nextFloat();
        System.out.print("Nhap Diem 2: ");
        this.D2 = sc.nextFloat();
        System.out.print("Nhap Diem 3: ");
        this.D3 = sc.nextFloat();
    }

    public void XuatHV(){
        super.Xuat();
        System.out.printf("%-10f%-10f%-10f", this.D1, this.D2, this.D3);
    }
}
