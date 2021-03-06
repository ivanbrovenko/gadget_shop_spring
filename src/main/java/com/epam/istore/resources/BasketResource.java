package com.epam.istore.resources;


import com.epam.istore.exception.ServiceException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface BasketResource {

    @GetMapping("/basket")
    String createBasketPage(HttpServletRequest request) throws IOException;

    @PutMapping("/basket")
    String putToTheBasket(int productId, int productCount, HttpServletRequest request) throws ServiceException;

    @DeleteMapping("/basket")
    String deleteFromBasket(HttpServletRequest request) throws ServletException, IOException;

    @PostMapping("/basket")
    String postToBasket(HttpServletRequest request) throws IOException;
}
