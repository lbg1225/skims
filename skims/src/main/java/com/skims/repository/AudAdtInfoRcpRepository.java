/** 
* AudAdtInfoRcp Entity 접근을 위한 Repository 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
* @see     org.springframework.data.repository.PagingAndSortingRepository
*/
package com.skims.repository;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.skims.domain.AudAdtInfoRcp;
import com.skims.domain.AudAdtInfoRcpPK;

@RepositoryRestResource(collectionResourceRel="audadtinforcps", path="audadtinforcps")
public interface AudAdtInfoRcpRepository extends PagingAndSortingRepository<AudAdtInfoRcp, AudAdtInfoRcpPK>{
//    @RestResource
//    Page<AudAdtInfoRcp>findByRcpdtAndRcpHhmmAndRcpSeqno(Date rcpdt, String rcpHhmm, BigDecimal rcpSeqno, Pageable pageable); // FindPK
}
