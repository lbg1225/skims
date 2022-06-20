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
@Table(name="aud_dherc_itmcl_sts") //--취급자별종목별통계
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudDhercItmclSts {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "st_yymm", nullable = false)
    private String stYymm; //--기준년월

    @Column(name = "adm_orgcd", nullable = false)
    private String admOrgcd; //--관리기관코드

    @Column(name = "dh_br_orgcd", nullable = false)
    private String dhBrOrgcd; //--취급지점기관코드

    @Column(name = "dh_stfno", nullable = false)
    private String dhStfno; //--취급직원번호

    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Column(name = "rtn_ct", nullable = true)
    private BigDecimal rtnCt; //--반납건수

    @Column(name = "nmlct", nullable = true)
    private BigDecimal nmlct; //--정상건수

    @Column(name = "dmg_ct", nullable = true)
    private BigDecimal dmgCt; //--서손건수

    @Column(name = "lss_ct", nullable = true)
    private BigDecimal lssCt; //--분실건수

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudDhercItmclSts(String stYymm, String admOrgcd, String dhBrOrgcd, String dhStfno, String rtxKndcd, BigDecimal rtnCt, BigDecimal nmlct, BigDecimal dmgCt, BigDecimal lssCt, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.stYymm = stYymm;
        this.admOrgcd = admOrgcd;
        this.dhBrOrgcd = dhBrOrgcd;
        this.dhStfno = dhStfno;
        this.rtxKndcd = rtxKndcd;
        this.rtnCt = rtnCt;
        this.nmlct = nmlct;
        this.dmgCt = dmgCt;
        this.lssCt = lssCt;
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

