package com.sample.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ListCommonCodeDetailDto {
    private String code;
    private String groupCode;
    private String codeName;
    private Boolean deleteFlag;
    private String groupNamse;
    
    @Builder
    public ListCommonCodeDetailDto(String code, String groupCode, String codeName, Boolean deleteFlag,
            String groupNamse) {
        this.code = code;
        this.groupCode = groupCode;
        this.codeName = codeName;
        this.deleteFlag = deleteFlag;
        this.groupNamse = groupNamse;
    }
    
}
