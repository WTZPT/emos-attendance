package com.emos.attendance.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@ApiModel
@Data
public class FromBody {
    @NotBlank
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$",message = "不符合正则表达式")
    @ApiModelProperty("姓名")
    String name;

    @NotBlank
    @ApiModelProperty("学号")
    String schoolId;
}
