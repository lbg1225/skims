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
import javax.validation.constraints.Size;
import javax.persistence.IdClass;
// import org.springframework.beans.BeanUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;

@Entity
@Table(name="aud_rtx_cmpu_apldo_ldg") //--영수증전산청약서원장
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRtxCmpuApldoLdg>findByRtxKndcdAndRtxSsYrAndRtxBkSno(String rtxKndcd, String rtxSsYr, String rtxBkSno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRtxCmpuApldoLdgPK.class)
public class AudRtxCmpuApldoLdg {
    @Id //  String
    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Id //  String
    @Column(name = "rtx_ss_yr", nullable = false)
    private String rtxSsYr; //--영수증발행년도

    @Id //  String
    @Column(name = "rtx_bk_sno", nullable = false)
    private String rtxBkSno; //--영수증책일련번호

    @Column(name = "rtx_isdt", nullable = true)
    private Date rtxIsdt; //--영수증발급일자

    @Column(name = "tgnrt_orgcd", nullable = true)
    private String tgnrtOrgcd; //--총괄기관코드

    @Column(name = "tgnrt_org_mfgdt", nullable = true)
    private Date tgnrtOrgMfgdt; //--총괄기관출고일자

    @Column(name = "tgnrt_org_rcdt", nullable = true)
    private Date tgnrtOrgRcdt; //--총괄기관수령일자

    @Column(name = "adm_orgcd", nullable = true)
    private String admOrgcd; //--관리기관코드

    @Column(name = "adm_org_mfgdt", nullable = true)
    private Date admOrgMfgdt; //--관리기관출고일자

    @Column(name = "adm_org_mfg_stfno", nullable = true)
    private String admOrgMfgStfno; //--관리기관출고직원번호

    @Column(name = "adm_org_rcdt", nullable = true)
    private Date admOrgRcdt; //--관리기관수령일자

    @Column(name = "dh_br_orgcd", nullable = true)
    private String dhBrOrgcd; //--취급지점기관코드

    @Column(name = "dh_br_mfgdt", nullable = true)
    private Date dhBrMfgdt; //--취급지점출고일자

    @Column(name = "dh_br_rcdt", nullable = true)
    private Date dhBrRcdt; //--취급지점수령일자

    @Column(name = "adm_br_rc_stfno", nullable = true)
    private String admBrRcStfno; //--관리지점수령직원번호

    @Column(name = "dhgnc_orgcd", nullable = true)
    private String dhgncOrgcd; //--취급소기관코드

    @Column(name = "dhgnc_mfgdt", nullable = true)
    private Date dhgncMfgdt; //--취급소출고일자

    @Column(name = "dhgnc_rcdt", nullable = true)
    private Date dhgncRcdt; //--취급소수령일자

    @Column(name = "rtx_st_flgcd", nullable = true)
    private String rtxStFlgcd; //--영수증상태구분코드

    @Column(name = "rtx_st_flgdt", nullable = true)
    private Date rtxStFlgdt; //--영수증상태구분일자

    @Column(name = "rc_yn", nullable = true)
    private String rcYn; //--수령여부

    @Column(name = "rtn_bf_rtx_st_flgcd", nullable = true)
    private String rtnBfRtxStFlgcd; //--반납전영수증상태구분코드

    @Column(name = "rtn_bf_rtx_st_flgdt", nullable = true)
    private Date rtnBfRtxStFlgdt; //--반납전영수증상태구분일자

    @Column(name = "rtndt", nullable = true)
    private Date rtndt; //--반납일자

    @Column(name = "rtn_rgt_stfno", nullable = true)
    private String rtnRgtStfno; //--반납등록직원번호

    @Column(name = "re_rtndt", nullable = true)
    private Date reRtndt; //--재반납일자

    @Column(name = "rrtn_rgt_stfno", nullable = true)
    private String rrtnRgtStfno; //--재반납등록직원번호

    @Column(name = "rtn_aryn", nullable = true)
    private String rtnAryn; //--반납승인여부

