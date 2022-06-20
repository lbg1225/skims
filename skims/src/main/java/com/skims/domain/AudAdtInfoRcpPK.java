/** 
* AudAdtInfoRcpCrDt Entity Id 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
*/
package com.skims.domain;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;

import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_adt_info_rcp //--감사정보접수 Primary Key
public class AudAdtInfoRcpPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "rcpdt")
    private Date rcpdt; //--접수일자

    @Column(name = "rcp_hhmm")
    private String rcpHhmm; //--접수시분

    @Column(name = "rcp_seqno")
    private BigDecimal rcpSeqno; //--접수순번

}

