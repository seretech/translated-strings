package com.serenity.developers.mylibrary;

import java.util.Locale;

public class langStrings {

    String value;
    String defLang = Locale.getDefault().getLanguage();

    public String bookmark() {
        if (defLang.matches("es")) {
            value = "Marcadores";
        } else if (defLang.matches("fr")) {
            value = "Signets";
        } else {
            value = "Bookmark";
        }
        return value;
    }

    public String deleted() {
        if (defLang.matches("es")) {
            value = "Eliminado";
        } else if (defLang.matches("fr")) {
            value = "Supprimé";
        } else {
            value = "Deleted";
        }
        return value;
    }
}
