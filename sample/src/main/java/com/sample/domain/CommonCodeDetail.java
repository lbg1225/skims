package com.sample.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="common_code_detail")
@Getter 
@EqualsAndHashCode // 필수
@NoArgsConstructor
@IdClass(CommonCodeDetailPK.class)
@ToString
public class CommonCodeDetail {
    @Id
    @Column(name = "CODE" )
    @Size(max=10)
    private String code;

    @Id
    @Column(name = "GROUP_CODE" )
    @Size(max=10)
    private String groupCode;

    @Column(name = "CODE_NAME" )
    @Size(max=100)
    private String codeName;

    @Column(name = "DELETE_FLAG")
    private Boolean deleteFlag;

    @Builder
    public CommonCodeDetail(@Size(max = 10) String code, @Size(max = 10) String groupCode, @Size(max = 100) String codeName, Boolean deleteFlag) {
        this.code = code;
        this.groupCode = groupCode;
        this.codeName = codeName;
        this.deleteFlag = deleteFlag;
    }

}
