package com.sample.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sample.domain.CommonCodeDetail;
import com.sample.domain.CommonCodeDetailPK;
import com.sample.dto.ListCommonCodeDetailDto;

@RepositoryRestResource(collectionResourceRel = "commoncodedetails", path = "commoncodedetails")
public interface CommonCodeDetailRepository extends JpaRepository<CommonCodeDetail, CommonCodeDetailPK>{ //Entity 클래스, PK 타입
    @RestResource
    Page<CommonCodeDetail>findByCode(String code, Pageable pageable);
    Page<CommonCodeDetail>findByCodeAndGroupCode(String code, String groupCode, Pageable pageable);
    @RestResource(exported = false)
    @Query(value = "select a.*, b.Group_Name from Common_Code_Detail a inner join Common_Code b on a.Group_Code = b.Group_Code", nativeQuery = true)
    List<Object []>findByData();
}