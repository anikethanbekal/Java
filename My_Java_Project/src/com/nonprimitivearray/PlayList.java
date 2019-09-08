package com.nonprimitivearray;

public class PlayList{
	static void listening(Songs[] song) {
		for (int i = 0; i < song.length; i++) {
			System.out.println(song[i].title);
			System.out.println(song[i].duration);
			System.out.println(song[i].singer);
		}
	}

	public static void main(String[] args) {
		Songs [] song =new Songs[1];
		song[0]=new Songs("MM",4.0,"sonu");
		listening(song);
	}
}
