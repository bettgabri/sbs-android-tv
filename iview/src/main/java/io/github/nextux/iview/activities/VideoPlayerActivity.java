package io.github.nextux.iview.activities;

import io.github.nextux.base.content.ContentManagerBase;
import io.github.nextux.iview.content.ContentManager;

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