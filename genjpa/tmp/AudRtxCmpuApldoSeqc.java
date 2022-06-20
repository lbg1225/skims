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
@Table(name="aud_rtx_cmpu_apldo_seqc") //--영수증전산청약서채번
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRtxCmpuApldoSeqc>findByRtxKndcdAndRtxSsYrAndRtxBkSno(String rtxKndcd, String rtxSsYr, String rtxBkSno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRtxCmpuApldoSeqcPK.class)
public class AudRtxCmpuApldoSeqc {
    @Id //  String
    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Id //  String
    @Column(name = "rtx_ss_yr", nullable = false)
    private String rtxSsYr; //--영수증발행년도

    @Id //  String
    @Column(name = "rtx_bk_sno", nullable = false)
    private String rtxBkSno; //--영수증책일련번호

    @Column(name = "ss_ct", nullable = true)
    private BigDecimal ssCt; //--발행횟수

    @Column(name = "plyno", nullable = true)
    private String plyno; //--증권번호

    @Column(name = "crrnm", nullable = true)
    private String crrnm; //--계약자명

    @Column(name = "prm", nullable = true)
    private BigDecimal prm; //--보험료

    @Column(name = "adm_br_orgcd", nullable = true)
    private String admBrOrgcd; //--관리지점기관코드

    @Column(name = "dh_br_orgcd", nullable = true)
    private String dhBrOrgcd; //--취급지점기관코드

    @Column(name = "dh_stfno", nullable = true)
    private String dhStfno; //--취급직원번호

    @Column(name = "o1_seqc_dt", nullable = true)
    private Date o1SeqcDt; //--1차채번일자

    @Column(name = "o1_seqc_hms", nullable = true)
    private String o1SeqcHms; //--1차채번시간

    @Column(name = "o1_ss_stfno", nullable = true)
    private String o1SsStfno; //--1차발행직원번호

    @Column(name = "o2_seqc_dt", nullable = true)
    private Date o2SeqcDt; //--2차채번일자

    @Column(name = "o2_seqc_hms", nullable = true)
    private String o2SeqcHms; //--2차채번시간

    @Column(name = "o2_ss_stfno", nullable = true)
    private String o2SsStfno; //--2차발행직원번호

    @Column(name = "o3_seqc_dt", nullable = true)
    private Date o3SeqcDt; //--3차채번일자

    @Column(name = "o3_seqc_hms", nullable = true)
    private String o3SeqcHms; //--3차채번시간

    @Column(name = "o3_ss_stfno", nullable = true)
    private String o3SsStfno; //--3차발행직원번호

    @Column(name = "rtx_mfg_yn", nullable = true)
    private String rtxMfgYn; //--영수증출고여부

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxCmpuApldoSeqc(String rtxKndcd, String rtxSsYr, String rtxBkSno, BigDecimal ssCt, String plyno, String crrnm, BigDecimal prm, String admBrOrgcd, String dhBrOrgcd, String dhStfno, Date o1SeqcDt, String o1SeqcHms, String o1SsStfno, Date o2SeqcDt, String o2SeqcHms, String o2SsStfno, Date o3SeqcDt, String o3SeqcHms, String o3SsStfno, String rtxMfgYn, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rtxKndcd = rtxKndcd;
        this.rtxSsYr = rtxSsYr;
        this.rtxBkSno = rtxBkSno;
        this.ssCt = ssCt;
        this.plyno = plyno;
        this.crrnm = crrnm;
        this.prm = prm;
        this.admBrOrgcd = admBrOrgcd;
        this.dhBrOrgcd = dhBrOrgcd;
        this.dhStfno = dhStfno;
        this.o1SeqcDt = o1SeqcDt;
        this.o1SeqcHms = o1SeqcHms;
        this.o1SsStfno = o1SsStfno;
        this.o2SeqcDt = o2SeqcDt;
        this.o2SeqcHms = o2SeqcHms;
        this.o2SsStfno = o2SsStfno;
        this.o3SeqcDt = o3SeqcDt;
        this.o3SeqcHms = o3SeqcHms;
        this.o3SsStfno = o3SsStfno;
        this.rtxMfgYn = rtxMfgYn;
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

