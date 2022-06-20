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
// import org.springframework.beans.BeanUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;

@Entity
@Table(name="aud_adt_prg_spc") //--감사진행내역
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudAdtPrgSpc {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "adtdt", nullable = false)
    private Date adtdt; //--감사일자

    @Column(name = "adt_yr", nullable = false)
    private String adtYr; //--감사년도

    @Column(name = "adt_flgcd", nullable = false)
    private String adtFlgcd; //--감사구분코드

    @Column(name = "adtno", nullable = false)
    private String adtno; //--감사번호

    @Column(name = "adt_seqno", nullable = false)
    private BigDecimal adtSeqno; //--감사순번

    @Column(name = "adt_stfno", nullable = false)
    private String adtStfno; //--감사직원번호

    @Column(name = "adt_bj_orgcd", nullable = true)
    private String adtBjOrgcd; //--감사대상기관코드

    @Column(name = "adt_nv_cn", nullable = true)
    private String adtNvCn; //--감사조사내용

    @Column(name = "issu_mtt", nullable = true)
    private String issuMtt; //--문제사항

    @Column(name = "indi_mtt", nullable = true)
    private String indiMtt; //--지적사항

    @Column(name = "admr_ctn", nullable = true)
    private String admrCtn; //--부서장의견

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
    public AudAdtPrgSpc(Date adtdt, String adtYr, String adtFlgcd, String adtno, BigDecimal adtSeqno, String adtStfno, String adtBjOrgcd, String adtNvCn, String issuMtt, String indiMtt, String admrCtn, BigDecimal fileKey, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtdt = adtdt;
        this.adtYr = adtYr;
        this.adtFlgcd = adtFlgcd;
        this.adtno = adtno;
        this.adtSeqno = adtSeqno;
        this.adtStfno = adtStfno;
        this.adtBjOrgcd = adtBjOrgcd;
        this.adtNvCn = adtNvCn;
        this.issuMtt = issuMtt;
        this.indiMtt = indiMtt;
        this.admrCtn = admrCtn;
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

