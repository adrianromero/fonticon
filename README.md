FontIcon [![Release](https://jitpack.io/v/adrianromero/fonticon.svg)](https://jitpack.io/#adrianromero/fonticon)
========

FontIcon is a JavaFX library to use Font Icons.

This library includes the most popular icon fonts to be used easily in JavaFX projects. It also includes utilities to colorize, style and animate the icons with a minimal effort. See the examples to start using the icons.

Examples
========

```java
IconBuilder.create(IonIcons.ION_LOADING_A, 48.0).iconTransition(new IconRotate()).build();
IconBuilder.create(FontAwesome.FA_ANDROID, 48.0).classes("fi-iconred", "fi-plain").build();
IconBuilder.create(FontAwesome.FA_BANK, 48.0).classes("fi-shadow", "fi-iconmediumblue").build();
IconBuilder.create(FontAwesome.FA_APPLE, 48.0).classes("fi-iconwhite", "fi-shadow").build();
IconBuilder.create(FontAwesome.FA_BELL, 48.0).classes("fi-iconwhite", "fi-plain", "fi-dropshadow").build();
IconBuilder.create(FontAwesome.FA_FILTER, 48.0).classes("fi-icongreen", "fi-shadow").build();
IconBuilder.create(FontAwesome.FA_BOMB, 48.0).classes("fi-iconred", "fi-shadow").build();
IconBuilder.create(IonIcons.ION_ALERT, 48.0).classes("fi-iconblue", "fi-shadow").build();
IconBuilder.create(OpenIconic.ACCOUNT_LOGIN, 48.0).classes("fi-iconyellow", "fi-shadow").build();
IconBuilder.create(Octicons.OCTICON_ALERT, 48.0).classes("fi-iconcyan", "fi-shadow").build();
IconBuilder.create(WeatherIcons.WI_CLOUDY, 48.0).classes("fi-iconwhite", "fi-shadow").build();
new StackPane(
        IconBuilder.create(FontAwesome.FA_SQUARE, 48.0).classes("fi-icondarkblue", "fi-stack-base").build(),
        IconBuilder.create(FontAwesome.FA_REFRESH, 32.0).classes("fi-iconwhite", "fi-plain").build());
new StackPane(
        IconBuilder.create(FontAwesome.FA_CIRCLE_THIN, 48.0).classes("fi-iconblack", "fi-plain").build(),
        new Label("31"));
```

Screenshots
===========

![Demo examples](https://raw.github.com/adrianromero/fonticon/master/screenshot-demo.png)

Demo examples

Acknowledgments
===============

* Font Awesome 4.4.0 by @davegandy - http://fontawesome.io - @fontawesome
License - http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
* Android Action Bar Icon Pack that is provided as part of Android Design Guidelines.
http://wireframesketcher.com/mockups/android-action-bar-icons.htm
Font and icon names based on Evgeny Shishkin Android Icon Fonts
https://github.com/johnkil/Android-Icon-Fonts
Copyright 2014 Evgeny Shishkin
Licensed under the Apache License, Version 2.0 (the "License");
* Material Design icons from Google's Project Polymer website by Shreyas Achar.
http://shreyasachar.github.io/Android-Resources/
Font and icon names based on Evgeny Shishkin Android Icon Fonts
https://github.com/johnkil/Android-Icon-Fonts
Copyright 2014 Evgeny Shishkin
Licensed under the Apache License, Version 2.0 (the "License");
* Ionicons, v1.5.2
Created by Ben Sperry for the Ionic Framework, http://ionicons.com/
https://twitter.com/benjsperry  https://twitter.com/ionicframework
MIT License: https://github.com/driftyco/ionicons
* Octicons
(c) 2012-2014 GitHub
When using the GitHub logos, be sure to follow the GitHub logo guidelines (https://github.com/logos)
Font License: SIL OFL 1.1 (http://scripts.sil.org/OFL)
Applies to all font files
Code License: MIT (http://choosealicense.com/licenses/mit/)
* [Open Iconic v1.1.1](http://useiconic.com/open)
All code (including SVG markup) is under the [MIT License](http://opensource.org/licenses/MIT).
All fonts are under the [SIL Licensed](http://scripts.sil.org/cms/scripts/page.php?item_id=OFL_web).
*  Weather Icons 2.0.8
Updated September 19, 2015
Weather themed icons for Bootstrap
Author - Erik Flowers - erik@helloerik.com
Email: erik@helloerik.com
Twitter: http://twitter.com/Erik_UX
Maintained at http://erikflowers.github.io/weather-icons
License
Font licensed under SIL OFL 1.1 -
http://scripts.sil.org/OFL
CSS, SCSS and LESS are licensed under MIT License -
http://opensource.org/licenses/mit-license.html
Documentation licensed under CC BY 3.0 -
http://creativecommons.org/licenses/by/3.0/
Inspired by and works great as a companion with Font Awesome
"Font Awesome by Dave Gandy - http://fontawesome.io"

License
=======

Font Icon is licensed under the Apache License, Version 2.0, January 2004.
