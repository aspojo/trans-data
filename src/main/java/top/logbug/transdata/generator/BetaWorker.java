package top.logbug.transdata.generator;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import top.logbug.transdata.generator.service.*;

/**
 * @author : lin.chen1
 * @version : 1.0.0.0
 * @date : Created at 2021/11/19
 */
@Slf4j
@Service
@DS("beta")
@Data
public class BetaWorker{
    RevertBatchInfo1Service batchInfo1Service;
    RevertItemsDaily1Service itemsDaily1Service;
    RevertCarbatchInfo1Service carbatchInfo1Service;
    RevertBoxInfo1Service boxInfo1Service;
    RevertBoxItems1Service boxItems1Service;
    JdbcTemplate jdbcTemplate;

    public BetaWorker(RevertBatchInfo1Service batchInfo1Service, RevertItemsDaily1Service itemsDaily1Service, RevertCarbatchInfo1Service carbatchInfo1Service, RevertBoxInfo1Service boxInfo1Service, RevertBoxItems1Service boxItems1Service, JdbcTemplate jdbcTemplate) {
        this.batchInfo1Service = batchInfo1Service;
        this.itemsDaily1Service = itemsDaily1Service;
        this.carbatchInfo1Service = carbatchInfo1Service;
        this.boxInfo1Service = boxInfo1Service;
        this.boxItems1Service = boxItems1Service;
        this.jdbcTemplate = jdbcTemplate;
    }
}
