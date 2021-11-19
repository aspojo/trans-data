package top.logbug.transdata.generator;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.jdbc.core.JdbcTemplate;
import top.logbug.transdata.generator.service.*;

/**
 * @author : lin.chen1
 * @version : 1.0.0.0
 * @date : Created at 2021/11/19
 */
@DS("beta")
public abstract class TransWorker {
    RevertBatchInfo1Service batchInfo1Service;
    RevertItemsDaily1Service itemsDaily1Service;
    RevertCarbatchInfo1Service carbatchInfo1Service;
    RevertBoxInfo1Service boxInfo1Service;
    RevertBoxItems1Service boxItems1Service;
    JdbcTemplate jdbcTemplate;

    public TransWorker(RevertBatchInfo1Service batchInfo1Service, RevertItemsDaily1Service itemsDaily1Service, RevertCarbatchInfo1Service carbatchInfo1Service, RevertBoxInfo1Service boxInfo1Service, RevertBoxItems1Service boxItems1Service, JdbcTemplate jdbcTemplate) {
        this.batchInfo1Service = batchInfo1Service;
        this.itemsDaily1Service = itemsDaily1Service;
        this.carbatchInfo1Service = carbatchInfo1Service;
        this.boxInfo1Service = boxInfo1Service;
        this.boxItems1Service = boxItems1Service;
        this.jdbcTemplate = jdbcTemplate;
    }
    public RevertBatchInfo1Service getBatchInfo1Service() {
        return batchInfo1Service;
    }

    public RevertItemsDaily1Service getItemsDaily1Service() {
        return itemsDaily1Service;
    }

    public RevertCarbatchInfo1Service getCarbatchInfo1Service() {
        return carbatchInfo1Service;
    }

    public RevertBoxInfo1Service getBoxInfo1Service() {
        return boxInfo1Service;
    }

    public RevertBoxItems1Service getBoxItems1Service() {
        return boxItems1Service;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
