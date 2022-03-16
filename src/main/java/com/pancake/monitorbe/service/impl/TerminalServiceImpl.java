package com.pancake.monitorbe.service.impl;

import com.pancake.monitorbe.dao.TerminalMapper;
import com.pancake.monitorbe.entity.Terminal;
import com.pancake.monitorbe.service.TerminalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * 业务层-终端-实现类
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 1:19
 */
@Service
public class TerminalServiceImpl implements TerminalService {

    @Resource
    TerminalMapper terminalMapper;

    @Override
    public ArrayList<Terminal> getAllTerminalList() {
        return (ArrayList<Terminal>) terminalMapper.getAllTerminals();
    }
}
