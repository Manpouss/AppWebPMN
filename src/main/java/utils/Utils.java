package utils;

public class Utils {
	public boolean check_saisie(String type, String saisie) {
	      String pattern = "";
	      if(type.equals("mdp")) {
	    	  pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,8}";
	      }
	      if(type.equals("nom")|| type.equals("fname")|| type.equals("livre_genre")) {
	    	  pattern = "#(\\s|^)([a-z0-9-_]+)#i";
	      }
	      /*if(type.equals("com_titre") || type.equals("livre_titre") || type.equals("nom_edit")) {
	    	  pattern = "^([a-zA-Z'àâéèêôùûçÀÂÉÈÔÙÛÇ[:blank:]- \s 0-9]{1,75})$";
	      }
	      if(type.equals("com_msg")) {
	    	  pattern = "^([a-zA-Z'àâéèêôùûçÀÂÉÈÔÙÛÇ[:blank:]- \s \n 0-9 ,?;.:/!%* ]{1,500})$";
	      }
	      if(type.equals("resume") || type.equals("bio")) {
	    	  pattern = "^([a-zA-Z'àâéèêôùûçÀÂÉÈÔÙÛÇ[:blank:]- \s 0-9 ,?;.:/!%* ]{1,750})$";
	      }
	      if(type.equals("login")) {
	    	  pattern = "^^([a-zA-Z'àâéèêôùûçÀÂÉÈÔÙÛÇ[:blank:]- 0-9 @#$%^&+=]{3,75})$$";
	      }
	      if(type.equals("mail")) {
	    	  pattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	      }
	      if(type.equals("ville") || type.equals("type_rem") || type.equals("marque")|| type.equals("pays")) {
	    	  pattern = "^[a-zA-Z][a-zàâéèêôùûçÀÂÉÈÔÙÛÇ][a-zàâéèêôùûçÀÂÉÈÔÙÛÇ\\- \\']*{2,100}$";
	      }
	      if(type.equals("civilite")) {
	    	  pattern = "(\\bhomme\\b)|(\\bfemme\\b)";
	      }
	      if(type.equals("num_tome")||type.equals("nb_tome")) {
	    	  pattern = "\\d{1,11}";
	      }
	      if(type.equals("num_licence")) {
	    	  pattern = "\\d{8}";
	      }
	      if(type.equals("immatriculation")) {
	    	  pattern = "^[A-Z]{2}[-][0-9]{3}[-][A-Z]{2}$";
	      }
	      if(type.equals("immatriculationl")) {
	    	  pattern = "^[a-zA-Z]{2}$";
	      }
	      if(type.equals("immatriculationc")) {
	    	  pattern = "^[0-9]{3}$";
	      }
	      if(type.equals("ean")) {
	    	  pattern = "(978|)[0-9]{10}";
	      }
	      if(type.equals("qte")) {
	    	  pattern = "\\d{1,5}";
	      }
	      if(type.equals("pourcent")||type.equals("cout")) {
	    	  pattern = "(?:\\d+(?:\\.\\d*)?|\\.\\d+)";
	      }
	      if(type.equals("note")) {
	    	  pattern = "(\\b1\\b)|(\\b2\\b)|(\\b3\\b)|(\\b4\\b)|(\\b5\\b)";
	      }*/
	      return saisie.matches(pattern);
	}
}
