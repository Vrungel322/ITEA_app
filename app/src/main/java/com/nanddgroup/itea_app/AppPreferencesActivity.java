package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.RingtonePreference;
import android.preference.SwitchPreference;

/**
 * Created by Nikita on 22.12.2016.
 */

public class AppPreferencesActivity extends PreferenceActivity {
    public final String SWITCH_PREFERENCE_KEY = "switch";
    public final String PREFERENCE_KEY = "pref";
    public final String CHECK_BOX_PREFERENCES_KEY = "check";
    public final String EDIT_TEXT_PREFERENCES_KEY = "edit";
    public final String LIST_PREFERENCES_KEY = "list";
    public final String MULTI_SELECT_LIST_PREFERENCE_KEY = "multilist";
    public final String RINGTONE_PREFERENCE_KEY = "ring";
    public static final String LOG_TAG = "PrefsLog";
    private Preference p;
    private CheckBoxPreference cbp;
    private EditTextPreference etp;
    private ListPreference lp;
    private MultiSelectListPreference mslp;
    private RingtonePreference rp;
    private SwitchPreference swp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefsscreen);
        swp = (SwitchPreference) findPreference(SWITCH_PREFERENCE_KEY);
        p = findPreference(PREFERENCE_KEY);
        cbp = (CheckBoxPreference) findPreference(CHECK_BOX_PREFERENCES_KEY);
        etp = (EditTextPreference) findPreference(EDIT_TEXT_PREFERENCES_KEY);
        lp = (ListPreference) findPreference(LIST_PREFERENCES_KEY);
        mslp = (MultiSelectListPreference) findPreference(MULTI_SELECT_LIST_PREFERENCE_KEY);
        rp = (RingtonePreference) findPreference(RINGTONE_PREFERENCE_KEY);
    }
}

