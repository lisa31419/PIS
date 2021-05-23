package com.example.lize.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.ContextThemeWrapper;

import com.example.lize.R;

public class Preferences {

    private static int theme = R.style.Theme_Red;

    public static void setTheme(int selectedTheme){
        switch (selectedTheme){
            case 1:     theme = R.style.Theme_Red; break;
            case 2:     theme = R.style.Theme_Purple; break;
            case 3:     theme = R.style.Theme_Indigo; break;
            case 4:     theme = R.style.Theme_Blue; break;
            case 5:     theme = R.style.Theme_Teal; break;
            case 6:     theme = R.style.Theme_Green; break;
            case 7:     theme = R.style.Theme_Yellow; break;
            case 8:     theme = R.style.Theme_Orange; break;
            case 9:     theme = R.style.Theme_Brown; break;
        }
    }

    public static int getSelectedTheme() {
        return theme;
    }

    public static void applyTheme(ContextThemeWrapper contextThemeWrapper) {
        contextThemeWrapper.setTheme(theme);
    }

    public static int getAmbitoColor(int ambitoColor){
        switch (ambitoColor){
            case 1: return  R.color.Ambito_Red;
            case 2: return R.color.Ambito_Purple;
            case 3: return R.color.Ambito_Indigo;
            case 4: return R.color.Ambito_Blue;
            case 5: return R.color.Ambito_Teal;
            case 6: return R.color.Ambito_Green;
            case 7: return R.color.Ambito_Yellow;
            case 8: return R.color.Ambito_Orange;
            case 9: return R.color.Ambito_Brown;

            default: return  R.color.Ambito_Red;
        }
    }

    public static int getAmbitoPressedColor(int ambitoColor){
        switch (ambitoColor){
            case 1: return  R.color.Presseed_Red;
            case 2: return R.color.Presseed_Purple;
            case 3: return R.color.Presseed_Indigo;
            case 4: return R.color.Presseed_Blue;
            case 5: return R.color.Presseed_Teal;
            case 6: return R.color.Presseed_Green;
            case 7: return R.color.Presseed_Yellow;
            case 8: return R.color.Presseed_Orange;
            case 9: return R.color.Presseed_Brown;

            default: return  R.color.Presseed_Red;
        }
    }

    public static int getDefaultAmbitoColor(){
        return R.color.white;
    }
}
