package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TShoppingcarDao;
import test.service.TShoppingcarService;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TShoppingcarEntity;
import java.util.List;
import java.util.Map;

@Service
public class TShoppingcarServiceImpl implements TShoppingcarService {


	private final TShoppingcarDao dao;

	@Autowired
	public TShoppingcarServiceImpl(TShoppingcarDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TShoppingcarEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TShoppingcarEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TShoppingcarEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TShoppingcarEntity> select(TShoppingcarEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TShoppingcarEntity> likeSelect(TShoppingcarEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TShoppingcarEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "user_id", "good_id", "detail_id"};

		String[] headEngList = new String[]{ "userId", "goodId", "detailId"};

		String[] describeList = new String[] { "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
