/*
 * Copyright (C) 2020 Vojtěch Perník <v.pernik@centrum.cz>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.pervoj.lttedit.classes;

/**
 *
 * @author Vojtěch Perník <v.pernik@centrum.cz>
 */
public class TranslationModel {
    private String code;
    private String original;
    private String translation;
    private String[] notes;
    
    public TranslationModel(String code, String original, String translation, String[] notes) {
        this.code = code;
        this.original = original;
        this.translation = translation;
        this.notes = notes;
    }

    public String getCode() {
        return code;
    }

    public String getOriginal() {
        return original;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
    
    public String[] getNotes() {
        return notes;
    }
}
