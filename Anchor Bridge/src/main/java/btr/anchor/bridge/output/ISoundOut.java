package btr.anchor.bridge.output;

import btr.anchor.bridge.output.IOut;

public interface ISoundOut extends IOut {

    void playSound(Object sound);

    void stopSound();


}