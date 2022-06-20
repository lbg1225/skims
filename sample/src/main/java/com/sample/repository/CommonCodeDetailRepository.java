package com.sample.repository;

import com.sample.domain.CommonCodeDetail;
import com.sample.domain.CommonCodeDetailPK;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "commoncodedetails", path = "commoncodedetails")
public interface CommonCodeDetailRepository extends PagingAndSortingRepository<CommonCodeDetail, CommonCodeDetailPK>{ //Entity 클래스, PK 타입
    @RestResource
    Page<CommonCodeDetail>findByCode(String code, Pageable pageable);
    Page<CommonCodeDetail>findByCodeAndGroupCode(String code, String groupCode, Pageable pageable);
}