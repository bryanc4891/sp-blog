package com.sp.blog.service;

import com.sp.blog.payload.PostDto;
import com.sp.blog.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    List<PostDto> getPostsByCategory(long categoryId);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
