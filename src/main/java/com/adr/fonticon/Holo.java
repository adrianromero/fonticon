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
 * Android Action Bar Icon Pack that is provided as part of Android Design Guidelines.
 * http://wireframesketcher.com/mockups/android-action-bar-icons.htm
 * Font and icon names based on Evgeny Shishkin Android Icon Fonts
 * https://github.com/johnkil/Android-Icon-Fonts
 * Copyright 2014 Evgeny Shishkin
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 
 * @author adrian
 */
public enum Holo implements IconFont {

    IC_ABOUT('\uE000'),
    IC_ACCEPT('\uE001'),
    IC_ACCOUNTS('\uE002'),
    IC_ADD_ALARM('\uE003'),
    IC_ADD_GROUP('\uE004'),
    IC_ADD_PERSON('\uE005'),
    IC_ADD_TO_QUEUE('\uE006'),
    IC_AIRPLANE_MODE_OFF('\uE007'),
    IC_AIRPLANE_MODE_ON('\uE008'),
    IC_ALARMS('\uE009'),
    IC_ATTACHMENT('\uE00A'),
    IC_BACK('\uE00B'),
    IC_BACKSPACE('\uE00C'),
    IC_BAD('\uE00D'),
    IC_BATTERY('\uE00E'),
    IC_BIGHTNESS_LOW('\uE00F'),
    IC_BLUETOOTH('\uE010'),
    IC_BLUETOOTH_CONNECTED('\uE011'),
    IC_BLUETOOTH_SEARCHING('\uE012'),
    IC_BRIGHTNESS_AUTO('\uE013'),
    IC_BRIGHTNESS_HIGH('\uE014'),
    IC_BRIGHTNESS_MEDIUM('\uE015'),
    IC_CALL('\uE016'),
    IC_CAMERA('\uE017'),
    IC_CANCEL('\uE018'),
    IC_CAST('\uE019'),
    IC_CC_BCC('\uE01A'),
    IC_CHAT('\uE01B'),
    IC_CLOUD('\uE01C'),
    IC_COLLAPSE('\uE01D'),
    IC_COLLECTION('\uE01E'),
    IC_COMPUTER('\uE01F'),
    IC_COPY('\uE020'),
    IC_CROP('\uE021'),
    IC_CUT('\uE022'),
    IC_DATA_USAGE('\uE023'),
    IC_DIAL_PAD('\uE024'),
    IC_DIRECTIONS('\uE025'),
    IC_DISCARD('\uE026'),
    IC_DOCK('\uE027'),
    IC_DOWNLOAD('\uE028'),
    IC_DRAWER('\uE029'),
    IC_EDIT('\uE02A'),
    IC_EMAIL('\uE02B'),
    IC_END_CALL('\uE02C'),
    IC_ERROR('\uE02D'),
    IC_EVENT('\uE02E'),
    IC_EXPAND('\uE02F'),
    IC_FAST_FORWARD('\uE030'),
    IC_FAVORITE('\uE031'),
    IC_FLASH_AUTOMATIC('\uE032'),
    IC_FLASH_OFF('\uE033'),
    IC_FLASH_ON('\uE034'),
    IC_FORWARD('\uE035'),
    IC_FULL_SCREEN('\uE036'),
    IC_GAMEPAD('\uE037'),
    IC_GO_TO_TODAY('\uE038'),
    IC_GOOD('\uE039'),
    IC_GROUP('\uE03A'),
    IC_HALF_IMPORTANT('\uE03B'),
    IC_HEADPHONES('\uE03C'),
    IC_HEADSET('\uE03D'),
    IC_HELP('\uE03E'),
    IC_IMPORT_EXPORT('\uE03F'),
    IC_IMPORTANT('\uE040'),
    IC_KEYBOARD('\uE041'),
    IC_LABELS('\uE042'),
    IC_LOCATION_FOUND('\uE043'),
    IC_LOCATION_OFF('\uE044'),
    IC_LOCATION_SEARCHING('\uE045'),
    IC_MAKE_AVAILABLE_OFFLINE('\uE046'),
    IC_MAP('\uE047'),
    IC_MERGE('\uE048'),
    IC_MIC('\uE049'),
    IC_MIC_MUTED('\uE04A'),
    IC_MOUSE('\uE04B'),
    IC_NETWORK_CELL('\uE04C'),
    IC_NETWORK_WIFI('\uE04D'),
    IC_NEW('\uE04E'),
    IC_NEW_ACCOUNT('\uE04F'),
    IC_NEW_ATTACHMENT('\uE050'),
    IC_NEW_EMAIL('\uE051'),
    IC_NEW_EVENT('\uE052'),
    IC_NEW_LABEL('\uE053'),
    IC_NEW_PICTURE('\uE054'),
    IC_NEXT('\uE055'),
    IC_NEXT_ITEM('\uE056'),
    IC_NOT_IMPORTANT('\uE057'),
    IC_NOT_SECURE('\uE058'),
    IC_OVERFLOW('\uE059'),
    IC_PASTE('\uE05A'),
    IC_PAUSE('\uE05B'),
    IC_PAUSE_OVER_VIDEO('\uE05C'),
    IC_PERSON('\uE05D'),
    IC_PHONE('\uE05E'),
    IC_PICTURE('\uE05F'),
    IC_PLACE('\uE060'),
    IC_PLAY('\uE061'),
    IC_PLAY_OVER_VIDEO('\uE062'),
    IC_PREVIOUS('\uE063'),
    IC_PREVIOUS_ITEM('\uE064'),
    IC_READ('\uE065'),
    IC_REFRESH('\uE066'),
    IC_REMOVE('\uE067'),
    IC_REPEAT('\uE068'),
    IC_REPLAY('\uE069'),
    IC_REPLY('\uE06A'),
    IC_REPLY_ALL('\uE06B'),
    IC_RETURN_FROM_FULL_SCREEN('\uE06C'),
    IC_REWIND('\uE06D'),
    IC_RING_VOLUME('\uE06E'),
    IC_ROTATE_LEFT('\uE06F'),
    IC_ROTATE_RIGHT('\uE070'),
    IC_SAVE('\uE071'),
    IC_SCREEN_LOCKED_TO_LANDSCAPE('\uE072'),
    IC_SCREEN_LOCKED_TO_PORTRAIT('\uE073'),
    IC_SCREEN_ROTATION('\uE074'),
    IC_SD_STORAGE('\uE075'),
    IC_SEARCH('\uE076'),
    IC_SECURE('\uE077'),
    IC_SELECT_ALL('\uE078'),
    IC_SEND_NOW('\uE079'),
    IC_SETTINGS('\uE07A'),
    IC_SHARE('\uE07B'),
    IC_SHUFFLE('\uE07C'),
    IC_SLIDESHOW('\uE07D'),
    IC_SORT_BY_SIZE('\uE07E'),
    IC_SPLIT('\uE07F'),
    IC_STOP('\uE080'),
    IC_STORAGE('\uE081'),
    IC_SWITCH_CAMERA('\uE082'),
    IC_SWITCH_VIDEO('\uE083'),
    IC_TIME('\uE084'),
    IC_UNDO('\uE085'),
    IC_UNREAD('\uE086'),
    IC_UPLOAD('\uE087'),
    IC_USB('\uE088'),
    IC_VIDEO('\uE089'),
    IC_VIEW_AS_GRID('\uE08A'),
    IC_VIEW_AS_LIST('\uE08B'),
    IC_VOLUME_MUTED('\uE08C'),
    IC_VOLUME_ON('\uE08D'),
    IC_WARNING('\uE08E'),
    IC_WEB_SITE('\uE08F');

    private static String HOLOFONT = null;
    
    static {
        try {
            HOLOFONT = Font.loadFont(FontAwesome.class.getResourceAsStream("fonts/holo-icon-font.ttf"), 10.0).getName();    
        } catch (Exception e) {
        }
    } 
    
    private final char character;

    private Holo(char character) {
        this.character = character;
    }

    @Override
    public char getChar() {
        return character;
    }

    @Override
    public String getFontName() {
        return HOLOFONT;
    }    
}
