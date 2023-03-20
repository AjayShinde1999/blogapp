package com.myblog.blogapp.payload;


import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private long id;
    @NotNull
    @Size(min = 2,message = "Post title should have at least 2 characters")
    private String title;
    @NotNull
    @Size(min = 10,message = "Post description should have at least 10 characters")
    private String description;
    @NotNull
    @NotEmpty
    private String content;

}