    @Column(name = "rtn_apdt", nullable = true)
    private Date rtnApdt; //--반납승인일자

    @Column(name = "rtn_ap_rgt_stfno", nullable = true)
    private String rtnApRgtStfno; //--반납승인등록직원번호

    @Column(name = "rrtn_aryn", nullable = true)
    private String rrtnAryn; //--재반납승인여부

    @Column(name = "rrtn_apdt", nullable = true)
    private Date rrtnApdt; //--재반납승인일자

    @Column(name = "rrtn_ap_rgt_stfno", nullable = true)
    private String rrtnApRgtStfno; //--재반납승인등록직원번호

    @Column(name = "rtrs_cn", nullable = true)
    private String rtrsCn; //--반송사유내용

    @Column(name = "rtdt", nullable = true)
    private Date rtdt; //--반송일자

    @Column(name = "rt_rgt_stfno", nullable = true)
    private String rtRgtStfno; //--반송등록직원번호

    @Column(name = "crrnm", nullable = true)
    private String crrnm; //--계약자명

    @Column(name = "rpdt", nullable = true)
    private Date rpdt; //--영수일자

    @Column(name = "rvdt", nullable = true)
    private Date rvdt; //--수납일자

    @Column(name = "prm", nullable = true)
    private BigDecimal prm; //--보험료

    @Column(name = "pym_seq", nullable = true)
    private BigDecimal pymSeq; //--납입회차

    @Column(name = "pym_yymm", nullable = true)
    private String pymYymm; //--납입년월

    @Column(name = "grcdt", nullable = true)
    private Date grcdt; //--유예일자

    @Column(name = "rtx_plyno", nullable = true)
    private String rtxPlyno; //--영수증증권번호

    @Column(name = "rtx_plyno_dgre", nullable = true)
    private String rtxPlynoDgre; //--영수증증권번호차수

    @Column(name = "rs_bzmno", nullable = true)
    private String rsBzmno; //--주민사업자번호

    @Column(name = "ins_strdt", nullable = true)
    private Date insStrdt; //--보험시작일자

    @Column(name = "ins_nddt", nullable = true)
    private Date insNddt; //--보험종료일자

    @Column(name = "ins_imcd", nullable = true)
    private String insImcd; //--보험종목코드

    @Column(name = "crtdt", nullable = true)
    private Date crtdt; //--생성일자

    @Column(name = "orgcr_yr", nullable = true)
    private String orgcrYr; //--원계약년도

    @Column(name = "orgcr_ins_endt", nullable = true)
    private Date orgcrInsEndt; //--원계약보험만기일자

    @Column(name = "orgcr_pym_dudt", nullable = true)
    private Date orgcrPymDudt; //--원계약납입응당일자

    @Column(name = "orgcr_prm", nullable = true)
    private BigDecimal orgcrPrm; //--원계약보험료

    @Column(name = "org_crrnm", nullable = true)
    private String orgCrrnm; //--원계약자명

    @Column(name = "orgcr_tlno", nullable = true)
    private String orgcrTlno; //--원계약전화번호

    @Column(name = "orgcr_pstno", nullable = true)
    private String orgcrPstno; //--원계약우편번호

    @Column(name = "orgcr_adr", nullable = true)
    private String orgcrAdr; //--원계약주소

