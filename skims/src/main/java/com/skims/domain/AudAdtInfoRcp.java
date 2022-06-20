/** 
* AudAdtInfoRcp Entity 클래스 

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
@Table(name="aud_adt_info_rcp") //--감사정보접수
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudAdtInfoRcp>findByRcpdtAndRcpHhmmAndRcpSeqno(Date rcpdt, String rcpHhmm, BigDecimal rcpSeqno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudAdtInfoRcpPK.class)
public class AudAdtInfoRcp {
    @Id //  Date
    @Column(name = "rcpdt", nullable = false)
    private Date rcpdt; //--접수일자

    @Id //  String
    @Column(name = "rcp_hhmm", nullable = false)
    private String rcpHhmm; //--접수시분

    @Id //  BigDecimal
    @Column(name = "rcp_seqno", nullable = false)
    private BigDecimal rcpSeqno; //--접수순번

    @Column(name = "adt_bsns_dsccd", nullable = true)
    private String adtBsnsDsccd; //--감사업무식별코드

    @Column(name = "adt_stfno", nullable = true)
    private String adtStfno; //--감사직원번호

    @Column(name = "plyno", nullable = true)
    private String plyno; //--증권번호

    @Column(name = "ctm_rsno", nullable = true)
    private String ctmRsno; //--고객주민번호

    @Column(name = "dh_stfno", nullable = true)
    private String dhStfno; //--취급직원번호

    @Column(name = "bjamt", nullable = true)
    private BigDecimal bjamt; //--대상금액

    @Column(name = "impdg_poct", nullable = true)
    private BigDecimal impdgPoct; //--중요도점수

    @Column(name = "adt_rcp_link_flgcd", nullable = true)
    private String adtRcpLinkFlgcd; //--감사접수연결구분코드

    @Column(name = "link_kyvl", nullable = true)
    private String linkKyvl; //--연결키값

    @Column(name = "cr_stfno", nullable = true)
    private String crStfno; //--발생직원번호

    @Column(name = "cr_spc", nullable = true)
    private String crSpc; //--발생내역

    @Column(name = "sms_snd_yn", nullable = true)
    private String smsSndYn; //--sms발송여부

    @Column(name = "adt_info_dlst_flgcd", nullable = true)
    private String adtInfoDlstFlgcd; //--감사정보처리상태구분코드

    @Column(name = "dl_cn", nullable = true)
    private String dlCn; //--처리내용

    @Column(name = "dldt", nullable = true)
    private Date dldt; //--처리일자

    @Column(name = "dl_hhmm", nullable = true)
    private String dlHhmm; //--처리시분

    @Column(name = "bsns_1_chr_stfno", nullable = true)
    private String bsns1ChrStfno; //--업무1담당직원번호

    @Column(name = "bsns_2_chr_stfno", nullable = true)
    private String bsns2ChrStfno; //--업무2담당직원번호

    @Column(name = "bsns_3_chr_stfno", nullable = true)
    private String bsns3ChrStfno; //--업무3담당직원번호

    @Column(name = "bsns_4_chr_stfno", nullable = true)
    private String bsns4ChrStfno; //--업무4담당직원번호

    @Column(name = "wst_yn", nullable = true)
    private String wstYn; //--폐기여부

    @Column(name = "adt_info_pout_mtt_flgcd", nullable = true)
    private String adtInfoPoutMttFlgcd; //--감사정보특이사항구분코드

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudAdtInfoRcp(Date rcpdt, String rcpHhmm, BigDecimal rcpSeqno, String adtBsnsDsccd, String adtStfno, String plyno, String ctmRsno, String dhStfno, BigDecimal bjamt, BigDecimal impdgPoct, String adtRcpLinkFlgcd, String linkKyvl, String crStfno, String crSpc, String smsSndYn, String adtInfoDlstFlgcd, String dlCn, Date dldt, String dlHhmm, String bsns1ChrStfno, String bsns2ChrStfno, String bsns3ChrStfno, String bsns4ChrStfno, String wstYn, String adtInfoPoutMttFlgcd, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rcpdt = rcpdt;
        this.rcpHhmm = rcpHhmm;
        this.rcpSeqno = rcpSeqno;
        this.adtBsnsDsccd = adtBsnsDsccd;
        this.adtStfno = adtStfno;
        this.plyno = plyno;
        this.ctmRsno = ctmRsno;
        this.dhStfno = dhStfno;
        this.bjamt = bjamt;
        this.impdgPoct = impdgPoct;
        this.adtRcpLinkFlgcd = adtRcpLinkFlgcd;
        this.linkKyvl = linkKyvl;
        this.crStfno = crStfno;
        this.crSpc = crSpc;
        this.smsSndYn = smsSndYn;
        this.adtInfoDlstFlgcd = adtInfoDlstFlgcd;
        this.dlCn = dlCn;
        this.dldt = dldt;
        this.dlHhmm = dlHhmm;
        this.bsns1ChrStfno = bsns1ChrStfno;
        this.bsns2ChrStfno = bsns2ChrStfno;
        this.bsns3ChrStfno = bsns3ChrStfno;
        this.bsns4ChrStfno = bsns4ChrStfno;
        this.wstYn = wstYn;
        this.adtInfoPoutMttFlgcd = adtInfoPoutMttFlgcd;
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

