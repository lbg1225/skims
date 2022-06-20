/** 
* AudAdtInfoRcpCrDt Entity 접근을 위한 Repository 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
* @see     org.springframework.data.repository.PagingAndSortingRepository
*/
package com.skims.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.skims.domain.AudAdtInfoRcpCrDt;

@RepositoryRestResource(collectionResourceRel="audadtinforcpcrdts", path="audadtinforcpcrdts")
public interface AudAdtInfoRcpCrDtRepository extends PagingAndSortingRepository<AudAdtInfoRcpCrDt, Long>{
}
