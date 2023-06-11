package com.khadijaMam;

class StringedInstrument extends Sound implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Playing the stringed instrument");
    }

    @Override
    void listenSound() {
        System.out.println("Listening to the sound of the stringed instrument");
    }
}