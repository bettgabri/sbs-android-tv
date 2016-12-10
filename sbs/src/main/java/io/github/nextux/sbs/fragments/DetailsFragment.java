package io.github.nextux.sbs.fragments;

import io.github.nextux.base.api.EpisodeBaseModel;
import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.sbs.activities.VideoPlayerActivity;
import io.github.nextux.sbs.content.ContentManager;

public class DetailsFragment extends io.github.nextux.base.fragments.DetailsFragment {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class<?> getPlayerActivityClass() {
        return VideoPlayerActivity.class;
    }

    protected void selectCurrentEpisode(EpisodeBaseModel episode, boolean initial) {
        if (!episode.equals(getCurrentEpisode())) {
            setCurrentEpisode(episode);
            if (initial) {
                getContentManger().fetchEpisode(episode);
            }
            if (getDetailView() != null) {
                getDetailView().setEpisode(episode);
            }
        }
    }
}
