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
@Table(name="aud_rtx_lss_info") //--영수증분실정보
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRtxLssInfo>findByRtxKndcdAndRtxSsYrAndRtxBkSno(String rtxKndcd, String rtxSsYr, String rtxBkSno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRtxLssInfoPK.class)
public class AudRtxLssInfo {
    @Id //  String
    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Id //  String
    @Column(name = "rtx_ss_yr", nullable = false)
    private String rtxSsYr; //--영수증발행년도

    @Id //  String
    @Column(name = "rtx_bk_sno", nullable = false)
    private String rtxBkSno; //--영수증책일련번호

    @Column(name = "rtx_tp_flgcd", nullable = true)
    private String rtxTpFlgcd; //--영수증유형구분코드

    @Column(name = "rtx_lss_knd_flgcd", nullable = true)
    private String rtxLssKndFlgcd; //--영수증분실종류구분코드

    @Column(name = "rtx_mfg_orgcd", nullable = true)
    private String rtxMfgOrgcd; //--영수증출고기관코드

    @Column(name = "rc_orgcd", nullable = true)
    private String rcOrgcd; //--수령기관코드

    @Column(name = "rc_dhgnc_orgcd", nullable = true)
    private String rcDhgncOrgcd; //--수령취급소기관코드

    @Column(name = "rc_dh_stfno", nullable = true)
    private String rcDhStfno; //--수령취급직원번호

    @Column(name = "lssdt", nullable = true)
    private Date lssdt; //--분실일자

    @Column(name = "rtx_lss_flgcd", nullable = true)
    private String rtxLssFlgcd; //--영수증분실구분코드

    @Column(name = "rtx_lss_inp_flgcd", nullable = true)
    private String rtxLssInpFlgcd; //--영수증분실입력구분코드

    @Column(name = "rtx_lss_dl_flgcd", nullable = true)
    private String rtxLssDlFlgcd; //--영수증분실처리구분코드

    @Column(name = "rtx_lss_ry_flgcd", nullable = true)
    private String rtxLssRyFlgcd; //--영수증분실회수구분코드

    @Column(name = "lss_rs", nullable = true)
    private String lssRs; //--분실사유

    @Column(name = "lss_ntcdt", nullable = true)
    private Date lssNtcdt; //--분실공고일자

    @Column(name = "ntc_entnm", nullable = true)
    private String ntcEntnm; //--공고업체명

    @Column(name = "iptdt", nullable = true)
    private Date iptdt; //--입력일자

    @Column(name = "inp_hms", nullable = true)
    private String inpHms; //--입력시간

    @Column(name = "rgt_stfno", nullable = true)
    private String rgtStfno; //--등록직원번호

    @Column(name = "prm", nullable = true)
    private BigDecimal prm; //--보험료

    @Column(name = "ins_strdt", nullable = true)
    private Date insStrdt; //--보험시작일자

    @Column(name = "ins_nddt", nullable = true)
    private Date insNddt; //--보험종료일자

    @Column(name = "rpdt", nullable = true)
    private Date rpdt; //--영수일자

    @Column(name = "crrnm", nullable = true)
    private String crrnm; //--계약자명

    @Column(name = "tlano", nullable = true)
    private String tlano; //--전화지역번호

    @Column(name = "tltno", nullable = true)
    private String tltno; //--전화국번

    @Column(name = "tlsno", nullable = true)
    private String tlsno; //--전화일련번호

    @Column(name = "rpub_rtxno", nullable = true)
    private String rpubRtxno; //--재발행영수증번호

    @Column(name = "rprm", nullable = true)
    private BigDecimal rprm; //--재보험료

    @Column(name = "rins_strdt", nullable = true)
    private Date rinsStrdt; //--재보험시작일자

    @Column(name = "rins_nddt", nullable = true)
    private Date rinsNddt; //--재보험종료일자

    @Column(name = "rins_rpdt", nullable = true)
    private Date rinsRpdt; //--재보험영수일자

    @Column(name = "re_crrnm", nullable = true)
    private String reCrrnm; //--재계약자명

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxLssInfo(String rtxKndcd, String rtxSsYr, String rtxBkSno, String rtxTpFlgcd, String rtxLssKndFlgcd, String rtxMfgOrgcd, String rcOrgcd, String rcDhgncOrgcd, String rcDhStfno, Date lssdt, String rtxLssFlgcd, String rtxLssInpFlgcd, String rtxLssDlFlgcd, String rtxLssRyFlgcd, String lssRs, Date lssNtcdt, String ntcEntnm, Date iptdt, String inpHms, String rgtStfno, BigDecimal prm, Date insStrdt, Date insNddt, Date rpdt, String crrnm, String tlano, String tltno, String tlsno, String rpubRtxno, BigDecimal rprm, Date rinsStrdt, Date rinsNddt, Date rinsRpdt, String reCrrnm, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rtxKndcd = rtxKndcd;
        this.rtxSsYr = rtxSsYr;
        this.rtxBkSno = rtxBkSno;
        this.rtxTpFlgcd = rtxTpFlgcd;
        this.rtxLssKndFlgcd = rtxLssKndFlgcd;
        this.rtxMfgOrgcd = rtxMfgOrgcd;
        this.rcOrgcd = rcOrgcd;
        this.rcDhgncOrgcd = rcDhgncOrgcd;
        this.rcDhStfno = rcDhStfno;
        this.lssdt = lssdt;
        this.rtxLssFlgcd = rtxLssFlgcd;
        this.rtxLssInpFlgcd = rtxLssInpFlgcd;
        this.rtxLssDlFlgcd = rtxLssDlFlgcd;
        this.rtxLssRyFlgcd = rtxLssRyFlgcd;
        this.lssRs = lssRs;
        this.lssNtcdt = lssNtcdt;
        this.ntcEntnm = ntcEntnm;
        this.iptdt = iptdt;
        this.inpHms = inpHms;
        this.rgtStfno = rgtStfno;
        this.prm = prm;
        this.insStrdt = insStrdt;
        this.insNddt = insNddt;
        this.rpdt = rpdt;
        this.crrnm = crrnm;
        this.tlano = tlano;
        this.tltno = tltno;
        this.tlsno = tlsno;
        this.rpubRtxno = rpubRtxno;
        this.rprm = rprm;
        this.rinsStrdt = rinsStrdt;
        this.rinsNddt = rinsNddt;
        this.rinsRpdt = rinsRpdt;
        this.reCrrnm = reCrrnm;
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

