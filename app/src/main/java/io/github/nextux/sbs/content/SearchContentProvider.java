package io.github.nextux.sbs.content;

import android.database.Cursor;

import io.github.nextux.sbs.content.SearchProviderBase;

public class SearchContentProvider extends SearchProviderBase {

    public static String AUTHORITY = "io.github.nextux.sbs.search";

    @Override
    protected String getAuthority() {
        return AUTHORITY;
    }

    protected Cursor getSuggestions(String query) {
        return ContentManager.getInstance().searchShowsCursor(query);
    }
}
