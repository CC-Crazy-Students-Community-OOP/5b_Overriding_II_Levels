package com.cc.java;
public class App {
    public static void main( String[] args ) {
        Player player = new Player();

        // Beispiel 1 mit for Schleife
            for ( int i = 0; i < 12; i++ ) {
                ausgabe( player.play() );  
            }
        // Beispiel 2 mit while Schleife
            while ( player.points <= 13 ) {
                ausgabe( player.play() );  
            }
    }

    private static void ausgabe( String outStr ) {
        System.out.println( outStr );
    }
}
