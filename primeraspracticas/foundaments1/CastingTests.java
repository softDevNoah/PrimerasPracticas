package foundaments1;

public class CastingTests {

	public static void validCastExample() {
		
		char	c = '1'; //es 49 en ASCII, usando base decimal
		int		i;
		short	s;
		long	l;
		byte	b;
		
		System.out.println("Usando conversiones EXplícitas:");
		System.out.println("c = " + c);
		i = (int)c;
		System.out.println("i = " + i);
		s = (short)i;
		System.out.println("s = " + s);
		l = (long)s;
		System.out.println("l = " + l);
		b = (byte)l;
		System.out.println("b = " + b);
		
		System.out.println("Y usando conversiones IMplícitas:");
		b = 1;
		System.out.println("b = " + b);
		s = b;
		System.out.println("s = " + s);
		i = s;
		System.out.println("i = " + i);
		l = i;
		System.out.println("l = " + l);	
		i = 49;
		
		System.out.println("Nuevo valor de i = " + i);
		c = (char)i;
		System.out.println("c = (char)i de forma EXplícita -> c = " + c + " (no aparece error como tal)\n");
	}
	public static void invalidCastExample() {
		int		i = 1;
//		char	c;
		boolean	bo = true;
		String	infoCast1,	infoCast2;
		
		System.out.println("Conversiones inválidas (para ver los errores, DESCOMENTAR el código):");
		System.out.println("(valor de i = " + i + ")");
	//	c = i;
		System.out.println("char c = i (aparece error si es char a int de forma IMplícita)");
	//	bo = i;
	//	bo = (boolean)i;
		System.out.println("\nUn tipo booleano no puede castearse con otro tipo ni implícita ni explícitamente.");
		infoCast1 = "Para que sea válido un casteo entre datos numéricos debe respetarse que el valor \"quepa\"";
		infoCast2 = " en el nuevo tipo, no se puede hacer por ejemplo byte = long; porque long es mas grande que byte.";
		if (bo)
			System.out.println("\n" + infoCast1 + infoCast2);
	}
	
	
	
}
