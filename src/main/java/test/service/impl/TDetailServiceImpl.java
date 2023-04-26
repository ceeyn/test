package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TDetailDao;
import test.service.TDetailService;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TDetailEntity;
import java.util.List;
import java.util.Map;

@Service
public class TDetailServiceImpl implements TDetailService {


	private final TDetailDao dao;

	@Autowired
	public TDetailServiceImpl(TDetailDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TDetailEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TDetailEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TDetailEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TDetailEntity> select(TDetailEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TDetailEntity> likeSelect(TDetailEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TDetailEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "good_id", "detail_id", "detail_name"};

		String[] headEngList = new String[]{ "goodId", "detailId", "detailName"};

		String[] describeList = new String[] { "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
