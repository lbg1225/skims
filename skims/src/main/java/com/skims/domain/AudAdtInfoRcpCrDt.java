/** 
* AudAdtInfoRcpCrDt Entity 클래스 

* @author  Lee Byoung Gwan
* @version 1.0 
*/
package com.skims.domain;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PostPersist;
import javax.persistence.PreUpdate;
import javax.persistence.PostUpdate;
import javax.persistence.PreRemove;
import javax.persistence.PostRemove;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// import org.springframework.beans.BeanUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;

@Entity
@Table(name="aud_adt_info_rcp_cr_dt") //--감사정보접수발생상세
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudAdtInfoRcpCrDt {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "rcpdt", nullable = false)
    private Date rcpdt; //--접수일자

    @Column(name = "rcp_hhmm", length = 4, nullable = false)
    private String rcpHhmm; //--접수시분

    @Column(name = "rcp_seqno", precision = 5, scale = 0, nullable = false)
    private BigDecimal rcpSeqno; //--접수순번

    @Column(name = "adt_bsns_dsccd", length = 10, nullable = true)
    private String adtBsnsDsccd; //--감사업무식별코드

    @Column(name = "cr_dt_cn", length = 4000, nullable = true)
    private String crDtCn; //--발생상세내용

    @Column(name = "inp_usr_id", length = 50, nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", length = 50, nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudAdtInfoRcpCrDt(Date rcpdt, String rcpHhmm, BigDecimal rcpSeqno, String adtBsnsDsccd, String crDtCn, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rcpdt = rcpdt;
        this.rcpHhmm = rcpHhmm;
        this.rcpSeqno = rcpSeqno;
        this.adtBsnsDsccd = adtBsnsDsccd;
        this.crDtCn = crDtCn;
        this.inpUsrId = inpUsrId;
        this.inpDthms = inpDthms;
        this.mdfUsrId = mdfUsrId;
        this.mdfDthms = mdfDthms;
    }

    //----------------------------------------------------
    // Load/Persist/Update/Remove(조회/신규/수정/삭제)
    // Entity Pre/Post(이전/이후) 처리에 대한 정의(PreLoad는 없음)
    // * DB의 Trigger와 비슷한 JPA기능
    //----------------------------------------------------
    @PostLoad
    public void onPostLoad() {

    }

    @PrePersist
    public void onPrePersist() {

    }

    @PostPersist
    public void onPostPersist() {

    }

    @PreUpdate
    public void onPreUpdate() {

    }

    @PostUpdate
    public void onPostUpdate() {

    }

    @PreRemove
    public void onPreRemove() {

    }

    @PostRemove
    public void onPostRemove() {

    }

}

