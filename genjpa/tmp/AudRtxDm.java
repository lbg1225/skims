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
@Table(name="aud_rtx_dm") //--영수증청구
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRtxDm>findByRtxDmOrgFlgcdAndRtxDmOrgcdAndRtxMfgOrgFlgcdAndRtxMfgOrgcdAndRtxKndcdAndRtxDmdtAndRtxDmSeqno(String rtxDmOrgFlgcd, String rtxDmOrgcd, String rtxMfgOrgFlgcd, String rtxMfgOrgcd, String rtxKndcd, Date rtxDmdt, BigDecimal rtxDmSeqno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRtxDmPK.class)
public class AudRtxDm {
    @Id //  String
    @Column(name = "rtx_dm_org_flgcd", nullable = false)
    private String rtxDmOrgFlgcd; //--영수증청구기관구분코드

    @Id //  String
    @Column(name = "rtx_dm_orgcd", nullable = false)
    private String rtxDmOrgcd; //--영수증청구기관코드

    @Id //  String
    @Column(name = "rtx_mfg_org_flgcd", nullable = false)
    private String rtxMfgOrgFlgcd; //--영수증출고기관구분코드

    @Id //  String
    @Column(name = "rtx_mfg_orgcd", nullable = false)
    private String rtxMfgOrgcd; //--영수증출고기관코드

    @Id //  String
    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Id //  Date
    @Column(name = "rtx_dmdt", nullable = false)
    private Date rtxDmdt; //--영수증청구일자

    @Id //  BigDecimal
    @Column(name = "rtx_dm_seqno", nullable = false)
    private BigDecimal rtxDmSeqno; //--영수증청구순번

    @Column(name = "rtx_rc_reqdt", nullable = true)
    private Date rtxRcReqdt; //--영수증수령요청일자

    @Column(name = "rtx_dm_qant", nullable = true)
    private BigDecimal rtxDmQant; //--영수증청구수량

    @Column(name = "rtx_ap_qant", nullable = true)
    private BigDecimal rtxApQant; //--영수증승인수량

    @Column(name = "rtx_mfg_yn", nullable = true)
    private String rtxMfgYn; //--영수증출고여부

    @Column(name = "rtx_mfgdt", nullable = true)
    private Date rtxMfgdt; //--영수증출고일자

    @Column(name = "dh_stfno", nullable = true)
    private String dhStfno; //--취급직원번호

    @Column(name = "rtx_ss_yr", nullable = true)
    private String rtxSsYr; //--영수증발행년도

    @Column(name = "rtx_bkno", nullable = true)
    private String rtxBkno; //--영수증책번호

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxDm(String rtxDmOrgFlgcd, String rtxDmOrgcd, String rtxMfgOrgFlgcd, String rtxMfgOrgcd, String rtxKndcd, Date rtxDmdt, BigDecimal rtxDmSeqno, Date rtxRcReqdt, BigDecimal rtxDmQant, BigDecimal rtxApQant, String rtxMfgYn, Date rtxMfgdt, String dhStfno, String rtxSsYr, String rtxBkno, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rtxDmOrgFlgcd = rtxDmOrgFlgcd;
        this.rtxDmOrgcd = rtxDmOrgcd;
        this.rtxMfgOrgFlgcd = rtxMfgOrgFlgcd;
        this.rtxMfgOrgcd = rtxMfgOrgcd;
        this.rtxKndcd = rtxKndcd;
        this.rtxDmdt = rtxDmdt;
        this.rtxDmSeqno = rtxDmSeqno;
        this.rtxRcReqdt = rtxRcReqdt;
        this.rtxDmQant = rtxDmQant;
        this.rtxApQant = rtxApQant;
        this.rtxMfgYn = rtxMfgYn;
        this.rtxMfgdt = rtxMfgdt;
        this.dhStfno = dhStfno;
        this.rtxSsYr = rtxSsYr;
        this.rtxBkno = rtxBkno;
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

