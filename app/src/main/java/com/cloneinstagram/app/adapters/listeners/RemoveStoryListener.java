package com.cloneinstagram.app.adapters.listeners;

import android.view.View;


@FunctionalInterface
public interface RemoveStoryListener {

    void removeStory(View view, int position);

}
