package com.jcrew

import griffon.core.artifact.GriffonModel
import griffon.transform.Observable
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonModel)
class WatchrModel {
    @Observable int clickCount = 0
    @Observable String sshUserName = ''

    def WatchrModel() {
    	this.sshUserName = 'JC\\c9gmatz'
    }
}