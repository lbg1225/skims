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
@Table(name="aud_mng_ar_spc") //--조치정리내역
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudMngArSpc {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "adt_yr", nullable = false)
    private String adtYr; //--감사년도

    @Column(name = "adt_flgcd", nullable = false)
    private String adtFlgcd; //--감사구분코드

    @Column(name = "adtno", nullable = false)
    private String adtno; //--감사번호

    @Column(name = "adt_seqno", nullable = false)
    private BigDecimal adtSeqno; //--감사순번

    @Column(name = "seqno", nullable = false)
    private BigDecimal seqno; //--순번

    @Column(name = "mng_rq_mtt", nullable = true)
    private String mngRqMtt; //--조치요구사항

    @Column(name = "mng_reqdt", nullable = true)
    private Date mngReqdt; //--조치요청일자

    @Column(name = "mng_rqdt", nullable = true)
    private Date mngRqdt; //--조치요구일자

    @Column(name = "mng_bj_orgcd", nullable = true)
    private String mngBjOrgcd; //--조치대상기관코드

    @Column(name = "wtop_file_key", nullable = true)
    private BigDecimal wtopFileKey; //--의견서파일key

    @Column(name = "mng_rq_dcu_flgcd", nullable = true)
    private String mngRqDcuFlgcd; //--조치요청문서구분코드

    @Column(name = "rq_dcu_file_key", nullable = true)
    private BigDecimal rqDcuFileKey; //--요청문서파일key

    @Column(name = "indi_ar_mtt", nullable = true)
    private String indiArMtt; //--지적정리사항

    @Column(name = "ar_rptg_file_key", nullable = true)
    private BigDecimal arRptgFileKey; //--정리보고서파일key

    @Column(name = "ar_orgcd", nullable = true)
    private String arOrgcd; //--정리기관코드

    @Column(name = "mng_cpldt", nullable = true)
    private Date mngCpldt; //--조치완료일자

    @Column(name = "indi_mtt_mng_rst_flgcd", nullable = true)
    private String indiMttMngRstFlgcd; //--지적사항조치결과구분코드

    @Column(name = "mng_rstcd", nullable = true)
    private String mngRstcd; //--조치결과코드

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudMngArSpc(String adtYr, String adtFlgcd, String adtno, BigDecimal adtSeqno, BigDecimal seqno, String mngRqMtt, Date mngReqdt, Date mngRqdt, String mngBjOrgcd, BigDecimal wtopFileKey, String mngRqDcuFlgcd, BigDecimal rqDcuFileKey, String indiArMtt, BigDecimal arRptgFileKey, String arOrgcd, Date mngCpldt, String indiMttMngRstFlgcd, String mngRstcd, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtYr = adtYr;
        this.adtFlgcd = adtFlgcd;
        this.adtno = adtno;
        this.adtSeqno = adtSeqno;
        this.seqno = seqno;
        this.mngRqMtt = mngRqMtt;
        this.mngReqdt = mngReqdt;
        this.mngRqdt = mngRqdt;
        this.mngBjOrgcd = mngBjOrgcd;
        this.wtopFileKey = wtopFileKey;
        this.mngRqDcuFlgcd = mngRqDcuFlgcd;
        this.rqDcuFileKey = rqDcuFileKey;
        this.indiArMtt = indiArMtt;
        this.arRptgFileKey = arRptgFileKey;
        this.arOrgcd = arOrgcd;
        this.mngCpldt = mngCpldt;
        this.indiMttMngRstFlgcd = indiMttMngRstFlgcd;
        this.mngRstcd = mngRstcd;
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

