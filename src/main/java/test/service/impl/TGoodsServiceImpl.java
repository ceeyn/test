package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TGoodsDao;
import test.service.TGoodsService;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TGoodsEntity;
import java.util.List;
import java.util.Map;

@Service
public class TGoodsServiceImpl implements TGoodsService {


	private final TGoodsDao dao;

	@Autowired
	public TGoodsServiceImpl(TGoodsDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TGoodsEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TGoodsEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TGoodsEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TGoodsEntity> select(TGoodsEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TGoodsEntity> likeSelect(TGoodsEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TGoodsEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "good_id", "good_kind", "good_name", "good_dis", "good_mid", "good_price", "good_over", "good_pre", "istoday"};

		String[] headEngList = new String[]{ "goodId", "goodKind", "goodName", "goodDis", "goodMid", "goodPrice", "goodOver", "goodPre", "istoday"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
