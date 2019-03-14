package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 吐槽持久层
 */
public interface SpitDao extends MongoRepository<Spit,String>{

    /**
     * 根据父级id进行查询+分页
     * @param parentId 父级id
     * @param pageable
     * @return
     */
    Page<Spit> findByParentid(String parentId, Pageable pageable);
}
