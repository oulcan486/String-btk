
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj="         Merhaba Oğulcan Nasılsın.";
		
		System.out.println("Metin uzunluğu: "+mesaj.length());
		
		System.out.println("10. Eleman: "+mesaj.charAt(10));
		System.out.println(mesaj.concat("Umarım iyi bir gün geçirirsin"));
		
		System.out.println(mesaj.startsWith("Mer"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler=new char[10];
		mesaj.getChars(0, 7, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("-------------------------------------");
		
		String newMessage=mesaj.replace(" ","-");
		System.out.println(newMessage);
		
		System.out.println(mesaj.substring(0, 7));
		
		for (String kelime :mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		
		System.out.println(mesaj.substring(0,1).toUpperCase()+mesaj.substring(1));
		
		
		System.out.println(mesaj);
		System.out.println(mesaj.trim());

	}

}
