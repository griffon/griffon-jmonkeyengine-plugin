griffon.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
        mavenRepo 'http://nifty-gui.sourceforge.net/nifty-maven-repo'
        String basePath = pluginDirPath ? "${pluginDirPath}/" : ''
        flatDir name: "jmonkeyenginePluginLib", dirs: ["${basePath}lib"]
    }
    dependencies {
        runtime('lessvoid:nifty:1.3.1') { exclude 'xpp3' }
        runtime 'xpp3:xpp3_min:1.1.4c',
                'de.jarnbjo:j-ogg-all:1.0',
                'com.bulletphysics:jbullet:20110211',
                'cz.advel:stack-alloc:20101010',
                'javax.vecmath:vecmath:1.4.0',
                'lessvoid:nifty-default-controls:1.3.1',
                'lessvoid:nifty-style-black:1.3.1'
        compile 'com.jme3:jME3-blender:3.0-BETA',
                'com.jme3:jME3-core:3.0-BETA',
                'com.jme3:jME3-desktop:3.0-BETA',
                'com.jme3:jME3-effects:3.0-BETA',
                'com.jme3:jME3-jbullet:3.0-BETA',
                'com.jme3:jME3-jogg:3.0-BETA',
                'com.jme3:jME3-lwjgl:3.0-BETA',
                'com.jme3:jME3-lwjgl-natives:3.0-BETA',
                'com.jme3:jME3-networking-3.0:BETA',
                'com.jme3:jME3-niftygui-3.0:BETA',
                'com.jme3:jME3-plugins-3.0:BETA',
                'com.jme3:jME3-terrain-3.0:BETA',
                'com.jme3:jME3-testdata-3.0:BETA'
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
            'org.springframework',
            'org.apache.karaf',
            'groovyx.net'
    warn 'griffon'
}
