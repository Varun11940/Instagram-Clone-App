package com.cloneinstagram.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cloneinstagram.app.adapters.PostAdapter;
import com.cloneinstagram.app.adapters.StoryAdapter;
import com.cloneinstagram.app.data.Post;
import com.cloneinstagram.app.data.Story;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView storyRecyclerView;
    private List<Story> storyList;

    private RecyclerView postRecyclerView;
    private List<Post> postList;

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        // Initialize StoryAdapter and set it to storyRecyclerView
        StoryAdapter storyAdapter = new StoryAdapter(storyList, this);
        storyRecyclerView.setAdapter(storyAdapter);
        storyRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Set click listener for removing story
        storyAdapter.setOnRemoveStoryListener((view, position) -> {
            // Handle the click event here
            Toast.makeText(this, "Remove Story: " + position, Toast.LENGTH_SHORT).show();
            storyList.remove(position);
            storyAdapter.notifyDataSetChanged();
        });

        // Initialize PostAdapter and set it to postRecyclerView
        PostAdapter postAdapter = new PostAdapter(postList, this);
        postRecyclerView.setAdapter(postAdapter);
        postRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initialize() {
        this.storyRecyclerView = findViewById(R.id.story_container);
        this.postRecyclerView = findViewById(R.id.singlePost);
        this.storyList = new ArrayList<>();
        this.postList = new ArrayList<>();

        // Add default stories
        this.storyList.add(new Story(1, "John", R.drawable.story4));
        this.storyList.add(new Story(2, "Sam", R.drawable.story3));
        this.storyList.add(new Story(3, "Ram", R.drawable.story5));
        this.storyList.add(new Story(4, "Shyam", R.drawable.story6));
        this.storyList.add(new Story(5, "Ramesh", R.drawable.story7));
        this.storyList.add(new Story(6, "Suresh", R.drawable.story8));

        // Add items to postList
        this.postList.add(new Post(1, R.drawable.profile, R.drawable.story1,
                "This is first post caption", "sponsored", "40 likes", "View all 5 comments", "Sam Alton"));

        this.postList.add(new Post(2, R.drawable.profile, R.drawable.story3,
                "This is second post caption", "sponsored", "50 likes", "View all 16 comments", "Robert Downey Junior"));
    }
}
