package com.nanddgroup.itea_app;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.RingtonePreference;
import android.preference.SwitchPreference;
import android.widget.Toast;

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
        lp.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                int index = lp.findIndexOfValue(newValue.toString());
                Toast.makeText(AppPreferencesActivity.this, String.valueOf(index), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        mslp = (MultiSelectListPreference) findPreference(MULTI_SELECT_LIST_PREFERENCE_KEY);
        rp = (RingtonePreference) findPreference(RINGTONE_PREFERENCE_KEY);
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        switch (preference.getKey()) {
            case PREFERENCE_KEY:
                Toast.makeText(this, "PREFERENCE_KEY", Toast.LENGTH_SHORT).show();
                break;
            case CHECK_BOX_PREFERENCES_KEY:
                Toast.makeText(this, "CHECK_BOX_PREFERENCES_KEY", Toast.LENGTH_SHORT).show();
                break;
            case EDIT_TEXT_PREFERENCES_KEY:
                Toast.makeText(this, "EDIT_TEXT_PREFERENCES_KEY", Toast.LENGTH_SHORT).show();
                break;
            case LIST_PREFERENCES_KEY:
                Toast.makeText(this, "LIST_PREFERENCES_KEY", Toast.LENGTH_SHORT).show();
                break;
            case MULTI_SELECT_LIST_PREFERENCE_KEY:
                Toast.makeText(this, "MULTI_SELECT_LIST_PREFERENCE_KEY", Toast.LENGTH_SHORT).show();
                break;
            case RINGTONE_PREFERENCE_KEY:
                Toast.makeText(this, "RINGTONE_PREFERENCE_KEY", Toast.LENGTH_SHORT).show();
                break;
            case SWITCH_PREFERENCE_KEY:
                Toast.makeText(this, "SWITCH_PREFERENCE_KEY", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}

