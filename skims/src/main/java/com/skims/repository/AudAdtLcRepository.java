/** 
* AudAdtLc Entity 접근을 위한 Repository 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
* @see     org.springframework.data.repository.PagingAndSortingRepository
*/
package com.skims.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.skims.domain.AudAdtLc;
import com.skims.domain.AudAdtLcPK;

@RepositoryRestResource(collectionResourceRel="audadtlcs", path="audadtlcs")
public interface AudAdtLcRepository extends PagingAndSortingRepository<AudAdtLc, AudAdtLcPK>{
    @RestResource
    Page<AudAdtLc>findByAdtYrAndAdtFlgcdAndAdtno(String adtYr, String adtFlgcd, String adtno, Pageable pageable); // FindPK
}
