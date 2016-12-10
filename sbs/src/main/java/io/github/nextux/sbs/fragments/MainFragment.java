package io.github.nextux.sbs.fragments;

import android.support.v17.leanback.widget.BrowseFrameLayout;
import android.view.View;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.sbs.R;
import io.github.nextux.sbs.activities.CategoryActivity;
import io.github.nextux.sbs.activities.DetailsActivity;
import io.github.nextux.sbs.activities.SearchActivity;
import io.github.nextux.sbs.content.ContentManager;


public class MainFragment extends io.github.nextux.base.fragments.MainFragment {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected void setupHeader() {
        setBadgeDrawable(getResources().getDrawable(R.mipmap.logo));
        setSearchAffordanceColor(getResources().getColor(R.color.brand_color));
    }

    @Override
    protected BrowseFrameLayout getBrowseFrame(View root) {
        return (BrowseFrameLayout) root.findViewById(android.support.v17.leanback.R.id.browse_frame);
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
    protected Class<?> getCategoryActivityClass() {
        return CategoryActivity.class;
    }
}
