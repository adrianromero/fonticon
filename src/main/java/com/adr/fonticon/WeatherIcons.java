//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014 Adrián Romero Corchado.
//
//    This file is part of FontIcon
//
//     Licensed under the Apache License, Version 2.0 (the "License");
//     you may not use this file except in compliance with the License.
//     You may obtain a copy of the License at
//     
//         http://www.apache.org/licenses/LICENSE-2.0
//     
//     Unless required by applicable law or agreed to in writing, software
//     distributed under the License is distributed on an "AS IS" BASIS,
//     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//     See the License for the specific language governing permissions and
//     limitations under the License.

package com.adr.fonticon;

import javafx.scene.text.Font;

/**
 * Icon Enum based on
 *  Weather Icons 1.2
 *  Weather themed icons for Bootstrap
 *  ------------------------------------------------------------------------------
 *  Maintained at http://erikflowers.github.io/weather-icons
 *  http://twitter.com/Erik_UX
 *
 *  License
 *  ------------------------------------------------------------------------------
 *  - Fpmt licensed under SIL OFL 1.1 -
 *    http://scripts.sil.org/OFL
 *  - CSS and LESS are licensed under MIT License -
 *    http://opensource.org/licenses/mit-license.html
 *  - Documentation licensed under CC BY 3.0 -
 *    http://creativecommons.org/licenses/by/3.0/
 *  - Inspired by and works great as a companion with Font Awesome
 *    "Font Awesome by Dave Gandy - http://fontawesome.io"
 *
 *  Weather Icons Bootstrap Package Author - Erik Flowers - erik@helloerik.com
 *  ------------------------------------------------------------------------------
 *  Email: erik@helloerik.com
 *  Twitter: http://twitter.com/Erik_UX
 * 
 * @author adrian
 */
public enum WeatherIcons implements IconFont {

