package com.constructors.initializers.practicals6;

public class TestSong {

	public static void main(String[] args)
	{
		Song s = new Song("somu","1 2 3 vishnuvardhana , karunada king nanena???");
		/*s.setName("somu");
		s.setLyrics("1 2 3 vishnuvardhana , karunada king nanena???");*/
		s.play();
		Song s2 = new Song("gomu","hello hello hello ...");
		/*s2.setName("gomu");
		s2.setLyrics("hello hello hello ...");*/
		s2.play();
		//s2.setLyrics("my name is raj raj... what is name plz plz plz");
		//s2.play();
		Song s3 = new Song("ramu");
		s3.play();
		s3.setLyrics("hello hello hello ...");
		s3.play();
	}
}
