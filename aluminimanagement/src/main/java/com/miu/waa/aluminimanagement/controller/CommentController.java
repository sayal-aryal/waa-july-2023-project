package com.miu.waa.aluminimanagement.controller;


import com.miu.waa.aluminimanagement.service.CommentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentServiceImpl commentService;

//    @GetMapping("/{id})
//            public List<Comment> findCommentsByStudent(@PathVariable Long id) {
//        return commentService.findCommentsByStudent(id);
//    }
}
