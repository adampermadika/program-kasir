class Kuliah{
    int nim=4350;
    String nama="Rahma";
    double nilai_uts=30;
    double nilai_tugas=50;
    double nilai_uas=80;
    double TotalNilai;
    String Ket;
    public double nilaiAkhir(){
         TotalNilai=(nilai_tugas*(20/100))+(nilai_uts*(30/100))+(nilai_uas*(50/100));
			return TotalNilai;
    }
    
     void statusLulus(){
        if(TotalNilai >= 70) {
            System.out.println(" Selamat Anda Lulus!!!");
            Ket="LULUS";
        }else {
            System.out.println(" Anda Belum Lulus!!! -_-");
            Ket="Belum LULUS";
        }
    } 
    
    void keterangan(){
		
		
        System.out.println(" Nama             : "+nama);
        System.out.println(" NIM              : "+nim);
        System.out.println(" Nilai UTS        : "+nilai_uts);
        System.out.println(" Nilai Tugas      : "+nilai_tugas);
        System.out.println(" Nilai UAS        : "+nilai_uas);
        System.out.println(" Nilai Akhir      : "+TotalNilai);
        System.out.println(" Status Kelulusan : "+Ket);
    }
}