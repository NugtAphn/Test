package Tuan05;

import java.util.ArrayList;

public class ListC3 {
    private ArrayList<ConNguoi> CN;
    private ArrayList<HocVien> HV;
    private ArrayList<NhanVienQL> QL;
    private ArrayList<GiaoVien> GV;
    
    public ListC3(){
        CN = new ArrayList<ConNguoi>();
        HV = new ArrayList<HocVien>();
        QL = new ArrayList<NhanVienQL>();
        GV = new ArrayList<GiaoVien>();
    }

    public ListC3(ArrayList<ConNguoi> CN, ArrayList<HocVien> HV, ArrayList<NhanVienQL> QL, ArrayList<GiaoVien> GV) {
        this.CN = CN;
        this.HV = HV;
        this.QL = QL;
        this.GV = GV;
    }
    
    public void Add(ConNguoi N){
        if(N instanceof NhanVienQL)
            QL.add((NhanVienQL) N);
        else
            if(N instanceof HocVien)
                HV.add((HocVien) N);
            else
                if(N instanceof GiaoVien)
                    GV.add((GiaoVien) N);
    }
    public void Out(byte choose){
        switch (choose){
            case 1:
                for (NhanVienQL N : QL)
                    N.XuatQL();
                break;
            case 2:
                for (HocVien N : HV)
                    N.XuatHV();
                break;
            case 3:
                for (GiaoVien N : GV)
                    N.XuatGV();
                break;
            default:
                System.out.print("\nNot This Type\n");
        }
            
    }

}


