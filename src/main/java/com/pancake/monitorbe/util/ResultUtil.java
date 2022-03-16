package com.pancake.monitorbe.util;

import com.pancake.monitorbe.model.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.ObjectUtils;

/**
 * @author PancakeCN
 * @date 2022/3/2 16:44
 */
@Log4j2
public abstract class ResultUtil {

    //private static Logger logger = LoggerFactory.getLogger(this.getClass());

    public static Result<Object> resultHandler(Object obj){

        Result<Object> res = new Result<>();
        if (ObjectUtils.isEmpty(obj)){
            res.setResultCode(404);
            res.setMessage("FAILED");
            res.setData(null);

            log.info("[FAILED]获取失败!");
            //System.out.println("FAILED");
        }else {
            System.out.println();
            res.setResultCode(200);
            res.setMessage("SUCCESS");
            res.setData(obj);

            log.info("[SUCCESS]获取成功！原始数据为：" + obj);
            System.out.println(obj);
        }
        return res;
    }
}
