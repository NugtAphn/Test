package Tuan05;

import java.util.Scanner;

public class ConNguoi {
    private String Ten,NgaySinh;

    public ConNguoi(){
    }

    public ConNguoi(String Ten, String NgaySinh){
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
    }

    public String getHoTen(){
        return this.Ten;
    }

    public void setHoTen(String Ten){
        this.Ten = Ten;
    }

    public String getNgaySinh(){
        return this.NgaySinh;
    }

    public void setNgaySinh(String NgaySinh){
        this.NgaySinh = NgaySinh;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten: ");
        this.Ten = sc.nextLine();
        System.out.print("Nhap Ngay Sinh: ");
        this.NgaySinh = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("\n%-10s %-10s", this.Ten, this.NgaySinh);
    }
}
