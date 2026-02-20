package com.regexpatterns;

public class RegexPatterns {
	public static void main(String[] args) {
		
		// Fundamentals questions 
		
		String Q1 = "[0-9]{1,}"; 
		String Q2 = "[a-zA-Z]{1,}";
		String Q3 = "[a-z]{1,}";
		String Q4 = "^TN-"; // ^TN-.*
		String Q5 = "2026$"; // *.2026$
		String Q6 = "(\\d){6}";
		String Q7 = "(0-9){10}"; //^\\d{10}$
		String Q8 = "(\\d){1,}";
		String Q9 = ".*[A-Z].*";
		String Q10 = "^[a-zA-Z0-9]+$";
		
		
		// Structured Validations
		
		String Q11 = "[0-9]{6}";
		String Q12 = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]| 1[0-2])-\\d{4}";//31-12-2000
		String Q13 = "^([01[0-9]|2[0-3]]):[0-5][0-9]$";
		String Q14 = "";
		String Q15 = "^(?= .*[A-Z])(?=.*\\d).{8,}$";
		String Q16 = "^[A-Z].*\\d$";
		String Q17 = "^[A-Za-z]{5}$";
		String Q18 = "^\\w{5$}";
		String Q19 = "^(.*[A-Z]{3}).*(\\d){2}).[A-Z]{1}*"; //^[A-Z]{3}\\d{2}[A-Z]$
		String Q20 = "\"^[A-Z][A-Za-z0-9]*\\\\d$";

	}
}
