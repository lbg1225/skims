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
@Table(name="aud_indi_mng_ar_adm") //--지적조치정리관리
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudIndiMngArAdm>findByAdtYrAndAdtFlgcdAndAdtnoAndAdtSeqno(String adtYr, String adtFlgcd, String adtno, BigDecimal adtSeqno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudIndiMngArAdmPK.class)
public class AudIndiMngArAdm {
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
    @Column(name = "adt_seqno", nullable = false)
    private BigDecimal adtSeqno; //--감사순번

    @Column(name = "adt_bsns_flgcd", nullable = true)
    private String adtBsnsFlgcd; //--감사업무구분코드

    @Column(name = "indi_mtt", nullable = true)
    private String indiMtt; //--지적사항

    @Column(name = "o1_indi_mng_flgcd", nullable = true)
    private String o1IndiMngFlgcd; //--1차지적조치구분코드

    @Column(name = "o2_indi_mng_flgcd", nullable = true)
    private String o2IndiMngFlgcd; //--2차지적조치구분코드

    @Column(name = "o3_indi_mng_flgcd", nullable = true)
    private String o3IndiMngFlgcd; //--3차지적조치구분코드

    @Column(name = "adt_stfno", nullable = true)
    private String adtStfno; //--감사직원번호

    @Column(name = "mng_br_orgcd", nullable = true)
    private String mngBrOrgcd; //--조치지점기관코드

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
    public AudIndiMngArAdm(String adtYr, String adtFlgcd, String adtno, BigDecimal adtSeqno, String adtBsnsFlgcd, String indiMtt, String o1IndiMngFlgcd, String o2IndiMngFlgcd, String o3IndiMngFlgcd, String adtStfno, String mngBrOrgcd, BigDecimal fileKey, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtYr = adtYr;
        this.adtFlgcd = adtFlgcd;
        this.adtno = adtno;
        this.adtSeqno = adtSeqno;
        this.adtBsnsFlgcd = adtBsnsFlgcd;
        this.indiMtt = indiMtt;
        this.o1IndiMngFlgcd = o1IndiMngFlgcd;
        this.o2IndiMngFlgcd = o2IndiMngFlgcd;
        this.o3IndiMngFlgcd = o3IndiMngFlgcd;
        this.adtStfno = adtStfno;
        this.mngBrOrgcd = mngBrOrgcd;
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

