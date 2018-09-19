import java.io.*;
import java.text.*;
import java.util.*;

public class Polifase{
	public static void main(String[] args) {
		int m;
		System.out.print("m = ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		ArrayList<Integer> NumTxt = new ArrayList<Integer>();
		ArrayList<String> StrTxt = new ArrayList<String>();
		String direccion = "/Users/samuelarturogarridosanchez/Desktop/doc.txt";
		List<String> StrTxt1;
		List<String> StrTxt2;
		for(int i = 0;i<StrTxt.size();i++){
		}
	}
}
/*Si usamos sólo FileInputStream, FileOuputStream, 
FileReader o FileWriter, cada vez que hagamos 
una lectura o escritura, 
se hará fisicamente en el disco duro. Si escribimos 
o leemos pocos 
caracteres cada vez, el proceso se hace costoso y
lento, con muchos accesos a disco duro.
Los BufferedReader, BufferedInputStream, 
BufferedWriter y 
BufferedOutputStream añaden un buffer intermedio. 
Cuando leamos o 
escribamos, esta clase controlará los accesos
 a disco.*/