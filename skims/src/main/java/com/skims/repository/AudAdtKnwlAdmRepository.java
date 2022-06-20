/** 
* AudAdtKnwlAdm Entity 접근을 위한 Repository 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
* @see     org.springframework.data.repository.PagingAndSortingRepository
*/
package com.skims.repository;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.skims.domain.AudAdtKnwlAdm;
import com.skims.domain.AudAdtKnwlAdmPK;

@RepositoryRestResource(collectionResourceRel="audadtknwladms", path="audadtknwladms")
public interface AudAdtKnwlAdmRepository extends PagingAndSortingRepository<AudAdtKnwlAdm, AudAdtKnwlAdmPK>{
    //@RestResource
    //Page<AudAdtKnwlAdm>findByAdtKnwlBsnsFlgcdAndAdtKnwlMdccdAndSeqno(String adtKnwlBsnsFlgcd, String adtKnwlMdccd, BigDecimal seqno, Pageable pageable); // FindPK
}
