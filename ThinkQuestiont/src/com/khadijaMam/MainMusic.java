package com.khadijaMam;

public class MainMusic {
    public static void main(String[] args) {
        PercussionInstrument tabla = new PercussionInstrument();
        tabla.play(); 
      
        tabla.listenSound(); 

        StringedInstrument violin = new StringedInstrument();
        violin.play(); 
        violin.listenSound(); 
    }
}