package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
			for (int i = 0; i < words.length ; i++) {
			sb.append(capitalize(words[i]));
			//System.out.println(words[i]);
			}
		//System.out.println(new String(sb));
		return new String(sb);
	}
	
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//もしcが大文字ならば
				sb.append(camelcase.substring(j,i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		//System.out.println(sb);
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s.length()==0){
			return "";
		}
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);//はじめの文字を大文字に
		String rest = s.substring(1);//2文字目から最後までを取り出す
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//はじめの文字を小文字に
		String rest = s.substring(1);//2文字目から最後までを取り出す
		return lowerFirst + rest;
	}
}
