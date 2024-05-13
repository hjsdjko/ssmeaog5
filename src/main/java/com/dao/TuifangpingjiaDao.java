package com.dao;

import com.entity.TuifangpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuifangpingjiaVO;
import com.entity.view.TuifangpingjiaView;


/**
 * 退房评价
 * 
 * @author 
 * @email 
 * @date 2021-04-01 14:03:08
 */
public interface TuifangpingjiaDao extends BaseMapper<TuifangpingjiaEntity> {
	
	List<TuifangpingjiaVO> selectListVO(@Param("ew") Wrapper<TuifangpingjiaEntity> wrapper);
	
	TuifangpingjiaVO selectVO(@Param("ew") Wrapper<TuifangpingjiaEntity> wrapper);
	
	List<TuifangpingjiaView> selectListView(@Param("ew") Wrapper<TuifangpingjiaEntity> wrapper);

	List<TuifangpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<TuifangpingjiaEntity> wrapper);
	
	TuifangpingjiaView selectView(@Param("ew") Wrapper<TuifangpingjiaEntity> wrapper);
	
}
