/** 
* AudAdtKnwlAdm Entity Id 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
*/
package com.skims.domain;
import java.math.BigDecimal;
import javax.persistence.Column;
import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_adt_knwl_adm //--감사지식관리 Primary Key
public class AudAdtKnwlAdmPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "adt_knwl_bsns_flgcd", length = 10, nullable = false)
    private String adtKnwlBsnsFlgcd; //--감사지식업무구분코드

    @Column(name = "adt_knwl_mdccd", length = 10, nullable = false)
    private String adtKnwlMdccd; //--감사지식중분류코드

    @Column(name = "seqno", precision = 5, scale = 0, nullable = false)
    private BigDecimal seqno; //--순번

}

