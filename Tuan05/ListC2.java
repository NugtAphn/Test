package Tuan05;

import java.util.ArrayList;

public class ListC2 {
    private ArrayList<ConNguoi> CN;
    private ArrayList<HocVien> HV;
    private ArrayList<NhanVien> NV;
    
    public ListC2(){
        CN = new ArrayList<ConNguoi>();
        HV = new ArrayList<HocVien>();
        NV = new ArrayList<NhanVien>();
    }

    public ListC2(ArrayList<ConNguoi> CN, ArrayList<HocVien> HV, ArrayList<NhanVien> NV) {
        this.CN = CN;
        this.HV = HV;
        this.NV = NV;
    }

    public void Add(ConNguoi N){
        if(N instanceof NhanVien)
            NV.add((NhanVien) N);
        else
            if(N instanceof HocVien)
                HV.add((HocVien) N);
    }
    public void Out(byte choose){
        switch (choose){
            case 1:
                for (NhanVien N : NV)
                    N.XuatNV();
                break;
            case 2:
                for (HocVien N : HV)
                    N.XuatHV();
                break;
            default:
                System.out.print("\nNot This Type\n");
        }
            
    }

}

