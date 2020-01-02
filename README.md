FontIcon [![Release](https://jitpack.io/v/adrianromero/fonticon.svg)](https://jitpack.io/#adrianromero/fonticon)
========

FontIcon is a JavaFX library to use Font Icons.

This library includes the most popular icon fonts to be used easily in JavaFX projects. It also includes utilities to colorize, style and animate the icons with a minimal effort. See the examples to start using the icons.

Examples
========

```java
IconBuilder.create(IconFontGlyph.FA_SOLID_BOOK, 48.0).styleClass("icon-size").build()
IconBuilder.create(IconFontGlyph.FA_SOLID_BRAIN, 52.0).color(Color.LIGHTGRAY).shine(Color.YELLOW).build()
IconBuilder.create(IconFontGlyph.FA_REGULAR_IMAGE, 52.0).apply(new LightOn(Color.AQUA)).build()
IconBuilder.create(IconFontGlyph.FA_REGULAR_LEMON, 52.0).apply(new LightOff()).build()
IconBuilder.create(IconFontGlyph.FA_BRANDS_CREATIVE_COMMONS, 52.0).color(Color.RED).apply(new ShadowHigh(Color.BLUE)).build()
IconBuilder.create(IconFontGlyph.WI_THERMOMETER, 52.0).apply(new ShadowHole(Color.AZURE)).build()
```

Screenshots
===========

![Demo examples](https://raw.github.com/adrianromero/fonticon/master/screenshot-demo.png)

Demo examples

Install
=======

To install the library add:

   ```gradle
   repositories {
       jcenter()
       maven { url "https://jitpack.io" }
   }
   dependencies {
       compile 'com.github.adrianromero:fonticon:2.0.200'
   }
   ```

Acknowledgments
===============

Font Awesome 5.12.0 by @davegandy
https://github.com/FortAwesome/Font-Awesome
(Icons: CC BY 4.0, Fonts: SIL OFL 1.1, Code: MIT License)

Weather Icons 2.0.10 by Erik Flowers
https://erikflowers.github.io/weather-icons
(Fonts: SIL OFL 1.1, Code: MIT License, Documentation: CC BY 3.0)

License
=======

Font Icon is licensed under the Apache License, Version 2.0, January 2004.
