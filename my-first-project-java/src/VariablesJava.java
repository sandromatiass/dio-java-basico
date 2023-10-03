public class VariablesJava {
 public static void main (String [] args){
	System.out.print("Hello world!");
	String primeiroNome = "Sandro";
	String segundoNome = "Matias";
	
	String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
	
	System.out.println(nomeCompleto);
	}

 public static String nomeCompleto (String primeiroNome, String segundoNome) {
	
    return " Resultado concatenação " + primeiroNome.concat(" ").concat(segundoNome);
	
    }
}