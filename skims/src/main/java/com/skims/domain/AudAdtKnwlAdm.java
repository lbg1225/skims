/** 
* AudAdtKnwlAdm Entity 클래스 

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
@Table(name="aud_adt_knwl_adm") //--감사지식관리
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudAdtKnwlAdm>findByAdtKnwlBsnsFlgcdAndAdtKnwlMdccdAndSeqno(String adtKnwlBsnsFlgcd, String adtKnwlMdccd, BigDecimal seqno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudAdtKnwlAdmPK.class)
public class AudAdtKnwlAdm {
    @Id //  String
    @Column(name = "adt_knwl_bsns_flgcd", length = 10, nullable = false)
    private String adtKnwlBsnsFlgcd; //--감사지식업무구분코드

    @Id //  String
    @Column(name = "adt_knwl_mdccd", length = 10, nullable = false)
    private String adtKnwlMdccd; //--감사지식중분류코드

    @Id //  BigDecimal
    @Column(name = "seqno", precision = 5, scale = 0, nullable = false)
    private BigDecimal seqno; //--순번

    @Column(name = "itnm", length = 100, nullable = true)
    private String itnm; //--항목명

    @Column(name = "dtit_chek_nm", length = 200, nullable = true)
    private String dtitChekNm; //--세부항목체크명

    @Column(name = "rgtdt", nullable = true)
    private Date rgtdt; //--등록일자

    @Column(name = "rgt_stfno", length = 50, nullable = true)
    private String rgtStfno; //--등록직원번호

    @Column(name = "clodt", nullable = true)
    private Date clodt; //--폐쇄일자

    @Column(name = "wrt_dep_chek_vl", length = 10, nullable = true)
    private String wrtDepChekVl; //--작성부서체크값

    @Column(name = "adx_1_file_pth", length = 200, nullable = true)
    private String adx1FilePth; //--첨부1파일경로

    @Column(name = "adx_2_file_pth", length = 200, nullable = true)
    private String adx2FilePth; //--첨부2파일경로

    @Column(name = "adx_3_file_pth", length = 200, nullable = true)
    private String adx3FilePth; //--첨부3파일경로

    @Column(name = "adx_4_file_pth", length = 200, nullable = true)
    private String adx4FilePth; //--첨부4파일경로

    @Column(name = "inp_usr_id", length = 50, nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", length = 50, nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudAdtKnwlAdm(String adtKnwlBsnsFlgcd, String adtKnwlMdccd, BigDecimal seqno, String itnm, String dtitChekNm, Date rgtdt, String rgtStfno, Date clodt, String wrtDepChekVl, String adx1FilePth, String adx2FilePth, String adx3FilePth, String adx4FilePth, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtKnwlBsnsFlgcd = adtKnwlBsnsFlgcd;
        this.adtKnwlMdccd = adtKnwlMdccd;
        this.seqno = seqno;
        this.itnm = itnm;
        this.dtitChekNm = dtitChekNm;
        this.rgtdt = rgtdt;
        this.rgtStfno = rgtStfno;
        this.clodt = clodt;
        this.wrtDepChekVl = wrtDepChekVl;
        this.adx1FilePth = adx1FilePth;
        this.adx2FilePth = adx2FilePth;
        this.adx3FilePth = adx3FilePth;
        this.adx4FilePth = adx4FilePth;
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

