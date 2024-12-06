package com.example.handle.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "地层信息", description = "存储地层的详细信息")
public class Stratums {
    @ApiModelProperty(value = "自增主键ID", example = "1")
    private Long id;

    @ApiModelProperty(value = "地层编号(业务主键)", required = true, example = "S2023001")
    @JsonProperty("stratumId")
    private String stratumId;

    @ApiModelProperty(value = "地层名称", required = true, example = "第一地层")
    @JsonProperty("stratumName")
    private String stratumName;

    @ApiModelProperty(value = "地层长度(米)", required = true, example = "100.500")
    @JsonProperty("stratumLen")
    private Double stratumLen;

    @ApiModelProperty(value = "地层地理位置", required = true, example = "北京市海淀区")
    @JsonProperty("stratumAdd")
    private String stratumAdd;

    @ApiModelProperty(value = "地层特性描述", example = "优质")
    @JsonProperty("stratumPro")
    private String stratumPro;

    @ApiModelProperty(value = "完整性(YES/NO)", example = "NO")
    @JsonProperty("integrity")
    private String integrity;

    @ApiModelProperty(value = "创建时间", example = "2023-12-25 10:30:00")
    @JsonProperty("createTime")
    private Timestamp createTime;
}
