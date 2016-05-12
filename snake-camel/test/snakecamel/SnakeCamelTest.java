package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseでキャメルケースが取得できる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhiJkl";
		String actual = scu.snakeToCamelcase("abc_def_ghi_jkl");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでスネークケースが取得できる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeで初めの文字を大文字にできる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scu.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで初めの文字を小文字にできる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
}
