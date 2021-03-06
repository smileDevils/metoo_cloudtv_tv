package com.cloud.tv.dto;


import com.cloud.tv.entity.Monitor;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
public class MonitorDto extends PageDto<Monitor>{
        @ApiModelProperty("学校ID")
        private Long id;
        @ApiModelProperty("学校标题")
        private String title;
        private Long liveRoomId;
        private Long roomProgramId;
        private Long userId;
        @ApiModelProperty("直播间标题")
        private String liveRoomTitle;
        @ApiModelProperty("直播名称")
        private String roomProgramTitle;
        @ApiModelProperty("直播用户名称")
        private String username;
        @ApiModelProperty("数字签名、记录每次直播记录；直播间ID+直播ID+用户ID+学校number")
        private String sign;
        @ApiModelProperty("应用唯一标识")
        private String appId;
        @ApiModelProperty("直播开启时间戳")
        private String beginTime;
        @ApiModelProperty("直播结束时间")
        private String endTime;
        @ApiModelProperty("直播状态 0: 关闭 1：开启 ")
        private int status;
        private List<String> appIds;

}
