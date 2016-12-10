package io.github.nextux.sbs.activities;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.sbs.content.ContentManager;

public class VideoPlayerActivity extends io.github.nextux.base.activities.VideoPlayerActivity {

    @Override
    protected ContentManagerBase getContentManger() {
        return ContentManager.getInstance();
    }

    @Override
    protected Class getVideoPlayerActivityClass() {
        return VideoPlayerActivity.class;
    }
}