package com.art.dao.famous;

import com.art.beans.famous.FamousPortrait;
import java.util.List;
import java.util.Map;

/**
 * 世界名人肖像DAO
 * @author wslixiaoliang
 */
public interface FamousPortraitDAO {

    /**
     * 主键查询
     * @param map
     * @return
     */
    FamousPortrait getPortraitById(Map map);

    /**
     * 多主键查询:多个主键查询多条记录
     * @param map
     * @return
     */
    List<FamousPortrait> getfamousListByIds(Map map);

    /**
     * 肖像list查询
     * @return
     */
    List<FamousPortrait> getPortraitInfos(Map map);



}
