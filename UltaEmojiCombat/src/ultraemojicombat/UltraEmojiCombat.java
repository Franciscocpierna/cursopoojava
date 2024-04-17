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
        l[2]= new Lutador("Snap","Eua", 35, 12,  2, 1,  1.65f, 80.9f);
        l[2].status();
        l[3]= new Lutador("Dead Codel","Australia", 37, 13,  0, 2,  1.93f, 81.6f);
        l[4]= new Lutador("Ufo Cobol","Brasil", 37, 5,  4, 3,  1.70f, 119.3f);
        l[5]= new Lutador("Nedaar","Eua", 30, 12,  2, 4,  1.81f, 105.7f);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLutar(l[4], l[5]);
        UEC01.Lutar();
        //l[0].status();
        //l[1].status();
        
        
	}

}
