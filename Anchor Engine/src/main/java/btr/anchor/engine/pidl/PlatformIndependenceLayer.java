package btr.anchor.engine.pidl;

import btr.anchor.bridge.output.IAudioOut;
import btr.anchor.bridge.output.IDisplayOut;
import btr.anchor.bridge.output.IDisplaySettingsOut;
import btr.anchor.bridge.output.IFileOut;
import btr.anchor.engine.display.image.DisplayImage;

public abstract class PlatformIndependenceLayer {

    public IDisplayOut displayOut;
    public IAudioOut audioOut;
    public IFileOut fileOut;
    public IDisplaySettingsOut displaySettingsOut;

    protected DisplayImage currentImage;

    public abstract void repaint();

    public abstract void init();

    public void setCurrentImage(DisplayImage image) {
        this.currentImage = image;

    }

}