package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.domain.CommonCodeDetail;
import com.sample.dto.ListCommonCodeDetailDto;
import com.sample.repository.CommonCodeDetailRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CommonCodeDetailController {

    @Autowired CommonCodeDetailRepository repository;

    @RequestMapping(value = "/commoncodedetail", method = RequestMethod.GET)
    HttpEntity<PagedModel<CommonCodeDetail>> commoncodedetails(Pageable pageable, PagedResourcesAssembler assembler) {
        Page<CommonCodeDetail> commoncodedetails = repository.findByData(pageable);
        for(CommonCodeDetail commonCodeDetail : commoncodedetails){
             log.info(commonCodeDetail.toString());
        }
        
        // Page<ListCommonCodeDetailDto>xx = repository.findByData1(pageable);
        // log.info("logtest1");
        return new ResponseEntity<>(assembler.toModel(commoncodedetails), HttpStatus.OK);
    }
}