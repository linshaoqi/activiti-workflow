package com.gogoing.workflow.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 用户待审批任务列表查询条件
 * @author yangxi
 */
@Data
@ApiModel(value = "用户待审批任务列表查询条件")
public class TaskUnFinishQuery extends WorkflowPage {


    /**
     * 任务审批人
     */
    @ApiModelProperty(value = "任务审批人")
    @NotEmpty(message = "任务审批人不能为空")
    private String userId;

    /**
     * 流程定义KEY
     */
    @ApiModelProperty(value = "流程定义KEY")
    private String processDefinitionKey;

    /**
     * 业务KEY
     */
    @ApiModelProperty(value = "业务KEY")
    private List<String> businessKey;

}