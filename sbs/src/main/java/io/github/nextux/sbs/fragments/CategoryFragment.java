package io.github.nextux.sbs.fragments;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.sbs.R;
import io.github.nextux.sbs.activities.DetailsActivity;
import io.github.nextux.sbs.activities.SearchActivity;
import io.github.nextux.sbs.content.ContentManager;

public class CategoryFragment extends io.github.nextux.base.fragments.CategoryFragment {
    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getSearchActivityClass() {
        return SearchActivity.class;
    }

    @Override
    protected Class<?> getDetailsActivityClass() {
        return DetailsActivity.class;
    }

    @Override
    protected void setupHeader() {
        setSearchAffordanceColor(getResources().getColor(R.color.brand_color));
    }
}
