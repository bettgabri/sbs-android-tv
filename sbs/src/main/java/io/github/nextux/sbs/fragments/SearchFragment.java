package io.github.nextux.sbs.fragments;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.sbs.activities.DetailsActivity;
import io.github.nextux.sbs.content.ContentManager;


public class SearchFragment extends io.github.nextux.base.fragments.SearchFragment {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getDetailsActivityClass() {
        return DetailsActivity.class;
    }
}