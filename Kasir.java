import java.util.*;

public class Kasir{
	public static void main(String[] args){
		Barang buku = new Barang();
		buku.Kode = 101;
		buku.KodeBarang();
		Barang pensil= new Barang();
		pensil.Kode = 501;
		pensil.KodeBarang();
		Barang pulpen= new Barang();
		pulpen.Kode= 401;
		pulpen.KodeBarang();
		Barang Barang1= new Barang();
		Scanner A = new Scanner(System.in);
		System.out.println("Daftar Barang");
		System.out.println("=============================");
		System.out.println("Kode\t	Nama\t	Harga\n");
		System.out.println(+buku.Kode+"\t	"+buku.Nama+"\t	"+buku.Harga);
		System.out.println(+pensil.Kode+"\t	"+pensil.Nama+"\t	"+pensil.Harga);
		System.out.println(+pulpen.Kode+"\t	"+pulpen.Nama+"\t	"+pulpen.Harga);
		System.out.println("=============================");
		System.out.print("Masukkan kode barang : ");		
		Barang1.Kode=A.nextInt();
		System.out.print("Masukkan jumlah barang : ");
		Barang1.jumlah= A.nextInt();
		Barang1.KodeBarang();
		Barang1.Total();
		System.out.println("");
		System.out.println("Daftar Pembelian");
		Barang1.record();
		System.out.println("");
		Barang1.bonus();
	}
}