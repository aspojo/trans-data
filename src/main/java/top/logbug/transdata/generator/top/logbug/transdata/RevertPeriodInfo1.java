package top.logbug.transdata.generator.top.logbug.transdata;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 货保质期
 * @TableName revert_period_info_1
 */
@TableName(value ="revert_period_info_1")
@Data
public class RevertPeriodInfo1 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 店号
     */
    private Short storeNo;

    /**
     * 任务单号
     */
    private String taskNo;

    /**
     * 货号
     */
    private String rtNo;

    /**
     * 该批最早生产日期
     */
    private Date prodDate;

    /**
     * 
     */
    private String createId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String updateId;

    /**
     * 
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}