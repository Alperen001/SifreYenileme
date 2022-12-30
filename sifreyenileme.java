import java.util.Scanner;

public class sifreyenileme {

	public static void main(String[] args) {
		String userName, password = null, pick, tekrarDene;
		int secim;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kullanýcý Adýný Giriniz: ");
		userName = inp.nextLine();
		System.out.println("Þifreniz: ");
		password = inp.nextLine();
		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriþ Yaptýnýz!");

		} else {
			System.out.println("Bilgileriniz Yanlýþtýr\nÞifreyi yenilemek istiyor musunuz");

		}
		pick = inp.nextLine();
		if (pick.equals("Yes")) {
			System.out.println("Lütfen Yeni Þifre Giriniz");
			password = inp.nextLine();
			System.out.println("Þifreyi Tekrar Girin");
			password = inp.nextLine();
			if (password.equals("3131")) {
				System.out.println("Yeni Þifreniz Eskisiyle Ayný Olamaz !\n Tekrar Giriniz !");

			} else {
				System.out.println("Þifre Baþarýyla Deðiþtirildi !");
			}
		}
		tekrarDene = inp.nextLine();
		if (tekrarDene.equals("OK")) {
			System.out.println("Farklý bir þifre girmeyi unutmayýnýz ! \n Þifreyi tekrar giriniz !");
			password = inp.nextLine();
			if (password.equals("3131")) {
				System.out.println("Hesabýnýz Askýya Alýndý !");
			} else {
				System.out.println("Þifre Baþarýyla Deðiþtirildi .");
			}

		}

	}

}
