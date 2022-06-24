package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.domain.CommonCodeDetail;
import com.sample.dto.ListCommonCodeDetailDto;
import com.sample.repository.CommonCodeDetailRepository;

@RestController
public class CommonCodeDetailController {

    @Autowired CommonCodeDetailRepository repository;

    @RequestMapping(value = "/commoncodedetail", method = RequestMethod.GET)
    HttpEntity<PagedModel<CommonCodeDetail>> commoncodedetails(Pageable pageable, PagedResourcesAssembler assembler) {
        Page<CommonCodeDetail> commoncodedetails = repository.findAll(pageable);
        return new ResponseEntity<>(assembler.toModel(commoncodedetails), HttpStatus.OK);
    }
    
    @GetMapping(path = "/commoncoded")
    public List<ListCommonCodeDetailDto> getByIncidNum() {
        List<ListCommonCodeDetailDto>data = repository.findByData();

        if (data.isEmpty())
            return data;
        else
            return data;
    }  

    @GetMapping("/book")  
    public List<ListCommonCodeDetailDto> listAllBooks() {  
    List<ListCommonCodeDetailDto> list = new ArrayList<>();  
    Iterable<ListCommonCodeDetailDto> iterable = repository.findByData();
    for (ListCommonCodeDetailDto bookEntity : iterable) {  
      list.add(bookEntity);  
      System.out.println(bookEntity.toString());
    }  
    return list;  
  }  
}