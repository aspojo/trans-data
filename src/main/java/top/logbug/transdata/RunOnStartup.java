package top.logbug.transdata;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import top.logbug.transdata.generator.BetaWorker;
import top.logbug.transdata.generator.DevWorker;
import top.logbug.transdata.generator.top.logbug.transdata.RevertBatchInfo1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author : lin.chen1
 * @version : 1.0.0.0
 * @date : Created at 2021/11/19
 */
@Slf4j
@Component
public class RunOnStartup implements ApplicationRunner {

    final DevWorker devWorker;
    @Autowired
    BetaWorker betaWorker;

    @Autowired

    public RunOnStartup(DevWorker devWorker) {
        this.devWorker = devWorker;
    }

    @Override
    public void run(ApplicationArguments args) {
        find();
        find2();
        log.error("insert success!");

    }
    public void find(){
        String batchId="WT10012021091000007";
//        clear(batchId);
        Map<String,Object> map=new HashMap(){{put("batch_id", batchId);}};
        List<RevertBatchInfo1> beta = this.betaWorker.getBatchInfo1Service().query().eq("batch_id", batchId).list();
        List<RevertBatchInfo1> dev = this.devWorker.getBatchInfo1Service().query().eq("batch_id", batchId).list();
    }
    @DS("dev")
    public void find2(){
        String batchId="WT10012021091000007";
//        clear(batchId);
        Map<String,Object> map=new HashMap(){{put("batch_id", batchId);}};
        List<RevertBatchInfo1> beta = this.betaWorker.getBatchInfo1Service().query().eq("batch_id", batchId).list();
        List<RevertBatchInfo1> dev = this.devWorker.getBatchInfo1Service().query().eq("batch_id", batchId).list();
    }

    void clear(String batchId) {

        devWorker.clear(batchId);
        log.error("clear success!");
    }


}