    @Column(name = "dh_stfno", nullable = true)
    private String dhStfno; //--취급직원번호

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxCmpuApldoLdg(String rtxKndcd, String rtxSsYr, String rtxBkSno, Date rtxIsdt, String tgnrtOrgcd, Date tgnrtOrgMfgdt, Date tgnrtOrgRcdt, String admOrgcd, Date admOrgMfgdt, String admOrgMfgStfno, Date admOrgRcdt, String dhBrOrgcd, Date dhBrMfgdt, Date dhBrRcdt, String admBrRcStfno, String dhgncOrgcd, Date dhgncMfgdt, Date dhgncRcdt, String rtxStFlgcd, Date rtxStFlgdt, String rcYn, String rtnBfRtxStFlgcd, Date rtnBfRtxStFlgdt, Date rtndt, String rtnRgtStfno, Date reRtndt, String rrtnRgtStfno, String rtnAryn, Date rtnApdt, String rtnApRgtStfno, String rrtnAryn, Date rrtnApdt, String rrtnApRgtStfno, String rtrsCn, Date rtdt, String rtRgtStfno, String crrnm, Date rpdt, Date rvdt, BigDecimal prm, BigDecimal pymSeq, String pymYymm, Date grcdt, String rtxPlyno, String rtxPlynoDgre, String rsBzmno, Date insStrdt, Date insNddt, String insImcd, Date crtdt, String orgcrYr, Date orgcrInsEndt, Date orgcrPymDudt, BigDecimal orgcrPrm, String orgCrrnm, String orgcrTlno, String orgcrPstno, String orgcrAdr, String dhStfno, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rtxKndcd = rtxKndcd;
        this.rtxSsYr = rtxSsYr;
        this.rtxBkSno = rtxBkSno;
        this.rtxIsdt = rtxIsdt;
        this.tgnrtOrgcd = tgnrtOrgcd;
        this.tgnrtOrgMfgdt = tgnrtOrgMfgdt;
        this.tgnrtOrgRcdt = tgnrtOrgRcdt;
        this.admOrgcd = admOrgcd;
        this.admOrgMfgdt = admOrgMfgdt;
        this.admOrgMfgStfno = admOrgMfgStfno;
        this.admOrgRcdt = admOrgRcdt;
        this.dhBrOrgcd = dhBrOrgcd;
        this.dhBrMfgdt = dhBrMfgdt;
        this.dhBrRcdt = dhBrRcdt;
        this.admBrRcStfno = admBrRcStfno;
        this.dhgncOrgcd = dhgncOrgcd;
        this.dhgncMfgdt = dhgncMfgdt;
        this.dhgncRcdt = dhgncRcdt;
        this.rtxStFlgcd = rtxStFlgcd;
        this.rtxStFlgdt = rtxStFlgdt;
        this.rcYn = rcYn;
        this.rtnBfRtxStFlgcd = rtnBfRtxStFlgcd;
        this.rtnBfRtxStFlgdt = rtnBfRtxStFlgdt;
        this.rtndt = rtndt;
        this.rtnRgtStfno = rtnRgtStfno;
        this.reRtndt = reRtndt;
        this.rrtnRgtStfno = rrtnRgtStfno;
        this.rtnAryn = rtnAryn;
        this.rtnApdt = rtnApdt;
        this.rtnApRgtStfno = rtnApRgtStfno;
        this.rrtnAryn = rrtnAryn;
        this.rrtnApdt = rrtnApdt;
        this.rrtnApRgtStfno = rrtnApRgtStfno;
        this.rtrsCn = rtrsCn;
        this.rtdt = rtdt;
        this.rtRgtStfno = rtRgtStfno;
        this.crrnm = crrnm;
        this.rpdt = rpdt;
        this.rvdt = rvdt;
        this.prm = prm;
        this.pymSeq = pymSeq;
        this.pymYymm = pymYymm;
        this.grcdt = grcdt;
        this.rtxPlyno = rtxPlyno;
        this.rtxPlynoDgre = rtxPlynoDgre;
        this.rsBzmno = rsBzmno;
        this.insStrdt = insStrdt;
        this.insNddt = insNddt;
        this.insImcd = insImcd;
        this.crtdt = crtdt;
        this.orgcrYr = orgcrYr;
        this.orgcrInsEndt = orgcrInsEndt;
        this.orgcrPymDudt = orgcrPymDudt;
        this.orgcrPrm = orgcrPrm;
        this.orgCrrnm = orgCrrnm;
        this.orgcrTlno = orgcrTlno;
        this.orgcrPstno = orgcrPstno;
        this.orgcrAdr = orgcrAdr;
        this.dhStfno = dhStfno;
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

