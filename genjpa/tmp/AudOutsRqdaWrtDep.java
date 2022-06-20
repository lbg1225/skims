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
@Table(name="aud_outs_rqda_wrt_dep") //--외부요청자료작성부서
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudOutsRqdaWrtDep {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "adt_yymm", nullable = false)
    private String adtYymm; //--감사년월

    @Column(name = "adt_seqno", nullable = false)
    private BigDecimal adtSeqno; //--감사순번

    @Column(name = "adt_bj_orgcd", nullable = false)
    private String adtBjOrgcd; //--감사대상기관코드

    @Column(name = "prst_yn", nullable = true)
    private String prstYn; //--제출여부

    @Column(name = "adt_stfno", nullable = true)
    private String adtStfno; //--감사직원번호

    @Column(name = "rcvdt", nullable = true)
    private Date rcvdt; //--수신일자

    @Column(name = "tsdt", nullable = true)
    private Date tsdt; //--전송일자

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudOutsRqdaWrtDep(String adtYymm, BigDecimal adtSeqno, String adtBjOrgcd, String prstYn, String adtStfno, Date rcvdt, Date tsdt, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtYymm = adtYymm;
        this.adtSeqno = adtSeqno;
        this.adtBjOrgcd = adtBjOrgcd;
        this.prstYn = prstYn;
        this.adtStfno = adtStfno;
        this.rcvdt = rcvdt;
        this.tsdt = tsdt;
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

