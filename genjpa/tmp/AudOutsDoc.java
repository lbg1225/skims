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
@Table(name="aud_outs_doc") //--외부공문
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudOutsDoc {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "dpc_orgnm", nullable = false)
    private String dpcOrgnm; //--발신기관명

    @Column(name = "dcuno", nullable = false)
    private String dcuno; //--문서번호

    @Column(name = "bj_orgcd", nullable = false)
    private String bjOrgcd; //--대상기관코드

    @Column(name = "rcpdt", nullable = false)
    private Date rcpdt; //--접수일자

    @Column(name = "titl", nullable = true)
    private String titl; //--제목

    @Column(name = "dcu_cn", nullable = true)
    private String dcuCn; //--문서내용

    @Column(name = "adx_file_pth1", nullable = true)
    private String adxFilePth1; //--첨부파일경로1

    @Column(name = "adx_file_pth2", nullable = true)
    private String adxFilePth2; //--첨부파일경로2

    @Column(name = "adx_file_pth3", nullable = true)
    private String adxFilePth3; //--첨부파일경로3

    @Column(name = "adx_file_pth4", nullable = true)
    private String adxFilePth4; //--첨부파일경로4

    @Column(name = "adx_file_pth5", nullable = true)
    private String adxFilePth5; //--첨부파일경로5

    @Column(name = "adx_file_pth6", nullable = true)
    private String adxFilePth6; //--첨부파일경로6

    @Column(name = "adx_file_pth7", nullable = true)
    private String adxFilePth7; //--첨부파일경로7

    @Column(name = "adx_file_pth8", nullable = true)
    private String adxFilePth8; //--첨부파일경로8

    @Column(name = "adx_file_pth9", nullable = true)
    private String adxFilePth9; //--첨부파일경로9

    @Column(name = "adx_file_pth10", nullable = true)
    private String adxFilePth10; //--첨부파일경로10

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudOutsDoc(String dpcOrgnm, String dcuno, String bjOrgcd, Date rcpdt, String titl, String dcuCn, String adxFilePth1, String adxFilePth2, String adxFilePth3, String adxFilePth4, String adxFilePth5, String adxFilePth6, String adxFilePth7, String adxFilePth8, String adxFilePth9, String adxFilePth10, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.dpcOrgnm = dpcOrgnm;
        this.dcuno = dcuno;
        this.bjOrgcd = bjOrgcd;
        this.rcpdt = rcpdt;
        this.titl = titl;
        this.dcuCn = dcuCn;
        this.adxFilePth1 = adxFilePth1;
        this.adxFilePth2 = adxFilePth2;
        this.adxFilePth3 = adxFilePth3;
        this.adxFilePth4 = adxFilePth4;
        this.adxFilePth5 = adxFilePth5;
        this.adxFilePth6 = adxFilePth6;
        this.adxFilePth7 = adxFilePth7;
        this.adxFilePth8 = adxFilePth8;
        this.adxFilePth9 = adxFilePth9;
        this.adxFilePth10 = adxFilePth10;
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

