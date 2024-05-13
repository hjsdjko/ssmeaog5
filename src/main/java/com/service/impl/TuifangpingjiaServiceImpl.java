package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuifangpingjiaDao;
import com.entity.TuifangpingjiaEntity;
import com.service.TuifangpingjiaService;
import com.entity.vo.TuifangpingjiaVO;
import com.entity.view.TuifangpingjiaView;

@Service("tuifangpingjiaService")
public class TuifangpingjiaServiceImpl extends ServiceImpl<TuifangpingjiaDao, TuifangpingjiaEntity> implements TuifangpingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuifangpingjiaEntity> page = this.selectPage(
                new Query<TuifangpingjiaEntity>(params).getPage(),
                new EntityWrapper<TuifangpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuifangpingjiaEntity> wrapper) {
		  Page<TuifangpingjiaView> page =new Query<TuifangpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuifangpingjiaVO> selectListVO(Wrapper<TuifangpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuifangpingjiaVO selectVO(Wrapper<TuifangpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuifangpingjiaView> selectListView(Wrapper<TuifangpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuifangpingjiaView selectView(Wrapper<TuifangpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
