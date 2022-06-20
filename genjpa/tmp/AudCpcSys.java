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
@Table(name="aud_cpc_sys") //--CPC시스템
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudCpcSys>findByAdtYymmAndAdtSeqnoAndAdtBjOrgcd(String adtYymm, BigDecimal adtSeqno, String adtBjOrgcd, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudCpcSysPK.class)
public class AudCpcSys {
    @Id //  String
    @Column(name = "adt_yymm", nullable = false)
    private String adtYymm; //--감사년월

    @Id //  BigDecimal
    @Column(name = "adt_seqno", nullable = false)
    private BigDecimal adtSeqno; //--감사순번

    @Id //  String
    @Column(name = "adt_bj_orgcd", nullable = false)
    private String adtBjOrgcd; //--감사대상기관코드

    @Column(name = "adt_stfno", nullable = true)
    private String adtStfno; //--감사직원번호

    @Column(name = "cpc_rqog_flgcd", nullable = true)
    private String cpcRqogFlgcd; //--cpc요청기관구분코드

    @Column(name = "cpc_da_flgcd", nullable = true)
    private String cpcDaFlgcd; //--cpc자료구분코드

    @Column(name = "cpc_da_dmdnm", nullable = true)
    private String cpcDaDmdnm; //--cpc자료요청자명

    @Column(name = "dmd_tlno", nullable = true)
    private String dmdTlno; //--요청자전화번호

    @Column(name = "rq_nm", nullable = true)
    private String rqNm; //--요청명

    @Column(name = "reqdt", nullable = true)
    private Date reqdt; //--요청일자

    @Column(name = "rq_clsdt", nullable = true)
    private Date rqClsdt; //--요청마감일자

    @Column(name = "adx_1_file_pth", nullable = true)
    private String adx1FilePth; //--첨부1파일경로

    @Column(name = "adx_2_file_pth", nullable = true)
    private String adx2FilePth; //--첨부2파일경로

    @Column(name = "adx_3_file_pth", nullable = true)
    private String adx3FilePth; //--첨부3파일경로

    @Column(name = "tsdt", nullable = true)
    private Date tsdt; //--전송일자

    @Column(name = "prsdt", nullable = true)
    private Date prsdt; //--제출일자

    @Column(name = "rcvdt", nullable = true)
    private Date rcvdt; //--수신일자

    @Column(name = "rcv_stfno", nullable = true)
    private String rcvStfno; //--수신직원번호

    @Column(name = "asrdt", nullable = true)
    private Date asrdt; //--회신일자

    @Column(name = "asr_1_file_pthnm", nullable = true)
    private String asr1FilePthnm; //--회신1파일경로명

    @Column(name = "asr_2_file_pthnm", nullable = true)
    private String asr2FilePthnm; //--회신2파일경로명

    @Column(name = "asr_3_file_pthnm", nullable = true)
    private String asr3FilePthnm; //--회신3파일경로명

    @Column(name = "asr_stfno", nullable = true)
    private String asrStfno; //--회신직원번호

    @Column(name = "rq_tmnm", nullable = true)
    private String rqTmnm; //--요청팀명

    @Column(name = "rq_oj", nullable = true)
    private String rqOj; //--요청목적

    @Column(name = "cnf_yn", nullable = true)
    private String cnfYn; //--확인여부

    @Column(name = "auth_es_yn", nullable = true)
    private String authEsYn; //--권한설정여부

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudCpcSys(String adtYymm, BigDecimal adtSeqno, String adtBjOrgcd, String adtStfno, String cpcRqogFlgcd, String cpcDaFlgcd, String cpcDaDmdnm, String dmdTlno, String rqNm, Date reqdt, Date rqClsdt, String adx1FilePth, String adx2FilePth, String adx3FilePth, Date tsdt, Date prsdt, Date rcvdt, String rcvStfno, Date asrdt, String asr1FilePthnm, String asr2FilePthnm, String asr3FilePthnm, String asrStfno, String rqTmnm, String rqOj, String cnfYn, String authEsYn, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.adtYymm = adtYymm;
        this.adtSeqno = adtSeqno;
        this.adtBjOrgcd = adtBjOrgcd;
        this.adtStfno = adtStfno;
        this.cpcRqogFlgcd = cpcRqogFlgcd;
        this.cpcDaFlgcd = cpcDaFlgcd;
        this.cpcDaDmdnm = cpcDaDmdnm;
        this.dmdTlno = dmdTlno;
        this.rqNm = rqNm;
        this.reqdt = reqdt;
        this.rqClsdt = rqClsdt;
        this.adx1FilePth = adx1FilePth;
        this.adx2FilePth = adx2FilePth;
        this.adx3FilePth = adx3FilePth;
        this.tsdt = tsdt;
        this.prsdt = prsdt;
        this.rcvdt = rcvdt;
        this.rcvStfno = rcvStfno;
        this.asrdt = asrdt;
        this.asr1FilePthnm = asr1FilePthnm;
        this.asr2FilePthnm = asr2FilePthnm;
        this.asr3FilePthnm = asr3FilePthnm;
        this.asrStfno = asrStfno;
        this.rqTmnm = rqTmnm;
        this.rqOj = rqOj;
        this.cnfYn = cnfYn;
        this.authEsYn = authEsYn;
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

