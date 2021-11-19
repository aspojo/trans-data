package top.logbug.transdata.generator.top.logbug;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName revert_batch_info_0
 */
@TableName(value ="revert_batch_info_0")
@Data
public class RevertBatchInfo0 implements Serializable {
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
     * 作业批单号
     */
    private String batchId;

    /**
     * 仓库编号 主店 外仓
     */
    private String warehouseNo;

    /**
     * 作业批单号状态 0:初始状态 1:开板完成或退货完成 拣货任务，开板任务完成 9:取消
     */
    private Byte status;

    /**
     * 拣货任务状态 0:初始状态 1:拣货完成
     */
    private String gtbsBizTypeCode;

    /**
     * 高库存 正常品
     */
    private String businessType;

    /**
     * dc id
     */
    private Integer dc;

    /**
     * DC仓名
     */
    private String dcName;

    /**
     * 厂商
     */
    private Integer supplierNo;

    /**
     * 厂商名称
     */
    private String supplierName;

    /**
     * 调入店
     */
    private Short tranStore;

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