package com.example.sn.Service;

import com.example.sn.Entity.Post;
import com.example.sn.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public void deletePost(Post post) {
        postRepository.delete(post);
    }
}
