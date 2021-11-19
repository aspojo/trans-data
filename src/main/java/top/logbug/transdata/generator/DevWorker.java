package top.logbug.transdata.generator;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import top.logbug.transdata.generator.service.*;
import top.logbug.transdata.generator.top.logbug.transdata.*;

/**
 * @author : lin.chen1
 * @version : 1.0.0.0
 * @date : Created at 2021/11/19
 */
@DS("dev")
@Service
public class DevWorker extends TransWorker {
    @Autowired
    public DevWorker(RevertBatchInfo1Service batchInfo1Service, RevertItemsDaily1Service itemsDaily1Service, RevertCarbatchInfo1Service carbatchInfo1Service, RevertBoxInfo1Service boxInfo1Service, RevertBoxItems1Service boxItems1Service, JdbcTemplate jdbcTemplate) {
        super(batchInfo1Service, itemsDaily1Service, carbatchInfo1Service, boxInfo1Service, boxItems1Service, jdbcTemplate);
    }


    public void clear(String batchId){
         batchInfo1Service.lambdaUpdate().eq(RevertBatchInfo1::getBatchId,batchId).remove();
         itemsDaily1Service.lambdaUpdate().eq(RevertItemsDaily1::getBatchId,batchId).remove();
         boxInfo1Service.lambdaUpdate().eq(RevertBoxInfo1::getBatchId,batchId);
         boxItems1Service.lambdaUpdate().eq(RevertBoxItems1::getBatchId,batchId).remove();

    }
}
