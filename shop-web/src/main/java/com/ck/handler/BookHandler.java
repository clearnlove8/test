package com.ck.handler;

import com.ck.entity.Book;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class BookHandler {

    @Autowired
    private IBookService bookService;

    @GetMapping("getAll")
    public String queryAll(Map map){
        List<Book> bookList = bookService.getAll();
        //添加模型数据
        map.put("bookList", bookList);
        //System.out.println(bookList);
        System.out.println("更新的代码!");
        System.out.println("22222");
        return "list";
    }

}
