package com.pancake.monitorbe.service;

import com.pancake.monitorbe.entity.Terminal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 业务层-终端-接口
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 1:18
 */
@Service
public interface TerminalService {

    /**
     * 获取所有终端列表
     *
     * @return java.util.ArrayList<com.pancake.monitorbe.entity.Terminal>
     * @author PancakeCN
     * @date 2022/3/15 16:09
     */
    ArrayList<Terminal> getAllTerminalList();
}
