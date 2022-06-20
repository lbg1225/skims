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
@Table(name="aud_rst_mtt") //--제재사항
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRstMtt>findByAdtYrAndAdtFlgcdAndAdtnoAndAdtIndiSeqnoAndAdtSeqno(String adtYr, String adtFlgcd, String adtno, BigDecimal adtIndiSeqno, BigDecimal adtSeqno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRstMttPK.class)
public class AudRstMtt {
    @Id //  String
    @Column(name = "adt_yr", nullable = false)
    private String adtYr; //--감사년도

    @Id //  String
    @Column(name = "adt_flgcd", nullable = false)
    private String adtFlgcd; //--감사구분코드

    @Id //  String
    @Column(name = "adtno", nullable = false)
    private String adtno; //--감사번호

    @Id //  BigDecimal
    @Column(name = "adt_indi_seqno", nullable = false)
    private BigDecimal adtIndiSeqno; //--감사지적순번

    @Id //  BigDecimal
    @Column(name = "adt_seqno", nullable = false)
    private BigDecimal adtSeqno; //--감사순번

    @Column(name = "rst_bj_flgcd", nullable = true)
    private String rstBjFlgcd; //--제재대상구분코드

    @Column(name = "rst_stfno", nullable = true)
    private String rstStfno; //--제재직원번호

    @Column(name = "rst_thtm_orgcd", nullable = true)
    private String rstThtmOrgcd; //--제재당시기관코드

    @Column(name = "rst_thtm_dtynm", nullable = true)
    private String rstThtmDtynm; //--제재당시직책명

    @Column(name = "rst_tp_flgcd", nullable = true)
    private String rstTpFlgcd; //--제재유형구분코드

    @Column(name = "rst_mntct", nullable = true)
    private BigDecimal rstMntct; //--제재개월수

    @Column(name = "rst_rgt_cn", nullable = true)
    private String rstRgtCn; //--제재등록내용

    @Column(name = "rst_amt", nullable = true)
    private BigDecimal rstAmt; //--제재금액

    @Column(name = "dcp_tp_flgcd", nullable = true)
    private String dcpTpFlgcd; //--징계유형구분코드

    @Column(name = "dcp_mntct", nullable = true)
    private BigDecimal dcpMntct; //--징계개월수

    @Column(name = "dcp_dt", nullable = true)
    private Date dcpDt; //--징계일자

    @Column(name = "rgt_stfno", nullable = true)
    private String rgtStfno; //--등록직원번호

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRstMtt(String adtYr, String adtFlgcd, String adtno, BigDecimal adtIndiSeqno, BigDecimal adtSeqno, String rstBjFlgcd, String rstStfno, String rstThtmOrgcd, String rstThtmDtynm, String rstTpFlgcd, BigDecimal rstMntct, String rstRgtCn, BigDecimal rstAmt, String dcpTpFlgcd, BigDecimal dcpMntct, Date dcpDt, String rgtStfno, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtYr = adtYr;
        this.adtFlgcd = adtFlgcd;
        this.adtno = adtno;
        this.adtIndiSeqno = adtIndiSeqno;
        this.adtSeqno = adtSeqno;
        this.rstBjFlgcd = rstBjFlgcd;
        this.rstStfno = rstStfno;
        this.rstThtmOrgcd = rstThtmOrgcd;
        this.rstThtmDtynm = rstThtmDtynm;
        this.rstTpFlgcd = rstTpFlgcd;
        this.rstMntct = rstMntct;
        this.rstRgtCn = rstRgtCn;
        this.rstAmt = rstAmt;
        this.dcpTpFlgcd = dcpTpFlgcd;
        this.dcpMntct = dcpMntct;
        this.dcpDt = dcpDt;
        this.rgtStfno = rgtStfno;
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

