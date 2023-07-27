package InterviewQuestions;

public class Q61_PasswordValidation {
	/*
	 * 1. Password MUST be at least have 6 characters and should not contain space 
	 * 2. PassWord should at least contain one upper case letter 
	 * 3. PassWord should at least contain one lower case letter	  
	 * 4. Password should at least contain one special characters 
	 * 5. Password should at least contain a digit
	 *
	 * 1. Şifre en az 6 karakter olmalı ve boşluk içermemelidir
	 *  2. Şifre en az bir büyük harf içermelidir
	 * 3. Şifre en az bir küçük harf içermelidir
	 * 4. Şifre en az bir özel karakter içermelidir
	 * 5. Şifre en az bir rakam içermelidir
	 */
	public static void main(String[] args) {

		String password= "Abc@123";
		System.out.println("passwordValidation(password) = " + passwordValidation(password));
	}
	public static boolean passwordValidation(String password){


		boolean buyukVarmi = password.matches("(.*[A-Z].*)"),
				kucukVarmi = password.matches("(.*[a-z].*)"),
				rkmVarmi = password.matches("(.*[0-9].*)"),
				ozelVarmi = password.matches("(.*[-/, :-@].*)"),
				valid = false;

		if (password.length() >=6 && !password.contains(" ")) {
			if (buyukVarmi&&kucukVarmi&&rkmVarmi&&ozelVarmi){
				valid=true;
			}
		}

		return valid;
	}

}
