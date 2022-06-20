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
@Table(name="aud_rtx_ldg") //--영수증원장
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRtxLdg>findByRtxKndcdAndRtxSsYrAndRtxBkno(String rtxKndcd, String rtxSsYr, String rtxBkno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRtxLdgPK.class)
public class AudRtxLdg {
    @Id //  String
    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Id //  String
    @Column(name = "rtx_ss_yr", nullable = false)
    private String rtxSsYr; //--영수증발행년도

    @Id //  String
    @Column(name = "rtx_bkno", nullable = false)
    private String rtxBkno; //--영수증책번호

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

    @Column(name = "adm_org_rcdt", nullable = true)
    private Date admOrgRcdt; //--관리기관수령일자

    @Column(name = "dh_br_orgcd", nullable = true)
    private String dhBrOrgcd; //--취급지점기관코드

    @Column(name = "dh_br_mfgdt", nullable = true)
    private Date dhBrMfgdt; //--취급지점출고일자

    @Column(name = "dh_br_rcdt", nullable = true)
    private Date dhBrRcdt; //--취급지점수령일자

    @Column(name = "dhgnc_orgcd", nullable = true)
    private String dhgncOrgcd; //--취급소기관코드

    @Column(name = "dhgnc_mfgdt", nullable = true)
    private Date dhgncMfgdt; //--취급소출고일자

    @Column(name = "dhgnc_rcdt", nullable = true)
    private Date dhgncRcdt; //--취급소수령일자

    @Column(name = "dh_stfno", nullable = true)
    private String dhStfno; //--취급직원번호

    @Column(name = "rtx_dh_br_orgcd", nullable = true)
    private String rtxDhBrOrgcd; //--영수증취급지점기관코드

    @Column(name = "rtx_dh_br_mfgdt", nullable = true)
    private Date rtxDhBrMfgdt; //--영수증취급지점출고일자

    @Column(name = "rtx_dh_br_rcdt", nullable = true)
    private Date rtxDhBrRcdt; //--영수증취급지점수령일자

    @Column(name = "rtx_dhtrb_orgcd", nullable = true)
    private String rtxDhtrbOrgcd; //--영수증취급점기관코드

    @Column(name = "rtx_dhtrb_mfgdt", nullable = true)
    private Date rtxDhtrbMfgdt; //--영수증취급점출고일자

    @Column(name = "rtx_dhtrb_rcdt", nullable = true)
    private Date rtxDhtrbRcdt; //--영수증취급점수령일자

    @Column(name = "rtx_dh_stfno", nullable = true)
    private String rtxDhStfno; //--영수증취급직원번호

    @Column(name = "rtx_st_flgcd", nullable = true)
    private String rtxStFlgcd; //--영수증상태구분코드

    @Column(name = "rtx_st_flgdt", nullable = true)
    private Date rtxStFlgdt; //--영수증상태구분일자

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

    @Column(name = "us_strdt", nullable = true)
    private Date usStrdt; //--사용시작일자

    @Column(name = "us_nddt", nullable = true)
    private Date usNddt; //--사용종료일자

    @Column(name = "no1_rtx_stcd", nullable = true)
    private String no1RtxStcd; //--1번영수증상태코드

    @Column(name = "no1_rtx_nrv_yn", nullable = true)
    private String no1RtxNrvYn; //--1번영수증미수납여부

    @Column(name = "no2_rtx_stcd", nullable = true)
    private String no2RtxStcd; //--2번영수증상태코드

    @Column(name = "no2_rtx_nrv_yn", nullable = true)
    private String no2RtxNrvYn; //--2번영수증미수납여부

    @Column(name = "no3_rtx_stcd", nullable = true)
    private String no3RtxStcd; //--3번영수증상태코드

    @Column(name = "no3_rtx_nrv_yn", nullable = true)
    private String no3RtxNrvYn; //--3번영수증미수납여부

    @Column(name = "no4_rtx_stcd", nullable = true)
    private String no4RtxStcd; //--4번영수증상태코드

    @Column(name = "no4_rtx_nrv_yn", nullable = true)
    private String no4RtxNrvYn; //--4번영수증미수납여부

    @Column(name = "no5_rtx_stcd", nullable = true)
    private String no5RtxStcd; //--5번영수증상태코드

    @Column(name = "no5_rtx_nrv_yn", nullable = true)
    private String no5RtxNrvYn; //--5번영수증미수납여부

    @Column(name = "no6_rtx_stcd", nullable = true)
    private String no6RtxStcd; //--6번영수증상태코드

    @Column(name = "no6_rtx_nrv_yn", nullable = true)
    private String no6RtxNrvYn; //--6번영수증미수납여부

    @Column(name = "no7_rtx_stcd", nullable = true)
    private String no7RtxStcd; //--7번영수증상태코드

    @Column(name = "no7_rtx_nrv_yn", nullable = true)
    private String no7RtxNrvYn; //--7번영수증미수납여부

    @Column(name = "no8_rtx_stcd", nullable = true)
    private String no8RtxStcd; //--8번영수증상태코드

    @Column(name = "no8_rtx_nrv_yn", nullable = true)
    private String no8RtxNrvYn; //--8번영수증미수납여부

