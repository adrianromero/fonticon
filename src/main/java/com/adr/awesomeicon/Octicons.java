//    FontAwesome is a JavaFX library to use Fontawesome
//    Copyright (C) 2014 Adrián Romero Corchado.
//
//    This file is part of FontAwesome
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

package com.adr.awesomeicon;

import javafx.scene.text.Font;

/**
 * Icon Enum based on
 * Octicons
 * (c) 2012-2014 GitHub
 * When using the GitHub logos, be sure to follow the GitHub logo guidelines (https://github.com/logos)
 * Font License: SIL OFL 1.1 (http://scripts.sil.org/OFL)
 * Applies to all font files
 * Code License: MIT (http://choosealicense.com/licenses/mit/)
 * Applies to all other files* 
 *
 * @author adrian
 */
public enum Octicons implements IconFont {
    
    OCTICON_ALERT('\uF02D'),
    OCTICON_ALIGNMENT_ALIGN('\uF08A'),
    OCTICON_ALIGNMENT_ALIGNED_TO('\uF08E'),
    OCTICON_ALIGNMENT_UNALIGN('\uF08B'),
    OCTICON_ARROW_DOWN('\uF03F'),
    OCTICON_ARROW_LEFT('\uF040'),
    OCTICON_ARROW_RIGHT('\uF03E'),
    OCTICON_ARROW_SMALL_DOWN('\uF0A0'),
    OCTICON_ARROW_SMALL_LEFT('\uF0A1'),
    OCTICON_ARROW_SMALL_RIGHT('\uF071'),
    OCTICON_ARROW_SMALL_UP('\uF09F'),
    OCTICON_ARROW_UP('\uF03D'),
    OCTICON_BEER('\uF069'),
    OCTICON_BOOK('\uF007'),
    OCTICON_BOOKMARK('\uF07B'),
    OCTICON_BRIEFCASE('\uF0D3'),
    OCTICON_BROADCAST('\uF048'),
    OCTICON_BROWSER('\uF0C5'),
    OCTICON_BUG('\uF091'),
    OCTICON_CALENDAR('\uF068'),
    OCTICON_CHECK('\uF03A'),
    OCTICON_CHECKLIST('\uF076'),
    OCTICON_CHEVRON_DOWN('\uF0A3'),
    OCTICON_CHEVRON_LEFT('\uF0A4'),
    OCTICON_CHEVRON_RIGHT('\uF078'),
    OCTICON_CHEVRON_UP('\uF0A2'),
    OCTICON_CIRCLE_SLASH('\uF084'),
    OCTICON_CIRCUIT_BOARD('\uF0D6'),
    OCTICON_CLIPPY('\uF035'),
    OCTICON_CLOCK('\uF046'),
    OCTICON_CLOUD_DOWNLOAD('\uF00B'),
    OCTICON_CLOUD_UPLOAD('\uF00C'),
    OCTICON_CODE('\uF05F'),
    OCTICON_COLOR_MODE('\uF065'),
    OCTICON_COMMENT_ADD('\uF02B'),
    OCTICON_COMMENT('\uF02B'),
    OCTICON_COMMENT_DISCUSSION('\uF04F'),
    OCTICON_CREDIT_CARD('\uF045'),
    OCTICON_DASH('\uF0CA'),
    OCTICON_DASHBOARD('\uF07D'),
    OCTICON_DATABASE('\uF096'),
    OCTICON_DEVICE_CAMERA('\uF056'),
    OCTICON_DEVICE_CAMERA_VIDEO('\uF057'),
    OCTICON_DEVICE_DESKTOP('\uF27C'),
    OCTICON_DEVICE_MOBILE('\uF038'),
    OCTICON_DIFF('\uF04D'),
    OCTICON_DIFF_ADDED('\uF06B'),
    OCTICON_DIFF_IGNORED('\uF099'),
    OCTICON_DIFF_MODIFIED('\uF06D'),
    OCTICON_DIFF_REMOVED('\uF06C'),
    OCTICON_DIFF_RENAMED('\uF06E'),
    OCTICON_ELLIPSIS('\uF09A'),
    OCTICON_EYE_UNWATCH('\uF04E'),
    OCTICON_EYE_WATCH('\uF04E'),
    OCTICON_EYE('\uF04E'),
    OCTICON_FILE_BINARY('\uF094'),
    OCTICON_FILE_CODE('\uF010'),
    OCTICON_FILE_DIRECTORY('\uF016'),
    OCTICON_FILE_MEDIA('\uF012'),
    OCTICON_FILE_PDF('\uF014'),
    OCTICON_FILE_SUBMODULE('\uF017'),
    OCTICON_FILE_SYMLINK_DIRECTORY('\uF0B1'),
    OCTICON_FILE_SYMLINK_FILE('\uF0B0'),
    OCTICON_FILE_TEXT('\uF011'),
    OCTICON_FILE_ZIP('\uF013'),
    OCTICON_FLAME('\uF0D2'),
    OCTICON_FOLD('\uF0CC'),
    OCTICON_GEAR('\uF02F'),
    OCTICON_GIFT('\uF042'),
    OCTICON_GIST('\uF00E'),
    OCTICON_GIST_SECRET('\uF08C'),
    OCTICON_GIT_BRANCH_CREATE('\uF020'),
    OCTICON_GIT_BRANCH_DELETE('\uF020'),
    OCTICON_GIT_BRANCH('\uF020'),
    OCTICON_GIT_COMMIT('\uF01F'),
    OCTICON_GIT_COMPARE('\uF0AC'),
    OCTICON_GIT_MERGE('\uF023'),
    OCTICON_GIT_PULL_REQUEST_ABANDONED('\uF009'),
    OCTICON_GIT_PULL_REQUEST('\uF009'),
    OCTICON_GLOBE('\uF0B6'),
    OCTICON_GRAPH('\uF043'),
    OCTICON_HEART('\u2665'),
    OCTICON_HISTORY('\uF07E'),
    OCTICON_HOME('\uF08D'),
    OCTICON_HORIZONTAL_RULE('\uF070'),
    OCTICON_HOURGLASS('\uF09E'),
    OCTICON_HUBOT('\uF09D'),
    OCTICON_INBOX('\uF0CF'),
    OCTICON_INFO('\uF059'),
    OCTICON_ISSUE_CLOSED('\uF028'),
    OCTICON_ISSUE_OPENED('\uF026'),
    OCTICON_ISSUE_REOPENED('\uF027'),
    OCTICON_JERSEY('\uF019'),
    OCTICON_JUMP_DOWN('\uF072'),
    OCTICON_JUMP_LEFT('\uF0A5'),
    OCTICON_JUMP_RIGHT('\uF0A6'),
    OCTICON_JUMP_UP('\uF073'),
    OCTICON_KEY('\uF049'),
    OCTICON_KEYBOARD('\uF00D'),
    OCTICON_LAW('\uF0D8'),
    OCTICON_LIGHT_BULB('\uF000'),
    OCTICON_LINK('\uF05C'),
    OCTICON_LINK_EXTERNAL('\uF07F'),
    OCTICON_LIST_ORDERED('\uF062'),
    OCTICON_LIST_UNORDERED('\uF061'),
    OCTICON_LOCATION('\uF060'),
    OCTICON_GIST_PRIVATE('\uF06A'),
    OCTICON_MIRROR_PRIVATE('\uF06A'),
    OCTICON_GIT_FORK_PRIVATE('\uF06A'),
    OCTICON_LOCK('\uF06A'),
    OCTICON_LOGO_GITHUB('\uF092'),
    OCTICON_MAIL('\uF03B'),
    OCTICON_MAIL_READ('\uF03C'),
    OCTICON_MAIL_REPLY('\uF051'),
    OCTICON_MARK_GITHUB('\uF00A'),
    OCTICON_MARKDOWN('\uF0C9'),
    OCTICON_MEGAPHONE('\uF077'),
    OCTICON_MENTION('\uF0BE'),
    OCTICON_MICROSCOPE('\uF089'),
    OCTICON_MILESTONE('\uF075'),
    OCTICON_MIRROR_PUBLIC('\uF024'),
    OCTICON_MIRROR('\uF024'),
    OCTICON_MORTAR_BOARD('\uF0D7'),
    OCTICON_MOVE_DOWN('\uF0A8'),
    OCTICON_MOVE_LEFT('\uF074'),
    OCTICON_MOVE_RIGHT('\uF0A9'),
    OCTICON_MOVE_UP('\uF0A7'),
    OCTICON_MUTE('\uF080'),
    OCTICON_NO_NEWLINE('\uF09C'),
    OCTICON_OCTOFACE('\uF008'),
    OCTICON_ORGANIZATION('\uF037'),
    OCTICON_PACKAGE('\uF0C4'),
    OCTICON_PAINTCAN('\uF0D1'),
    OCTICON_PENCIL('\uF058'),
    OCTICON_PERSON_ADD('\uF018'),
    OCTICON_PERSON_FOLLOW('\uF018'),
    OCTICON_PERSON('\uF018'),
    OCTICON_PIN('\uF041'),
    OCTICON_PLAYBACK_FAST_FORWARD('\uF0BD'),
    OCTICON_PLAYBACK_PAUSE('\uF0BB'),
    OCTICON_PLAYBACK_PLAY('\uF0BF'),
    OCTICON_PLAYBACK_REWIND('\uF0BC'),
    OCTICON_PLUG('\uF0D4'),
    OCTICON_REPO_CREATE('\uF05D'),
    OCTICON_GIST_NEW('\uF05D'),
    OCTICON_FILE_DIRECTORY_CREATE('\uF05D'),
    OCTICON_FILE_ADD('\uF05D'),
    OCTICON_PLUS('\uF05D'),
    OCTICON_PODIUM('\uF0AF'),
    OCTICON_PRIMITIVE_DOT('\uF052'),
    OCTICON_PRIMITIVE_SQUARE('\uF053'),
    OCTICON_PULSE('\uF085'),
    OCTICON_PUZZLE('\uF0C0'),
    OCTICON_QUESTION('\uF02C'),
    OCTICON_QUOTE('\uF063'),
    OCTICON_RADIO_TOWER('\uF030'),
    OCTICON_REPO_DELETE('\uF001'),
    OCTICON_REPO('\uF001'),
    OCTICON_REPO_CLONE('\uF04C'),
    OCTICON_REPO_FORCE_PUSH('\uF04A'),
    OCTICON_GIST_FORK('\uF002'),
    OCTICON_REPO_FORKED('\uF002'),
    OCTICON_REPO_PULL('\uF006'),
    OCTICON_REPO_PUSH('\uF005'),
    OCTICON_ROCKET('\uF033'),
    OCTICON_RSS('\uF034'),
    OCTICON_RUBY('\uF047'),
    OCTICON_SCREEN_FULL('\uF066'),
    OCTICON_SCREEN_NORMAL('\uF067'),
    OCTICON_SEARCH_SAVE('\uF02E'),
    OCTICON_SEARCH('\uF02E'),
    OCTICON_SERVER('\uF097'),
    OCTICON_SETTINGS('\uF07C'),
    OCTICON_LOG_IN('\uF036'),
    OCTICON_SIGN_IN('\uF036'),
    OCTICON_LOG_OUT('\uF032'),
    OCTICON_SIGN_OUT('\uF032'),
    OCTICON_SPLIT('\uF0C6'),
    OCTICON_SQUIRREL('\uF0B2'),
    OCTICON_STAR_ADD('\uF02A'),
    OCTICON_STAR_DELETE('\uF02A'),
    OCTICON_STAR('\uF02A'),
    OCTICON_STEPS('\uF0C7'),
    OCTICON_STOP('\uF08F'),
    OCTICON_REPO_SYNC('\uF087'),
    OCTICON_SYNC('\uF087'),
    OCTICON_TAG_REMOVE('\uF015'),
    OCTICON_TAG_ADD('\uF015'),
    OCTICON_TAG('\uF015'),
    OCTICON_TELESCOPE('\uF088'),
    OCTICON_TERMINAL('\uF0C8'),
    OCTICON_THREE_BARS('\uF05E'),
    OCTICON_TOOLS('\uF031'),
    OCTICON_TRASHCAN('\uF0D0'),
    OCTICON_TRIANGLE_DOWN('\uF05B'),
    OCTICON_TRIANGLE_LEFT('\uF044'),
    OCTICON_TRIANGLE_RIGHT('\uF05A'),
    OCTICON_TRIANGLE_UP('\uF0AA'),
    OCTICON_UNFOLD('\uF039'),
    OCTICON_UNMUTE('\uF0BA'),
    OCTICON_VERSIONS('\uF064'),
    OCTICON_REMOVE_CLOSE('\uF081'),
    OCTICON_X('\uF081'),
    OCTICON_ZAP('\u26A1');
    
    private static String OCTICONS = null;
    
    static {
        try {
            OCTICONS = Font.loadFont(FontAwesome.class.getResourceAsStream("fonts/octicons.ttf"), 10.0).getName();    
        } catch (Exception e) {
        }
    } 
    
    private final char character;

    private Octicons(char character) {
        this.character = character;
    }

    @Override
    public char getChar() {
        return character;
    }

    @Override
    public String getFontName() {
        return OCTICONS;
    }        
}