    WI_DAY_CLOUDY_GUSTS('\uF000'),
    WI_DAY_CLOUDY_WINDY('\uF001'),
    WI_DAY_CLOUDY('\uF002'),
    WI_DAY_FOG('\uF003'),
    WI_DAY_HAIL('\uF004'),
    WI_DAY_LIGHTNING('\uF005'),
    WI_DAY_RAIN_MIX('\uF006'),
    WI_DAY_RAIN_WIND('\uF007'),
    WI_DAY_RAIN('\uF008'),
    WI_DAY_SHOWERS('\uF009'),
    WI_DAY_SNOW('\uF00A'),
    WI_DAY_SPRINKLE('\uF00B'),
    WI_DAY_SUNNY_OVERCAST('\uF00C'),
    WI_DAY_SUNNY('\uF00D'),
    WI_DAY_STORM_SHOWERS('\uF00E'),
    WI_DAY_THUNDERSTORM('\uF010'),
    WI_CLOUDY_GUSTS('\uF011'),
    WI_CLOUDY_WINDY('\uF012'),
    WI_CLOUDY('\uF013'),
    WI_FOG('\uF014'),
    WI_HAIL('\uF015'),
    WI_LIGHTNING('\uF016'),
    WI_RAIN_MIX('\uF017'),
    WI_RAIN_WIND('\uF018'),
    WI_RAIN('\uF019'),
    WI_SHOWERS('\uF01A'),
    WI_SNOW('\uF01B'),
    WI_SPRINKLE('\uF01C'),
    WI_STORM_SHOWERS('\uF01D'),
    WI_THUNDERSTORM('\uF01E'),
    WI_WINDY('\uF021'),
    WI_NIGHT_ALT_CLOUDY_GUSTS('\uF022'),
    WI_NIGHT_ALT_CLOUDY_WINDY('\uF023'),
    WI_NIGHT_ALT_HAIL('\uF024'),
    WI_NIGHT_ALT_LIGHTNING('\uF025'),
    WI_NIGHT_ALT_RAIN_MIX('\uF026'),
    WI_NIGHT_ALT_RAIN_WIND('\uF027'),
    WI_NIGHT_ALT_RAIN('\uF028'),
    WI_NIGHT_ALT_SHOWERS('\uF029'),
    WI_NIGHT_ALT_SNOW('\uF02A'),
    WI_NIGHT_ALT_SPRINKLE('\uF02B'),
    WI_NIGHT_ALT_STORM_SHOWERS('\uF02C'),
    WI_NIGHT_ALT_THUNDERSTORM('\uF02D'),
    WI_NIGHT_CLEAR('\uF02E'),
    WI_NIGHT_CLOUDY_GUSTS('\uF02F'),
    WI_NIGHT_CLOUDY_WINDY('\uF030'),
    WI_NIGHT_CLOUDY('\uF031'),
    WI_NIGHT_HAIL('\uF032'),
    WI_NIGHT_LIGHTNING('\uF033'),
    WI_NIGHT_RAIN_MIX('\uF034'),
    WI_NIGHT_RAIN_WIND('\uF035'),
    WI_NIGHT_RAIN('\uF036'),
    WI_NIGHT_SHOWERS('\uF037'),
    WI_NIGHT_SNOW('\uF038'),
    WI_NIGHT_SPRINKLE('\uF039'),
    WI_NIGHT_STORM_SHOWERS('\uF03A'),
    WI_NIGHT_THUNDERSTORM('\uF03B'),
    WI_CELSIUS('\uF03C'),
    WI_CLOUD_DOWN('\uF03D'),
    WI_CLOUD_REFRESH('\uF03E'),
    WI_CLOUD_UP('\uF040'),
    WI_CLOUD('\uF041'),
    WI_DEGREES('\uF042'),
    WI_DOWN_LEFT('\uF043'),
    WI_DOWN('\uF044'),
    WI_FAHRENHEIT('\uF045'),
    WI_HORIZON_ALT('\uF046'),
    WI_HORIZON('\uF047'),
    WI_LEFT('\uF048'),
    WI_NIGHT_FOG('\uF04A'),
    WI_REFRESH_ALT('\uF04B'),
    WI_REFRESH('\uF04C'),
    WI_RIGHT('\uF04D'),
    WI_SPRINKLES('\uF04E'),
    WI_STRONG_WIND('\uF050'),
    WI_SUNRISE('\uF051'),
    WI_SUNSET('\uF052'),
    WI_THERMOMETER_EXTERIOR('\uF053'),
    WI_THERMOMETER_INTERNAL('\uF054'),
    WI_THERMOMETER('\uF055'),
    WI_TORNADO('\uF056'),
    WI_UP_RIGHT('\uF057'),
    WI_UP('\uF058'),
    WI_WIND_WEST('\uF059'),
    WI_WIND_SOUTH_WEST('\uF05A'),
    WI_WIND_SOUTH_EAST('\uF05B'),
    WI_WIND_SOUTH('\uF05C'),
    WI_WIND_NORTH_WEST('\uF05D'),
    WI_WIND_NORTH_EAST('\uF05E'),
    WI_WIND_NORTH('\uF060'),
    WI_WIND_EAST('\uF061'),
    WI_SMOKE('\uF062'),
    WI_DUST('\uF063'),
    WI_SNOW_WIND('\uF064'),
    WI_DAY_SNOW_WIND('\uF065'),
    WI_NIGHT_SNOW_WIND('\uF066'),
    WI_NIGHT_ALT_SNOW_WIND('\uF067'),
    WI_DAY_SLEET_STORM('\uF068'),
    WI_NIGHT_SLEET_STORM('\uF069'),
    WI_NIGHT_ALT_SLEET_STORM('\uF06A'),
    WI_DAY_SNOW_THUNDERSTORM('\uF06B'),
    WI_NIGHT_SNOW_THUNDERSTORM('\uF06C'),
    WI_NIGHT_ALT_SNOW_THUNDERSTORM('\uF06D'),
    WI_SOLAR_ECLIPSE('\uF06E'),
    WI_LUNAR_ECLIPSE('\uF070'),
    WI_METEOR('\uF071'),
    WI_HOT('\uF072'),
    WI_HURRICANE('\uF073'),
    WI_SMOG('\uF074'),
    WI_ALIEN('\uF075'),
    WI_SNOWFLAKE_COLD('\uF076'),
    WI_STARS('\uF077'),
    WI_MOON_FULL('\uF078'),
    WI_MOON_WAXING_GIBBOUS('\uF079'),
    WI_MOON_WAXING_QUARTER('\uF07A'),
    WI_MOON_WAXING_CRESCENT('\uF07B'),
    WI_MOON_YOUNG('\uF07C'),
    WI_MOON_NEW('\uF07D'),
    WI_MOON_OLD('\uF07E'),
    WI_MOON_WANING_CRESCENT('\uF080'),
    WI_MOON_WANING_QUARTER('\uF081'),
    WI_MOON_WANING_GIBBOUS('\uF082'),
    WI_NIGHT_PARTLY_CLOUDY('\uF083');

    private static String WEATHERICONS = null;
    
    static {
        try {
            WEATHERICONS = Font.loadFont(WeatherIcons.class.getResourceAsStream("fonts/weathericons-regular-webfont.ttf"), 10.0).getName();    
        } catch (Exception e) {
        }
    } 
    
    private final char character;

    private WeatherIcons(char character) {
        this.character = character;
    }

    @Override
    public char getChar() {
        return character;
    }

    @Override
    public String getFontName() {
        return WEATHERICONS;
    }        
}
