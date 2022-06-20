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
@Table(name="aud_odtm_adt_sts") //--상시감사통계
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudOdtmAdtSts {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "stdt", nullable = false)
    private Date stdt; //--기준일자

    @Column(name = "orgcd", nullable = false)
    private String orgcd; //--기관코드

    @Column(name = "adt_bsns_dsccd", nullable = false)
    private String adtBsnsDsccd; //--감사업무식별코드

    @Column(name = "impdg_poct", nullable = true)
    private BigDecimal impdgPoct; //--중요도점수

    @Column(name = "odtm_adt_bjct", nullable = true)
    private BigDecimal odtmAdtBjct; //--상시감사대상건수

    @Column(name = "wrkdt", nullable = true)
    private Date wrkdt; //--작업일자

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudOdtmAdtSts(Date stdt, String orgcd, String adtBsnsDsccd, BigDecimal impdgPoct, BigDecimal odtmAdtBjct, Date wrkdt, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.stdt = stdt;
        this.orgcd = orgcd;
        this.adtBsnsDsccd = adtBsnsDsccd;
        this.impdgPoct = impdgPoct;
        this.odtmAdtBjct = odtmAdtBjct;
        this.wrkdt = wrkdt;
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

