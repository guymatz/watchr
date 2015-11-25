package com.jcrew

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonController)
class WatchrController {
    WatchrModel model

    void click() {
        model.clickCount++
    }
}