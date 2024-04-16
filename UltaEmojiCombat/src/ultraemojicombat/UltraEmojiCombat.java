package ultraemojicombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] = new Lutador[6];
		l[0]= new Lutador("Pretty Boy","França", 32, 11,  2, 1,  1.75f, 68.9f);
		l[0].apresentar();
		l[0].ganharLuta();
		l[0].perderLuta();
		l[0].status();
		l[1]=new Lutador("Putscript","Brasil", 29, 14,  2, 3,  1.68f, 57.9f);
        l[1].status();
        l[2]= new Lutador("Manoel","Brasil", 30, 12,  1, 1,  1.98f, 100.9f);
        l[2].status();
        
	}

}