    @Column(name = "no9_rtx_stcd", nullable = true)
    private String no9RtxStcd; //--9번영수증상태코드

    @Column(name = "no9_rtx_nrv_yn", nullable = true)
    private String no9RtxNrvYn; //--9번영수증미수납여부

    @Column(name = "no10_rtx_stcd", nullable = true)
    private String no10RtxStcd; //--10번영수증상태코드

    @Column(name = "no10_rtx_nrv_yn", nullable = true)
    private String no10RtxNrvYn; //--10번영수증미수납여부

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxLdg(String rtxKndcd, String rtxSsYr, String rtxBkno, Date rtxIsdt, String tgnrtOrgcd, Date tgnrtOrgMfgdt, Date tgnrtOrgRcdt, String admOrgcd, Date admOrgMfgdt, Date admOrgRcdt, String dhBrOrgcd, Date dhBrMfgdt, Date dhBrRcdt, String dhgncOrgcd, Date dhgncMfgdt, Date dhgncRcdt, String dhStfno, String rtxDhBrOrgcd, Date rtxDhBrMfgdt, Date rtxDhBrRcdt, String rtxDhtrbOrgcd, Date rtxDhtrbMfgdt, Date rtxDhtrbRcdt, String rtxDhStfno, String rtxStFlgcd, Date rtxStFlgdt, String rtnBfRtxStFlgcd, Date rtnBfRtxStFlgdt, Date rtndt, String rtnRgtStfno, Date reRtndt, String rrtnRgtStfno, String rtnAryn, Date rtnApdt, String rtnApRgtStfno, String rrtnAryn, Date rrtnApdt, String rrtnApRgtStfno, String rtrsCn, Date rtdt, String rtRgtStfno, Date usStrdt, Date usNddt, String no1RtxStcd, String no1RtxNrvYn, String no2RtxStcd, String no2RtxNrvYn, String no3RtxStcd, String no3RtxNrvYn, String no4RtxStcd, String no4RtxNrvYn, String no5RtxStcd, String no5RtxNrvYn, String no6RtxStcd, String no6RtxNrvYn, String no7RtxStcd, String no7RtxNrvYn, String no8RtxStcd, String no8RtxNrvYn, String no9RtxStcd, String no9RtxNrvYn, String no10RtxStcd, String no10RtxNrvYn, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rtxKndcd = rtxKndcd;
        this.rtxSsYr = rtxSsYr;
        this.rtxBkno = rtxBkno;
        this.rtxIsdt = rtxIsdt;
        this.tgnrtOrgcd = tgnrtOrgcd;
        this.tgnrtOrgMfgdt = tgnrtOrgMfgdt;
        this.tgnrtOrgRcdt = tgnrtOrgRcdt;
        this.admOrgcd = admOrgcd;
        this.admOrgMfgdt = admOrgMfgdt;
        this.admOrgRcdt = admOrgRcdt;
        this.dhBrOrgcd = dhBrOrgcd;
        this.dhBrMfgdt = dhBrMfgdt;
        this.dhBrRcdt = dhBrRcdt;
        this.dhgncOrgcd = dhgncOrgcd;
        this.dhgncMfgdt = dhgncMfgdt;
        this.dhgncRcdt = dhgncRcdt;
        this.dhStfno = dhStfno;
        this.rtxDhBrOrgcd = rtxDhBrOrgcd;
        this.rtxDhBrMfgdt = rtxDhBrMfgdt;
        this.rtxDhBrRcdt = rtxDhBrRcdt;
        this.rtxDhtrbOrgcd = rtxDhtrbOrgcd;
        this.rtxDhtrbMfgdt = rtxDhtrbMfgdt;
        this.rtxDhtrbRcdt = rtxDhtrbRcdt;
        this.rtxDhStfno = rtxDhStfno;
        this.rtxStFlgcd = rtxStFlgcd;
        this.rtxStFlgdt = rtxStFlgdt;
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
        this.usStrdt = usStrdt;
        this.usNddt = usNddt;
        this.no1RtxStcd = no1RtxStcd;
        this.no1RtxNrvYn = no1RtxNrvYn;
        this.no2RtxStcd = no2RtxStcd;
        this.no2RtxNrvYn = no2RtxNrvYn;
        this.no3RtxStcd = no3RtxStcd;
        this.no3RtxNrvYn = no3RtxNrvYn;
        this.no4RtxStcd = no4RtxStcd;
        this.no4RtxNrvYn = no4RtxNrvYn;
        this.no5RtxStcd = no5RtxStcd;
        this.no5RtxNrvYn = no5RtxNrvYn;
        this.no6RtxStcd = no6RtxStcd;
        this.no6RtxNrvYn = no6RtxNrvYn;
        this.no7RtxStcd = no7RtxStcd;
        this.no7RtxNrvYn = no7RtxNrvYn;
        this.no8RtxStcd = no8RtxStcd;
        this.no8RtxNrvYn = no8RtxNrvYn;
        this.no9RtxStcd = no9RtxStcd;
        this.no9RtxNrvYn = no9RtxNrvYn;
        this.no10RtxStcd = no10RtxStcd;
        this.no10RtxNrvYn = no10RtxNrvYn;
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

