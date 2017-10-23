import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter e or d: ");
		String oper = inp.next();
		System.out.print("Enter encryption Key: ");
		byte encr = inp.nextByte();
		System.out.print("Enter string: ");
		String str = inp.nextLine();
		inp.close();
		
	}
    public static String xor(String op, int key) {
        String name = "Joseph";
        byte e = 2;
        StringBuilder stre = new StringBuilder();
        for (int i =0;i<name.length();i++) {
        		stre.append((char)(name.charAt(i)^e)) ;
        		//System.out.println((char)(name.charAt(i)^'e'));
        }
        StringBuilder revert = new StringBuilder();
        for (int i =0;i<name.length();i++) {
    		revert.append((char)(stre.charAt(i)^e)) ;
    		//System.out.println((char)(name.charAt(i)^'e'));
    }
        System.out.println(stre);
        System.out.println(revert);
    return stre.toString();
    }
}
