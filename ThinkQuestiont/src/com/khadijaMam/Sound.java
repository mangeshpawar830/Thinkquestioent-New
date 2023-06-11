package com.khadijaMam;

abstract class Sound {
    abstract void listenSound();
}

class PercussionInstrument extends Sound implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Playing the percussion instrument");
    }

    @Override
    void listenSound() {
        System.out.println("Listening to the sound of the percussion instrument");
    }
}