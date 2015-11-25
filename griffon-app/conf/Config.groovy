application {
    title = 'watchr'
    startupGroups = ['watchr']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "watchr"
    'watchr' {
        model      = 'com.jcrew.WatchrModel'
        view       = 'com.jcrew.WatchrView'
        controller = 'com.jcrew.WatchrController'
    }
}