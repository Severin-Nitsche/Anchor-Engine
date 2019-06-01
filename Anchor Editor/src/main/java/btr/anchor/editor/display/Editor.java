package btr.anchor.editor.display;

import btr.anchor.engine.AnchorEngine;
import btr.anchor.engine.util.debug.DebugHelper;
import btr.anchor.engine.util.enums.TargetSystem;
import btr.anchor.engine.util.enums.ReleaseState;
import btr.anchor.engine.util.math.Dimension;
import btr.anchor.psl.awt.PSLAwt;

import javax.swing.*;

public class Editor {

    public AnchorEngine engine;

    PSLAwt layer;

    JFrame frame;
    JPanel panel;

    public void init() {
        engine = new AnchorEngine(TargetSystem.PC, "BTR App", 0.01, ReleaseState.ALPHA, new Dimension(5000, 5000));
        if (engine.pidl instanceof PSLAwt) {
            layer = (PSLAwt) engine.pidl;
        }
        frame = layer.frame;
        panel = layer.panel;
        layer.setCurrentImage(DebugHelper.genearateRandomImage(500, 500));
    }

}