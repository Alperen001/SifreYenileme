import java.util.Scanner;

public class sifreyenileme {

	public static void main(String[] args) {
		String userName, password = null, pick, tekrarDene;
		int secim;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kullan�c� Ad�n� Giriniz: ");
		userName = inp.nextLine();
		System.out.println("�ifreniz: ");
		password = inp.nextLine();
		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giri� Yapt�n�z!");

		} else {
			System.out.println("Bilgileriniz Yanl��t�r\n�ifreyi yenilemek istiyor musunuz");

		}
		pick = inp.nextLine();
		if (pick.equals("Yes")) {
			System.out.println("L�tfen Yeni �ifre Giriniz");
			password = inp.nextLine();
			System.out.println("�ifreyi Tekrar Girin");
			password = inp.nextLine();
			if (password.equals("3131")) {
				System.out.println("Yeni �ifreniz Eskisiyle Ayn� Olamaz !\n Tekrar Giriniz !");

			} else {
				System.out.println("�ifre Ba�ar�yla De�i�tirildi !");
			}
		}
		tekrarDene = inp.nextLine();
		if (tekrarDene.equals("OK")) {
			System.out.println("Farkl� bir �ifre girmeyi unutmay�n�z ! \n �ifreyi tekrar giriniz !");
			password = inp.nextLine();
			if (password.equals("3131")) {
				System.out.println("Hesab�n�z Ask�ya Al�nd� !");
			} else {
				System.out.println("�ifre Ba�ar�yla De�i�tirildi .");
			}

		}

	}

}
