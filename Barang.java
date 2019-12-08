public class Barang{
//Prototype Barang
	String Nama;
	int Kode;
	int Harga;
	int total;
	int jumlah;

	void KodeBarang(){ //method Kode Barang
		if (Kode ==101){
			Nama ="Buku";
			Harga=5000;
		}else if (Kode == 501){
			Nama = "Pensil";
			Harga =2500;
		}else if (Kode == 401){
			Nama = "Pulpen";
			Harga = 4000;
		}else {
			System.out.println("Kode yang anda masukan tidak terdaftar!!!");
		}
	}

	public Integer Total(){	//method Hitung Total
		total= (Harga*jumlah);
		return total;
	}
	public void bonus(){ // Method Bonus
		if (total>= 200000){
			System.out.println("Anda mendapatkan Google bag Special Edition!!");
		}
	}

	public void record(){ //Method cetak data pembelian
	System.out.println("=========================");
	System.out.println("Kode Barang  : "+Kode);
	System.out.println("Nama Barang  : "+Nama);
	System.out.println("Harga Barang : "+Harga);
	System.out.println("");
	System.out.println("Qty   : "+jumlah);
	System.out.println("Total : "+total);
	}
}