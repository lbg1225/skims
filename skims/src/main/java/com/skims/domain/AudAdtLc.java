/** 
* AudAdtLc Entity 클래스 

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
import javax.persistence.IdClass;
// import org.springframework.beans.BeanUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;

@Entity
@Table(name="aud_adt_lc") //--감사착수
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudAdtLc>findByAdtYrAndAdtFlgcdAndAdtno(String adtYr, String adtFlgcd, String adtno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudAdtLcPK.class)
public class AudAdtLc {
    @Id //  String
    @Column(name = "adt_yr", nullable = false)
    private String adtYr; //--감사년도

    @Id //  String
    @Column(name = "adt_flgcd", nullable = false)
    private String adtFlgcd; //--감사구분코드

    @Id //  String
    @Column(name = "adtno", nullable = false)
    private String adtno; //--감사번호

    @Column(name = "adt_knd_flgcd", nullable = true)
    private String adtKndFlgcd; //--감사종류구분코드

    @Column(name = "adt_ty_flgcd", nullable = true)
    private String adtTyFlgcd; //--감사형태구분코드

    @Column(name = "adtnm", nullable = true)
    private String adtnm; //--감사명

    @Column(name = "adt_xec_strdt", nullable = true)
    private Date adtXecStrdt; //--감사실시시작일자

    @Column(name = "adt_xec_nddt", nullable = true)
    private Date adtXecNddt; //--감사실시종료일자

    @Column(name = "adt_bj_strdt", nullable = true)
    private Date adtBjStrdt; //--감사대상시작일자

    @Column(name = "adt_bj_nddt", nullable = true)
    private Date adtBjNddt; //--감사대상종료일자

    @Column(name = "file_key", nullable = true)
    private BigDecimal fileKey; //--파일key

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudAdtLc(String adtYr, String adtFlgcd, String adtno, String adtKndFlgcd, String adtTyFlgcd, String adtnm, Date adtXecStrdt, Date adtXecNddt, Date adtBjStrdt, Date adtBjNddt, BigDecimal fileKey, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtYr = adtYr;
        this.adtFlgcd = adtFlgcd;
        this.adtno = adtno;
        this.adtKndFlgcd = adtKndFlgcd;
        this.adtTyFlgcd = adtTyFlgcd;
        this.adtnm = adtnm;
        this.adtXecStrdt = adtXecStrdt;
        this.adtXecNddt = adtXecNddt;
        this.adtBjStrdt = adtBjStrdt;
        this.adtBjNddt = adtBjNddt;
        this.fileKey = fileKey;
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

