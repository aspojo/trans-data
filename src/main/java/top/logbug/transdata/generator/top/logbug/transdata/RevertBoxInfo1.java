package top.logbug.transdata.generator.top.logbug.transdata;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName revert_box_info_1
 */
@TableName(value ="revert_box_info_1")
@Data
public class RevertBoxInfo1 implements Serializable {
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
     * 箱号
     */
    private String boxId;

    /**
     * 退货类型: 0:好品回仓 1:好品回仓退厂 2:回仓退厂 3:店间调货 4: 退厂(68RS) 5:服饰后整
     */
    private String gtbsBizTypeCode;

    /**
     * 作业批单号
     */
    private String batchId;

    /**
     * 装车作业批单号
     */
    private String carBatchId;

    /**
     * 箱状态 0:初始状态 1:开板完成或退货完成 拣货任务，开板任务完成 9:取消
     */
    private Byte status;

    /**
     * 装车单号
     */
    private String loadingId;

    /**
     * dc id
     */
    private Integer dc;

    /**
     * 厂商
     */
    private Integer supplierNo;

    /**
     * 调入店
     */
    private Integer tranStore;

    /**
     * 收货地点
     */
    private Integer recptPlace;

    /**
     * 仓库编号 主店 外仓
     */
    private String warehouseNo;

    /**
     * 
     */
    private String coursegroupNo;

    /**
     * 
     */
    private String coursegroupName;

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