package com.sample.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Builder;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode // 필수
public class CommonCodeDetailPK implements Serializable {
    private String code;    
    @Column(name = "group_code")
    private String groupCode;
    
    @Builder
    public CommonCodeDetailPK(String code, String groupCode) {
        this.code = code;
        this.groupCode = groupCode;
    }
}
