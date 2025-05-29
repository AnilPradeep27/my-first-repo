package test;

public class Test {
	public static void main(String[] args) {
		String newSecureToken = "c701d69d-0a57-4c00-8ae8-66339bd2e45a";
		String 	oldSecureToken = "c701d69d-0a57-4c00-8ae8-66339bd2e45a:FC:BZCA:immortalRomanceDesktop:122695407:EUR:en:BWINCOM:false:null";	
		TokenParams tokenParams	= new TokenParams("c701d69d-0a57-4c00-8ae8-66339bd2e45a", "BZCA", "FC", "MGS_ImmortalRomance", "122695407",
				"EUR", "en", "BWINCOM", false);
		
		System.out.println(tokenParams);

	}
	
	public static String getEncodedParamsforOfflineToken(String newSecureToken, String oldSecureToken) {	
		int firstColonIndex = oldSecureToken.indexOf(":");
		return oldSecureToken.substring(firstColonIndex + 1);	
		
	}
}
