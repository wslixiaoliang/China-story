package com.art.dao.famous;

import com.art.beans.famous.Famous;
import java.util.List;
import java.util.Map;

/**
 * 世界名人DAO
 * @author lixiaoliang
 */
public interface FamousDAO {

    /**
     * 主键查询
     * @param map
     * @return
     */
    Famous getFamousById(Map map);

    /**
     * 条件查询
     * @param map
     * @return
     */
    List<Famous> getFamousInfos(Map map);

    /**
     * count查询
     * @param map
     * @return
     */
    Integer getFamousCount(Map map);
    /**
     * 新增
     * @param map
     */
    void addFamous(Map map);

    /**
     * 删除
     * @param map
     */
    void deleteByFamousId(Map map);

}
