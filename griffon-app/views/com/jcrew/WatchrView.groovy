package com.jcrew

import griffon.core.artifact.GriffonView
import griffon.metadata.ArtifactProviderFor
import javax.swing.SwingConstants

@ArtifactProviderFor(GriffonView)
class WatchrView {
    FactoryBuilderSupport builder
    WatchrModel model

    void initUI() {
        builder.with {
            application(size: [320, 160], id: 'mainWindow',
                title: application.configuration['application.title'],
                iconImage:   imageIcon('/griffon-icon-48x48.png').image,
                iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                             imageIcon('/griffon-icon-32x32.png').image,
                             imageIcon('/griffon-icon-16x16.png').image]) {
                gridLayout(rows: 2, cols: 1)
                label(id: 'clickLabel', text: bind { model.clickCount },
                     horizontalAlignment: SwingConstants.CENTER)
                label(id: 'nameLabel', text: bind { model.sshUserName },
                     horizontalAlignment: SwingConstants.RIGHT)
                button(id: 'clickButton', clickAction)
            }
        }
    }
}